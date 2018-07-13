package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.briup.app02.bean.Course;
import com.briup.app02.dao.CourseMapper;
import com.briup.app02.service.ICourseService;

public class CourseServiceImpl implements ICourseService {
	@Autowired
	private CourseMapper courseMapper;
	
	
	@Override
	public List<Course> findAll() throws Exception {
		//调用studentMapper查询所有学生
		List<Course> list = courseMapper.findAll();
		
		return list;
	}


	@Override
	public Course findById(long id) throws Exception {
		return courseMapper.findById(id);
	}


	@Override
	public void save(Course student) throws Exception {
		courseMapper.save(student);
	}


	@Override
	public void update(Course student) throws Exception {
		courseMapper.update(student);
	}


	@Override
	public void deleteById(long id) throws Exception {
		//1. 通过id查找
		Course student = courseMapper.findById(id);
		//2. 如果该学生存在，执行删除操作，如果该学生不存在，抛出异常
		if(student!=null){
			courseMapper.deleteById(id);
		} else {
			throw new Exception("要删除的学生不存在");
		}
		
		
	}
}
