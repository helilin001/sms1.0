package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Qq;
import com.briup.app02.dao.QqMapper;
import com.briup.app02.service.IQqService;

@Service
public class QqServiceImpl implements IQqService {
	@Autowired
	private QqMapper qqMapper;
	
	
	@Override
	public List<Qq> findAll() throws Exception {
		//调用studentMapper查询所有学生
		List<Qq> list = qqMapper.findAll();
		
		return list;
	}


	@Override
	public Qq findById(long id) throws Exception {
		return qqMapper.findById(id);
	}


	@Override
	public void save(Qq qq) throws Exception {
		qqMapper.save(qq);
	}


	@Override
	public void update(Qq qq) throws Exception {
		qqMapper.update(qq);
	}


	@Override
	public void deleteById(long id) throws Exception {
		//1. 通过id查找
		Qq qq = qqMapper.findById(id);
		//2. 如果该学生存在，执行删除操作，如果该学生不存在，抛出异常
		if(qq!=null){
			qqMapper.deleteById(id);
		} else {
			throw new Exception("要删除的学生不存在");
		}
		
		
	}
}
