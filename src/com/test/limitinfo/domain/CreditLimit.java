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
 * credit_limit : 授信信息表
 * </p>
 *
 * @author linyl
 * @since 2017-09-23
 */
@TableName("credit_limit")
public class CreditLimit extends Model<CreditLimit> {

    private static final long serialVersionUID = 1L;

    /**
     * 授信额度ID
     */
	private Long id;
    /**
     * 授信额度编号
     */
	@TableField("credit_limit_num")
	private String creditLimitNum;
    /**
     * 客户名称
     */
	@TableField("customer_name")
	private String customerName;
    /**
     * 客户编号
     */
	@TableField("customer_id")
	private String customerId;
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
     * 额度状态代码
     */
	@TableField("limit_status_cd")
	private String limitStatusCd;
    /**
     * 渠道标识
     */
	@TableField("channel_type")
	private String channelType;
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
     * 备注
     */
	private String remarks;
    /**
     * 原额度编号
     */
	@TableField("old_credit_limit_num")
	private String oldCreditLimitNum;
    /**
     * 触发失效期限
     */
	@TableField("invalid_term")
	private Integer invalidTerm;
    /**
     * 客户类型代码
     */
	@TableField("customer_type_cd")
	private String customerTypeCd;
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
     * 担保方式代码
     */
	@TableField("guarantee_method_cd")
	private String guaranteeMethodCd;
    /**
     * 担保方式说明
     */
	@TableField("guarantee_method_note")
	private String guaranteeMethodNote;


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

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
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

	public String getLimitStatusCd() {
		return limitStatusCd;
	}

	public void setLimitStatusCd(String limitStatusCd) {
		this.limitStatusCd = limitStatusCd;
	}

	public String getChannelType() {
		return channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
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

	public String getOldCreditLimitNum() {
		return oldCreditLimitNum;
	}

	public void setOldCreditLimitNum(String oldCreditLimitNum) {
		this.oldCreditLimitNum = oldCreditLimitNum;
	}

	public Integer getInvalidTerm() {
		return invalidTerm;
	}

	public void setInvalidTerm(Integer invalidTerm) {
		this.invalidTerm = invalidTerm;
	}

	public String getCustomerTypeCd() {
		return customerTypeCd;
	}

	public void setCustomerTypeCd(String customerTypeCd) {
		this.customerTypeCd = customerTypeCd;
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

	public String getGuaranteeMethodCd() {
		return guaranteeMethodCd;
	}

	public void setGuaranteeMethodCd(String guaranteeMethodCd) {
		this.guaranteeMethodCd = guaranteeMethodCd;
	}

	public String getGuaranteeMethodNote() {
		return guaranteeMethodNote;
	}

	public void setGuaranteeMethodNote(String guaranteeMethodNote) {
		this.guaranteeMethodNote = guaranteeMethodNote;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "CreditLimit{" +
			", id=" + id +
			", creditLimitNum=" + creditLimitNum +
			", customerName=" + customerName +
			", customerId=" + customerId +
			", startDate=" + startDate +
			", expirationDate=" + expirationDate +
			", term=" + term +
			", termUnitCd=" + termUnitCd +
			", creditLimit=" + creditLimit +
			", availableLimit=" + availableLimit +
			", outstndLimit=" + outstndLimit +
			", currencyCd=" + currencyCd +
			", limitStatusCd=" + limitStatusCd +
			", channelType=" + channelType +
			", createBy=" + createBy +
			", createTime=" + createTime +
			", updateBy=" + updateBy +
			", modifyTime=" + modifyTime +
			", remarks=" + remarks +
			", oldCreditLimitNum=" + oldCreditLimitNum +
			", invalidTerm=" + invalidTerm +
			", customerTypeCd=" + customerTypeCd +
			", identyInd=" + identyInd +
			", freezeInd=" + freezeInd +
			", freezeAmt=" + freezeAmt +
			", guaranteeMethodCd=" + guaranteeMethodCd +
			", guaranteeMethodNote=" + guaranteeMethodNote +
			"}";
	}
}
