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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.slayer.service.http.orderIdServiceSoap}.
 *
 * @author nithesh
 * @see com.slayer.service.http.orderIdServiceSoap
 * @generated
 */
public class orderIdSoap implements Serializable {
	public static orderIdSoap toSoapModel(orderId model) {
		orderIdSoap soapModel = new orderIdSoap();

		soapModel.setTransactionId(model.getTransactionId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setBuyer(model.getBuyer());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setAmount(model.getAmount());
		soapModel.setCurrencyType(model.getCurrencyType());
		soapModel.setReceiverEmail(model.getReceiverEmail());
		soapModel.setPayerEmail(model.getPayerEmail());
		soapModel.setDebit(model.getDebit());
		soapModel.setCredit(model.getCredit());

		return soapModel;
	}

	public static orderIdSoap[] toSoapModels(orderId[] models) {
		orderIdSoap[] soapModels = new orderIdSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static orderIdSoap[][] toSoapModels(orderId[][] models) {
		orderIdSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new orderIdSoap[models.length][models[0].length];
		}
		else {
			soapModels = new orderIdSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static orderIdSoap[] toSoapModels(List<orderId> models) {
		List<orderIdSoap> soapModels = new ArrayList<orderIdSoap>(models.size());

		for (orderId model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new orderIdSoap[soapModels.size()]);
	}

	public orderIdSoap() {
	}

	public long getPrimaryKey() {
		return _transactionId;
	}

	public void setPrimaryKey(long pk) {
		setTransactionId(pk);
	}

	public long getTransactionId() {
		return _transactionId;
	}

	public void setTransactionId(long transactionId) {
		_transactionId = transactionId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public String getBuyer() {
		return _buyer;
	}

	public void setBuyer(String buyer) {
		_buyer = buyer;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public String getAmount() {
		return _amount;
	}

	public void setAmount(String amount) {
		_amount = amount;
	}

	public String getCurrencyType() {
		return _currencyType;
	}

	public void setCurrencyType(String currencyType) {
		_currencyType = currencyType;
	}

	public String getReceiverEmail() {
		return _receiverEmail;
	}

	public void setReceiverEmail(String receiverEmail) {
		_receiverEmail = receiverEmail;
	}

	public String getPayerEmail() {
		return _payerEmail;
	}

	public void setPayerEmail(String payerEmail) {
		_payerEmail = payerEmail;
	}

	public String getDebit() {
		return _debit;
	}

	public void setDebit(String debit) {
		_debit = debit;
	}

	public String getCredit() {
		return _credit;
	}

	public void setCredit(String credit) {
		_credit = credit;
	}

	private long _transactionId;
	private long _companyId;
	private String _buyer;
	private Date _createDate;
	private String _amount;
	private String _currencyType;
	private String _receiverEmail;
	private String _payerEmail;
	private String _debit;
	private String _credit;
}