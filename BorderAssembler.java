package GUI;



import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

/** BorderAssembler -- handles making all the borders and their settings.
 * 
 * @author Raleigh Martin
 * @date 4-12-20
 *
 */
public class BorderAssembler {

	private Border blackLine;
	private Border redLine;
	private Border bufferBorder;
	private Border blackPanelBorder;
	private Border redPanelBorder;
	private Border outputBorder;
	private Border prevExpBorder;
	private Border currentExpBorder;
	private Border histButtonBorder;
	
	private Color darkRed;
	
	/**
	 * Constructor.
	 */
	public BorderAssembler() {
		
	  
	  //Dark red color for main panel Border
	  
	  darkRed = new Color(128,0,0);
	  
	  
		// Common Borders
        
		blackLine = BorderFactory.createLineBorder( Color.black );
		redLine = BorderFactory.createLineBorder( darkRed );
		bufferBorder = BorderFactory.createEmptyBorder( 5, 11, 0, 13 );
		
		histButtonBorder = BorderFactory.createEmptyBorder(174, 0, 0, 0);
		        
		//Panel Border
		        
		blackPanelBorder = BorderFactory.createCompoundBorder(bufferBorder, blackLine);
		redPanelBorder = BorderFactory.createCompoundBorder(bufferBorder, redLine);
		
		//Output Border
		        
		outputBorder = BorderFactory.createTitledBorder(blackPanelBorder, "Output");
		        
		//PrevExp Border
		        
		prevExpBorder = BorderFactory.createTitledBorder(blackPanelBorder, "Previous Expression");
	
		//CurrentExp Border
		        
		currentExpBorder = BorderFactory.createTitledBorder( blackPanelBorder, "Current Expression");
		
		
	}
	

	
	//****************************Getter Methods******************************
	
	public Border getBufferBorder() {
	  return bufferBorder;
	}
	
	public Border getBlackLineBorder() {
	  return blackLine;
	}
	
	
	public Border getRedLineBorder() {
	  return redLine;
	}
	
	
	public Border getBlackPanelBorder() {
		return blackPanelBorder;
	}

	
	public Border getRedPanelBorder() {
    return redPanelBorder;
  }

	
	public Border getOutputBorder() {
		return outputBorder;
	}
	

	public Border getPrevExpBorder() {
		return prevExpBorder;
	}


	public Border getCurrentExpBorder() {
		return currentExpBorder;
	}

public Border getHistButtonBorder() {
  return histButtonBorder;
}


}
