
package edu.utep.trustlab.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="I" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="S" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="R" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "url",
    "i",
    "s",
    "r"
})
@XmlRootElement(name = "nearneighbor")
public class Nearneighbor {

    @XmlElementRef(name = "url", namespace = "http://services.trustlab.utep.edu", type = JAXBElement.class)
    protected JAXBElement<String> url;
    @XmlElementRef(name = "I", namespace = "http://services.trustlab.utep.edu", type = JAXBElement.class)
    protected JAXBElement<String> i;
    @XmlElementRef(name = "S", namespace = "http://services.trustlab.utep.edu", type = JAXBElement.class)
    protected JAXBElement<String> s;
    @XmlElementRef(name = "R", namespace = "http://services.trustlab.utep.edu", type = JAXBElement.class)
    protected JAXBElement<String> r;

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUrl(JAXBElement<String> value) {
        this.url = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the i property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getI() {
        return i;
    }

    /**
     * Sets the value of the i property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setI(JAXBElement<String> value) {
        this.i = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the s property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getS() {
        return s;
    }

    /**
     * Sets the value of the s property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setS(JAXBElement<String> value) {
        this.s = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the r property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getR() {
        return r;
    }

    /**
     * Sets the value of the r property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setR(JAXBElement<String> value) {
        this.r = ((JAXBElement<String> ) value);
    }

}
