<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/portlet_2_0"   prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/ui"   prefix="lif-ui"%>
<%@page import="com.slayer.service.orderIdLocalServiceUtil" %>
<%@page import="com.slayer.model.orderId"%>
<portlet:defineObjects/>
<lif-ui:search-container delta="1000"  emptyResultsMessage="Error Comming from!!!!!!!!!!!" >
<lif-ui:search-container-results results="<%= orderIdLocalServiceUtil.getorderIds(searchContainer.getStart(), searchContainer.getEnd()) %>"/>
<lif-ui:search-container-row className="orderId">

<lif-ui:search-container-column-text name="Transaction Id" property="transactionId"></lif-ui:search-container-column-text>
<lif-ui:search-container-column-text name="Company Id" property="companyId"></lif-ui:search-container-column-text>
<lif-ui:search-container-column-text name="Buyer" property="buyer"></lif-ui:search-container-column-text>
<lif-ui:search-container-column-text name="Create Date" property="createDate"></lif-ui:search-container-column-text>
<lif-ui:search-container-column-text name="Amount" property="amount"></lif-ui:search-container-column-text>
<lif-ui:search-container-column-text name="Currency Type" property="currencyType"></lif-ui:search-container-column-text>
<lif-ui:search-container-column-text name="Receiver Email" property="receiverEmail"></lif-ui:search-container-column-text>
<lif-ui:search-container-column-text name="Payer Email" property="payerEmail"></lif-ui:search-container-column-text>
<lif-ui:search-container-column-text name="Debit" property="debit"></lif-ui:search-container-column-text>
<lif-ui:search-container-column-text name="Credit" property="credit"></lif-ui:search-container-column-text>



</lif-ui:search-container-row>
<lif-ui:search-iterator searchContainer="<%=searchContainer %>"></lif-ui:search-iterator>
</lif-ui:search-container>