package com.test.server.service;

import com.test.server.exception.*;;

public interface CRUDService<T> {
	
	/**
	 * creates Entity 
	 * 
	 * @param T the entity to create
	 * @return id the unique identifier of Entity
	 * @throws CCMSException
	 */
	public Long create(T entity)throws CCMSException;
	/**
	 * updates Entity 
	 * 
	 * @param T the entity to update
	 * @throws CCMSException
	 */
	void update(T entity)throws CCMSException;

	/**
	 * deleted Entity for given  id
	 * 
	 * @param id the unique identifier of Entity
	 * @throws CCMSException
	 */
	void delete(T entity)throws CCMSException;
	
	/**
	 * deleted Entity for given  id
	 * 
	 * @param id the unique identifier of Entity
	 * @throws CCMSException
	 */
	void delete(Long id)throws CCMSException;


	/**
	 * find Entity by id
	 * 
	 * @param id the unique identifier of Entity
	 * @return T the entity 
	 * @throws CCMSException
	 */
	public T findById(Long id)throws CCMSException;

}
