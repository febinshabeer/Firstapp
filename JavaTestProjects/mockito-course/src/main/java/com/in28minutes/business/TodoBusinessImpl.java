package com.in28minutes.business;

import java.util.ArrayList;
import java.util.List;

import com.in28minutes.data.api.Todoservice;

public class TodoBusinessImpl {

	private Todoservice todoservice;

	public TodoBusinessImpl(Todoservice todoservice) {
		super();
		this.todoservice = todoservice;
	} 
	public List<String> retreavetodosrelatedtospring(String user)
	{
		List<String> filtertodos=new ArrayList<String>();
	
		List<String> todos=todoservice.retrieveTodos(user);
		
		for(String todo:todos)
		{
			if(todo.contains("spring"))
			{
				filtertodos.add(todo);
			}
		}
		return filtertodos;
		
	}
}
