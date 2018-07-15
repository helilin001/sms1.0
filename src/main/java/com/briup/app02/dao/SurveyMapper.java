package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Survey;


public interface SurveyMapper {
	// 查询所有学生信息
		List<Survey> findAll();
		
		// 通过id查询学生信息
		Survey findById(long id);
		
		// 保存学生信息
		void save(Survey survey);
		
		// 修改学生信息
		void update(Survey survey);
		
		//删除学生信息
		void deleteById(long id);
}
