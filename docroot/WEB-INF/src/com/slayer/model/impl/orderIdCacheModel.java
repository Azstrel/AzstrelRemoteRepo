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

package com.slayer.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.slayer.model.orderId;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing orderId in entity cache.
 *
 * @author nithesh
 * @see orderId
 * @generated
 */
public class orderIdCacheModel implements CacheModel<orderId>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{transactionId=");
		sb.append(transactionId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", buyer=");
		sb.append(buyer);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", amount=");
		sb.append(amount);
		sb.append(", currencyType=");
		sb.append(currencyType);
		sb.append(", receiverEmail=");
		sb.append(receiverEmail);
		sb.append(", payerEmail=");
		sb.append(payerEmail);
		sb.append(", debit=");
		sb.append(debit);
		sb.append(", credit=");
		sb.append(credit);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public orderId toEntityModel() {
		orderIdImpl orderIdImpl = new orderIdImpl();

		orderIdImpl.setTransactionId(transactionId);
		orderIdImpl.setCompanyId(companyId);

		if (buyer == null) {
			orderIdImpl.setBuyer(StringPool.BLANK);
		}
		else {
			orderIdImpl.setBuyer(buyer);
		}

		if (createDate == Long.MIN_VALUE) {
			orderIdImpl.setCreateDate(null);
		}
		else {
			orderIdImpl.setCreateDate(new Date(createDate));
		}

		if (amount == null) {
			orderIdImpl.setAmount(StringPool.BLANK);
		}
		else {
			orderIdImpl.setAmount(amount);
		}

		if (currencyType == null) {
			orderIdImpl.setCurrencyType(StringPool.BLANK);
		}
		else {
			orderIdImpl.setCurrencyType(currencyType);
		}

		if (receiverEmail == null) {
			orderIdImpl.setReceiverEmail(StringPool.BLANK);
		}
		else {
			orderIdImpl.setReceiverEmail(receiverEmail);
		}

		if (payerEmail == null) {
			orderIdImpl.setPayerEmail(StringPool.BLANK);
		}
		else {
			orderIdImpl.setPayerEmail(payerEmail);
		}

		if (debit == null) {
			orderIdImpl.setDebit(StringPool.BLANK);
		}
		else {
			orderIdImpl.setDebit(debit);
		}

		if (credit == null) {
			orderIdImpl.setCredit(StringPool.BLANK);
		}
		else {
			orderIdImpl.setCredit(credit);
		}

		orderIdImpl.resetOriginalValues();

		return orderIdImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		transactionId = objectInput.readLong();
		companyId = objectInput.readLong();
		buyer = objectInput.readUTF();
		createDate = objectInput.readLong();
		amount = objectInput.readUTF();
		currencyType = objectInput.readUTF();
		receiverEmail = objectInput.readUTF();
		payerEmail = objectInput.readUTF();
		debit = objectInput.readUTF();
		credit = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(transactionId);
		objectOutput.writeLong(companyId);

		if (buyer == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(buyer);
		}

		objectOutput.writeLong(createDate);

		if (amount == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(amount);
		}

		if (currencyType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(currencyType);
		}

		if (receiverEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(receiverEmail);
		}

		if (payerEmail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(payerEmail);
		}

		if (debit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(debit);
		}

		if (credit == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(credit);
		}
	}

	public long transactionId;
	public long companyId;
	public String buyer;
	public long createDate;
	public String amount;
	public String currencyType;
	public String receiverEmail;
	public String payerEmail;
	public String debit;
	public String credit;
}