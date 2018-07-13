package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Course;
import com.briup.app02.service.ICourseService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/course")
public class CourseController {
	// 注入studentService的实例
	@Autowired
	private ICourseService courseService;
	
	@GetMapping("deleteCourseById")
	public MsgResponse deleteCourseById(long id){
		try {
			// 调用service层代码删除学生信息
			courseService.deleteById(id);
			// 如果删除成功返回成功信息
			return MsgResponse.success("删除成功！", null);
		} catch (Exception e) {
			// 先打印错误信息，让后台开发者知道问题所在；返回错误信息，让前端开发者知道错误所在
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("updateCourse")
	public String updateCourse(Course course){
		try {
			courseService.update(course);
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
	@PostMapping("saveCourse")
	public void saveCourse(Course course){
		try {
			courseService.save(course);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	// http://127.0.0.1:8080/student/findAllStudent
	@GetMapping("findAllCourse")
	public MsgResponse findAllStudent(){
		try {
			List<Course> list = courseService.findAll();
			return MsgResponse.success("查询成功", list);
		} catch (Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findCourseById")
	public Course findStudentById(long id){
		try {
			Course course = courseService.findById(id);
			return course;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
}













