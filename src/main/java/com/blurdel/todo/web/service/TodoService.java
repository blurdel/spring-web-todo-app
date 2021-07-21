package com.blurdel.todo.web.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.blurdel.todo.web.model.Todo;


@Service
public class TodoService {

	private static List<Todo> list = new ArrayList<>();
	
	static {
		list.add(new Todo(1, "User", "Learn Java", new Date(), true));
		list.add(new Todo(2, "User", "Learn Spring MVC", new Date(), false));
		list.add(new Todo(3, "User", "Learn Jenkins", new Date(), true));
		list.add(new Todo(4, "User", "Learn kubernetes", new Date(), false));
		
		list.add(new Todo(5, "Larry", "Learn Chinese", new Date(), false));
		list.add(new Todo(6, "Curly", "Learn Spanish", new Date(), false));
	}
	
	public List<Todo> getTodoList(String user) {
		
		List<Todo> filtered = list.stream()
				.filter(p -> p.getUser().equalsIgnoreCase(user))
				.collect(Collectors.toList());
		
		return filtered;
	}
	
}
