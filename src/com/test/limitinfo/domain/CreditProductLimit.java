package com.test.limitinfo.domain;

import java.io.Serializable;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * credit_product_limit : 授信产品额度
 * </p>
 *
 * @author linyl
 * @since 2017-09-23
 */
@TableName("credit_product_limit")
public class CreditProductLimit extends Model<CreditProductLimit> {

    private static final long serialVersionUID = 1L;

    /**
     * 授信产品额度ID
     */
	private Long id;
    /**
     * 授信额度编号
     */
	@TableField("credit_limit_num")
	private String creditLimitNum;
    /**
     * 客户编号
     */
	@TableField("customer_id")
	private String customerId;
    /**
     * 授信产品编号
     */
	@TableField("credit_product")
	private String creditProduct;
    /**
     * 起始日期
     */
	@TableField("start_date")
	private Date startDate;
    /**
     * 到期日期
     */
	@TableField("expiration_date")
	private Date expirationDate;
    /**
     * 期限
     */
	private Integer term;
    /**
     * 期限单位代码
     */
	@TableField("term_unit_cd")
	private String termUnitCd;
    /**
     * 总额度
     */
	@TableField("credit_limit")
	private BigDecimal creditLimit;
    /**
     * 已用额度
     */
	@TableField("available_limit")
	private BigDecimal availableLimit;
    /**
     * 可用额度
     */
	@TableField("outstnd_limit")
	private BigDecimal outstndLimit;
    /**
     * 币种
     */
	@TableField("currency_cd")
	private String currencyCd;
    /**
     * 是否可循环
     */
	@TableField("revolving_ind")
	private String revolvingInd;
    /**
     * 额度类型
     */
	@TableField("credit_limit_type")
	private String creditLimitType;
    /**
     * 创建者
     */
	@TableField("create_by")
	private String createBy;
    /**
     * 创建时间
     */
	@TableField("create_time")
	private Date createTime;
    /**
     * 更新者
     */
	@TableField("update_by")
	private String updateBy;
    /**
     * 更新时间
     */
	@TableField("modify_time")
	private Date modifyTime;
    /**
     * 备注信息
     */
	private String remarks;
    /**
     * 认定标志
     */
	@TableField("identy_ind")
	private String identyInd;
    /**
     * 冻结状态
     */
	@TableField("freeze_ind")
	private String freezeInd;
    /**
     * 冻结金额
     */
	@TableField("freeze_amt")
	private BigDecimal freezeAmt;
    /**
     * 父级产品额度编号
     */
	@TableField("parent_product_limit_id")
	private String parentProductLimitId;
    /**
     * 额度状态代码
     */
	@TableField("limit_status_cd")
	private String limitStatusCd;
    /**
     * 品种余额
     */
	@TableField("product_balance")
	private BigDecimal productBalance;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCreditLimitNum() {
		return creditLimitNum;
	}

	public void setCreditLimitNum(String creditLimitNum) {
		this.creditLimitNum = creditLimitNum;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCreditProduct() {
		return creditProduct;
	}

	public void setCreditProduct(String creditProduct) {
		this.creditProduct = creditProduct;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Integer getTerm() {
		return term;
	}

	public void setTerm(Integer term) {
		this.term = term;
	}

	public String getTermUnitCd() {
		return termUnitCd;
	}

	public void setTermUnitCd(String termUnitCd) {
		this.termUnitCd = termUnitCd;
	}

	public BigDecimal getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	public BigDecimal getAvailableLimit() {
		return availableLimit;
	}

	public void setAvailableLimit(BigDecimal availableLimit) {
		this.availableLimit = availableLimit;
	}

	public BigDecimal getOutstndLimit() {
		return outstndLimit;
	}

	public void setOutstndLimit(BigDecimal outstndLimit) {
		this.outstndLimit = outstndLimit;
	}

	public String getCurrencyCd() {
		return currencyCd;
	}

	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}

	public String getRevolvingInd() {
		return revolvingInd;
	}

	public void setRevolvingInd(String revolvingInd) {
		this.revolvingInd = revolvingInd;
	}

	public String getCreditLimitType() {
		return creditLimitType;
	}

	public void setCreditLimitType(String creditLimitType) {
		this.creditLimitType = creditLimitType;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getIdentyInd() {
		return identyInd;
	}

	public void setIdentyInd(String identyInd) {
		this.identyInd = identyInd;
	}

	public String getFreezeInd() {
		return freezeInd;
	}

	public void setFreezeInd(String freezeInd) {
		this.freezeInd = freezeInd;
	}

	public BigDecimal getFreezeAmt() {
		return freezeAmt;
	}

	public void setFreezeAmt(BigDecimal freezeAmt) {
		this.freezeAmt = freezeAmt;
	}

	public String getParentProductLimitId() {
		return parentProductLimitId;
	}

	public void setParentProductLimitId(String parentProductLimitId) {
		this.parentProductLimitId = parentProductLimitId;
	}

	public String getLimitStatusCd() {
		return limitStatusCd;
	}

	public void setLimitStatusCd(String limitStatusCd) {
		this.limitStatusCd = limitStatusCd;
	}

	public BigDecimal getProductBalance() {
		return productBalance;
	}

	public void setProductBalance(BigDecimal productBalance) {
		this.productBalance = productBalance;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "CreditProductLimit{" +
			", id=" + id +
			", creditLimitNum=" + creditLimitNum +
			", customerId=" + customerId +
			", creditProduct=" + creditProduct +
			", startDate=" + startDate +
			", expirationDate=" + expirationDate +
			", term=" + term +
			", termUnitCd=" + termUnitCd +
			", creditLimit=" + creditLimit +
			", availableLimit=" + availableLimit +
			", outstndLimit=" + outstndLimit +
			", currencyCd=" + currencyCd +
			", revolvingInd=" + revolvingInd +
			", creditLimitType=" + creditLimitType +
			", createBy=" + createBy +
			", createTime=" + createTime +
			", updateBy=" + updateBy +
			", modifyTime=" + modifyTime +
			", remarks=" + remarks +
			", identyInd=" + identyInd +
			", freezeInd=" + freezeInd +
			", freezeAmt=" + freezeAmt +
			", parentProductLimitId=" + parentProductLimitId +
			", limitStatusCd=" + limitStatusCd +
			", productBalance=" + productBalance +
			"}";
	}
}
