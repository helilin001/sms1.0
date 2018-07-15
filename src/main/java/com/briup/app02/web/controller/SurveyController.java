package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Survey;
import com.briup.app02.service.ISurveyService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/survey")
public class SurveyController {
	// 注入studentService的实例
	@Autowired
	private ISurveyService surveyService;
	
	@GetMapping("deleteSurveyById")
	public MsgResponse deleteSurveyById(long id){
		try {
			// 调用service层代码删除学生信息
			surveyService.deleteById(id);
			// 如果删除成功返回成功信息
			return MsgResponse.success("删除成功！", null);
		} catch (Exception e) {
			// 先打印错误信息，让后台开发者知道问题所在；返回错误信息，让前端开发者知道错误所在
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("updateSurvey")
	public String updateSurvey(Survey survey){
		try {
			surveyService.update(survey);
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
	@PostMapping("saveSurvey")
	public void saveCourse(Survey survey){
		try {
			surveyService.save(survey);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	// http://127.0.0.1:8080/course/findAllSurvey
	@GetMapping("findAllSurvey")
	public MsgResponse findAllSurvey(){
		try {
			List<Survey> list = surveyService.findAll();
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findSurveyById")
	public Survey findSurveyById(long id){
		try {
			Survey sourse = surveyService.findById(id);
			return sourse;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
}













