
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

@XmlRootElement(name = "netCDFGridRaster", namespace = "http://services.trustlab.utep.edu/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "netCDFGridRaster", namespace = "http://services.trustlab.utep.edu/", propOrder = {"url", "plotVariable", "font", "lbOrientation", "colorTable"})

public class NetCDFGridRaster {

    @XmlElement(name = "url")
    private java.lang.String url;
    @XmlElement(name = "plotVariable")
    private java.lang.String plotVariable;
    @XmlElement(name = "font")
    private java.lang.String font;
    @XmlElement(name = "lbOrientation")
    private java.lang.String lbOrientation;
    @XmlElement(name = "colorTable")
    private java.lang.String colorTable;

    public java.lang.String getUrl() {
        return this.url;
    }

    public void setUrl(java.lang.String newUrl)  {
        this.url = newUrl;
    }

    public java.lang.String getPlotVariable() {
        return this.plotVariable;
    }

    public void setPlotVariable(java.lang.String newPlotVariable)  {
        this.plotVariable = newPlotVariable;
    }

    public java.lang.String getFont() {
        return this.font;
    }

    public void setFont(java.lang.String newFont)  {
        this.font = newFont;
    }

    public java.lang.String getLbOrientation() {
        return this.lbOrientation;
    }

    public void setLbOrientation(java.lang.String newLbOrientation)  {
        this.lbOrientation = newLbOrientation;
    }

    public java.lang.String getColorTable() {
        return this.colorTable;
    }

    public void setColorTable(java.lang.String newColorTable)  {
        this.colorTable = newColorTable;
    }

}
