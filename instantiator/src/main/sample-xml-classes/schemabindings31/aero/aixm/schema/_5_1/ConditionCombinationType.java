//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package schemabindings31.aero.aixm.schema._5_1;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConditionCombinationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConditionCombinationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractPropertiesWithScheduleType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1.1}PropertiesWithSchedulePropertyGroup"/>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1.1}ConditionCombinationPropertyGroup"/>
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractPropertiesWithScheduleExtension"/>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractConditionCombinationExtension"/>
 *                 &lt;/choice>
 *                 &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionCombinationType", propOrder = {
    "timeInterval",
    "annotation",
    "specialDateAuthority",
    "logicalOperator",
    "weather",
    "aircraft",
    "flight",
    "subCondition",
    "extension"
})
public class ConditionCombinationType
    extends AbstractPropertiesWithScheduleType
{

    @XmlElement(nillable = true)
    protected List<TimesheetPropertyType> timeInterval;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    @XmlElement(nillable = true)
    protected List<OrganisationAuthorityPropertyType> specialDateAuthority;
    @XmlElementRef(name = "logicalOperator", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeLogicalOperatorType> logicalOperator;
    @XmlElement(nillable = true)
    protected List<MeteorologyPropertyType> weather;
    @XmlElement(nillable = true)
    protected List<AircraftCharacteristicPropertyType> aircraft;
    @XmlElement(nillable = true)
    protected List<FlightCharacteristicPropertyType> flight;
    @XmlElement(nillable = true)
    protected List<ConditionCombinationPropertyType> subCondition;
    protected List<ConditionCombinationType.Extension> extension;

    /**
     * Gets the value of the timeInterval property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeInterval property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeInterval().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimesheetPropertyType }
     * 
     * 
     */
    public List<TimesheetPropertyType> getTimeInterval() {
        if (timeInterval == null) {
            timeInterval = new ArrayList<TimesheetPropertyType>();
        }
        return this.timeInterval;
    }

    public boolean isSetTimeInterval() {
        return ((this.timeInterval!= null)&&(!this.timeInterval.isEmpty()));
    }

    public void unsetTimeInterval() {
        this.timeInterval = null;
    }

    /**
     * Gets the value of the annotation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotePropertyType }
     * 
     * 
     */
    public List<NotePropertyType> getAnnotation() {
        if (annotation == null) {
            annotation = new ArrayList<NotePropertyType>();
        }
        return this.annotation;
    }

    public boolean isSetAnnotation() {
        return ((this.annotation!= null)&&(!this.annotation.isEmpty()));
    }

    public void unsetAnnotation() {
        this.annotation = null;
    }

    /**
     * Gets the value of the specialDateAuthority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialDateAuthority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialDateAuthority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationAuthorityPropertyType }
     * 
     * 
     */
    public List<OrganisationAuthorityPropertyType> getSpecialDateAuthority() {
        if (specialDateAuthority == null) {
            specialDateAuthority = new ArrayList<OrganisationAuthorityPropertyType>();
        }
        return this.specialDateAuthority;
    }

    public boolean isSetSpecialDateAuthority() {
        return ((this.specialDateAuthority!= null)&&(!this.specialDateAuthority.isEmpty()));
    }

    public void unsetSpecialDateAuthority() {
        this.specialDateAuthority = null;
    }

    /**
     * Gets the value of the logicalOperator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeLogicalOperatorType }{@code >}
     *     
     */
    public JAXBElement<CodeLogicalOperatorType> getLogicalOperator() {
        return logicalOperator;
    }

    /**
     * Sets the value of the logicalOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeLogicalOperatorType }{@code >}
     *     
     */
    public void setLogicalOperator(JAXBElement<CodeLogicalOperatorType> value) {
        this.logicalOperator = value;
    }

    public boolean isSetLogicalOperator() {
        return (this.logicalOperator!= null);
    }

    /**
     * Gets the value of the weather property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weather property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeather().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeteorologyPropertyType }
     * 
     * 
     */
    public List<MeteorologyPropertyType> getWeather() {
        if (weather == null) {
            weather = new ArrayList<MeteorologyPropertyType>();
        }
        return this.weather;
    }

    public boolean isSetWeather() {
        return ((this.weather!= null)&&(!this.weather.isEmpty()));
    }

    public void unsetWeather() {
        this.weather = null;
    }

    /**
     * Gets the value of the aircraft property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aircraft property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAircraft().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AircraftCharacteristicPropertyType }
     * 
     * 
     */
    public List<AircraftCharacteristicPropertyType> getAircraft() {
        if (aircraft == null) {
            aircraft = new ArrayList<AircraftCharacteristicPropertyType>();
        }
        return this.aircraft;
    }

    public boolean isSetAircraft() {
        return ((this.aircraft!= null)&&(!this.aircraft.isEmpty()));
    }

    public void unsetAircraft() {
        this.aircraft = null;
    }

    /**
     * Gets the value of the flight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightCharacteristicPropertyType }
     * 
     * 
     */
    public List<FlightCharacteristicPropertyType> getFlight() {
        if (flight == null) {
            flight = new ArrayList<FlightCharacteristicPropertyType>();
        }
        return this.flight;
    }

    public boolean isSetFlight() {
        return ((this.flight!= null)&&(!this.flight.isEmpty()));
    }

    public void unsetFlight() {
        this.flight = null;
    }

    /**
     * Gets the value of the subCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionCombinationPropertyType }
     * 
     * 
     */
    public List<ConditionCombinationPropertyType> getSubCondition() {
        if (subCondition == null) {
            subCondition = new ArrayList<ConditionCombinationPropertyType>();
        }
        return this.subCondition;
    }

    public boolean isSetSubCondition() {
        return ((this.subCondition!= null)&&(!this.subCondition.isEmpty()));
    }

    public void unsetSubCondition() {
        this.subCondition = null;
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
     * {@link ConditionCombinationType.Extension }
     * 
     * 
     */
    public List<ConditionCombinationType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ConditionCombinationType.Extension>();
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractPropertiesWithScheduleExtension"/>
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractConditionCombinationExtension"/>
     *       &lt;/choice>
     *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}OwnershipAttributeGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "abstractPropertiesWithScheduleExtension",
        "abstractConditionCombinationExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractPropertiesWithScheduleExtension")
        protected AbstractExtensionType abstractPropertiesWithScheduleExtension;
        @XmlElement(name = "AbstractConditionCombinationExtension")
        protected AbstractExtensionType abstractConditionCombinationExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractPropertiesWithScheduleExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractPropertiesWithScheduleExtension() {
            return abstractPropertiesWithScheduleExtension;
        }

        /**
         * Sets the value of the abstractPropertiesWithScheduleExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractPropertiesWithScheduleExtension(AbstractExtensionType value) {
            this.abstractPropertiesWithScheduleExtension = value;
        }

        public boolean isSetAbstractPropertiesWithScheduleExtension() {
            return (this.abstractPropertiesWithScheduleExtension!= null);
        }

        /**
         * Gets the value of the abstractConditionCombinationExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractConditionCombinationExtension() {
            return abstractConditionCombinationExtension;
        }

        /**
         * Sets the value of the abstractConditionCombinationExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractConditionCombinationExtension(AbstractExtensionType value) {
            this.abstractConditionCombinationExtension = value;
        }

        public boolean isSetAbstractConditionCombinationExtension() {
            return (this.abstractConditionCombinationExtension!= null);
        }

        /**
         * Gets the value of the owns property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isOwns() {
            if (owns == null) {
                return false;
            } else {
                return owns;
            }
        }

        /**
         * Sets the value of the owns property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOwns(boolean value) {
            this.owns = value;
        }

        public boolean isSetOwns() {
            return (this.owns!= null);
        }

        public void unsetOwns() {
            this.owns = null;
        }

    }

}
