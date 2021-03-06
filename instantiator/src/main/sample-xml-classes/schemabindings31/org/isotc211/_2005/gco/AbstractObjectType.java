//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package schemabindings31.org.isotc211._2005.gco;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import schemabindings31.org.isotc211._2005.gmd.AbstractDQElementType;
import schemabindings31.org.isotc211._2005.gmd.AbstractDQResultType;
import schemabindings31.org.isotc211._2005.gmd.AbstractDSAggregateType;
import schemabindings31.org.isotc211._2005.gmd.AbstractEXGeographicExtentType;
import schemabindings31.org.isotc211._2005.gmd.AbstractMDContentInformationType;
import schemabindings31.org.isotc211._2005.gmd.AbstractMDIdentificationType;
import schemabindings31.org.isotc211._2005.gmd.AbstractMDSpatialRepresentationType;
import schemabindings31.org.isotc211._2005.gmd.AbstractRSReferenceSystemType;
import schemabindings31.org.isotc211._2005.gmd.CIAddressType;
import schemabindings31.org.isotc211._2005.gmd.CICitationType;
import schemabindings31.org.isotc211._2005.gmd.CIContactType;
import schemabindings31.org.isotc211._2005.gmd.CIDateType;
import schemabindings31.org.isotc211._2005.gmd.CIOnlineResourceType;
import schemabindings31.org.isotc211._2005.gmd.CIResponsiblePartyType;
import schemabindings31.org.isotc211._2005.gmd.CISeriesType;
import schemabindings31.org.isotc211._2005.gmd.CITelephoneType;
import schemabindings31.org.isotc211._2005.gmd.DQDataQualityType;
import schemabindings31.org.isotc211._2005.gmd.DQScopeType;
import schemabindings31.org.isotc211._2005.gmd.DSAssociationType;
import schemabindings31.org.isotc211._2005.gmd.DSDataSetType;
import schemabindings31.org.isotc211._2005.gmd.EXExtentType;
import schemabindings31.org.isotc211._2005.gmd.EXTemporalExtentType;
import schemabindings31.org.isotc211._2005.gmd.EXVerticalExtentType;
import schemabindings31.org.isotc211._2005.gmd.LILineageType;
import schemabindings31.org.isotc211._2005.gmd.LIProcessStepType;
import schemabindings31.org.isotc211._2005.gmd.LISourceType;
import schemabindings31.org.isotc211._2005.gmd.MDAggregateInformationType;
import schemabindings31.org.isotc211._2005.gmd.MDApplicationSchemaInformationType;
import schemabindings31.org.isotc211._2005.gmd.MDBrowseGraphicType;
import schemabindings31.org.isotc211._2005.gmd.MDConstraintsType;
import schemabindings31.org.isotc211._2005.gmd.MDDigitalTransferOptionsType;
import schemabindings31.org.isotc211._2005.gmd.MDDimensionType;
import schemabindings31.org.isotc211._2005.gmd.MDDistributionType;
import schemabindings31.org.isotc211._2005.gmd.MDDistributorType;
import schemabindings31.org.isotc211._2005.gmd.MDExtendedElementInformationType;
import schemabindings31.org.isotc211._2005.gmd.MDFormatType;
import schemabindings31.org.isotc211._2005.gmd.MDGeometricObjectsType;
import schemabindings31.org.isotc211._2005.gmd.MDIdentifierType;
import schemabindings31.org.isotc211._2005.gmd.MDKeywordsType;
import schemabindings31.org.isotc211._2005.gmd.MDMaintenanceInformationType;
import schemabindings31.org.isotc211._2005.gmd.MDMediumType;
import schemabindings31.org.isotc211._2005.gmd.MDMetadataExtensionInformationType;
import schemabindings31.org.isotc211._2005.gmd.MDMetadataType;
import schemabindings31.org.isotc211._2005.gmd.MDPortrayalCatalogueReferenceType;
import schemabindings31.org.isotc211._2005.gmd.MDRangeDimensionType;
import schemabindings31.org.isotc211._2005.gmd.MDReferenceSystemType;
import schemabindings31.org.isotc211._2005.gmd.MDRepresentativeFractionType;
import schemabindings31.org.isotc211._2005.gmd.MDStandardOrderProcessType;
import schemabindings31.org.isotc211._2005.gmd.MDUsageType;
import schemabindings31.org.isotc211._2005.gmd.PTFreeTextType;
import schemabindings31.org.isotc211._2005.gmd.PTLocaleType;


/**
 * <p>Java class for AbstractObject_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractObject_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.isotc211.org/2005/gco}ObjectIdentification"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractObject_Type")
@XmlSeeAlso({
    CICitationType.class,
    EXExtentType.class,
    MDDimensionType.class,
    LILineageType.class,
    DQDataQualityType.class,
    CIContactType.class,
    MDApplicationSchemaInformationType.class,
    MDPortrayalCatalogueReferenceType.class,
    MDBrowseGraphicType.class,
    MDFormatType.class,
    CIDateType.class,
    DSAssociationType.class,
    AbstractRSReferenceSystemType.class,
    MDUsageType.class,
    MDMaintenanceInformationType.class,
    EXTemporalExtentType.class,
    MDReferenceSystemType.class,
    MDIdentifierType.class,
    MDMetadataType.class,
    MDDistributionType.class,
    CITelephoneType.class,
    MDRangeDimensionType.class,
    CISeriesType.class,
    LIProcessStepType.class,
    MDDistributorType.class,
    CIResponsiblePartyType.class,
    DQScopeType.class,
    AbstractEXGeographicExtentType.class,
    EXVerticalExtentType.class,
    CIOnlineResourceType.class,
    AbstractDQResultType.class,
    AbstractMDSpatialRepresentationType.class,
    MDDigitalTransferOptionsType.class,
    PTLocaleType.class,
    PTFreeTextType.class,
    MDGeometricObjectsType.class,
    MDMediumType.class,
    MDKeywordsType.class,
    MDExtendedElementInformationType.class,
    MDMetadataExtensionInformationType.class,
    LISourceType.class,
    AbstractMDIdentificationType.class,
    AbstractDSAggregateType.class,
    MDConstraintsType.class,
    CIAddressType.class,
    AbstractMDContentInformationType.class,
    MDAggregateInformationType.class,
    DSDataSetType.class,
    MDStandardOrderProcessType.class,
    AbstractDQElementType.class,
    MDRepresentativeFractionType.class,
    TypeNameType.class,
    MultiplicityRangeType.class,
    MultiplicityType.class,
    MemberNameType.class
})
public abstract class AbstractObjectType {

    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "uuid")
    protected String uuid;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public boolean isSetId() {
        return (this.id!= null);
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    public boolean isSetUuid() {
        return (this.uuid!= null);
    }

}
