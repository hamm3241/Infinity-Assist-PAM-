package com.temenos.infinityassist.retail;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class RetailCreditScoreParams implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Integer bureauScore = 760;

	private java.lang.Double dTIRatio = 54.0;

	private java.lang.Integer relationshipWithBank = 5;

	private java.lang.Integer yearsOfEmployment = 5;

	private java.lang.String productIdentifier = "RETAIL.UNSECURED";

	private java.lang.Double debtRatio = 75.0;

	private double ltvRatio;

	private java.lang.String propertyType = "0";
	
	private java.lang.Double netAffordabilityRatio = 0.0;
	
	private java.lang.Double cashFlowAnalysis = 0.0;

	public RetailCreditScoreParams() {
	}

	public java.lang.Integer getBureauScore() {
		return this.bureauScore;
	}

	public void setBureauScore(java.lang.Integer bureauScore) {
		this.bureauScore = bureauScore;
	}

	public java.lang.Double getdTIRatio() {
		return this.dTIRatio;
	}

	public void setdTIRatio(java.lang.Double dTIRatio) {
		this.dTIRatio = dTIRatio;
	}

	public java.lang.Integer getRelationshipWithBank() {
		return this.relationshipWithBank;
	}

	public void setRelationshipWithBank(java.lang.Integer relationshipWithBank) {
		this.relationshipWithBank = relationshipWithBank;
	}

	public java.lang.Integer getYearsOfEmployment() {
		return this.yearsOfEmployment;
	}

	public void setYearsOfEmployment(java.lang.Integer yearsOfEmployment) {
		this.yearsOfEmployment = yearsOfEmployment;
	}

	public java.lang.String getProductIdentifier() {
		return this.productIdentifier;
	}

	public void setProductIdentifier(java.lang.String productIdentifier) {
		this.productIdentifier = productIdentifier;
	}

	public java.lang.Double getDebtRatio() {
		return this.debtRatio;
	}

	public void setDebtRatio(java.lang.Double debtRatio) {
		this.debtRatio = debtRatio;
	}

	public double getLtvRatio() {
		return this.ltvRatio;
	}

	public void setLtvRatio(double ltvRatio) {
		this.ltvRatio = ltvRatio;
	}

	public java.lang.String getPropertyType() {
		return this.propertyType;
	}

	public void setPropertyType(java.lang.String propertyType) {
		this.propertyType = propertyType;
	}
	
	public java.lang.Double getNetAffordabilityRatio() {
		return this.netAffordabilityRatio;
	}

	public void setNetAffordabilityRatio(java.lang.Double netAffordabilityRatio) {
		this.netAffordabilityRatio = netAffordabilityRatio;
	}
	
	public java.lang.Double getCashFlowAnalysis() {
		return this.cashFlowAnalysis;
	}

	public void setCashFlowAnalysis(java.lang.Double cashFlowAnalysis) {
		this.cashFlowAnalysis = cashFlowAnalysis;
	}


	public RetailCreditScoreParams(java.lang.Integer bureauScore,
			java.lang.Double dTIRatio, java.lang.Integer relationshipWithBank,
			java.lang.Integer yearsOfEmployment,
			java.lang.String productIdentifier, java.lang.Double debtRatio,
			double ltvRatio, java.lang.String propertyType, java.lang.Double netAffordabilityRatio,java.lang.Double cashFlowAnalysis) {
		this.bureauScore = bureauScore;
		this.dTIRatio = dTIRatio;
		this.relationshipWithBank = relationshipWithBank;
		this.yearsOfEmployment = yearsOfEmployment;
		this.productIdentifier = productIdentifier;
		this.debtRatio = debtRatio;
		this.ltvRatio = ltvRatio;
		this.propertyType = propertyType;
		this.netAffordabilityRatio = netAffordabilityRatio;
		this.cashFlowAnalysis = cashFlowAnalysis;
	}

}