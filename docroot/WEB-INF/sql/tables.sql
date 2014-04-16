create table CrowdFunds_orderId (
	transactionId LONG not null primary key,
	companyId LONG,
	buyer VARCHAR(75) null,
	createDate DATE null,
	amount VARCHAR(75) null,
	currencyType VARCHAR(75) null,
	receiverEmail VARCHAR(75) null,
	payerEmail VARCHAR(75) null,
	debit VARCHAR(75) null,
	credit VARCHAR(75) null
);