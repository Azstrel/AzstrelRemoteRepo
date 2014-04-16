<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@page import="com.slayer.service.orderIdLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="com.slayer.model.orderId"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<portlet:defineObjects/>
<liferay-ui:search-container delta="10"
	emptyResultsMessage="Sorry. There are no items to display.">
	<liferay-ui:search-container-results 
	results="<%= orderIdLocalServiceUtil.getorderIds(searchContainer.getStart()
,searchContainer.getEnd()
) %> "/>

	<liferay-ui:search-container-row modelVar="crwfund" className="orderId">
		
		<liferay-ui:search-container-column-text name="Transaction Id"
			property="transactionId" />
		<liferay-ui:search-container-column-text name="Company Id"
			property="companyId" />
		<liferay-ui:search-container-column-text name="Buyer" property="Buyer" />
		<liferay-ui:search-container-column-text name="buyer Id"
			property="buyer" />
		<liferay-ui:search-container-column-text name="createDate"
			property="createDate" />
		<liferay-ui:search-container-column-text name="amount Type"
			property="amount" />
		<liferay-ui:search-container-column-text name="Currency Type"
			property="currencyType" />
		<liferay-ui:search-container-column-text name="Receiver Email"
			property="receiverEmail" />
		<liferay-ui:search-container-column-text name="Payer Email"
			property="payerEmail" />
		<liferay-ui:search-container-column-text name="Debit Amount"
			property="debit" />
         <liferay-ui:search-container-column-text name="credit Amount"
			property="credit" />
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator searchContainer="<%=searchContainer%>" />
</liferay-ui:search-container>
