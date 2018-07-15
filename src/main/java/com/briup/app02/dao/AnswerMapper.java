package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Answer;


public interface AnswerMapper {
		// 查询所有学生信息
		List<Answer> findAll();
		
		// 通过id查询学生信息
		Answer findById(long id);
		
		// 保存学生信息
		void save(Answer answer);
		
		// 修改学生信息
		void update(Answer answer);
		
		//删除学生信息
		void deleteById(long id);
}
