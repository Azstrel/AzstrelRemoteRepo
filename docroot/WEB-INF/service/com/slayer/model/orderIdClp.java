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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.slayer.service.ClpSerializer;
import com.slayer.service.orderIdLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author nithesh
 */
public class orderIdClp extends BaseModelImpl<orderId> implements orderId {
	public orderIdClp() {
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
	public long getPrimaryKey() {
		return _transactionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTransactionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _transactionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getTransactionId() {
		return _transactionId;
	}

	@Override
	public void setTransactionId(long transactionId) {
		_transactionId = transactionId;

		if (_orderIdRemoteModel != null) {
			try {
				Class<?> clazz = _orderIdRemoteModel.getClass();

				Method method = clazz.getMethod("setTransactionId", long.class);

				method.invoke(_orderIdRemoteModel, transactionId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_orderIdRemoteModel != null) {
			try {
				Class<?> clazz = _orderIdRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_orderIdRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getBuyer() {
		return _buyer;
	}

	@Override
	public void setBuyer(String buyer) {
		_buyer = buyer;

		if (_orderIdRemoteModel != null) {
			try {
				Class<?> clazz = _orderIdRemoteModel.getClass();

				Method method = clazz.getMethod("setBuyer", String.class);

				method.invoke(_orderIdRemoteModel, buyer);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_orderIdRemoteModel != null) {
			try {
				Class<?> clazz = _orderIdRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_orderIdRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getAmount() {
		return _amount;
	}

	@Override
	public void setAmount(String amount) {
		_amount = amount;

		if (_orderIdRemoteModel != null) {
			try {
				Class<?> clazz = _orderIdRemoteModel.getClass();

				Method method = clazz.getMethod("setAmount", String.class);

				method.invoke(_orderIdRemoteModel, amount);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCurrencyType() {
		return _currencyType;
	}

	@Override
	public void setCurrencyType(String currencyType) {
		_currencyType = currencyType;

		if (_orderIdRemoteModel != null) {
			try {
				Class<?> clazz = _orderIdRemoteModel.getClass();

				Method method = clazz.getMethod("setCurrencyType", String.class);

				method.invoke(_orderIdRemoteModel, currencyType);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReceiverEmail() {
		return _receiverEmail;
	}

	@Override
	public void setReceiverEmail(String receiverEmail) {
		_receiverEmail = receiverEmail;

		if (_orderIdRemoteModel != null) {
			try {
				Class<?> clazz = _orderIdRemoteModel.getClass();

				Method method = clazz.getMethod("setReceiverEmail", String.class);

				method.invoke(_orderIdRemoteModel, receiverEmail);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPayerEmail() {
		return _payerEmail;
	}

	@Override
	public void setPayerEmail(String payerEmail) {
		_payerEmail = payerEmail;

		if (_orderIdRemoteModel != null) {
			try {
				Class<?> clazz = _orderIdRemoteModel.getClass();

				Method method = clazz.getMethod("setPayerEmail", String.class);

				method.invoke(_orderIdRemoteModel, payerEmail);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDebit() {
		return _debit;
	}

	@Override
	public void setDebit(String debit) {
		_debit = debit;

		if (_orderIdRemoteModel != null) {
			try {
				Class<?> clazz = _orderIdRemoteModel.getClass();

				Method method = clazz.getMethod("setDebit", String.class);

				method.invoke(_orderIdRemoteModel, debit);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCredit() {
		return _credit;
	}

	@Override
	public void setCredit(String credit) {
		_credit = credit;

		if (_orderIdRemoteModel != null) {
			try {
				Class<?> clazz = _orderIdRemoteModel.getClass();

				Method method = clazz.getMethod("setCredit", String.class);

				method.invoke(_orderIdRemoteModel, credit);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getorderIdRemoteModel() {
		return _orderIdRemoteModel;
	}

	public void setorderIdRemoteModel(BaseModel<?> orderIdRemoteModel) {
		_orderIdRemoteModel = orderIdRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _orderIdRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_orderIdRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			orderIdLocalServiceUtil.addorderId(this);
		}
		else {
			orderIdLocalServiceUtil.updateorderId(this);
		}
	}

	@Override
	public orderId toEscapedModel() {
		return (orderId)ProxyUtil.newProxyInstance(orderId.class.getClassLoader(),
			new Class[] { orderId.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		orderIdClp clone = new orderIdClp();

		clone.setTransactionId(getTransactionId());
		clone.setCompanyId(getCompanyId());
		clone.setBuyer(getBuyer());
		clone.setCreateDate(getCreateDate());
		clone.setAmount(getAmount());
		clone.setCurrencyType(getCurrencyType());
		clone.setReceiverEmail(getReceiverEmail());
		clone.setPayerEmail(getPayerEmail());
		clone.setDebit(getDebit());
		clone.setCredit(getCredit());

		return clone;
	}

	@Override
	public int compareTo(orderId orderId) {
		long primaryKey = orderId.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof orderIdClp)) {
			return false;
		}

		orderIdClp orderId = (orderIdClp)obj;

		long primaryKey = orderId.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{transactionId=");
		sb.append(getTransactionId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", buyer=");
		sb.append(getBuyer());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", amount=");
		sb.append(getAmount());
		sb.append(", currencyType=");
		sb.append(getCurrencyType());
		sb.append(", receiverEmail=");
		sb.append(getReceiverEmail());
		sb.append(", payerEmail=");
		sb.append(getPayerEmail());
		sb.append(", debit=");
		sb.append(getDebit());
		sb.append(", credit=");
		sb.append(getCredit());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.slayer.model.orderId");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>transactionId</column-name><column-value><![CDATA[");
		sb.append(getTransactionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>buyer</column-name><column-value><![CDATA[");
		sb.append(getBuyer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>amount</column-name><column-value><![CDATA[");
		sb.append(getAmount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>currencyType</column-name><column-value><![CDATA[");
		sb.append(getCurrencyType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>receiverEmail</column-name><column-value><![CDATA[");
		sb.append(getReceiverEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>payerEmail</column-name><column-value><![CDATA[");
		sb.append(getPayerEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>debit</column-name><column-value><![CDATA[");
		sb.append(getDebit());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>credit</column-name><column-value><![CDATA[");
		sb.append(getCredit());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
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
	private BaseModel<?> _orderIdRemoteModel;
}