package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Answer;
import com.briup.app02.service.IAnswerService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/answer")
public class AnswerController {
	// 注入studentService的实例
	@Autowired
	private IAnswerService answerService;
	
	@GetMapping("deleteAnswerById")
	public MsgResponse deleteAnswerById(long id){
		try {
			// 调用service层代码删除学生信息
			answerService.deleteById(id);
			// 如果删除成功返回成功信息
			return MsgResponse.success("删除成功！", null);
		} catch (Exception e) {
			// 先打印错误信息，让后台开发者知道问题所在；返回错误信息，让前端开发者知道错误所在
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("updateAnswer")
	public String updateAnswer(Answer answer){
		try {
			answerService.update(answer);
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
	@PostMapping("saveAnswer")
	public void saveCourse(Answer answer){
		try {
			answerService.save(answer);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	// http://127.0.0.1:8080/answer/findAllAnswer
	@GetMapping("findAllAnswer")
	public MsgResponse findAllAnswer(){
		try {
			List<Answer> list = answerService.findAll();
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findAnswerById")
	public Answer findAnswerById(long id){
		try {
			Answer answer = answerService.findById(id);
			return answer;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
}













