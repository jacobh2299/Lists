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
	}
	
	private void fillTheList()
	{
		Donut jellyFilled = new Donut();
		
	}
	
}
