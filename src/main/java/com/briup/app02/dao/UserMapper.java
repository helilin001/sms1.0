package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.User;


public interface UserMapper {
	// 查询所有学生信息
		List<User> findAll();
		
		// 通过id查询学生信息
		User findById(long id);
		
		// 保存学生信息
		void save(User user);
		
		// 修改学生信息
		void update(User user);
		
		//删除学生信息
		void deleteById(long id);
}
