//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.11 at 11:41:57 AM CET 
//


package oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.BaseUnitMeasureType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.CalculationSequenceNumericType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PerUnitAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.PercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TaxableAmountType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TierRangeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TierRatePercentType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.TransactionCurrencyTaxAmountType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for TaxSubtotalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxSubtotalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxableAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TaxAmount"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}CalculationSequenceNumeric" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TransactionCurrencyTaxAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}Percent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}BaseUnitMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}PerUnitAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TierRange" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}TierRatePercent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}TaxCategory"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxSubtotalType", propOrder = {
    "taxableAmount",
    "taxAmount",
    "calculationSequenceNumeric",
    "transactionCurrencyTaxAmount",
    "percent",
    "baseUnitMeasure",
    "perUnitAmount",
    "tierRange",
    "tierRatePercent",
    "taxCategory"
})
public class TaxSubtotalType
    implements Serializable, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 100L;
    @XmlElement(name = "TaxableAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TaxableAmountType taxableAmount;
    @XmlElement(name = "TaxAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2", required = true)
    protected TaxAmountType taxAmount;
    @XmlElement(name = "CalculationSequenceNumeric", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected CalculationSequenceNumericType calculationSequenceNumeric;
    @XmlElement(name = "TransactionCurrencyTaxAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TransactionCurrencyTaxAmountType transactionCurrencyTaxAmount;
    @XmlElement(name = "Percent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PercentType percent;
    @XmlElement(name = "BaseUnitMeasure", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected BaseUnitMeasureType baseUnitMeasure;
    @XmlElement(name = "PerUnitAmount", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected PerUnitAmountType perUnitAmount;
    @XmlElement(name = "TierRange", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TierRangeType tierRange;
    @XmlElement(name = "TierRatePercent", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected TierRatePercentType tierRatePercent;
    @XmlElement(name = "TaxCategory", required = true)
    protected TaxCategoryType taxCategory;

    /**
     * Gets the value of the taxableAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TaxableAmountType }
     *     
     */
    public TaxableAmountType getTaxableAmount() {
        return taxableAmount;
    }

    /**
     * Sets the value of the taxableAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxableAmountType }
     *     
     */
    public void setTaxableAmount(TaxableAmountType value) {
        this.taxableAmount = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TaxAmountType }
     *     
     */
    public TaxAmountType getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxAmountType }
     *     
     */
    public void setTaxAmount(TaxAmountType value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the calculationSequenceNumeric property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationSequenceNumericType }
     *     
     */
    public CalculationSequenceNumericType getCalculationSequenceNumeric() {
        return calculationSequenceNumeric;
    }

    /**
     * Sets the value of the calculationSequenceNumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationSequenceNumericType }
     *     
     */
    public void setCalculationSequenceNumeric(CalculationSequenceNumericType value) {
        this.calculationSequenceNumeric = value;
    }

    /**
     * Gets the value of the transactionCurrencyTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCurrencyTaxAmountType }
     *     
     */
    public TransactionCurrencyTaxAmountType getTransactionCurrencyTaxAmount() {
        return transactionCurrencyTaxAmount;
    }

    /**
     * Sets the value of the transactionCurrencyTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCurrencyTaxAmountType }
     *     
     */
    public void setTransactionCurrencyTaxAmount(TransactionCurrencyTaxAmountType value) {
        this.transactionCurrencyTaxAmount = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link PercentType }
     *     
     */
    public PercentType getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentType }
     *     
     */
    public void setPercent(PercentType value) {
        this.percent = value;
    }

    /**
     * Gets the value of the baseUnitMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link BaseUnitMeasureType }
     *     
     */
    public BaseUnitMeasureType getBaseUnitMeasure() {
        return baseUnitMeasure;
    }

    /**
     * Sets the value of the baseUnitMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseUnitMeasureType }
     *     
     */
    public void setBaseUnitMeasure(BaseUnitMeasureType value) {
        this.baseUnitMeasure = value;
    }

    /**
     * Gets the value of the perUnitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PerUnitAmountType }
     *     
     */
    public PerUnitAmountType getPerUnitAmount() {
        return perUnitAmount;
    }

    /**
     * Sets the value of the perUnitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerUnitAmountType }
     *     
     */
    public void setPerUnitAmount(PerUnitAmountType value) {
        this.perUnitAmount = value;
    }

    /**
     * Gets the value of the tierRange property.
     * 
     * @return
     *     possible object is
     *     {@link TierRangeType }
     *     
     */
    public TierRangeType getTierRange() {
        return tierRange;
    }

    /**
     * Sets the value of the tierRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierRangeType }
     *     
     */
    public void setTierRange(TierRangeType value) {
        this.tierRange = value;
    }

    /**
     * Gets the value of the tierRatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link TierRatePercentType }
     *     
     */
    public TierRatePercentType getTierRatePercent() {
        return tierRatePercent;
    }

    /**
     * Sets the value of the tierRatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierRatePercentType }
     *     
     */
    public void setTierRatePercent(TierRatePercentType value) {
        this.tierRatePercent = value;
    }

    /**
     * Gets the value of the taxCategory property.
     * 
     * @return
     *     possible object is
     *     {@link TaxCategoryType }
     *     
     */
    public TaxCategoryType getTaxCategory() {
        return taxCategory;
    }

    /**
     * Sets the value of the taxCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxCategoryType }
     *     
     */
    public void setTaxCategory(TaxCategoryType value) {
        this.taxCategory = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            TaxableAmountType theTaxableAmount;
            theTaxableAmount = this.getTaxableAmount();
            strategy.appendField(locator, this, "taxableAmount", buffer, theTaxableAmount);
        }
        {
            TaxAmountType theTaxAmount;
            theTaxAmount = this.getTaxAmount();
            strategy.appendField(locator, this, "taxAmount", buffer, theTaxAmount);
        }
        {
            CalculationSequenceNumericType theCalculationSequenceNumeric;
            theCalculationSequenceNumeric = this.getCalculationSequenceNumeric();
            strategy.appendField(locator, this, "calculationSequenceNumeric", buffer, theCalculationSequenceNumeric);
        }
        {
            TransactionCurrencyTaxAmountType theTransactionCurrencyTaxAmount;
            theTransactionCurrencyTaxAmount = this.getTransactionCurrencyTaxAmount();
            strategy.appendField(locator, this, "transactionCurrencyTaxAmount", buffer, theTransactionCurrencyTaxAmount);
        }
        {
            PercentType thePercent;
            thePercent = this.getPercent();
            strategy.appendField(locator, this, "percent", buffer, thePercent);
        }
        {
            BaseUnitMeasureType theBaseUnitMeasure;
            theBaseUnitMeasure = this.getBaseUnitMeasure();
            strategy.appendField(locator, this, "baseUnitMeasure", buffer, theBaseUnitMeasure);
        }
        {
            PerUnitAmountType thePerUnitAmount;
            thePerUnitAmount = this.getPerUnitAmount();
            strategy.appendField(locator, this, "perUnitAmount", buffer, thePerUnitAmount);
        }
        {
            TierRangeType theTierRange;
            theTierRange = this.getTierRange();
            strategy.appendField(locator, this, "tierRange", buffer, theTierRange);
        }
        {
            TierRatePercentType theTierRatePercent;
            theTierRatePercent = this.getTierRatePercent();
            strategy.appendField(locator, this, "tierRatePercent", buffer, theTierRatePercent);
        }
        {
            TaxCategoryType theTaxCategory;
            theTaxCategory = this.getTaxCategory();
            strategy.appendField(locator, this, "taxCategory", buffer, theTaxCategory);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TaxSubtotalType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TaxSubtotalType that = ((TaxSubtotalType) object);
        {
            TaxableAmountType lhsTaxableAmount;
            lhsTaxableAmount = this.getTaxableAmount();
            TaxableAmountType rhsTaxableAmount;
            rhsTaxableAmount = that.getTaxableAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxableAmount", lhsTaxableAmount), LocatorUtils.property(thatLocator, "taxableAmount", rhsTaxableAmount), lhsTaxableAmount, rhsTaxableAmount)) {
                return false;
            }
        }
        {
            TaxAmountType lhsTaxAmount;
            lhsTaxAmount = this.getTaxAmount();
            TaxAmountType rhsTaxAmount;
            rhsTaxAmount = that.getTaxAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxAmount", lhsTaxAmount), LocatorUtils.property(thatLocator, "taxAmount", rhsTaxAmount), lhsTaxAmount, rhsTaxAmount)) {
                return false;
            }
        }
        {
            CalculationSequenceNumericType lhsCalculationSequenceNumeric;
            lhsCalculationSequenceNumeric = this.getCalculationSequenceNumeric();
            CalculationSequenceNumericType rhsCalculationSequenceNumeric;
            rhsCalculationSequenceNumeric = that.getCalculationSequenceNumeric();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "calculationSequenceNumeric", lhsCalculationSequenceNumeric), LocatorUtils.property(thatLocator, "calculationSequenceNumeric", rhsCalculationSequenceNumeric), lhsCalculationSequenceNumeric, rhsCalculationSequenceNumeric)) {
                return false;
            }
        }
        {
            TransactionCurrencyTaxAmountType lhsTransactionCurrencyTaxAmount;
            lhsTransactionCurrencyTaxAmount = this.getTransactionCurrencyTaxAmount();
            TransactionCurrencyTaxAmountType rhsTransactionCurrencyTaxAmount;
            rhsTransactionCurrencyTaxAmount = that.getTransactionCurrencyTaxAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transactionCurrencyTaxAmount", lhsTransactionCurrencyTaxAmount), LocatorUtils.property(thatLocator, "transactionCurrencyTaxAmount", rhsTransactionCurrencyTaxAmount), lhsTransactionCurrencyTaxAmount, rhsTransactionCurrencyTaxAmount)) {
                return false;
            }
        }
        {
            PercentType lhsPercent;
            lhsPercent = this.getPercent();
            PercentType rhsPercent;
            rhsPercent = that.getPercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "percent", lhsPercent), LocatorUtils.property(thatLocator, "percent", rhsPercent), lhsPercent, rhsPercent)) {
                return false;
            }
        }
        {
            BaseUnitMeasureType lhsBaseUnitMeasure;
            lhsBaseUnitMeasure = this.getBaseUnitMeasure();
            BaseUnitMeasureType rhsBaseUnitMeasure;
            rhsBaseUnitMeasure = that.getBaseUnitMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baseUnitMeasure", lhsBaseUnitMeasure), LocatorUtils.property(thatLocator, "baseUnitMeasure", rhsBaseUnitMeasure), lhsBaseUnitMeasure, rhsBaseUnitMeasure)) {
                return false;
            }
        }
        {
            PerUnitAmountType lhsPerUnitAmount;
            lhsPerUnitAmount = this.getPerUnitAmount();
            PerUnitAmountType rhsPerUnitAmount;
            rhsPerUnitAmount = that.getPerUnitAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "perUnitAmount", lhsPerUnitAmount), LocatorUtils.property(thatLocator, "perUnitAmount", rhsPerUnitAmount), lhsPerUnitAmount, rhsPerUnitAmount)) {
                return false;
            }
        }
        {
            TierRangeType lhsTierRange;
            lhsTierRange = this.getTierRange();
            TierRangeType rhsTierRange;
            rhsTierRange = that.getTierRange();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tierRange", lhsTierRange), LocatorUtils.property(thatLocator, "tierRange", rhsTierRange), lhsTierRange, rhsTierRange)) {
                return false;
            }
        }
        {
            TierRatePercentType lhsTierRatePercent;
            lhsTierRatePercent = this.getTierRatePercent();
            TierRatePercentType rhsTierRatePercent;
            rhsTierRatePercent = that.getTierRatePercent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "tierRatePercent", lhsTierRatePercent), LocatorUtils.property(thatLocator, "tierRatePercent", rhsTierRatePercent), lhsTierRatePercent, rhsTierRatePercent)) {
                return false;
            }
        }
        {
            TaxCategoryType lhsTaxCategory;
            lhsTaxCategory = this.getTaxCategory();
            TaxCategoryType rhsTaxCategory;
            rhsTaxCategory = that.getTaxCategory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "taxCategory", lhsTaxCategory), LocatorUtils.property(thatLocator, "taxCategory", rhsTaxCategory), lhsTaxCategory, rhsTaxCategory)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            TaxableAmountType theTaxableAmount;
            theTaxableAmount = this.getTaxableAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxableAmount", theTaxableAmount), currentHashCode, theTaxableAmount);
        }
        {
            TaxAmountType theTaxAmount;
            theTaxAmount = this.getTaxAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxAmount", theTaxAmount), currentHashCode, theTaxAmount);
        }
        {
            CalculationSequenceNumericType theCalculationSequenceNumeric;
            theCalculationSequenceNumeric = this.getCalculationSequenceNumeric();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "calculationSequenceNumeric", theCalculationSequenceNumeric), currentHashCode, theCalculationSequenceNumeric);
        }
        {
            TransactionCurrencyTaxAmountType theTransactionCurrencyTaxAmount;
            theTransactionCurrencyTaxAmount = this.getTransactionCurrencyTaxAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactionCurrencyTaxAmount", theTransactionCurrencyTaxAmount), currentHashCode, theTransactionCurrencyTaxAmount);
        }
        {
            PercentType thePercent;
            thePercent = this.getPercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "percent", thePercent), currentHashCode, thePercent);
        }
        {
            BaseUnitMeasureType theBaseUnitMeasure;
            theBaseUnitMeasure = this.getBaseUnitMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "baseUnitMeasure", theBaseUnitMeasure), currentHashCode, theBaseUnitMeasure);
        }
        {
            PerUnitAmountType thePerUnitAmount;
            thePerUnitAmount = this.getPerUnitAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "perUnitAmount", thePerUnitAmount), currentHashCode, thePerUnitAmount);
        }
        {
            TierRangeType theTierRange;
            theTierRange = this.getTierRange();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tierRange", theTierRange), currentHashCode, theTierRange);
        }
        {
            TierRatePercentType theTierRatePercent;
            theTierRatePercent = this.getTierRatePercent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tierRatePercent", theTierRatePercent), currentHashCode, theTierRatePercent);
        }
        {
            TaxCategoryType theTaxCategory;
            theTaxCategory = this.getTaxCategory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "taxCategory", theTaxCategory), currentHashCode, theTaxCategory);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}