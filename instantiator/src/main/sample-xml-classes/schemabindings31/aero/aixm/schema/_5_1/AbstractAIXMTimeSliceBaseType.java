//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.06 at 11:11:25 PM MSK 
//


package schemabindings31.aero.aixm.schema._5_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import schemabindings31.net.opengis.gml.v_3_2_1.AbstractTimeSliceType;


/**
 * Base type of AIXM Timeslices.  Removes option attributes that are not used in AIXM.
 * 
 * <p>Java class for AbstractAIXMTimeSliceBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractAIXMTimeSliceBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.opengis.net/gml/3.2}AbstractTimeSliceType">
 *       &lt;sequence>
 *         &lt;sequence>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opengis.net/gml/3.2}validTime"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.opengis.net/gml/3.2}id use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractAIXMTimeSliceBaseType")
@XmlSeeAlso({
    AbstractAIXMTimeSliceType.class
})
public abstract class AbstractAIXMTimeSliceBaseType
    extends AbstractTimeSliceType
{


}
