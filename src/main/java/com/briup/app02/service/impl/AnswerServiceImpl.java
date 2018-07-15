package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Answer;
import com.briup.app02.dao.AnswerMapper;
import com.briup.app02.service.IAnswerService;

@Service
public class AnswerServiceImpl implements IAnswerService {
	@Autowired
	private AnswerMapper answerMapper;
	
	
	@Override
	public List<Answer> findAll() throws Exception {
		//调用studentMapper查询所有学生
		List<Answer> list = answerMapper.findAll();
		
		return list;
	}


	@Override
	public Answer findById(long id) throws Exception {
		return answerMapper.findById(id);
	}


	@Override
	public void save(Answer answer) throws Exception {
		answerMapper.save(answer);
	}


	@Override
	public void update(Answer answer) throws Exception {
		answerMapper.update(answer);
	}


	@Override
	public void deleteById(long id) throws Exception {
		//1. 通过id查找
		Answer answer = answerMapper.findById(id);
		//2. 如果该学生存在，执行删除操作，如果该学生不存在，抛出异常
		if(answer!=null){
			answerMapper.deleteById(id);
		} else {
			throw new Exception("要删除的学生不存在");
		}
		
		
	}

}













