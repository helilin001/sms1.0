package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Question;
import com.briup.app02.dao.QuestionMapper;
import com.briup.app02.service.IQuestionService;

@Service
public class QuestionServiceImpl implements IQuestionService {
	@Autowired
	private QuestionMapper questionMapper;
	
	
	@Override
	public List<Question> findAll() throws Exception {
		//调用studentMapper查询所有学生
		List<Question> list = questionMapper.findAll();
		
		return list;
	}


	@Override
	public Question findById(long id) throws Exception {
		return questionMapper.findById(id);
	}


	@Override
	public void save(Question question) throws Exception {
		questionMapper.save(question);
	}


	@Override
	public void update(Question question) throws Exception {
		questionMapper.update(question);
	}


	@Override
	public void deleteById(long id) throws Exception {
		//1. 通过id查找
		Question course = questionMapper.findById(id);
		//2. 如果该学生存在，执行删除操作，如果该学生不存在，抛出异常
		if(course!=null){
			questionMapper.deleteById(id);
		} else {
			throw new Exception("要删除的学生不存在");
		}
		
		
	}
}
