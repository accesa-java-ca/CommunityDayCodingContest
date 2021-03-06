//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package schemabindings31._int.icao.iwxxm._3;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import schemabindings31.net.opengis.gml.v_3_2_1.AssociationRoleType;
import schemabindings31.net.opengis.gml.v_3_2_1.TimeInstantPropertyType;
import schemabindings31.net.opengis.gml.v_3_2_1.TimePeriodPropertyType;


/**
 * <p>Java class for SIGMETType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SIGMETType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://icao.int/iwxxm/3.0}ReportType">
 *       &lt;sequence>
 *         &lt;element name="issueTime" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType"/>
 *         &lt;element name="issuingAirTrafficServicesUnit" type="{http://icao.int/iwxxm/3.0}UnitPropertyType"/>
 *         &lt;element name="originatingMeteorologicalWatchOffice" type="{http://icao.int/iwxxm/3.0}UnitPropertyType" minOccurs="0"/>
 *         &lt;element name="issuingAirTrafficServicesRegion" type="{http://icao.int/iwxxm/3.0}AirspacePropertyType" minOccurs="0"/>
 *         &lt;element name="sequenceNumber" type="{http://icao.int/iwxxm/3.0}StringWithNilReasonType" minOccurs="0"/>
 *         &lt;element name="validPeriod" type="{http://www.opengis.net/gml/3.2}TimePeriodPropertyType"/>
 *         &lt;element name="cancelledReportSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancelledReportValidPeriod" type="{http://www.opengis.net/gml/3.2}TimePeriodPropertyType" minOccurs="0"/>
 *         &lt;element name="phenomenon" type="{http://icao.int/iwxxm/3.0}AeronauticalSignificantWeatherPhenomenonType" minOccurs="0"/>
 *         &lt;element name="analysis" type="{http://www.opengis.net/gml/3.2}AssociationRoleType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="forecastPositionAnalysis" type="{http://www.opengis.net/gml/3.2}AssociationRoleType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://icao.int/iwxxm/3.0}ExtensionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="isCancelReport" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SIGMETType", propOrder = {
    "issueTime",
    "issuingAirTrafficServicesUnit",
    "originatingMeteorologicalWatchOffice",
    "issuingAirTrafficServicesRegion",
    "sequenceNumber",
    "validPeriod",
    "cancelledReportSequenceNumber",
    "cancelledReportValidPeriod",
    "phenomenon",
    "analysis",
    "forecastPositionAnalysis",
    "extension"
})
@XmlSeeAlso({
    TropicalCycloneSIGMETType.class,
    VolcanicAshSIGMETType.class
})
public class SIGMETType
    extends ReportType
{

    @XmlElement(required = true)
    protected TimeInstantPropertyType issueTime;
    @XmlElement(required = true)
    protected UnitPropertyType issuingAirTrafficServicesUnit;
    protected UnitPropertyType originatingMeteorologicalWatchOffice;
    protected AirspacePropertyType issuingAirTrafficServicesRegion;
    protected StringWithNilReasonType sequenceNumber;
    @XmlElement(required = true)
    protected TimePeriodPropertyType validPeriod;
    protected String cancelledReportSequenceNumber;
    protected TimePeriodPropertyType cancelledReportValidPeriod;
    protected AeronauticalSignificantWeatherPhenomenonType phenomenon;
    protected List<AssociationRoleType> analysis;
    protected List<AssociationRoleType> forecastPositionAnalysis;
    protected List<ExtensionType> extension;
    @XmlAttribute(name = "isCancelReport")
    protected Boolean isCancelReport;

    /**
     * Gets the value of the issueTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public TimeInstantPropertyType getIssueTime() {
        return issueTime;
    }

    /**
     * Sets the value of the issueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public void setIssueTime(TimeInstantPropertyType value) {
        this.issueTime = value;
    }

    public boolean isSetIssueTime() {
        return (this.issueTime!= null);
    }

    /**
     * Gets the value of the issuingAirTrafficServicesUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPropertyType }
     *     
     */
    public UnitPropertyType getIssuingAirTrafficServicesUnit() {
        return issuingAirTrafficServicesUnit;
    }

    /**
     * Sets the value of the issuingAirTrafficServicesUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPropertyType }
     *     
     */
    public void setIssuingAirTrafficServicesUnit(UnitPropertyType value) {
        this.issuingAirTrafficServicesUnit = value;
    }

    public boolean isSetIssuingAirTrafficServicesUnit() {
        return (this.issuingAirTrafficServicesUnit!= null);
    }

    /**
     * Gets the value of the originatingMeteorologicalWatchOffice property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPropertyType }
     *     
     */
    public UnitPropertyType getOriginatingMeteorologicalWatchOffice() {
        return originatingMeteorologicalWatchOffice;
    }

    /**
     * Sets the value of the originatingMeteorologicalWatchOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPropertyType }
     *     
     */
    public void setOriginatingMeteorologicalWatchOffice(UnitPropertyType value) {
        this.originatingMeteorologicalWatchOffice = value;
    }

    public boolean isSetOriginatingMeteorologicalWatchOffice() {
        return (this.originatingMeteorologicalWatchOffice!= null);
    }

    /**
     * Gets the value of the issuingAirTrafficServicesRegion property.
     * 
     * @return
     *     possible object is
     *     {@link AirspacePropertyType }
     *     
     */
    public AirspacePropertyType getIssuingAirTrafficServicesRegion() {
        return issuingAirTrafficServicesRegion;
    }

    /**
     * Sets the value of the issuingAirTrafficServicesRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirspacePropertyType }
     *     
     */
    public void setIssuingAirTrafficServicesRegion(AirspacePropertyType value) {
        this.issuingAirTrafficServicesRegion = value;
    }

    public boolean isSetIssuingAirTrafficServicesRegion() {
        return (this.issuingAirTrafficServicesRegion!= null);
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link StringWithNilReasonType }
     *     
     */
    public StringWithNilReasonType getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringWithNilReasonType }
     *     
     */
    public void setSequenceNumber(StringWithNilReasonType value) {
        this.sequenceNumber = value;
    }

    public boolean isSetSequenceNumber() {
        return (this.sequenceNumber!= null);
    }

    /**
     * Gets the value of the validPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public TimePeriodPropertyType getValidPeriod() {
        return validPeriod;
    }

    /**
     * Sets the value of the validPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public void setValidPeriod(TimePeriodPropertyType value) {
        this.validPeriod = value;
    }

    public boolean isSetValidPeriod() {
        return (this.validPeriod!= null);
    }

    /**
     * Gets the value of the cancelledReportSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelledReportSequenceNumber() {
        return cancelledReportSequenceNumber;
    }

    /**
     * Sets the value of the cancelledReportSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelledReportSequenceNumber(String value) {
        this.cancelledReportSequenceNumber = value;
    }

    public boolean isSetCancelledReportSequenceNumber() {
        return (this.cancelledReportSequenceNumber!= null);
    }

    /**
     * Gets the value of the cancelledReportValidPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public TimePeriodPropertyType getCancelledReportValidPeriod() {
        return cancelledReportValidPeriod;
    }

    /**
     * Sets the value of the cancelledReportValidPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodPropertyType }
     *     
     */
    public void setCancelledReportValidPeriod(TimePeriodPropertyType value) {
        this.cancelledReportValidPeriod = value;
    }

    public boolean isSetCancelledReportValidPeriod() {
        return (this.cancelledReportValidPeriod!= null);
    }

    /**
     * Gets the value of the phenomenon property.
     * 
     * @return
     *     possible object is
     *     {@link AeronauticalSignificantWeatherPhenomenonType }
     *     
     */
    public AeronauticalSignificantWeatherPhenomenonType getPhenomenon() {
        return phenomenon;
    }

    /**
     * Sets the value of the phenomenon property.
     * 
     * @param value
     *     allowed object is
     *     {@link AeronauticalSignificantWeatherPhenomenonType }
     *     
     */
    public void setPhenomenon(AeronauticalSignificantWeatherPhenomenonType value) {
        this.phenomenon = value;
    }

    public boolean isSetPhenomenon() {
        return (this.phenomenon!= null);
    }

    /**
     * Gets the value of the analysis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the analysis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnalysis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociationRoleType }
     * 
     * 
     */
    public List<AssociationRoleType> getAnalysis() {
        if (analysis == null) {
            analysis = new ArrayList<AssociationRoleType>();
        }
        return this.analysis;
    }

    public boolean isSetAnalysis() {
        return ((this.analysis!= null)&&(!this.analysis.isEmpty()));
    }

    public void unsetAnalysis() {
        this.analysis = null;
    }

    /**
     * Gets the value of the forecastPositionAnalysis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forecastPositionAnalysis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForecastPositionAnalysis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociationRoleType }
     * 
     * 
     */
    public List<AssociationRoleType> getForecastPositionAnalysis() {
        if (forecastPositionAnalysis == null) {
            forecastPositionAnalysis = new ArrayList<AssociationRoleType>();
        }
        return this.forecastPositionAnalysis;
    }

    public boolean isSetForecastPositionAnalysis() {
        return ((this.forecastPositionAnalysis!= null)&&(!this.forecastPositionAnalysis.isEmpty()));
    }

    public void unsetForecastPositionAnalysis() {
        this.forecastPositionAnalysis = null;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionType }
     * 
     * 
     */
    public List<ExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ExtensionType>();
        }
        return this.extension;
    }

    public boolean isSetExtension() {
        return ((this.extension!= null)&&(!this.extension.isEmpty()));
    }

    public void unsetExtension() {
        this.extension = null;
    }

    /**
     * Gets the value of the isCancelReport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsCancelReport() {
        return isCancelReport;
    }

    /**
     * Sets the value of the isCancelReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCancelReport(boolean value) {
        this.isCancelReport = value;
    }

    public boolean isSetIsCancelReport() {
        return (this.isCancelReport!= null);
    }

    public void unsetIsCancelReport() {
        this.isCancelReport = null;
    }

}
