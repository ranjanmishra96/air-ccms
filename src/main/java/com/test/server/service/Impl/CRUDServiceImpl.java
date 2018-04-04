package com.test.server.service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.test.server.dao.GenericDAO;
import com.test.server.exception.UniqueConstraintException;
import com.test.server.service.CRUDService;



public abstract class CRUDServiceImpl<T> implements CRUDService<T> {
	
	/**
	 * gets the baseDAO
	 */
	public abstract GenericDAO<T, Long> getBaseDAO();



	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public Long create(T entity) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<T>> validate = validator.validate(entity);
		if (validate.size() > 0) {
			List<String> list = new ArrayList<>();
			for (ConstraintViolation<T> constraintViolation : validate) {
				list.add(constraintViolation.getMessage());
			}

			String[] myarray = list.toArray(new String[] {});
			throw new UniqueConstraintException(myarray);
		}
		return (Long) getBaseDAO().create(entity);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void update(T entity) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<T>> validate = validator.validate(entity);
		if (validate.size() > 0) {
			List<String> list = new ArrayList<>();
			for (ConstraintViolation<T> constraintViolation : validate) {
				list.add(constraintViolation.getMessage());
			}

			String[] myarray = list.toArray(new String[] {});
			throw new UniqueConstraintException(myarray);
		} else {
			getBaseDAO().merge(entity);
		}
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void delete(T entity) {
		getBaseDAO().delete(entity);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void delete(Long id) {
		T entity = getBaseDAO().load(id);
		getBaseDAO().delete(entity);
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public T findById(Long id) {

		return getBaseDAO().findById(id);
	}

}
