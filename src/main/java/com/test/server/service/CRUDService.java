package com.test.server.service;

import com.test.server.exception.*;;

public interface CRUDService<T> {
	
	/**
	 * creates Entity 
	 * 
	 * @param T the entity to create
	 * @return id the unique identifier of Entity
	 * @throws Exception
	 */
	public Long create(T entity)throws Exception;
	/**
	 * updates Entity 
	 * 
	 * @param T the entity to update
	 * @throws Exception
	 */
	void update(T entity)throws Exception;

	/**
	 * deleted Entity for given  id
	 * 
	 * @param id the unique identifier of Entity
	 * @throws Exception
	 */
	void delete(T entity)throws Exception;
	
	/**
	 * deleted Entity for given  id
	 * 
	 * @param id the unique identifier of Entity
	 * @throws Exception
	 */
	void delete(Long id)throws Exception;


	/**
	 * find Entity by id
	 * 
	 * @param id the unique identifier of Entity
	 * @return T the entity 
	 * @throws Exception
	 */
	public T findById(Long id)throws Exception;

}
