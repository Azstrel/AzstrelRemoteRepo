/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.slayer.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link orderId}.
 * </p>
 *
 * @author nithesh
 * @see orderId
 * @generated
 */
public class orderIdWrapper implements orderId, ModelWrapper<orderId> {
	public orderIdWrapper(orderId orderId) {
		_orderId = orderId;
	}

	@Override
	public Class<?> getModelClass() {
		return orderId.class;
	}

	@Override
	public String getModelClassName() {
		return orderId.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("transactionId", getTransactionId());
		attributes.put("companyId", getCompanyId());
		attributes.put("buyer", getBuyer());
		attributes.put("createDate", getCreateDate());
		attributes.put("amount", getAmount());
		attributes.put("currencyType", getCurrencyType());
		attributes.put("receiverEmail", getReceiverEmail());
		attributes.put("payerEmail", getPayerEmail());
		attributes.put("debit", getDebit());
		attributes.put("credit", getCredit());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long transactionId = (Long)attributes.get("transactionId");

		if (transactionId != null) {
			setTransactionId(transactionId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String buyer = (String)attributes.get("buyer");

		if (buyer != null) {
			setBuyer(buyer);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		String amount = (String)attributes.get("amount");

		if (amount != null) {
			setAmount(amount);
		}

		String currencyType = (String)attributes.get("currencyType");

		if (currencyType != null) {
			setCurrencyType(currencyType);
		}

		String receiverEmail = (String)attributes.get("receiverEmail");

		if (receiverEmail != null) {
			setReceiverEmail(receiverEmail);
		}

		String payerEmail = (String)attributes.get("payerEmail");

		if (payerEmail != null) {
			setPayerEmail(payerEmail);
		}

		String debit = (String)attributes.get("debit");

		if (debit != null) {
			setDebit(debit);
		}

		String credit = (String)attributes.get("credit");

		if (credit != null) {
			setCredit(credit);
		}
	}

	/**
	* Returns the primary key of this order ID.
	*
	* @return the primary key of this order ID
	*/
	@Override
	public long getPrimaryKey() {
		return _orderId.getPrimaryKey();
	}

	/**
	* Sets the primary key of this order ID.
	*
	* @param primaryKey the primary key of this order ID
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_orderId.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the transaction ID of this order ID.
	*
	* @return the transaction ID of this order ID
	*/
	@Override
	public long getTransactionId() {
		return _orderId.getTransactionId();
	}

	/**
	* Sets the transaction ID of this order ID.
	*
	* @param transactionId the transaction ID of this order ID
	*/
	@Override
	public void setTransactionId(long transactionId) {
		_orderId.setTransactionId(transactionId);
	}

	/**
	* Returns the company ID of this order ID.
	*
	* @return the company ID of this order ID
	*/
	@Override
	public long getCompanyId() {
		return _orderId.getCompanyId();
	}

	/**
	* Sets the company ID of this order ID.
	*
	* @param companyId the company ID of this order ID
	*/
	@Override
	public void setCompanyId(long companyId) {
		_orderId.setCompanyId(companyId);
	}

	/**
	* Returns the buyer of this order ID.
	*
	* @return the buyer of this order ID
	*/
	@Override
	public java.lang.String getBuyer() {
		return _orderId.getBuyer();
	}

	/**
	* Sets the buyer of this order ID.
	*
	* @param buyer the buyer of this order ID
	*/
	@Override
	public void setBuyer(java.lang.String buyer) {
		_orderId.setBuyer(buyer);
	}

	/**
	* Returns the create date of this order ID.
	*
	* @return the create date of this order ID
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _orderId.getCreateDate();
	}

	/**
	* Sets the create date of this order ID.
	*
	* @param createDate the create date of this order ID
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_orderId.setCreateDate(createDate);
	}

	/**
	* Returns the amount of this order ID.
	*
	* @return the amount of this order ID
	*/
	@Override
	public java.lang.String getAmount() {
		return _orderId.getAmount();
	}

	/**
	* Sets the amount of this order ID.
	*
	* @param amount the amount of this order ID
	*/
	@Override
	public void setAmount(java.lang.String amount) {
		_orderId.setAmount(amount);
	}

	/**
	* Returns the currency type of this order ID.
	*
	* @return the currency type of this order ID
	*/
	@Override
	public java.lang.String getCurrencyType() {
		return _orderId.getCurrencyType();
	}

	/**
	* Sets the currency type of this order ID.
	*
	* @param currencyType the currency type of this order ID
	*/
	@Override
	public void setCurrencyType(java.lang.String currencyType) {
		_orderId.setCurrencyType(currencyType);
	}

	/**
	* Returns the receiver email of this order ID.
	*
	* @return the receiver email of this order ID
	*/
	@Override
	public java.lang.String getReceiverEmail() {
		return _orderId.getReceiverEmail();
	}

	/**
	* Sets the receiver email of this order ID.
	*
	* @param receiverEmail the receiver email of this order ID
	*/
	@Override
	public void setReceiverEmail(java.lang.String receiverEmail) {
		_orderId.setReceiverEmail(receiverEmail);
	}

	/**
	* Returns the payer email of this order ID.
	*
	* @return the payer email of this order ID
	*/
	@Override
	public java.lang.String getPayerEmail() {
		return _orderId.getPayerEmail();
	}

	/**
	* Sets the payer email of this order ID.
	*
	* @param payerEmail the payer email of this order ID
	*/
	@Override
	public void setPayerEmail(java.lang.String payerEmail) {
		_orderId.setPayerEmail(payerEmail);
	}

	/**
	* Returns the debit of this order ID.
	*
	* @return the debit of this order ID
	*/
	@Override
	public java.lang.String getDebit() {
		return _orderId.getDebit();
	}

	/**
	* Sets the debit of this order ID.
	*
	* @param debit the debit of this order ID
	*/
	@Override
	public void setDebit(java.lang.String debit) {
		_orderId.setDebit(debit);
	}

	/**
	* Returns the credit of this order ID.
	*
	* @return the credit of this order ID
	*/
	@Override
	public java.lang.String getCredit() {
		return _orderId.getCredit();
	}

	/**
	* Sets the credit of this order ID.
	*
	* @param credit the credit of this order ID
	*/
	@Override
	public void setCredit(java.lang.String credit) {
		_orderId.setCredit(credit);
	}

	@Override
	public boolean isNew() {
		return _orderId.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_orderId.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _orderId.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_orderId.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _orderId.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _orderId.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_orderId.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _orderId.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_orderId.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_orderId.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_orderId.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new orderIdWrapper((orderId)_orderId.clone());
	}

	@Override
	public int compareTo(orderId orderId) {
		return _orderId.compareTo(orderId);
	}

	@Override
	public int hashCode() {
		return _orderId.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<orderId> toCacheModel() {
		return _orderId.toCacheModel();
	}

	@Override
	public orderId toEscapedModel() {
		return new orderIdWrapper(_orderId.toEscapedModel());
	}

	@Override
	public orderId toUnescapedModel() {
		return new orderIdWrapper(_orderId.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _orderId.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _orderId.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_orderId.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof orderIdWrapper)) {
			return false;
		}

		orderIdWrapper orderIdWrapper = (orderIdWrapper)obj;

		if (Validator.equals(_orderId, orderIdWrapper._orderId)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public orderId getWrappedorderId() {
		return _orderId;
	}

	@Override
	public orderId getWrappedModel() {
		return _orderId;
	}

	@Override
	public void resetOriginalValues() {
		_orderId.resetOriginalValues();
	}

	private orderId _orderId;
}