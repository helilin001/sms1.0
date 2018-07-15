package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Question;
import com.briup.app02.service.IQuestionService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/question")
public class QuestionController {
	// 注入studentService的实例
	@Autowired
	private IQuestionService questionService;
	
	@GetMapping("deleteQuestionById")
	public MsgResponse deleteQuestionById(long id){
		try {
			// 调用service层代码删除学生信息	
			questionService.deleteById(id);
			// 如果删除成功返回成功信息
			return MsgResponse.success("删除成功！", null);
		} catch (Exception e) {
			// 先打印错误信息，让后台开发者知道问题所在；返回错误信息，让前端开发者知道错误所在
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("updateQuestion")
	public String updateQuestion(Question question){
		try {
			questionService.update(question);
			return "修改成功！";
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}
	
	/**
	 * 保存学生信息
	 * @author 李春雨
	 * @param student 
	 * @return 
	 * */
	@PostMapping("saveQuestion")
	public void saveQuestion(Question question){
		try {
			questionService.save(question);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	// http://127.0.0.1:8080/course/findAllCourse
	@GetMapping("findAllQuestion")
	public MsgResponse findAllQuestion(){
		try {
			List<Question> list = questionService.findAll();
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findQuestionById")
	public Question findQuestionById(long id){
		try {
			Question question = questionService.findById(id);
			return question;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
}













