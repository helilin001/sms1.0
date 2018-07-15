package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Clazz;
import com.briup.app02.dao.ClazzMapper;
import com.briup.app02.service.IClazzService;

@Service
public class ClazzServiceImpl implements IClazzService {
	@Autowired
	private ClazzMapper clazzMapper;
	
	
	@Override
	public List<Clazz> findAll() throws Exception {
		//调用studentMapper查询所有学生
		List<Clazz> list = clazzMapper.findAll();
		
		return list;
	}


	@Override
	public Clazz findById(long id) throws Exception {
		return clazzMapper.findById(id);
	}


	@Override
	public void save(Clazz answer) throws Exception {
		clazzMapper.save(answer);
	}


	@Override
	public void update(Clazz answer) throws Exception {
		clazzMapper.update(answer);
	}


	@Override
	public void deleteById(long id) throws Exception {
		//1. 通过id查找
		Clazz answer = clazzMapper.findById(id);
		//2. 如果该学生存在，执行删除操作，如果该学生不存在，抛出异常
		if(answer!=null){
			clazzMapper.deleteById(id);
		} else {
			throw new Exception("要删除的学生不存在");
		}
		
		
	}

}













