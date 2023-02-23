package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.example.demo.bean.Student;
import com.example.demo.dao.StudentRepo;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepo edao;

		@RequestMapping("/")
		public String home()
		{
			return "home.jsp";
		}
		
		@RequestMapping("/addStudent")
		public String addStudent(Student student)
		{
			edao.save(student);
			return "home.jsp";
		}
		
		@RequestMapping("/getStudent")
		public ModelAndView getStudent(@RequestParam int sid)
		{
			ModelAndView mv=new ModelAndView("display.jsp");
			Student student= edao.findById(sid).orElse(null);
			mv.addObject(student);
			return mv;
		}
		
		@RequestMapping("/delStudent")
		public String delStudent(@RequestParam int sid)
		{
			edao.deleteById(sid);
			return "home.jsp";
		}
		
		@RequestMapping("/upStudent")
		public String upStudent(@RequestParam int sid, String sname)
		{
			Student student= edao.findById(sid).orElse(null);
			student.setSname(sname);
			edao.save(student);
			return "home.jsp";
		}
		
}
