package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Questionnaire;


public interface QuestionnaireMapper {
	// 查询所有学生信息
		List<Questionnaire> findAll();
		
		// 通过id查询学生信息
		Questionnaire findById(long id);
		
		// 保存学生信息
		void save(Questionnaire questionnaire);
		
		// 修改学生信息
		void update(Questionnaire questionnaire);
		
		//删除学生信息
		void deleteById(long id);
}
