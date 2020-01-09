package com.euclid.batch.model.dao.first;

import java.util.List;
import java.util.Map;

import com.euclid.batch.model.vo.People;

public interface FirstDao {
	public Map<String, Object> firstDataAccess();
	public List<People> getListPeople(Map<String, Object> param);
}
