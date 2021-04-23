//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.04.22 a las 06:05:25 PM CDT 
//


package me.tell.alimentos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="busqueda_precio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "busquedaPrecio"
})
@XmlRootElement(name = "BusquedaAlimentoPrecioRequest")
public class BusquedaAlimentoPrecioRequest {

    @XmlElement(name = "busqueda_precio")
    protected int busquedaPrecio;

    /**
     * Obtiene el valor de la propiedad busquedaPrecio.
     * 
     */
    public int getBusquedaPrecio() {
        return busquedaPrecio;
    }

    /**
     * Define el valor de la propiedad busquedaPrecio.
     * 
     */
    public void setBusquedaPrecio(int value) {
        this.busquedaPrecio = value;
    }

}
