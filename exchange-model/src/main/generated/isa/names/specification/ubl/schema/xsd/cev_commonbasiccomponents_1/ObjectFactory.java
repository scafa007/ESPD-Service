//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.11 at 11:41:57 AM CET 
//


package isa.names.specification.ubl.schema.xsd.cev_commonbasiccomponents_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.DescriptionType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TypeCodeType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the isa.names.specification.ubl.schema.xsd.cev_commonbasiccomponents_1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EmbeddedEvidenceIndicator_QNAME = new QName("urn:isa:names:specification:ubl:schema:xsd:CEV-CommonBasicComponents-1", "EmbeddedEvidenceIndicator");
    private final static QName _EvidenceID_QNAME = new QName("urn:isa:names:specification:ubl:schema:xsd:CEV-CommonBasicComponents-1", "EvidenceID");
    private final static QName _EvidenceTypeCode_QNAME = new QName("urn:isa:names:specification:ubl:schema:xsd:CEV-CommonBasicComponents-1", "EvidenceTypeCode");
    private final static QName _EvidenceName_QNAME = new QName("urn:isa:names:specification:ubl:schema:xsd:CEV-CommonBasicComponents-1", "EvidenceName");
    private final static QName _EvidenceDescription_QNAME = new QName("urn:isa:names:specification:ubl:schema:xsd:CEV-CommonBasicComponents-1", "EvidenceDescription");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: isa.names.specification.ubl.schema.xsd.cev_commonbasiccomponents_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IndicatorType }
     * 
     */
    public IndicatorType createIndicatorType() {
        return new IndicatorType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndicatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:isa:names:specification:ubl:schema:xsd:CEV-CommonBasicComponents-1", name = "EmbeddedEvidenceIndicator")
    public JAXBElement<IndicatorType> createEmbeddedEvidenceIndicator(IndicatorType value) {
        return new JAXBElement<IndicatorType>(_EmbeddedEvidenceIndicator_QNAME, IndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IDType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:isa:names:specification:ubl:schema:xsd:CEV-CommonBasicComponents-1", name = "EvidenceID")
    public JAXBElement<IDType> createEvidenceID(IDType value) {
        return new JAXBElement<IDType>(_EvidenceID_QNAME, IDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:isa:names:specification:ubl:schema:xsd:CEV-CommonBasicComponents-1", name = "EvidenceTypeCode")
    public JAXBElement<TypeCodeType> createEvidenceTypeCode(TypeCodeType value) {
        return new JAXBElement<TypeCodeType>(_EvidenceTypeCode_QNAME, TypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:isa:names:specification:ubl:schema:xsd:CEV-CommonBasicComponents-1", name = "EvidenceName")
    public JAXBElement<NameType> createEvidenceName(NameType value) {
        return new JAXBElement<NameType>(_EvidenceName_QNAME, NameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescriptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:isa:names:specification:ubl:schema:xsd:CEV-CommonBasicComponents-1", name = "EvidenceDescription")
    public JAXBElement<DescriptionType> createEvidenceDescription(DescriptionType value) {
        return new JAXBElement<DescriptionType>(_EvidenceDescription_QNAME, DescriptionType.class, null, value);
    }

}