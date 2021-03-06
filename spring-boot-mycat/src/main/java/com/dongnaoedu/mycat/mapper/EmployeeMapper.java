package com.dongnaoedu.mycat.mapper;

import java.util.List;

import com.dongnaoedu.mycat.model.Employee;

public interface EmployeeMapper {

	List<Employee> selectByExample(Employee employee);

	public Employee selectByPrimaryKey(Integer id);

	public void deleteByPrimaryKey(Integer id);

	public void updateByPrimaryKey(Employee employee);

	public void insert(Employee employee);
}