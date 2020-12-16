package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;

/** ButtonAssembler -- Handles all the settings for the different buttons.
 * 
 * @author Raleigh Martin
 *
 */
public class ButtonAssembler {
	private JButton zeroButton;
	private JButton oneButton;
	private JButton twoButton;
	private JButton threeButton;
	private JButton fourButton;
	private JButton fiveButton;
	private JButton sixButton;
	private JButton sevenButton;
	private JButton eightButton;
	private JButton nineButton;
	
	private JButton resetButton;
	private JButton clearButton;
	private JButton plusButton;
	private JButton minusButton;
	private JButton multiButton;
	private JButton diviButton;
	private JButton equalsButton;
	
	private JButton histButton;
	private JButton backsButton;
	private JButton signButton;
	
	Color yellowButtonColor;
	Color grayButtonColor;
	/**
	 * Constructor.
	 */
	public ButtonAssembler() {
	  
	  //Font
	  
	  Font buttonFont = new Font(Font.SANS_SERIF, Font.BOLD, 18);
		
	  //Special Button Color
	  
	  yellowButtonColor = new Color(128,128,0);
	  grayButtonColor = new Color(179, 179, 179);
	  
	  //Button Dimensions
	  
	  Dimension standardButtonSize = new Dimension( 50, 30 );
	  Dimension zeroButtonSize = new Dimension (105,30);
	  Dimension histButtonSize = new Dimension(17,17);
		
		//Number Buttons
		zeroButton = new JButton("0");
		oneButton = new JButton("1");
		twoButton = new JButton("2");
		threeButton = new JButton("3");
		fourButton = new JButton("4");
		fiveButton = new JButton("5");
		sixButton = new JButton("6");
		sevenButton = new JButton("7");
		eightButton = new JButton("8");
		nineButton = new JButton("9");
		
		//Operator Buttons
		resetButton = new JButton("R");
		clearButton = new JButton("C");
		plusButton = new JButton("+");
		minusButton = new JButton("-");
		multiButton = new JButton("\u00D7");
		diviButton = new JButton("\u00F7");
		equalsButton = new JButton("=");
		
		//Function Buttons
		histButton = new JButton(">");
		backsButton = new JButton("\u232B");
		signButton = new JButton("\u00B1");
		
		
		//Number Button Sizes
	
		zeroButton.setPreferredSize(zeroButtonSize);
    oneButton.setPreferredSize(standardButtonSize);
    twoButton.setPreferredSize(standardButtonSize);
    threeButton.setPreferredSize(standardButtonSize);
    fourButton.setPreferredSize(standardButtonSize);
    fiveButton.setPreferredSize(standardButtonSize);
    sixButton.setPreferredSize(standardButtonSize);
    sevenButton.setPreferredSize(standardButtonSize);
    eightButton.setPreferredSize(standardButtonSize);
    nineButton.setPreferredSize(standardButtonSize);
    
    //Operator Button Sizes
    resetButton.setPreferredSize(standardButtonSize);
    clearButton.setPreferredSize(standardButtonSize);
    plusButton.setPreferredSize(standardButtonSize);
    minusButton.setPreferredSize(standardButtonSize);
    multiButton.setPreferredSize(standardButtonSize);
    diviButton.setPreferredSize(standardButtonSize);
    equalsButton.setPreferredSize(standardButtonSize);
    
    //Function Button Sizes
    histButton.setPreferredSize(histButtonSize);
    histButton.setMargin(new java.awt.Insets(1, 2, 1, 2));
    backsButton.setPreferredSize(standardButtonSize);
    signButton.setPreferredSize(standardButtonSize);
	
    //Color Sets
    
    signButton.setForeground(yellowButtonColor);
    clearButton.setForeground(yellowButtonColor);
    resetButton.setForeground(yellowButtonColor);
    backsButton.setForeground(yellowButtonColor);
    
    //Number Button Colors
    
    zeroButton.setBackground(grayButtonColor);
    oneButton.setBackground(grayButtonColor);
    twoButton.setBackground(grayButtonColor);
    threeButton.setBackground(grayButtonColor);
    fourButton.setBackground(grayButtonColor);
    fiveButton.setBackground(grayButtonColor);
    sixButton.setBackground(grayButtonColor);
    sevenButton.setBackground(grayButtonColor);
    eightButton.setBackground(grayButtonColor);
    nineButton.setBackground(grayButtonColor);
    
    //Operator Colors
    resetButton.setBackground(grayButtonColor);
    clearButton.setBackground(grayButtonColor);
    plusButton.setBackground(grayButtonColor);
    minusButton.setBackground(grayButtonColor);
    multiButton.setBackground(grayButtonColor);
    diviButton.setBackground(grayButtonColor);
    equalsButton.setBackground(grayButtonColor);
    
    //Function Colors
    histButton.setBackground(grayButtonColor);
    backsButton.setBackground(grayButtonColor);
    signButton.setBackground(grayButtonColor);
    
  //Number Button Fonts
    
    zeroButton.setFont(buttonFont);
    oneButton.setFont(buttonFont);
    twoButton.setFont(buttonFont);
    threeButton.setFont(buttonFont);
    fourButton.setFont(buttonFont);
    fiveButton.setFont(buttonFont);
    sixButton.setFont(buttonFont);
    sevenButton.setFont(buttonFont);
    eightButton.setFont(buttonFont);
    nineButton.setFont(buttonFont);
    
    //Operator Button Colors
    resetButton.setFont(buttonFont);
    clearButton.setFont(buttonFont);
    plusButton.setFont(buttonFont);
    minusButton.setFont(buttonFont);
    multiButton.setFont(buttonFont);
    diviButton.setFont(buttonFont);
    equalsButton.setFont(buttonFont);
    
    //Function Button Colors
    backsButton.setMargin(new java.awt.Insets(1, 2, 1, 2));
    backsButton.setFont(buttonFont);
    signButton.setFont(buttonFont);
    
    
	}
	
	
//************************************Getter Methods***************************************

	/**
	 * @return the zeroButton
	 */
	public JButton getZeroButton() {
		return zeroButton;
	}

	/**
	 * @return the oneButton
	 */
	public JButton getOneButton() {
		return oneButton;
	}

	/**
	 * @return the twoButton
	 */
	public JButton getTwoButton() {
		return twoButton;
	}

	/**
	 * @return the threeButton
	 */
	public JButton getThreeButton() {
		return threeButton;
	}

	/**
	 * @return the fourButton
	 */
	public JButton getFourButton() {
		return fourButton;
	}

	/**
	 * @return the fiveButton
	 */
	public JButton getFiveButton() {
		return fiveButton;
	}

	/**
	 * @return the sixButton
	 */
	public JButton getSixButton() {
		return sixButton;
	}

	/**
	 * @return the sevenButton
	 */
	public JButton getSevenButton() {
		return sevenButton;
	}

	/**
	 * @return the eightButton
	 */
	public JButton getEightButton() {
		return eightButton;
	}

	/**
	 * @return the nineButton
	 */
	public JButton getNineButton() {
		return nineButton;
	}

	/**
	 * @return the resetButton
	 */
	public JButton getResetButton() {
		return resetButton;
	}

	/**
	 * @return the clearButton
	 */
	public JButton getClearButton() {
		return clearButton;
	}

	/**
	 * @return the plusButton
	 */
	public JButton getPlusButton() {
		return plusButton;
	}

	/**
	 * @return the minusButton
	 */
	public JButton getMinusButton() {
		return minusButton;
	}

	/**
	 * @return the multiButton
	 */
	public JButton getMultiButton() {
		return multiButton;
	}

	/**
	 * @return the diviButton
	 */
	public JButton getDiviButton() {
		return diviButton;
	}

	/**
	 * @return the equalButton
	 */
	public JButton getEqualsButton() {
		return equalsButton;
	}

	/**
	 * @return the histButton
	 */
	public JButton getHistButton() {
		return histButton;
	}

	/**
	 * @return the backsButton
	 */
	public JButton getBacksButton() {
		return backsButton;
	}

	/**
	 * @return the signButton
	 */
	public JButton getSignButton() {
		return signButton;
	}

	
	
	
}
