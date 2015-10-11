package com.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.model.BaseObject;

public interface BaseObjectRepository<T extends BaseObject> extends CrudRepository<T, Long> {
	List<T> findAllById(final Long id);
}
