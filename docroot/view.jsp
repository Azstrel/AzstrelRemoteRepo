<%@page import="javax.portlet.ActionRequest"%>
<%@page import="javax.portlet.PortletURL"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>

<portlet:defineObjects />
This is the <b>Helpus</b> portlet.

<%
	PortletURL updateURL = renderResponse.createActionURL();
	updateURL.setParameter(ActionRequest.ACTION_NAME, "update");
%>
<aui:form name="fm" action="<%=updateURL.toString()%>" method="POST">
<aui:button
 type="submit" value="update"></aui:button>
</aui:form>

<portlet:defineObjects />

<portlet:renderURL var="fundsURL">
<portlet:param name="jspPage" value="/html/order.jsp"/>
</portlet:renderURL>
<aui:a href="<%=fundsURL.toString() %>">helpUS</aui:a>