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

package com.slayer.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link orderIdLocalService}.
 *
 * @author nithesh
 * @see orderIdLocalService
 * @generated
 */
public class orderIdLocalServiceWrapper implements orderIdLocalService,
	ServiceWrapper<orderIdLocalService> {
	public orderIdLocalServiceWrapper(orderIdLocalService orderIdLocalService) {
		_orderIdLocalService = orderIdLocalService;
	}

	/**
	* Adds the order ID to the database. Also notifies the appropriate model listeners.
	*
	* @param orderId the order ID
	* @return the order ID that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.slayer.model.orderId addorderId(com.slayer.model.orderId orderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _orderIdLocalService.addorderId(orderId);
	}

	/**
	* Creates a new order ID with the primary key. Does not add the order ID to the database.
	*
	* @param transactionId the primary key for the new order ID
	* @return the new order ID
	*/
	@Override
	public com.slayer.model.orderId createorderId(long transactionId) {
		return _orderIdLocalService.createorderId(transactionId);
	}

	/**
	* Deletes the order ID with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param transactionId the primary key of the order ID
	* @return the order ID that was removed
	* @throws PortalException if a order ID with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.slayer.model.orderId deleteorderId(long transactionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _orderIdLocalService.deleteorderId(transactionId);
	}

	/**
	* Deletes the order ID from the database. Also notifies the appropriate model listeners.
	*
	* @param orderId the order ID
	* @return the order ID that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.slayer.model.orderId deleteorderId(
		com.slayer.model.orderId orderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _orderIdLocalService.deleteorderId(orderId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _orderIdLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _orderIdLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.slayer.model.impl.orderIdModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _orderIdLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.slayer.model.impl.orderIdModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _orderIdLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _orderIdLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _orderIdLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.slayer.model.orderId fetchorderId(long transactionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _orderIdLocalService.fetchorderId(transactionId);
	}

	/**
	* Returns the order ID with the primary key.
	*
	* @param transactionId the primary key of the order ID
	* @return the order ID
	* @throws PortalException if a order ID with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.slayer.model.orderId getorderId(long transactionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _orderIdLocalService.getorderId(transactionId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _orderIdLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the order IDs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.slayer.model.impl.orderIdModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of order IDs
	* @param end the upper bound of the range of order IDs (not inclusive)
	* @return the range of order IDs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.slayer.model.orderId> getorderIds(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _orderIdLocalService.getorderIds(start, end);
	}

	/**
	* Returns the number of order IDs.
	*
	* @return the number of order IDs
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getorderIdsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _orderIdLocalService.getorderIdsCount();
	}

	/**
	* Updates the order ID in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param orderId the order ID
	* @return the order ID that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.slayer.model.orderId updateorderId(
		com.slayer.model.orderId orderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _orderIdLocalService.updateorderId(orderId);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _orderIdLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_orderIdLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _orderIdLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public orderIdLocalService getWrappedorderIdLocalService() {
		return _orderIdLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedorderIdLocalService(
		orderIdLocalService orderIdLocalService) {
		_orderIdLocalService = orderIdLocalService;
	}

	@Override
	public orderIdLocalService getWrappedService() {
		return _orderIdLocalService;
	}

	@Override
	public void setWrappedService(orderIdLocalService orderIdLocalService) {
		_orderIdLocalService = orderIdLocalService;
	}

	private orderIdLocalService _orderIdLocalService;
}