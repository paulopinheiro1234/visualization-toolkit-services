
package edu.utep.trustlab.services.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.5.2
 * Tue Apr 17 15:20:30 MDT 2012
 * Generated source version: 2.5.2
 */

@XmlRootElement(name = "grdcontour", namespace = "http://services.trustlab.utep.edu/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "grdcontour", namespace = "http://services.trustlab.utep.edu/", propOrder = {"url", "C", "A", "J", "S", "B", "Wa", "Wc"})

public class Grdcontour {

    @XmlElement(name = "url")
    private java.lang.String url;
    @XmlElement(name = "C")
    private java.lang.String C;
    @XmlElement(name = "A")
    private java.lang.String A;
    @XmlElement(name = "J")
    private java.lang.String J;
    @XmlElement(name = "S")
    private java.lang.String S;
    @XmlElement(name = "B")
    private java.lang.String B;
    @XmlElement(name = "Wa")
    private java.lang.String Wa;
    @XmlElement(name = "Wc")
    private java.lang.String Wc;

    public java.lang.String getUrl() {
        return this.url;
    }

    public void setUrl(java.lang.String newUrl)  {
        this.url = newUrl;
    }

    public java.lang.String getC() {
        return this.C;
    }

    public void setC(java.lang.String newC)  {
        this.C = newC;
    }

    public java.lang.String getA() {
        return this.A;
    }

    public void setA(java.lang.String newA)  {
        this.A = newA;
    }

    public java.lang.String getJ() {
        return this.J;
    }

    public void setJ(java.lang.String newJ)  {
        this.J = newJ;
    }

    public java.lang.String getS() {
        return this.S;
    }

    public void setS(java.lang.String newS)  {
        this.S = newS;
    }

    public java.lang.String getB() {
        return this.B;
    }

    public void setB(java.lang.String newB)  {
        this.B = newB;
    }

    public java.lang.String getWa() {
        return this.Wa;
    }

    public void setWa(java.lang.String newWa)  {
        this.Wa = newWa;
    }

    public java.lang.String getWc() {
        return this.Wc;
    }

    public void setWc(java.lang.String newWc)  {
        this.Wc = newWc;
    }

}
