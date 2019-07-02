package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Employee;

@Controller
public class EmployeeController {

	@RequestMapping("/show")
	public ModelAndView showReg()
	{
		ModelAndView m=new ModelAndView();
		m.setViewName("EmpData");
		Employee e=new Employee();
		e.setEmpId(10);
		e.setEmpName("SATISH");
		e.setEmpSal(1000.00);
		List<Employee> list=Arrays.asList(
				new Employee(11,"SRINU5",2000.00),
				new Employee(12,"SRINU4",3000.00),
				new Employee(13,"SRINU3",4000.00),
				new Employee(14,"SRINU2",5000.00),
				new Employee(15,"SRINU1",6000.00)
				);
		m.addObject("eid",55);
		m.addObject("empData",e);
		m.addObject("list",list);
		return m;
	}
}
