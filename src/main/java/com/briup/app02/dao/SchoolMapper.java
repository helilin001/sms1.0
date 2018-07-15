package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.School;


public interface SchoolMapper {
	// 查询所有学生信息
		List<School> findAll();
		
		// 通过id查询学生信息
		School findById(long id);
		
		// 保存学生信息
		void save(School school);
		
		// 修改学生信息
		void update(School school);
		
		//删除学生信息
		void deleteById(long id);
}
