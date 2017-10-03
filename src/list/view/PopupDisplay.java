package list.view;

import javax.swing.JOptionPane;

public class PopupDisplay 
{
	/**
	 * Displays the supplied message in a popup window.
	 * @param message
	 */
	public void displayText(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	
	/**
	 * Displays the supplied question in a popup and returns the answer as a String
	 * @param fromQuestion The question to ask the User.
	 * @return The String Answer
	 */
	public String getResponse(String fromQuestion)
	{
		String response = "";
		
		response += JOptionPane.showInputDialog(null, fromQuestion);
		
		return response;
	}
	
}
