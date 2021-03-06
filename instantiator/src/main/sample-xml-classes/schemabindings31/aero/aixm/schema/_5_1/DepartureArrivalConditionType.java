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
 * <p>Java class for DepartureArrivalConditionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepartureArrivalConditionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.aixm.aero/schema/5.1.1}AbstractAIXMObjectType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.aixm.aero/schema/5.1.1}DepartureArrivalConditionPropertyGroup"/>
 *         &lt;element name="extension" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractDepartureArrivalConditionExtension"/>
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
@XmlType(name = "DepartureArrivalConditionType", propOrder = {
    "minimumEnrouteAltitude",
    "minimumCrossingAtEnd",
    "minimumCrossingAtEndReference",
    "maximumCrossingAtEnd",
    "maximumCrossingAtEndReference",
    "engineType",
    "annotation",
    "extension"
})
public class DepartureArrivalConditionType
    extends AbstractAIXMObjectType
{

    @XmlElementRef(name = "minimumEnrouteAltitude", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumEnrouteAltitude;
    @XmlElementRef(name = "minimumCrossingAtEnd", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> minimumCrossingAtEnd;
    @XmlElementRef(name = "minimumCrossingAtEndReference", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> minimumCrossingAtEndReference;
    @XmlElementRef(name = "maximumCrossingAtEnd", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<ValDistanceVerticalType> maximumCrossingAtEnd;
    @XmlElementRef(name = "maximumCrossingAtEndReference", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<CodeVerticalReferenceType> maximumCrossingAtEndReference;
    @XmlElementRef(name = "engineType", namespace = "http://www.aixm.aero/schema/5.1.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AircraftCharacteristicPropertyType> engineType;
    @XmlElement(nillable = true)
    protected List<NotePropertyType> annotation;
    protected List<DepartureArrivalConditionType.Extension> extension;

    /**
     * Gets the value of the minimumEnrouteAltitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getMinimumEnrouteAltitude() {
        return minimumEnrouteAltitude;
    }

    /**
     * Sets the value of the minimumEnrouteAltitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMinimumEnrouteAltitude(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumEnrouteAltitude = value;
    }

    public boolean isSetMinimumEnrouteAltitude() {
        return (this.minimumEnrouteAltitude!= null);
    }

    /**
     * Gets the value of the minimumCrossingAtEnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getMinimumCrossingAtEnd() {
        return minimumCrossingAtEnd;
    }

    /**
     * Sets the value of the minimumCrossingAtEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMinimumCrossingAtEnd(JAXBElement<ValDistanceVerticalType> value) {
        this.minimumCrossingAtEnd = value;
    }

    public boolean isSetMinimumCrossingAtEnd() {
        return (this.minimumCrossingAtEnd!= null);
    }

    /**
     * Gets the value of the minimumCrossingAtEndReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public JAXBElement<CodeVerticalReferenceType> getMinimumCrossingAtEndReference() {
        return minimumCrossingAtEndReference;
    }

    /**
     * Sets the value of the minimumCrossingAtEndReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setMinimumCrossingAtEndReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.minimumCrossingAtEndReference = value;
    }

    public boolean isSetMinimumCrossingAtEndReference() {
        return (this.minimumCrossingAtEndReference!= null);
    }

    /**
     * Gets the value of the maximumCrossingAtEnd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public JAXBElement<ValDistanceVerticalType> getMaximumCrossingAtEnd() {
        return maximumCrossingAtEnd;
    }

    /**
     * Sets the value of the maximumCrossingAtEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValDistanceVerticalType }{@code >}
     *     
     */
    public void setMaximumCrossingAtEnd(JAXBElement<ValDistanceVerticalType> value) {
        this.maximumCrossingAtEnd = value;
    }

    public boolean isSetMaximumCrossingAtEnd() {
        return (this.maximumCrossingAtEnd!= null);
    }

    /**
     * Gets the value of the maximumCrossingAtEndReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public JAXBElement<CodeVerticalReferenceType> getMaximumCrossingAtEndReference() {
        return maximumCrossingAtEndReference;
    }

    /**
     * Sets the value of the maximumCrossingAtEndReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CodeVerticalReferenceType }{@code >}
     *     
     */
    public void setMaximumCrossingAtEndReference(JAXBElement<CodeVerticalReferenceType> value) {
        this.maximumCrossingAtEndReference = value;
    }

    public boolean isSetMaximumCrossingAtEndReference() {
        return (this.maximumCrossingAtEndReference!= null);
    }

    /**
     * Gets the value of the engineType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AircraftCharacteristicPropertyType }{@code >}
     *     
     */
    public JAXBElement<AircraftCharacteristicPropertyType> getEngineType() {
        return engineType;
    }

    /**
     * Sets the value of the engineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AircraftCharacteristicPropertyType }{@code >}
     *     
     */
    public void setEngineType(JAXBElement<AircraftCharacteristicPropertyType> value) {
        this.engineType = value;
    }

    public boolean isSetEngineType() {
        return (this.engineType!= null);
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
     * {@link DepartureArrivalConditionType.Extension }
     * 
     * 
     */
    public List<DepartureArrivalConditionType.Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<DepartureArrivalConditionType.Extension>();
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
     *         &lt;element ref="{http://www.aixm.aero/schema/5.1.1}AbstractDepartureArrivalConditionExtension"/>
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
        "abstractDepartureArrivalConditionExtension"
    })
    public static class Extension {

        @XmlElement(name = "AbstractDepartureArrivalConditionExtension")
        protected AbstractExtensionType abstractDepartureArrivalConditionExtension;
        @XmlAttribute(name = "owns")
        protected Boolean owns;

        /**
         * Gets the value of the abstractDepartureArrivalConditionExtension property.
         * 
         * @return
         *     possible object is
         *     {@link AbstractExtensionType }
         *     
         */
        public AbstractExtensionType getAbstractDepartureArrivalConditionExtension() {
            return abstractDepartureArrivalConditionExtension;
        }

        /**
         * Sets the value of the abstractDepartureArrivalConditionExtension property.
         * 
         * @param value
         *     allowed object is
         *     {@link AbstractExtensionType }
         *     
         */
        public void setAbstractDepartureArrivalConditionExtension(AbstractExtensionType value) {
            this.abstractDepartureArrivalConditionExtension = value;
        }

        public boolean isSetAbstractDepartureArrivalConditionExtension() {
            return (this.abstractDepartureArrivalConditionExtension!= null);
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
