package com.test;

import java.io.IOException;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

//import com.liferay.portal.SystemException;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.slayer.model.orderId;
import com.slayer.model.impl.orderIdImpl;
import com.slayer.service.orderIdLocalServiceUtil;

public class tryHelp extends MVCPortlet{
	public void update(ActionRequest actonRequest,ActionResponse actionResponse)throws IOException, PortletException 
	{
		orderId od= new orderIdImpl();
		od.setTransactionId(555);
	    od.setCompanyId(155);
	    od.setBuyer("neil");
	    od.setCreateDate(new Date());
	    od.setAmount("2000");
	    od.setCurrencyType("USD");
	    od.setReceiverEmail("neil@gmail.com");
	    od.setPayerEmail("aneil@gmail");
	    od.setDebit("125k");
	
     	try {
			od = orderIdLocalServiceUtil.addorderId(od);
		} catch (com.liferay.portal.kernel.exception.SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}}
