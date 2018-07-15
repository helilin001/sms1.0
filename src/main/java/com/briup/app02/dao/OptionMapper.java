package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Option;


public interface OptionMapper {
	// 查询所有学生信息
		List<Option> findAll();
		
		// 通过id查询学生信息
		Option findById(long id);
		
		// 保存学生信息
		void save(Option option);
		
		// 修改学生信息
		void update(Option option);
		
		//删除学生信息
		void deleteById(long id);
}
