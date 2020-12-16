package GUI;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JWindow;

import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 * Constructs the jframe for the history panel popout.
 * 
 * @author Raleigh Martin
 *
 */
public class HistoryAssembler extends JWindow
{

  private static final long serialVersionUID = 1L;
  
  private JPanel histBorderPanel;
  
  private JTextArea histArea;
  
  private JScrollPane scroll;
  
  
  

  /**
   * Constructor.
   */
  public HistoryAssembler()
  {
    
    //Colors and borders
    
    Color darkRed = new Color(255,170,170);
    Border histRedLine = BorderFactory.createLineBorder( darkRed );
    Border spacer = BorderFactory.createEmptyBorder(5,15,5,2);
    Border compound = BorderFactory.createCompoundBorder(spacer,histRedLine);
    Border finalBorder = new TitledBorder(compound, "History", 2, 2); // 2 is justification, 2 is position
    
    
    
    //Panels
    
    histBorderPanel = new JPanel(new GridLayout(1,1));
    
    histBorderPanel.setBorder(finalBorder);
    
    
    
    //Comps
    
    histArea = new JTextArea();
    
    histArea.setEditable(false);
    histArea.setBorder(null);
    
    scroll = new JScrollPane(histArea);
    
    scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    
    
    // Adds
    
    histBorderPanel.add(scroll);
    
    this.setContentPane(histBorderPanel);

    this.setSize(200, 233);
    
    
  
  

  }

}
