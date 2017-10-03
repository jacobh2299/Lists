package list.controller;

import java.util.*;
import list.model.Donut;
import list.view.PopupDisplay;


public class ToolController 
{
	private List<Donut> donutList;
	private PopupDisplay display;
	
	public ToolController()
	{
		donutList = new ArrayList<Donut>();
		display = new PopupDisplay();
	}
	
	public void start() 
	{
		Donut temp = new Donut();
		
		donutList.add(temp);		
		fillTheList();
		showTheList();
	}
	
	private void showTheList()
	{
		for(int i=0; i<donutList.size();i++)
		{
			display.displayText(donutList.get(i).toString());
		}
	}
	
	private void fillTheList()
	{
		Donut jellyFilled = new Donut("jelly filled");
		Donut glazed = new Donut("glazed");
		Donut mapleBar = new Donut("Maple Bar");
		Donut cake = new Donut("cake");
		Donut chocolate = new Donut("Chocolate");
		
		donutList.add(chocolate);
		donutList.add(cake);
		donutList.add(mapleBar);
		donutList.add(glazed);
		donutList.add(jellyFilled);
		
	}
	
}
