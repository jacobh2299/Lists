package list.controller;

import java.util.*;
import list.model.Donut;


public class ToolController 
{
	private List<Donut> donutList;
	
	public ToolController()
	{
		donutList = new ArrayList<Donut>();
	}
	
	public void start() 
	{
			Donut temp = new Donut();
		
			donutList.add(temp);	
	}
	
}
