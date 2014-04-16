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

import com.liferay.portal.service.persistence.BasePersistence;

import com.slayer.model.orderId;

/**
 * The persistence interface for the order ID service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author nithesh
 * @see orderIdPersistenceImpl
 * @see orderIdUtil
 * @generated
 */
public interface orderIdPersistence extends BasePersistence<orderId> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link orderIdUtil} to access the order ID persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the order ID in the entity cache if it is enabled.
	*
	* @param orderId the order ID
	*/
	public void cacheResult(com.slayer.model.orderId orderId);

	/**
	* Caches the order IDs in the entity cache if it is enabled.
	*
	* @param orderIds the order IDs
	*/
	public void cacheResult(java.util.List<com.slayer.model.orderId> orderIds);

	/**
	* Creates a new order ID with the primary key. Does not add the order ID to the database.
	*
	* @param transactionId the primary key for the new order ID
	* @return the new order ID
	*/
	public com.slayer.model.orderId create(long transactionId);

	/**
	* Removes the order ID with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param transactionId the primary key of the order ID
	* @return the order ID that was removed
	* @throws com.slayer.NoSuchorderIdException if a order ID with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.slayer.model.orderId remove(long transactionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.slayer.NoSuchorderIdException;

	public com.slayer.model.orderId updateImpl(com.slayer.model.orderId orderId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the order ID with the primary key or throws a {@link com.slayer.NoSuchorderIdException} if it could not be found.
	*
	* @param transactionId the primary key of the order ID
	* @return the order ID
	* @throws com.slayer.NoSuchorderIdException if a order ID with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.slayer.model.orderId findByPrimaryKey(long transactionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.slayer.NoSuchorderIdException;

	/**
	* Returns the order ID with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param transactionId the primary key of the order ID
	* @return the order ID, or <code>null</code> if a order ID with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.slayer.model.orderId fetchByPrimaryKey(long transactionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the order IDs.
	*
	* @return the order IDs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.slayer.model.orderId> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.slayer.model.orderId> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.slayer.model.orderId> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the order IDs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of order IDs.
	*
	* @return the number of order IDs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}