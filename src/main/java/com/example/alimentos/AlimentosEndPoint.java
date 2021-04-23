package com.example.alimentos;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import me.tell.alimentos.AnadirAlimentoResponse;
import me.tell.alimentos.AnadirAlimentoRequest;
import me.tell.alimentos.BusquedaAlimentoResponse;
import me.tell.alimentos.BusquedaAlimentoRequest;
import me.tell.alimentos.BusquedaAlimentoPrecioRequest;
import me.tell.alimentos.BusquedaAlimentoPrecioResponse;
import me.tell.alimentos.ModificarAlimentoRequest;
import me.tell.alimentos.ModificarAlimentoResponse;
import me.tell.alimentos.EliminarAlimentoResponse;
import me.tell.alimentos.EliminarAlimentoRequest;
import me.tell.alimentos.BusquedaAlimentoResponse.Notificacion;

@Endpoint
public class AlimentosEndPoint{
    @Autowired
    private Ialimentos ialimentos;
    @PayloadRoot(namespace="http://tell.me/alimentos",localPart="AnadirAlimentoRequest" )
    @ResponsePayload
    public AnadirAlimentoResponse dameAlimento(@RequestPayload AnadirAlimentoRequest peticion){
        AnadirAlimentoResponse respuesta = new AnadirAlimentoResponse();
        respuesta.setRespuesta("Se agregó correctamente el alimento " + peticion.getNombre());

        Alimentos alimentos = new Alimentos();
        alimentos.setNombre(peticion.getNombre());
        alimentos.setDescripcion(peticion.getDescripcion());
        alimentos.setPrecio(peticion.getPrecio());
        alimentos.setCantidadExistente(peticion.getCantidadExistente());
        alimentos.setFechaElaboracion(peticion.getFechaElaboracion());
        alimentos.setFechaCaducidad(peticion.getFechaCaducidad());
        alimentos.setCategoria(peticion.getCategoria());

        ialimentos.save(alimentos);
        
        return respuesta;
    }

    @PayloadRoot(namespace="http://tell.me/alimentos",localPart="BusquedaAlimentoRequest" )
    @ResponsePayload
    public BusquedaAlimentoResponse dameAlimentos(){
        BusquedaAlimentoResponse respuesta = new BusquedaAlimentoResponse();
        Iterable<Alimentos> listaAlimentos = ialimentos.findAll();
        
        for(Alimentos ls : listaAlimentos){
            BusquedaAlimentoResponse.Notificacion notificacion = new BusquedaAlimentoResponse.Notificacion();
            notificacion.setId(ls.getId());
            notificacion.setNombre(ls.getNombre());
            notificacion.setDescripcion(ls.getDescripcion());
            notificacion.setPrecio(ls.getPrecio());
            notificacion.setCantidadExistente(ls.getCantidadExistente());
            notificacion.setFechaElaboracion(ls.getFechaElaboracion());
            notificacion.setFechaCaducidad(ls.getFechaCaducidad());
            notificacion.setCategoria(ls.getCategoria());
            respuesta.getNotificacion().add(notificacion);
        }
        return respuesta;
    }

    @PayloadRoot(namespace="http://tell.me/alimentos",localPart="BusquedaAlimentoPrecioRequest" )
    @ResponsePayload
    public BusquedaAlimentoPrecioResponse damePrecioAlimentos(@RequestPayload BusquedaAlimentoPrecioRequest peticion){
        BusquedaAlimentoPrecioResponse respuesta = new BusquedaAlimentoPrecioResponse();
        Iterable<Alimentos> listaAlimentos = ialimentos.findAll();
        boolean presupuesto=false;
    
        for(Alimentos ls : listaAlimentos){
            BusquedaAlimentoPrecioResponse.Notificacion notificacion = new BusquedaAlimentoPrecioResponse.Notificacion();
            Integer precioProductos=ls.getPrecio(); 
            Integer precioInsertado=peticion.getBusquedaPrecio();
                if(precioInsertado >= precioProductos){
                    presupuesto=true;
                    notificacion.setId(ls.getId());
                    notificacion.setNombre(ls.getNombre());
                    notificacion.setPrecio(ls.getPrecio());
                    respuesta.getNotificacion().add(notificacion);
                }
        }
        if(!presupuesto)
            respuesta.setRespuesta("Saldo Insuficiente para Adquirir un Producto con  " + peticion.getBusquedaPrecio());  
        return respuesta;
    }

    @PayloadRoot(namespace="http://tell.me/alimentos",localPart="ModificarAlimentoRequest" )
    @ResponsePayload
    public ModificarAlimentoResponse modificarAlimento(@RequestPayload ModificarAlimentoRequest peticion){
        ModificarAlimentoResponse respuesta = new ModificarAlimentoResponse();
        Optional<Alimentos> s = ialimentos.findById(peticion.getId());

        if(s.isPresent()){
            Alimentos alimentos = new Alimentos();
            alimentos = s.get();
            alimentos.setNombre(peticion.getNombre());
            alimentos.setDescripcion(peticion.getDescripcion());
            alimentos.setPrecio(peticion.getPrecio());
            alimentos.setCantidadExistente(peticion.getCantidadExistente());
            alimentos.setFechaElaboracion(peticion.getFechaElaboracion());
            alimentos.setFechaCaducidad(peticion.getFechaCaducidad());
            alimentos.setCategoria(peticion.getCategoria());
            ialimentos.save(alimentos);
            respuesta.setRespuesta("Se modificó el alimento: " + peticion.getNombre());
        }else{
            respuesta.setRespuesta("Id no existe: " + peticion.getId());
        }
        return respuesta;
    }

    @PayloadRoot(namespace="http://tell.me/alimentos",localPart="EliminarAlimentoRequest")
    @ResponsePayload
    public EliminarAlimentoResponse eliminaAlimento(@RequestPayload EliminarAlimentoRequest peticion){
        EliminarAlimentoResponse respuesta= new EliminarAlimentoResponse();
        respuesta.setRespuesta("Se eliminó el alimento " + peticion.getId());
        ialimentos.deleteById(peticion.getId());
    
        return respuesta;
    }
}
