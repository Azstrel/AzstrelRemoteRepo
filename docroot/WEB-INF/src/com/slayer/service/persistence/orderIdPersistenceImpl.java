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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.slayer.NoSuchorderIdException;

import com.slayer.model.impl.orderIdImpl;
import com.slayer.model.impl.orderIdModelImpl;
import com.slayer.model.orderId;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the order ID service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author nithesh
 * @see orderIdPersistence
 * @see orderIdUtil
 * @generated
 */
public class orderIdPersistenceImpl extends BasePersistenceImpl<orderId>
	implements orderIdPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link orderIdUtil} to access the order ID persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = orderIdImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(orderIdModelImpl.ENTITY_CACHE_ENABLED,
			orderIdModelImpl.FINDER_CACHE_ENABLED, orderIdImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(orderIdModelImpl.ENTITY_CACHE_ENABLED,
			orderIdModelImpl.FINDER_CACHE_ENABLED, orderIdImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(orderIdModelImpl.ENTITY_CACHE_ENABLED,
			orderIdModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public orderIdPersistenceImpl() {
		setModelClass(orderId.class);
	}

	/**
	 * Caches the order ID in the entity cache if it is enabled.
	 *
	 * @param orderId the order ID
	 */
	@Override
	public void cacheResult(orderId orderId) {
		EntityCacheUtil.putResult(orderIdModelImpl.ENTITY_CACHE_ENABLED,
			orderIdImpl.class, orderId.getPrimaryKey(), orderId);

		orderId.resetOriginalValues();
	}

	/**
	 * Caches the order IDs in the entity cache if it is enabled.
	 *
	 * @param orderIds the order IDs
	 */
	@Override
	public void cacheResult(List<orderId> orderIds) {
		for (orderId orderId : orderIds) {
			if (EntityCacheUtil.getResult(
						orderIdModelImpl.ENTITY_CACHE_ENABLED,
						orderIdImpl.class, orderId.getPrimaryKey()) == null) {
				cacheResult(orderId);
			}
			else {
				orderId.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all order IDs.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(orderIdImpl.class.getName());
		}

		EntityCacheUtil.clearCache(orderIdImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the order ID.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(orderId orderId) {
		EntityCacheUtil.removeResult(orderIdModelImpl.ENTITY_CACHE_ENABLED,
			orderIdImpl.class, orderId.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<orderId> orderIds) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (orderId orderId : orderIds) {
			EntityCacheUtil.removeResult(orderIdModelImpl.ENTITY_CACHE_ENABLED,
				orderIdImpl.class, orderId.getPrimaryKey());
		}
	}

	/**
	 * Creates a new order ID with the primary key. Does not add the order ID to the database.
	 *
	 * @param transactionId the primary key for the new order ID
	 * @return the new order ID
	 */
	@Override
	public orderId create(long transactionId) {
		orderId orderId = new orderIdImpl();

		orderId.setNew(true);
		orderId.setPrimaryKey(transactionId);

		return orderId;
	}

	/**
	 * Removes the order ID with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param transactionId the primary key of the order ID
	 * @return the order ID that was removed
	 * @throws com.slayer.NoSuchorderIdException if a order ID with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public orderId remove(long transactionId)
		throws NoSuchorderIdException, SystemException {
		return remove((Serializable)transactionId);
	}

	/**
	 * Removes the order ID with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the order ID
	 * @return the order ID that was removed
	 * @throws com.slayer.NoSuchorderIdException if a order ID with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public orderId remove(Serializable primaryKey)
		throws NoSuchorderIdException, SystemException {
		Session session = null;

		try {
			session = openSession();

			orderId orderId = (orderId)session.get(orderIdImpl.class, primaryKey);

			if (orderId == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchorderIdException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(orderId);
		}
		catch (NoSuchorderIdException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected orderId removeImpl(orderId orderId) throws SystemException {
		orderId = toUnwrappedModel(orderId);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(orderId)) {
				orderId = (orderId)session.get(orderIdImpl.class,
						orderId.getPrimaryKeyObj());
			}

			if (orderId != null) {
				session.delete(orderId);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (orderId != null) {
			clearCache(orderId);
		}

		return orderId;
	}

	@Override
	public orderId updateImpl(com.slayer.model.orderId orderId)
		throws SystemException {
		orderId = toUnwrappedModel(orderId);

		boolean isNew = orderId.isNew();

		Session session = null;

		try {
			session = openSession();

			if (orderId.isNew()) {
				session.save(orderId);

				orderId.setNew(false);
			}
			else {
				session.merge(orderId);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(orderIdModelImpl.ENTITY_CACHE_ENABLED,
			orderIdImpl.class, orderId.getPrimaryKey(), orderId);

		return orderId;
	}

	protected orderId toUnwrappedModel(orderId orderId) {
		if (orderId instanceof orderIdImpl) {
			return orderId;
		}

		orderIdImpl orderIdImpl = new orderIdImpl();

		orderIdImpl.setNew(orderId.isNew());
		orderIdImpl.setPrimaryKey(orderId.getPrimaryKey());

		orderIdImpl.setTransactionId(orderId.getTransactionId());
		orderIdImpl.setCompanyId(orderId.getCompanyId());
		orderIdImpl.setBuyer(orderId.getBuyer());
		orderIdImpl.setCreateDate(orderId.getCreateDate());
		orderIdImpl.setAmount(orderId.getAmount());
		orderIdImpl.setCurrencyType(orderId.getCurrencyType());
		orderIdImpl.setReceiverEmail(orderId.getReceiverEmail());
		orderIdImpl.setPayerEmail(orderId.getPayerEmail());
		orderIdImpl.setDebit(orderId.getDebit());
		orderIdImpl.setCredit(orderId.getCredit());

		return orderIdImpl;
	}

	/**
	 * Returns the order ID with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the order ID
	 * @return the order ID
	 * @throws com.slayer.NoSuchorderIdException if a order ID with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public orderId findByPrimaryKey(Serializable primaryKey)
		throws NoSuchorderIdException, SystemException {
		orderId orderId = fetchByPrimaryKey(primaryKey);

		if (orderId == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchorderIdException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return orderId;
	}

	/**
	 * Returns the order ID with the primary key or throws a {@link com.slayer.NoSuchorderIdException} if it could not be found.
	 *
	 * @param transactionId the primary key of the order ID
	 * @return the order ID
	 * @throws com.slayer.NoSuchorderIdException if a order ID with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public orderId findByPrimaryKey(long transactionId)
		throws NoSuchorderIdException, SystemException {
		return findByPrimaryKey((Serializable)transactionId);
	}

	/**
	 * Returns the order ID with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the order ID
	 * @return the order ID, or <code>null</code> if a order ID with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public orderId fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		orderId orderId = (orderId)EntityCacheUtil.getResult(orderIdModelImpl.ENTITY_CACHE_ENABLED,
				orderIdImpl.class, primaryKey);

		if (orderId == _nullorderId) {
			return null;
		}

		if (orderId == null) {
			Session session = null;

			try {
				session = openSession();

				orderId = (orderId)session.get(orderIdImpl.class, primaryKey);

				if (orderId != null) {
					cacheResult(orderId);
				}
				else {
					EntityCacheUtil.putResult(orderIdModelImpl.ENTITY_CACHE_ENABLED,
						orderIdImpl.class, primaryKey, _nullorderId);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(orderIdModelImpl.ENTITY_CACHE_ENABLED,
					orderIdImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return orderId;
	}

	/**
	 * Returns the order ID with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param transactionId the primary key of the order ID
	 * @return the order ID, or <code>null</code> if a order ID with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public orderId fetchByPrimaryKey(long transactionId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)transactionId);
	}

	/**
	 * Returns all the order IDs.
	 *
	 * @return the order IDs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<orderId> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<orderId> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<orderId> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<orderId> list = (List<orderId>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ORDERID);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ORDERID;

				if (pagination) {
					sql = sql.concat(orderIdModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<orderId>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<orderId>(list);
				}
				else {
					list = (List<orderId>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the order IDs from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (orderId orderId : findAll()) {
			remove(orderId);
		}
	}

	/**
	 * Returns the number of order IDs.
	 *
	 * @return the number of order IDs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ORDERID);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the order ID persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.slayer.model.orderId")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<orderId>> listenersList = new ArrayList<ModelListener<orderId>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<orderId>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(orderIdImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_ORDERID = "SELECT orderId FROM orderId orderId";
	private static final String _SQL_COUNT_ORDERID = "SELECT COUNT(orderId) FROM orderId orderId";
	private static final String _ORDER_BY_ENTITY_ALIAS = "orderId.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No orderId exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(orderIdPersistenceImpl.class);
	private static orderId _nullorderId = new orderIdImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<orderId> toCacheModel() {
				return _nullorderIdCacheModel;
			}
		};

	private static CacheModel<orderId> _nullorderIdCacheModel = new CacheModel<orderId>() {
			@Override
			public orderId toEntityModel() {
				return _nullorderId;
			}
		};
}