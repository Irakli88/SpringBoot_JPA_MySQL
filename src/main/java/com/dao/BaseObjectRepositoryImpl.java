package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.model.BaseObject;

public class BaseObjectRepositoryImpl<T extends BaseObject>  {

	@Autowired
	BaseObjectRepository<T> baseObjectRepository;
	
	public List<T> findAllBySomeLogic() {
		return null;
	}
}
