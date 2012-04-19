
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

@XmlRootElement(name = "vtkContourFilter", namespace = "http://services.trustlab.utep.edu/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vtkContourFilter", namespace = "http://services.trustlab.utep.edu/", propOrder = {"url", "numContours", "scalarRange"})

public class VtkContourFilter {

    @XmlElement(name = "url")
    private java.lang.String url;
    @XmlElement(name = "numContours")
    private java.lang.String numContours;
    @XmlElement(name = "scalarRange")
    private java.lang.String scalarRange;

    public java.lang.String getUrl() {
        return this.url;
    }

    public void setUrl(java.lang.String newUrl)  {
        this.url = newUrl;
    }

    public java.lang.String getNumContours() {
        return this.numContours;
    }

    public void setNumContours(java.lang.String newNumContours)  {
        this.numContours = newNumContours;
    }

    public java.lang.String getScalarRange() {
        return this.scalarRange;
    }

    public void setScalarRange(java.lang.String newScalarRange)  {
        this.scalarRange = newScalarRange;
    }

}
