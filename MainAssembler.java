package GUI;

import javax.swing.JFrame;

/**
 * GuiAssembler -- Constructs the GUI and adds everything to the proper place.
 * 
 * @author Raleigh Martin
 *
 */
public class MainAssembler extends JFrame
{

  private static final long serialVersionUID = 1L;

  private ImageHandler image;
  private DisplayCompAssembler displayComp;
  private ButtonAssembler button;
  private PanelAssembler panel;
  private HistoryAssembler histWindow;

  /**
   * Constructor
   */
  public MainAssembler()
  {

    displayComp = new DisplayCompAssembler();
    button = new ButtonAssembler();
    panel = new PanelAssembler();
    histWindow = new HistoryAssembler();
    histWindow.setVisible(false);
    histWindow.toBack();
    this.toFront();

    // ***************************************Additions***************************************

    // Main Additions
    panel.getBorderPanel().add(panel.getMainPanel(), "Center");
    panel.getBorderPanel().add(panel.getHistButtonPanel(), "East");
    panel.getBorderPanel().add(panel.getSpaceSouth(), "South");
    panel.getBorderPanel().add(panel.getSpaceWest(), "West");
    panel.getMainPanel().add(panel.getNumPadPanel(), "Center");
    panel.getMainPanel().add(panel.getOperatorPanel(), "East");
    panel.getMainPanel().add(panel.getFieldPanel(), "North");

    // Get Image and Add to Border Panel

    image = new ImageHandler("UnitEdLogo_Transparent.png");

    panel.getBorderPanel().add(image, "North");

    // Display Panel Sub Additions

    panel.getDisplayPanel().add(panel.getDisplayIntPanel());

    // Num Pad Sub Additions

    panel.getNumPadPanel().add(panel.getNumSubPanel1());
    panel.getNumPadPanel().add(panel.getNumSubPanel2());
    panel.getNumPadPanel().add(panel.getNumSubPanel3());
    panel.getNumPadPanel().add(panel.getNumSubPanel4());
    panel.getNumPadPanel().add(panel.getNumSubPanel5());

    // Button Additions

    panel.getHistButtonPanel().add(panel.getHistButtonSubPanel(), "Center");
    panel.getHistButtonSubPanel().add(button.getHistButton());

    // Num Pad SubPanels

    // SubPanel 1

    panel.getNumSubPanel1().add(button.getSignButton());
    panel.getNumSubPanel1().add(button.getClearButton());
    panel.getNumSubPanel1().add(button.getResetButton());

    // SubPanel 2

    panel.getNumSubPanel2().add(button.getOneButton());
    panel.getNumSubPanel2().add(button.getTwoButton());
    panel.getNumSubPanel2().add(button.getThreeButton());

    // SubPanel 3

    panel.getNumSubPanel3().add(button.getFourButton());
    panel.getNumSubPanel3().add(button.getFiveButton());
    panel.getNumSubPanel3().add(button.getSixButton());

    // SubPanel 4

    panel.getNumSubPanel4().add(button.getSevenButton());
    panel.getNumSubPanel4().add(button.getEightButton());
    panel.getNumSubPanel4().add(button.getNineButton());

    // SubPanel 5

    panel.getNumSubPanel5().add(button.getZeroButton());
    panel.getNumSubPanel5().add(button.getBacksButton());

    // Operator SubPanel Additions

    panel.getOperatorPanel().add(panel.getOperatorSubPanel1());
    panel.getOperatorPanel().add(panel.getOperatorSubPanel2());
    panel.getOperatorPanel().add(panel.getOperatorSubPanel3());
    panel.getOperatorPanel().add(panel.getOperatorSubPanel4());
    panel.getOperatorPanel().add(panel.getOperatorSubPanel5());

    // Button Additions to SubPanels

    panel.getOperatorSubPanel1().add(button.getPlusButton());
    panel.getOperatorSubPanel2().add(button.getMinusButton());
    panel.getOperatorSubPanel3().add(button.getMultiButton());
    panel.getOperatorSubPanel4().add(button.getDiviButton());
    panel.getOperatorSubPanel5().add(button.getEqualsButton());

    // Display Comps

    panel.getFieldPanel().add(panel.getDisplayPanel());
    panel.getFieldPanel().add(panel.getInputFieldPanel());

    panel.getDisplayIntPanel().add(displayComp.getDisplay());
    panel.getInputFieldPanel().add(displayComp.getInputField(), "Center");
    panel.getInputFieldPanel().add(displayComp.getUnitDropdown(), "East");
    // JFrame Settings

    setContentPane(panel.getBorderPanel());

    this.setSize(300, 350);
    this.setVisible(true);
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    this.setTitle("Calculator");

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }


  // ****************************************Getter Methods****************************************

  /**
   * @return the displayComp
   */
  public DisplayCompAssembler getDisplayComp()
  {
    return displayComp;
  }

  /**
   * @return the button
   */
  public ButtonAssembler getButton()
  {
    return button;
  }

  /**
   * @return the panel
   */
  public PanelAssembler getPanel()
  {
    return panel;
  }

  /**
   * @return the histWindow
   */
  public HistoryAssembler getHistWindow()
  {
    return histWindow;
  }

}
