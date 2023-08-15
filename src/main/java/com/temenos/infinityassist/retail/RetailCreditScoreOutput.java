package com.temenos.infinityassist.retail;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class RetailCreditScoreOutput implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Integer bureauScoreOutPut;

	private java.lang.Integer dTIRatioOutput;

	private java.lang.Integer relationshipWithBankOutput;

	private java.lang.Integer yearsOfEmploymentOutput;

	private java.lang.Integer totalScore;

	private java.lang.Integer ltvRatio;

	public RetailCreditScoreOutput() {
	}

	public java.lang.Integer getBureauScoreOutPut() {
		return this.bureauScoreOutPut;
	}

	public void setBureauScoreOutPut(java.lang.Integer bureauScoreOutPut) {
		this.bureauScoreOutPut = bureauScoreOutPut;
	}

	public java.lang.Integer getdTIRatioOutput() {
		return this.dTIRatioOutput;
	}

	public void setdTIRatioOutput(java.lang.Integer dTIRatioOutput) {
		this.dTIRatioOutput = dTIRatioOutput;
	}

	public java.lang.Integer getRelationshipWithBankOutput() {
		return this.relationshipWithBankOutput;
	}

	public void setRelationshipWithBankOutput(
			java.lang.Integer relationshipWithBankOutput) {
		this.relationshipWithBankOutput = relationshipWithBankOutput;
	}

	public java.lang.Integer getYearsOfEmploymentOutput() {
		return this.yearsOfEmploymentOutput;
	}

	public void setYearsOfEmploymentOutput(
			java.lang.Integer yearsOfEmploymentOutput) {
		this.yearsOfEmploymentOutput = yearsOfEmploymentOutput;
	}

	public java.lang.Integer getTotalScore() {
		return this.totalScore;
	}

	public void setTotalScore(java.lang.Integer totalScore) {
		this.totalScore = totalScore;
	}

	public java.lang.Integer getLtvRatio() {
		return this.ltvRatio;
	}

	public void setLtvRatio(java.lang.Integer ltvRatio) {
		this.ltvRatio = ltvRatio;
	}

	public RetailCreditScoreOutput(java.lang.Integer bureauScoreOutPut,
			java.lang.Integer dTIRatioOutput,
			java.lang.Integer relationshipWithBankOutput,
			java.lang.Integer yearsOfEmploymentOutput,
			java.lang.Integer totalScore, java.lang.Integer ltvRatio) {
		this.bureauScoreOutPut = bureauScoreOutPut;
		this.dTIRatioOutput = dTIRatioOutput;
		this.relationshipWithBankOutput = relationshipWithBankOutput;
		this.yearsOfEmploymentOutput = yearsOfEmploymentOutput;
		this.totalScore = totalScore;
		this.ltvRatio = ltvRatio;
	}

}