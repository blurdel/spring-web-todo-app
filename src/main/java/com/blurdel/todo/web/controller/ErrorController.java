package com.blurdel.todo.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;


@Controller("error")
public class ErrorController {

	@ExceptionHandler(Exception.class)
	public ModelAndView handleException(HttpServletRequest req, Exception exc) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("error");
		mv.addObject("exception", exc.getLocalizedMessage());
		mv.addObject("url", req.getRequestURL());
		
		System.out.println("Doh! " + exc.getLocalizedMessage());
		System.out.println("Doh! " + req.getRequestURL());
		return mv;		
	}
	
}
