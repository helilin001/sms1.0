package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Question;


public interface QuestionMapper {
	// 查询所有学生信息
		List<Question> findAll();
		
		// 通过id查询学生信息
		Question findById(long id);
		
		// 保存学生信息
		void save(Question question);
		
		// 修改学生信息
		void update(Question question);
		
		//删除学生信息
		void deleteById(long id);
}
