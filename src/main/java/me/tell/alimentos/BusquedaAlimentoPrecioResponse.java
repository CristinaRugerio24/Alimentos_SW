//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.04.22 a las 06:05:25 PM CDT 
//


package me.tell.alimentos;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="notificacion" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="cantidad_existente" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="fecha_elaboracion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="fecha_caducidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="respuesta" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "notificacion",
    "respuesta"
})
@XmlRootElement(name = "BusquedaAlimentoPrecioResponse")
public class BusquedaAlimentoPrecioResponse {

    @XmlElement(required = true)
    protected List<BusquedaAlimentoPrecioResponse.Notificacion> notificacion;
    @XmlElement(required = true)
    protected String respuesta;

    /**
     * Gets the value of the notificacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusquedaAlimentoPrecioResponse.Notificacion }
     * 
     * 
     */
    public List<BusquedaAlimentoPrecioResponse.Notificacion> getNotificacion() {
        if (notificacion == null) {
            notificacion = new ArrayList<BusquedaAlimentoPrecioResponse.Notificacion>();
        }
        return this.notificacion;
    }

    /**
     * Obtiene el valor de la propiedad respuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * Define el valor de la propiedad respuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespuesta(String value) {
        this.respuesta = value;
    }


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
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="cantidad_existente" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="fecha_elaboracion" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="fecha_caducidad" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "id",
        "nombre",
        "descripcion",
        "precio",
        "cantidadExistente",
        "fechaElaboracion",
        "fechaCaducidad",
        "categoria"
    })
    public static class Notificacion {

        protected int id;
        @XmlElement(required = true)
        protected String nombre;
        @XmlElement(required = true)
        protected String descripcion;
        protected int precio;
        @XmlElement(name = "cantidad_existente")
        protected int cantidadExistente;
        @XmlElement(name = "fecha_elaboracion", required = true)
        protected String fechaElaboracion;
        @XmlElement(name = "fecha_caducidad", required = true)
        protected String fechaCaducidad;
        @XmlElement(required = true)
        protected String categoria;

        /**
         * Obtiene el valor de la propiedad id.
         * 
         */
        public int getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         */
        public void setId(int value) {
            this.id = value;
        }

        /**
         * Obtiene el valor de la propiedad nombre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(String value) {
            this.nombre = value;
        }

        /**
         * Obtiene el valor de la propiedad descripcion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescripcion() {
            return descripcion;
        }

        /**
         * Define el valor de la propiedad descripcion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescripcion(String value) {
            this.descripcion = value;
        }

        /**
         * Obtiene el valor de la propiedad precio.
         * 
         */
        public int getPrecio() {
            return precio;
        }

        /**
         * Define el valor de la propiedad precio.
         * 
         */
        public void setPrecio(int value) {
            this.precio = value;
        }

        /**
         * Obtiene el valor de la propiedad cantidadExistente.
         * 
         */
        public int getCantidadExistente() {
            return cantidadExistente;
        }

        /**
         * Define el valor de la propiedad cantidadExistente.
         * 
         */
        public void setCantidadExistente(int value) {
            this.cantidadExistente = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaElaboracion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFechaElaboracion() {
            return fechaElaboracion;
        }

        /**
         * Define el valor de la propiedad fechaElaboracion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFechaElaboracion(String value) {
            this.fechaElaboracion = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaCaducidad.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFechaCaducidad() {
            return fechaCaducidad;
        }

        /**
         * Define el valor de la propiedad fechaCaducidad.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFechaCaducidad(String value) {
            this.fechaCaducidad = value;
        }

        /**
         * Obtiene el valor de la propiedad categoria.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategoria() {
            return categoria;
        }

        /**
         * Define el valor de la propiedad categoria.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategoria(String value) {
            this.categoria = value;
        }

    }

}
