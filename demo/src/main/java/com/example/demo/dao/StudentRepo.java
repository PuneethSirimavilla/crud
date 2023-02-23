package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;


import com.example.demo.bean.Student;

public interface StudentRepo extends CrudRepository<Student, Integer>
{
	
}
