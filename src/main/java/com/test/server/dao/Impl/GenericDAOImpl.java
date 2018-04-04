package com.test.server.dao.Impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;

import com.test.server.dao.GenericDAO;
import com.test.server.exception.CCMSException;
import com.test.server.exception.ErrorCode;
import com.test.server.exception.UniqueConstraintEnum;



@SuppressWarnings({ "rawtypes", "unchecked" })
public class GenericDAOImpl<E, PK extends java.io.Serializable> implements GenericDAO<E, PK> {

	/**
	 * Represents the hibernate session factory object.
	 */
	protected SessionFactory sessionFactory;

	/**
	 * Represents the entity class for which the DAO has been written.
	 */
	private final Class<? extends E> _entityClass;

	/**
	 * Represents the constructor of the DAO object.
	 * 
	 * @param entityClass
	 *            represents the calss for which DAO needs to be created.
	 */
	public GenericDAOImpl(final Class<? extends E> entityClass) {
		super();
		_entityClass = entityClass;
	}

	/**
	 * Method returns the current Hibernate session for the thread.
	 * 
	 * @return Session Represents the Hibernate session.
	 * @throws CCMSException
	 *             throws in case of query or DB Error.
	 */
	protected Session getCrntSession() throws CCMSException {
		try {
			return sessionFactory.getCurrentSession();
		} catch (final HibernateException e) {
			e.printStackTrace();
			throw new CCMSException("Failed to get thread session ", ErrorCode.BASE_DB_ERROR, e);
		}
	}

	/**
	 * Setter for the session factory.
	 * 
	 * @param sessionFactory
	 *            Represents the hibernate session factory object.
	 */
	@Autowired
	public void setSessionFactory(final SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * This method is used to save entity into the database
	 * 
	 * @param newInstance
	 *            Represents the instance to be saved.
	 * 
	 * @return PK Represents the primary key of the entity
	 * @throws CCMSException
	 *             throws in case of query or DB Error.
	 */
	@Override
	public PK create(final E newInstance) throws CCMSException {
		PK id = null;
		final Session session = getCrntSession();
		try {
			id = (PK) session.save(newInstance);
			getCrntSession().flush();
		} catch (final ConstraintViolationException e) {
			String constraintErrorMessage = UniqueConstraintEnum.findUniqueConstraintEnum(e.getConstraintName())
					.getConstraintErrorMessage();
			throw new CCMSException(constraintErrorMessage, ErrorCode.BASE_DB_ERROR);
		} catch (final HibernateException e) {
			e.printStackTrace();
			throw new CCMSException("Failed to insert  " + newInstance, ErrorCode.BASE_DB_ERROR, e);
		}
		return id;
	}

	/**
	 * This method is used to update the entity into database.
	 * 
	 * @param entity
	 *            Represents the instance to be updated.
	 * 
	 * @see org.hibernate.Session#saveOrUpdate(java.lang.Object)
	 * @throws CCMSException
	 *             throws in case of query or DB Error.
	 */
	@Override
	public void update(final E entity) throws CCMSException {
		try {
			getCrntSession().merge(entity);
			getCrntSession().flush();
		} catch (final ConstraintViolationException e) {
			String constraintErrorMessage = UniqueConstraintEnum.findUniqueConstraintEnum(e.getConstraintName())
					.getConstraintErrorMessage();
			throw new CCMSException(constraintErrorMessage, ErrorCode.BASE_DB_ERROR);
		} catch (final HibernateException e) {
			throw new CCMSException("Exception while updating entity ", ErrorCode.BASE_DB_ERROR, e);
		}

	}

	/**
	 * This method is used to merge the entity into database.
	 * 
	 * @param entity
	 *            Represents the instance to be updated.
	 * 
	 * @throws CCMSException
	 *             throws in case of query or DB Error.
	 */
	@Override
	public void merge(final E entity) throws CCMSException {
		try {
			getCrntSession().merge(entity);
			getCrntSession().flush();
		} catch (final ConstraintViolationException e) {
			String constraintErrorMessage = UniqueConstraintEnum.findUniqueConstraintEnum(e.getConstraintName())
					.getConstraintErrorMessage();
			throw new CCMSException(constraintErrorMessage, ErrorCode.BASE_DB_ERROR);
		} catch (final HibernateException e) {
			throw new CCMSException("Exception while updating entity ", ErrorCode.BASE_DB_ERROR, e);
		}

	}

	/**
	 * This method is used to get the particular row from database and its columns will mapped to the object describes in the class
	 * signature E.
	 * 
	 * @param id
	 *            Represents the primary key value for which objects needs to be fetched.
	 * 
	 * @return entity Represents the mapped obejct from database row.
	 * 
	 * @see org.hibernate.Session#get(java.lang.Class, java.io.Serializable)
	 * @throws CCMSException
	 *             throws in case of query or DB Error.
	 */
	@Override
	public E get(final PK id) throws CCMSException {
		try {
			return (E) getCrntSession().get(_entityClass, id);
		} catch (final HibernateException e) {
			throw new CCMSException("Exception while getting entity ", ErrorCode.BASE_DB_ERROR, e);
		}
	}

	/**
	 * This method is used to load the proxy for the object describes in the class signature E. This method never hit the database until the
	 * property (except id property) of that object() is accessed by getter.
	 * 
	 * @param id
	 *            Represents the id of the object for which the proxy needs to be load.
	 * 
	 * @return entity Represents the proxy object.
	 * 
	 * @see org.hibernate.Session#load(java.lang.Class, java.io.Serializable)
	 * @throws CCMSException
	 *             throws in case of query or DB Error.
	 */
	@Override
	public E load(final PK id) throws CCMSException {
		try {
			return (E) getCrntSession().load(_entityClass, id);
		} catch (final HibernateException e) {
			throw new CCMSException("Exception while loading entity ", ErrorCode.BASE_DB_ERROR, e);
		}

	}

	/**
	 * This method is used to return the criteria object for the class describes in the class signature E..
	 * 
	 * @return Represents the generic criteria object.
	 * 
	 * @throws CCMSException
	 *             throws in case of query or DB Error.
	 */
	@Override
	public Criteria getCriteria() throws CCMSException {
		try {
			return getCrntSession().createCriteria(_entityClass);
		} catch (final HibernateException e) {
			throw new CCMSException("Exception while creating criteria ", ErrorCode.BASE_DB_ERROR, e);
		}
	}

	/**
	 * This method is used to get the Generic Criteria object.
	 * 
	 * @param entityclass
	 *            Represents the class for which Criteria object needs be generated.
	 * 
	 * @return Represents the generic criteria object.
	 * @throws CCMSException
	 *             throws in case of query or DB Error.
	 */
	@Override
	public Criteria getCriteria(final Class entityclass) throws CCMSException {
		try {
			return getCrntSession().createCriteria(entityclass);
		} catch (final HibernateException e) {
			throw new CCMSException("Exception while getting criteria ", ErrorCode.BASE_DB_ERROR, e);
		}
	}

	/**
	 * This method is used to execute the query of the Criteria object.
	 * 
	 * @param criteria
	 *            Represents the criteria object which is going to execute the query.
	 * 
	 * @return List Represents the results return from the query.
	 * @throws CCMSException
	 *             throws in case of query or DB Error.
	 */
	@Override
	public <V> List<V> executeCriteria(final Criteria criteria) throws CCMSException {
		try {
			return criteria.list();
		} catch (final HibernateException e) {
			e.printStackTrace();
			throw new CCMSException("Exception while executing criteria " + criteria, ErrorCode.BASE_DB_ERROR, e);
		}
	}

	/**
	 * This method is used to load the proxy for the generic object.This method never hit the database until the property (except id
	 * property) of that object() is accessed by getter.
	 * 
	 * @param classs
	 *            Represents the class for which the proxy needs to be generated.
	 * @param id
	 *            Represents the id for which proxy needs to be generated.
	 * 
	 * @return V Represents the proxy object.
	 * @throws CCMSException
	 *             throws in case of query or DB Error.
	 */
	@Override
	public <V extends Object> V loadObject(final Class classs, final PK id) throws CCMSException {
		try {
			return (V) getCrntSession().load(classs, id);
		} catch (final HibernateException e) {
			throw new CCMSException("Exception while load entity ", ErrorCode.BASE_DB_ERROR, e);
		}

	}

	/**
	 * This method is used to load the generic object from the database.
	 * 
	 * @param classs
	 *            Represents the class for which the object needs to be fetched from database.
	 * @param id
	 *            Represents the id for which the object needs to be fetched from database.
	 * 
	 * @return V Represents the generic object.
	 * @throws CCMSException
	 *             throws in case of query or DB Error.
	 */
	@Override
	public <V extends Object> V getObject(final Class classs, final PK id) throws CCMSException {
		try {
			return (V) getCrntSession().get(classs, id);
		} catch (final HibernateException e) {
			throw new CCMSException("Exception while get entity ", ErrorCode.BASE_DB_ERROR, e);
		}
	}

	/**
	 * This method is used to get the generic object from database with all mentioned associations.
	 * 
	 * @param entityClass
	 *            Represents the Class for which the object needs to fetch from database.
	 * @param entityId
	 *            Represents the id for which the obejct needs to be fetch from database.
	 * @param entityAssociations
	 *            Represents the associations of the object needs to be load with the object.
	 * 
	 * @return V Represents the Object fetched from database.
	 * @throws CCMSException
	 *             throws in case of query or DB Error.
	 */
	@SuppressWarnings("deprecation")
	@Override
	public <V extends Object> V getEntityWithAssociations(Class entityClass, PK entityId, String... entityAssociations)
			throws CCMSException {

		V dataObject = null;
		final Criteria criteria = getCriteria(entityClass);
		try {
			for (final String associationName : entityAssociations) {
				criteria.createAlias(associationName, associationName, CriteriaSpecification.LEFT_JOIN);
			}
			criteria.add(Restrictions.eq("id", entityId));
			final List<V> entityList = executeCriteria(criteria);
			if (entityList.size() > 0) {
				dataObject = entityList.get(0);
			}
		} catch (final HibernateException e) {
			throw new CCMSException("Exception while executing getEntityWithAssociations " + criteria, ErrorCode.BASE_DB_ERROR, e);
		}
		return dataObject;
	}

	/**
	 * This method is used to get Query object for Hibernate Query.
	 * 
	 * @param hql
	 *            Represents the Hibernate Query for which the Query object needs to fetched.
	 * 
	 * @return Represents the Query object.
	 * 
	 * @throws CCMSException
	 *             throws in case of query or DB Error.
	 */
	public Query getQueryObject(final String hql) throws CCMSException {
		try {
			Query query = getCrntSession().createQuery(hql);
			return query;
		} catch (final HibernateException e) {
			throw new CCMSException("Exception while creating query object " + hql, ErrorCode.BASE_DB_ERROR, e);
		}

	}

	/**
	 * This method is used to get the results from the Hibernate DDL Query object.
	 * 
	 * @param query
	 *            Represents the hibernate query object for which the results needs to be fetched.
	 * 
	 * @return List Represents the result returns from the database.
	 * @throws CCMSException
	 *             throws in case of query or DB Error.
	 */
	public <V> List<V> executeHQLSelectQuery(final Query query) throws CCMSException {
		try {
			return query.list();
		} catch (final HibernateException e) {
			throw new CCMSException("Exception while executing hq query  " + query, ErrorCode.BASE_DB_ERROR, e);
		}

	}

	/**
	 * This method is used to execute Hibernate DML Query object.
	 * 
	 * @param query
	 *            Represents the hibernate query object for which the results needs to be fetched.
	 * 
	 * @return represents number of rows inserted/updated or deleted.
	 * @throws CCMSException
	 *             throws in case of query or DB Error.
	 */
	public int executeHQLDMLQuery(final Query query) throws CCMSException {
		try {
			return query.executeUpdate();
		} catch (final HibernateException e) {
			throw new CCMSException("Exception while executing hq query  " + query, ErrorCode.BASE_DB_ERROR, e);
		}

	}

	/**
	 * This method is used to create Entity.
	 * 
	 * @param newInstance
	 *            Represents newInstance.
	 * 
	 * @throws CCMSException
	 *             throws in case of query or DB Error.
	 */
	public PK saveEntity(Object newInstance) throws CCMSException {
		PK id = null;
		final Session session = getCrntSession();
		try {
			id = (PK) session.save(newInstance);
		} catch (final HibernateException e) {
			throw new CCMSException("Failed to insert  " + newInstance + " successfully", ErrorCode.BASE_DB_ERROR, e);
		}
		return id;
	}

	/**
	 * This method is used to update Entity.
	 * 
	 * @param newInstance
	 *            Represents newInstance.
	 * 
	 * @throws CCMSException
	 *             throws in case of query or DB Error.
	 */
	public void updateEntity(Object newInstance) throws CCMSException {
		try {
			getCrntSession().update(newInstance);
		} catch (final HibernateException e) {
			throw new CCMSException("Exception while refresh entity ", ErrorCode.BASE_DB_ERROR, e);
		}
	}

	@SuppressWarnings("hiding")
	@Override
	public <E> List<E> findAll() throws CCMSException {
		Criteria criteria = getCriteria(_entityClass);
		List<E> list = executeCriteria(criteria);
		return list;
	}

	@Override
	public void delete(E newInstance) throws CCMSException {
		try {
			getCrntSession().delete(newInstance);
		} catch (final HibernateException e) {
			throw new CCMSException("Exception while deleting entity ", ErrorCode.BASE_DB_ERROR, e);
		}
	}

	@Override
	public <T> T findById(Long id) {
		Criteria criteria = getCriteria(_entityClass);
		criteria.add(Restrictions.eq("id", id));
		return (T) criteria.uniqueResult();
	}
	
	@Override
	public <T> List<T> findHierarchy(String keyWord, Integer noOfRecords,Class entity) {
		Criteria criteria = getCriteria(entity);
		Disjunction or = Restrictions.disjunction();
		or.add(Restrictions.ilike("fullName", "%" + keyWord + "%"));
		if (keyWord != null) {
			criteria.add(or);
		}
		criteria.add(Restrictions.eq("active", "Yes"));
		criteria.setMaxResults(noOfRecords);
		return  executeCriteria(criteria);
	}

	@Override
	public <E> List<E> findAll(List<Long> ids) {
		if(ids!=null && ids.size() > 0){
			Criteria criteria = getCriteria(_entityClass);
			criteria.add(Restrictions.in("id", ids));
			return criteria.list();
		} else{
			return new ArrayList<E>();
		}
	}
	

}
