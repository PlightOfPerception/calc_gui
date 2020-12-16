package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;


import javax.swing.JComboBox;
import javax.swing.JLabel;

import javax.swing.JTextPane;




/** DisplayCompAssembler -- Handles all the display components and their settings.
 * 
 * @author Raleigh Martin
 *
 */
public class DisplayCompAssembler {

	private JTextPane inputField;
	private JLabel display;
	private JComboBox<String> unitDropdown;
	
	/**
	 * Constructor.
	 */
	public DisplayCompAssembler() {
		
	  
	  //Font for inputfield
	  
	  Font fieldFont = new Font(Font.SANS_SERIF, Font.BOLD, 24);
	  
	  Dimension inputFieldSize = new Dimension( 25, 125);
	  Dimension unitDropdownSize = new Dimension( 49, 30);
	  
	  
		inputField = new JTextPane();
		display = new JLabel();
		unitDropdown = new JComboBox<String>();
		
		
		inputField.setPreferredSize(inputFieldSize);
		inputField.setFont(fieldFont);
		
		
		display.setFont(fieldFont);
		
		
		
		//DropDown menu
		
		unitDropdown.addItem("");
		unitDropdown.addItem("lbs");
		unitDropdown.addItem("in");
		unitDropdown.addItem("cm");
		unitDropdown.addItem("l");
		
		unitDropdown.setEditable(true);
		
		unitDropdown.setPreferredSize(unitDropdownSize);
		
		unitDropdown.setBackground(Color.white);
		
		inputField.add(unitDropdown);
		
		
		
		
	}

	
	//*******************************Getter Methods***********************************
	
	
	/**
	 * @return the display
	 */
	public JLabel getDisplay() {
		return display;
	}

	/**
	 * @return the inputField
	 */
	public JTextPane getInputField() {
		return inputField;
	}

	/**
	 * @return the unitDropdown
	 */
	public JComboBox<String> getUnitDropdown() {
		return unitDropdown;
	}
		
	
	
}
