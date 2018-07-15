package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Grade;


public interface GradeMapper {
	// 查询所有学生信息
		List<Grade> findAll();
		
		// 通过id查询学生信息
		Grade findById(long id);
		
		// 保存学生信息
		void save(Grade course);
		
		// 修改学生信息
		void update(Grade course);
		
		//删除学生信息
		void deleteById(long id);
}
