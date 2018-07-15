package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Clazz;


public interface ClazzMapper {
		// 查询所有学生信息
		List<Clazz> findAll();
		
		// 通过id查询学生信息
		Clazz findById(long id);
		
		// 保存学生信息
		void save(Clazz clazz);
		
		// 修改学生信息
		void update(Clazz clazz);
		
		//删除学生信息
		void deleteById(long id);
}
