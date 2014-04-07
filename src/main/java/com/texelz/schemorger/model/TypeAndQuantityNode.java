package com.texelz.schemorger.model;

/**
 *
 * A structured value indicating the quantity, unit of measurement, and business function of goods included in a bundle offer.
 * @fullPath Thing > Intangible > StructuredValue > TypeAndQuantityNode
 *
 * @author Texelz (by Onhate)
 *
 */
public class TypeAndQuantityNode extends StructuredValue {

	private Double amountOfThisGood;
	private BusinessFunction businessFunction;
	private Product typeOfGood;
	private String unitCode;
	/**
	 * The quantity of the goods included in the offer.
	 */
	public Double getAmountOfThisGood() {
		return this.amountOfThisGood;
	}
	public void setAmountOfThisGood(Double amountOfThisGood) {
		this.amountOfThisGood = amountOfThisGood;
	}
	/**
	 * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell.
	 */
	public BusinessFunction getBusinessFunction() {
		return this.businessFunction;
	}
	public void setBusinessFunction(BusinessFunction businessFunction) {
		this.businessFunction = businessFunction;
	}
	/**
	 * The product that this structured value is referring to.
	 */
	public Product getTypeOfGood() {
		return this.typeOfGood;
	}
	public void setTypeOfGood(Product typeOfGood) {
		this.typeOfGood = typeOfGood;
	}
	/**
	 * The unit of measurement given using the UN/CEFACT Common Code (3 characters).
	 */
	public String getUnitCode() {
		return this.unitCode;
	}
	public void setUnitCode(String unitCode) {
		this.unitCode = unitCode;
	}
}