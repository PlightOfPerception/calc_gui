package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JPanel;


/** Panel Assembler -- Handles making panels and their settings.
 * 
 * @author Raleigh Martin
 * 
 *
 */
public class PanelAssembler {
 
	
	private BorderAssembler border;
	
	private JPanel borderPanel;
	private JPanel mainPanel;
	private JPanel fieldPanel;
	private JPanel numPadPanel;
	private JPanel operatorPanel;
	private JPanel displayPanel;
	private JPanel displayIntPanel;
	private JPanel historyPanel;
	private JPanel inputFieldPanel;
	private JPanel imagePanel;
	
	private JPanel numSubPanel1;
	private JPanel numSubPanel2;
	private JPanel numSubPanel3;
	private JPanel numSubPanel4;
	private JPanel numSubPanel5;
	
	private JPanel operatorSubPanel1;
  private JPanel operatorSubPanel2;
  private JPanel operatorSubPanel3;
  private JPanel operatorSubPanel4;
  private JPanel operatorSubPanel5;
	
  private JPanel histButtonPanel;
  private JPanel histButtonSubPanel;
  
  private JPanel spaceSouth;
  private JPanel spaceWest;
	
	Color redPanel;
  
	/**
	 * Constructor.
	 */
	public PanelAssembler() {
	  
	  //Color for red display
	  
	  redPanel = new Color(255,170,170);
		
		//Dimensions for the Panels
		
	  Dimension borderPanelSize = new Dimension(350, 500);
		Dimension mainPanelSize = new Dimension (350 , 500);
		Dimension fieldPanelSize = new Dimension(250, 90);
		Dimension numPadPanelSize = new Dimension(175, 325);
		Dimension operatorPanelSize = new Dimension(75, 325);
		
		
		
		//Panel Inits
		
		border = new BorderAssembler();
		
		borderPanel = new JPanel(new BorderLayout());
		mainPanel = new JPanel(new BorderLayout());
		fieldPanel = new JPanel(new GridLayout(2,1));
		numPadPanel = new JPanel(new GridLayout(5,1));
		operatorPanel = new JPanel(new GridLayout(5,1));
		
		displayPanel = new JPanel(new GridLayout(1,1));
		displayIntPanel = new JPanel( new GridLayout(1,1));
		historyPanel = new JPanel(new FlowLayout());
		inputFieldPanel = new JPanel(new BorderLayout());  //TODO was grid 1,1
		
		histButtonPanel = new JPanel( new BorderLayout());
		histButtonSubPanel = new JPanel( new FlowLayout());
	
		spaceSouth = new JPanel();
		spaceWest = new JPanel();
		imagePanel = new JPanel();
		
		//Border Sets
		
		//mainPanel.setBorder(border.getRedLineBorder()); //For Testing
		inputFieldPanel.setBorder(border.getBlackPanelBorder());
		displayPanel.setBorder(border.getRedPanelBorder());
		
		histButtonPanel.setBorder(border.getHistButtonBorder());
		
		//Color for Display
		
		displayIntPanel.setBackground(redPanel);
		imagePanel.setBackground(redPanel);
		
		
		//Num Pad Panel SubPanels
		
		numSubPanel1 = new JPanel(new FlowLayout());
		numSubPanel2 = new JPanel(new FlowLayout());
		numSubPanel3 = new JPanel(new FlowLayout());
		numSubPanel4 = new JPanel(new FlowLayout());
		numSubPanel5 = new JPanel(new FlowLayout());
		
		//Operator Panel SubPanels
		
		operatorSubPanel1 = new JPanel(new FlowLayout());
    operatorSubPanel2 = new JPanel(new FlowLayout());
    operatorSubPanel3 = new JPanel(new FlowLayout());
    operatorSubPanel4 = new JPanel(new FlowLayout());
    operatorSubPanel5 = new JPanel(new FlowLayout());
		
		
		// Set Dimensions onto Panels
    
		borderPanel.setPreferredSize(borderPanelSize);
		mainPanel.setPreferredSize(mainPanelSize);
		numPadPanel.setPreferredSize(numPadPanelSize);
		fieldPanel.setPreferredSize(fieldPanelSize);
		operatorPanel.setPreferredSize(operatorPanelSize);

		
	}
	
	

	

//***********************************Getters for Panels****************************************

	/**
	 * @return the mainPanel
	 */
	public JPanel getMainPanel() {
		return mainPanel;
	}



	/**
	 * @return the fieldPanel
	 */
	public JPanel getFieldPanel() {
		return fieldPanel;
	}



	/**
	 * @return the numPadPanel
	 */
	public JPanel getNumPadPanel() {
		return numPadPanel;
	}



	/**
	 * @return the operatorPanel
	 */
	public JPanel getOperatorPanel() {
		return operatorPanel;
	}



	/**
	 * @return the displayPanel
	 */
	public JPanel getDisplayPanel() {
		return displayPanel;
	}



	/**
	 * @return the historyPanel
	 */
	public JPanel getHistoryPanel() {
		return historyPanel;
	}



	/**
	 * @return the inputFieldPanel
	 */
	public JPanel getInputFieldPanel() {
		return inputFieldPanel;
	}





  /**
   * @return the numSubPanel1
   */
  public JPanel getNumSubPanel1()
  {
    return numSubPanel1;
  }





  /**
   * @return the numSubPanel2
   */
  public JPanel getNumSubPanel2()
  {
    return numSubPanel2;
  }





  /**
   * @return the numSubPanel3
   */
  public JPanel getNumSubPanel3()
  {
    return numSubPanel3;
  }





  /**
   * @return the numSubPanel4
   */
  public JPanel getNumSubPanel4()
  {
    return numSubPanel4;
  }





  /**
   * @return the numSubPanel5
   */
  public JPanel getNumSubPanel5()
  {
    return numSubPanel5;
  }
  

  
  
  
  /**
   * @return the borderPanel
   */
  public JPanel getBorderPanel() {
    return borderPanel;
  }





  /**
   * @return the operatorSubPanel1
   */
  public JPanel getOperatorSubPanel1()
  {
    return operatorSubPanel1;
  }





  /**
   * @return the operatorSubPanel2
   */
  public JPanel getOperatorSubPanel2()
  {
    return operatorSubPanel2;
  }





  /**
   * @return the operatorSubPanel3
   */
  public JPanel getOperatorSubPanel3()
  {
    return operatorSubPanel3;
  }





  /**
   * @return the operatorSubPanel4
   */
  public JPanel getOperatorSubPanel4()
  {
    return operatorSubPanel4;
  }





  /**
   * @return the operatorSubPanel5
   */
  public JPanel getOperatorSubPanel5()
  {
    return operatorSubPanel5;
  }
  
  
  
  
  
  /**
   * @return the historyButtonPanel
   */
  public JPanel getHistButtonPanel() {
    return histButtonPanel;
  }
  
  
  
  
  
  /**
   * @return the historySubButtonPanel
   */
  public JPanel getHistButtonSubPanel() {
    return histButtonSubPanel;
  }





  /**
   * @return the spaceSouth
   */
  public JPanel getSpaceSouth()
  {
    return spaceSouth;
  }





  /**
   * @return the spaceWest
   */
  public JPanel getSpaceWest()
  {
    return spaceWest;
  }
  
  
  
  
  /**
   * @return the displayIntPanel
   */
  public JPanel getDisplayIntPanel() {
    return displayIntPanel;
  }
  
  
  
  /**
   * @return the imagePanel
   */
  public JPanel getImagePanel() {
    return imagePanel;
  }
  
  
}
