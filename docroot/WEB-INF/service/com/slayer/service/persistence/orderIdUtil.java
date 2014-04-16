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

package com.slayer.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.slayer.model.orderId;

import java.util.List;

/**
 * The persistence utility for the order ID service. This utility wraps {@link orderIdPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author nithesh
 * @see orderIdPersistence
 * @see orderIdPersistenceImpl
 * @generated
 */
public class orderIdUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(orderId orderId) {
		getPersistence().clearCache(orderId);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<orderId> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<orderId> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<orderId> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static orderId update(orderId orderId) throws SystemException {
		return getPersistence().update(orderId);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static orderId update(orderId orderId, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(orderId, serviceContext);
	}

	/**
	* Caches the order ID in the entity cache if it is enabled.
	*
	* @param orderId the order ID
	*/
	public static void cacheResult(com.slayer.model.orderId orderId) {
		getPersistence().cacheResult(orderId);
	}

	/**
	* Caches the order IDs in the entity cache if it is enabled.
	*
	* @param orderIds the order IDs
	*/
	public static void cacheResult(
		java.util.List<com.slayer.model.orderId> orderIds) {
		getPersistence().cacheResult(orderIds);
	}

	/**
	* Creates a new order ID with the primary key. Does not add the order ID to the database.
	*
	* @param transactionId the primary key for the new order ID
	* @return the new order ID
	*/
	public static com.slayer.model.orderId create(long transactionId) {
		return getPersistence().create(transactionId);
	}

	/**
	* Removes the order ID with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param transactionId the primary key of the order ID
	* @return the order ID that was removed
	* @throws com.slayer.NoSuchorderIdException if a order ID with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.slayer.model.orderId remove(long transactionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.slayer.NoSuchorderIdException {
		return getPersistence().remove(transactionId);
	}

	public static com.slayer.model.orderId updateImpl(
		com.slayer.model.orderId orderId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(orderId);
	}

	/**
	* Returns the order ID with the primary key or throws a {@link com.slayer.NoSuchorderIdException} if it could not be found.
	*
	* @param transactionId the primary key of the order ID
	* @return the order ID
	* @throws com.slayer.NoSuchorderIdException if a order ID with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.slayer.model.orderId findByPrimaryKey(long transactionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.slayer.NoSuchorderIdException {
		return getPersistence().findByPrimaryKey(transactionId);
	}

	/**
	* Returns the order ID with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param transactionId the primary key of the order ID
	* @return the order ID, or <code>null</code> if a order ID with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.slayer.model.orderId fetchByPrimaryKey(long transactionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(transactionId);
	}

	/**
	* Returns all the order IDs.
	*
	* @return the order IDs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.slayer.model.orderId> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.slayer.model.orderId> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the order IDs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.slayer.model.impl.orderIdModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of order IDs
	* @param end the upper bound of the range of order IDs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of order IDs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.slayer.model.orderId> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the order IDs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of order IDs.
	*
	* @return the number of order IDs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static orderIdPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (orderIdPersistence)PortletBeanLocatorUtil.locate(com.slayer.service.ClpSerializer.getServletContextName(),
					orderIdPersistence.class.getName());

			ReferenceRegistry.registerReference(orderIdUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(orderIdPersistence persistence) {
	}

	private static orderIdPersistence _persistence;
}