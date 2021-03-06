//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package schemabindings31._int.icao.iwxxm._3;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

import schemabindings31._int.wmo.def.metce._2013.EruptingVolcanoPropertyType;
import schemabindings31.net.opengis.gml.v_3_2_1.TimeInstantPropertyType;


/**
 * <p>Java class for VolcanicAshAdvisoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VolcanicAshAdvisoryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://icao.int/iwxxm/3.0}ReportType">
 *       &lt;sequence>
 *         &lt;element name="issueTime" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType"/>
 *         &lt;element name="issuingVolcanicAshAdvisoryCentre" type="{http://icao.int/iwxxm/3.0}UnitPropertyType"/>
 *         &lt;element name="volcano" type="{http://def.wmo.int/metce/2013}EruptingVolcanoPropertyType" minOccurs="0"/>
 *         &lt;element name="stateOrRegion" type="{http://icao.int/iwxxm/3.0}StringWithNilReasonType" minOccurs="0"/>
 *         &lt;element name="summitElevation" type="{http://icao.int/iwxxm/3.0}LengthWithNilReasonType" minOccurs="0"/>
 *         &lt;element name="advisoryNumber" type="{http://icao.int/iwxxm/3.0}StringWithNilReasonType" minOccurs="0"/>
 *         &lt;element name="informationSource" type="{http://icao.int/iwxxm/3.0}StringWithNilReasonType" minOccurs="0"/>
 *         &lt;element name="colourCode" type="{http://icao.int/iwxxm/3.0}AviationColourCodeType" minOccurs="0"/>
 *         &lt;element name="eruptionDetails" type="{http://icao.int/iwxxm/3.0}StringWithNilReasonType" minOccurs="0"/>
 *         &lt;element name="observation" type="{http://icao.int/iwxxm/3.0}VolcanicAshObservedOrEstimatedConditionsPropertyType" minOccurs="0"/>
 *         &lt;element name="forecast" type="{http://icao.int/iwxxm/3.0}VolcanicAshForecastConditionsPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="remarks" type="{http://icao.int/iwxxm/3.0}StringWithNilReasonType" minOccurs="0"/>
 *         &lt;element name="nextAdvisoryTime" type="{http://www.opengis.net/gml/3.2}TimeInstantPropertyType" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://icao.int/iwxxm/3.0}ExtensionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolcanicAshAdvisoryType", propOrder = {
    "issueTime",
    "issuingVolcanicAshAdvisoryCentre",
    "volcano",
    "stateOrRegion",
    "summitElevation",
    "advisoryNumber",
    "informationSource",
    "colourCode",
    "eruptionDetails",
    "observation",
    "forecast",
    "remarks",
    "nextAdvisoryTime",
    "extension"
})
public class VolcanicAshAdvisoryType
    extends ReportType
{

    @XmlElement(required = true)
    protected TimeInstantPropertyType issueTime;
    @XmlElement(required = true)
    protected UnitPropertyType issuingVolcanicAshAdvisoryCentre;
    protected EruptingVolcanoPropertyType volcano;
    protected StringWithNilReasonType stateOrRegion;
    protected LengthWithNilReasonType summitElevation;
    protected StringWithNilReasonType advisoryNumber;
    protected StringWithNilReasonType informationSource;
    @XmlElementRef(name = "colourCode", namespace = "http://icao.int/iwxxm/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<AviationColourCodeType> colourCode;
    @XmlElementRef(name = "eruptionDetails", namespace = "http://icao.int/iwxxm/3.0", type = JAXBElement.class, required = false)
    protected JAXBElement<StringWithNilReasonType> eruptionDetails;
    protected VolcanicAshObservedOrEstimatedConditionsPropertyType observation;
    protected List<VolcanicAshForecastConditionsPropertyType> forecast;
    protected StringWithNilReasonType remarks;
    protected TimeInstantPropertyType nextAdvisoryTime;
    protected List<ExtensionType> extension;

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
     * Gets the value of the issuingVolcanicAshAdvisoryCentre property.
     * 
     * @return
     *     possible object is
     *     {@link UnitPropertyType }
     *     
     */
    public UnitPropertyType getIssuingVolcanicAshAdvisoryCentre() {
        return issuingVolcanicAshAdvisoryCentre;
    }

    /**
     * Sets the value of the issuingVolcanicAshAdvisoryCentre property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitPropertyType }
     *     
     */
    public void setIssuingVolcanicAshAdvisoryCentre(UnitPropertyType value) {
        this.issuingVolcanicAshAdvisoryCentre = value;
    }

    public boolean isSetIssuingVolcanicAshAdvisoryCentre() {
        return (this.issuingVolcanicAshAdvisoryCentre!= null);
    }

    /**
     * Gets the value of the volcano property.
     * 
     * @return
     *     possible object is
     *     {@link EruptingVolcanoPropertyType }
     *     
     */
    public EruptingVolcanoPropertyType getVolcano() {
        return volcano;
    }

    /**
     * Sets the value of the volcano property.
     * 
     * @param value
     *     allowed object is
     *     {@link EruptingVolcanoPropertyType }
     *     
     */
    public void setVolcano(EruptingVolcanoPropertyType value) {
        this.volcano = value;
    }

    public boolean isSetVolcano() {
        return (this.volcano!= null);
    }

    /**
     * Gets the value of the stateOrRegion property.
     * 
     * @return
     *     possible object is
     *     {@link StringWithNilReasonType }
     *     
     */
    public StringWithNilReasonType getStateOrRegion() {
        return stateOrRegion;
    }

    /**
     * Sets the value of the stateOrRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringWithNilReasonType }
     *     
     */
    public void setStateOrRegion(StringWithNilReasonType value) {
        this.stateOrRegion = value;
    }

    public boolean isSetStateOrRegion() {
        return (this.stateOrRegion!= null);
    }

    /**
     * Gets the value of the summitElevation property.
     * 
     * @return
     *     possible object is
     *     {@link LengthWithNilReasonType }
     *     
     */
    public LengthWithNilReasonType getSummitElevation() {
        return summitElevation;
    }

    /**
     * Sets the value of the summitElevation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthWithNilReasonType }
     *     
     */
    public void setSummitElevation(LengthWithNilReasonType value) {
        this.summitElevation = value;
    }

    public boolean isSetSummitElevation() {
        return (this.summitElevation!= null);
    }

    /**
     * Gets the value of the advisoryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link StringWithNilReasonType }
     *     
     */
    public StringWithNilReasonType getAdvisoryNumber() {
        return advisoryNumber;
    }

    /**
     * Sets the value of the advisoryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringWithNilReasonType }
     *     
     */
    public void setAdvisoryNumber(StringWithNilReasonType value) {
        this.advisoryNumber = value;
    }

    public boolean isSetAdvisoryNumber() {
        return (this.advisoryNumber!= null);
    }

    /**
     * Gets the value of the informationSource property.
     * 
     * @return
     *     possible object is
     *     {@link StringWithNilReasonType }
     *     
     */
    public StringWithNilReasonType getInformationSource() {
        return informationSource;
    }

    /**
     * Sets the value of the informationSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringWithNilReasonType }
     *     
     */
    public void setInformationSource(StringWithNilReasonType value) {
        this.informationSource = value;
    }

    public boolean isSetInformationSource() {
        return (this.informationSource!= null);
    }

    /**
     * Gets the value of the colourCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AviationColourCodeType }{@code >}
     *     
     */
    public JAXBElement<AviationColourCodeType> getColourCode() {
        return colourCode;
    }

    /**
     * Sets the value of the colourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AviationColourCodeType }{@code >}
     *     
     */
    public void setColourCode(JAXBElement<AviationColourCodeType> value) {
        this.colourCode = value;
    }

    public boolean isSetColourCode() {
        return (this.colourCode!= null);
    }

    /**
     * Gets the value of the eruptionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringWithNilReasonType }{@code >}
     *     
     */
    public JAXBElement<StringWithNilReasonType> getEruptionDetails() {
        return eruptionDetails;
    }

    /**
     * Sets the value of the eruptionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringWithNilReasonType }{@code >}
     *     
     */
    public void setEruptionDetails(JAXBElement<StringWithNilReasonType> value) {
        this.eruptionDetails = value;
    }

    public boolean isSetEruptionDetails() {
        return (this.eruptionDetails!= null);
    }

    /**
     * Gets the value of the observation property.
     * 
     * @return
     *     possible object is
     *     {@link VolcanicAshObservedOrEstimatedConditionsPropertyType }
     *     
     */
    public VolcanicAshObservedOrEstimatedConditionsPropertyType getObservation() {
        return observation;
    }

    /**
     * Sets the value of the observation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolcanicAshObservedOrEstimatedConditionsPropertyType }
     *     
     */
    public void setObservation(VolcanicAshObservedOrEstimatedConditionsPropertyType value) {
        this.observation = value;
    }

    public boolean isSetObservation() {
        return (this.observation!= null);
    }

    /**
     * Gets the value of the forecast property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forecast property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForecast().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VolcanicAshForecastConditionsPropertyType }
     * 
     * 
     */
    public List<VolcanicAshForecastConditionsPropertyType> getForecast() {
        if (forecast == null) {
            forecast = new ArrayList<VolcanicAshForecastConditionsPropertyType>();
        }
        return this.forecast;
    }

    public boolean isSetForecast() {
        return ((this.forecast!= null)&&(!this.forecast.isEmpty()));
    }

    public void unsetForecast() {
        this.forecast = null;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link StringWithNilReasonType }
     *     
     */
    public StringWithNilReasonType getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringWithNilReasonType }
     *     
     */
    public void setRemarks(StringWithNilReasonType value) {
        this.remarks = value;
    }

    public boolean isSetRemarks() {
        return (this.remarks!= null);
    }

    /**
     * Gets the value of the nextAdvisoryTime property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public TimeInstantPropertyType getNextAdvisoryTime() {
        return nextAdvisoryTime;
    }

    /**
     * Sets the value of the nextAdvisoryTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInstantPropertyType }
     *     
     */
    public void setNextAdvisoryTime(TimeInstantPropertyType value) {
        this.nextAdvisoryTime = value;
    }

    public boolean isSetNextAdvisoryTime() {
        return (this.nextAdvisoryTime!= null);
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

}
