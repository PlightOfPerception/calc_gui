package GUI;

import calculator.Calculator;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;

/** Observer -- Controller and ActionListener for the Gui
 * 
 * @author Raleigh Martin
 * @date Apr 15, 2020
 *
 */
public class Observer implements ActionListener, ComponentListener, WindowStateListener
{

  private Timer timer;
  private Calculator calc;
  private MainAssembler gui;
  private String expression;
  private String answer;
  private final int FINISH_X = 299;
  private final int BEGIN_X = 90;
  private final int BEGIN_Y = 65;
  private final int FPS = 60;
  private final int FRAME_LENGTH = 1000 / FPS;
  private final int STEP = 15;
  int tempLocX = BEGIN_X;
  int tempLocY = BEGIN_Y;
  private TimerTask animate;

  /**
   * Constructor.
   */
  public Observer()
  {

    calc = new Calculator();
    gui = new MainAssembler();
    expression = "";
    answer = "";
    timer = new Timer();
    gui.addComponentListener(this);
    gui.addWindowStateListener(this);
    callListeners();
  }

  
  /**
   * Makes choices when buttons are pressed.
   */
  public void actionPerformed(ActionEvent a)
  {

    gui.getDisplayComp().getInputField().requestFocus();

    String buttonTitle = ((JButton) a.getSource()).getText();

    // Number Buttons

    if (buttonTitle.matches("[0-9]")) stringButtonPressed(buttonTitle, true); // TODO Regex is magic. This used to be 9 lines of code.

    // Operator Buttons
    if (buttonTitle.matches("[+\\-\u00D7\u00F7]")) stringButtonPressed(buttonTitle, false);

    if (buttonTitle.equals("R")) resetPressed();
    if (buttonTitle.equals("C")) clearPressed();
    if (buttonTitle.equals("=")) equalsPressed();

    // Function Buttons
    if (buttonTitle.equals(">") || buttonTitle.equals("<")) histPressed();
    if (buttonTitle.equals("\u232B")) backsPressed();
    if (buttonTitle.equals("\u00B1")) signPressed();

  }

  // ******************************Private Methods**********************************

  // ***********************Action Logic*************************//
  //
  // Depending on the name of the method, these methods
  // determine what happens when the button they are related
  // to is pressed.

  // Number Buttons

  private void stringButtonPressed(String str, Boolean isNumber)
  {

    expression = gui.getDisplayComp().getInputField().getText();

    if (isNumber)
    {

      expression = expression.trim() + str;

      gui.getDisplayComp().getInputField().setText(expression);

    }
    else if (expression.matches("^[\\-]?[0-9]+([.]?[0-9]+)?"))
    {

      answer += expression.trim()
          + gui.getDisplayComp().getUnitDropdown().getSelectedItem().toString().trim();

      answer += str;

      gui.getDisplayComp().getDisplay().setText(answer);
      gui.getDisplayComp().getInputField().setText("");
      clearPressed();
    }

  }

  // Non Character Operator Buttons

  private void resetPressed()
  {

    expression = "";
    answer = "";

    clearPressed();

    gui.getDisplayComp().getDisplay().setText("");
    gui.getDisplayComp().getInputField().setText("");

  }

  private void clearPressed()
  {

    expression = "";
    gui.getDisplayComp().getInputField().setText(expression);

  }

  private void equalsPressed()
  {
    //TODO Send display to calculator, wait for string, set display to string thats returned and
    //update history panel.
  }


  private void histPressed()
  {

    if (gui.getButton().getHistButton().getText().equals(">"))
    {

      gui.getButton().getHistButton().setText("<");

      animateHistory(true);

      gui.getHistWindow().setVisible(true);
      gui.toFront();

    }
    else
    {

      gui.getButton().getHistButton().setText(">");

      animateHistory(false);

      gui.toFront();

    }
  }

  private void backsPressed()
  {
    expression = gui.getDisplayComp().getInputField().getText();

    if (expression.length() > 0)
    {
      String sub = expression.substring(0, expression.length() - 1);

      gui.getDisplayComp().getInputField().setText(sub);
    }

  }

  private void signPressed()
  {

    expression = gui.getDisplayComp().getInputField().getText();

    if (expression.matches("^[\\-]+[0-9.]*"))
    {
      expression = expression.replaceAll("^[\\-]+", "");
    }
    else
    {
      expression = "-" + expression;
    }

    gui.getDisplayComp().getInputField().setText(expression);

  }

  
  /** Runs the animation on History panel
   * 
   * @param direction true if out, false if in
   */
  private void animateHistory(boolean direction)
  {
    if (animate != null)
    {
      animate.cancel();
    }
    if (direction)
    {

      animate = new TimerTask()
      {
        public void run()
        {
          updateHistoryPanelLocation(tempLocX, tempLocY);
          tempLocX += STEP;

          if (tempLocX > FINISH_X)
          {
            this.cancel();
          }

        }
      };

    }
    else
    {

      animate = new TimerTask()
      {
        public void run()
        {
          updateHistoryPanelLocation(tempLocX - 14 , tempLocY);
          tempLocX -= STEP;

          if (tempLocX < BEGIN_X)
          {
            this.cancel();
          }

        }
      };

    }

    timer.scheduleAtFixedRate(animate, 0, FRAME_LENGTH);

  }

  private void updateHistoryPanelLocation(int x, int y)
  {

    int oldX = gui.getLocation().x;
    int oldY = gui.getLocation().y;

    oldX += x;
    oldY += y;

    Point newLocation = new Point(oldX, oldY);

    gui.getHistWindow().setLocation(newLocation);

  }

  private void resetAnimation()
  {
    if (animate != null)
    {
      animate.cancel();
    }

    tempLocX = BEGIN_X;
    tempLocY = BEGIN_Y;
    gui.getHistWindow().setVisible(false);
    gui.getButton().getHistButton().setText(">");
    updateHistoryPanelLocation(BEGIN_X, BEGIN_Y);

  }

  // *********************************Component Listeners**********************************

  @Override
  public void componentHidden(ComponentEvent a)
  {

  }

  @Override
  public void componentMoved(ComponentEvent a)
  {
    if (gui.getButton().getHistButton().getText().equals("<")) {
      updateHistoryPanelLocation(FINISH_X - 14, BEGIN_Y);
    } else {
      updateHistoryPanelLocation(BEGIN_X, BEGIN_Y);
    }
  }

  @Override
  public void componentResized(ComponentEvent a)
  {

  }

  @Override
  public void componentShown(ComponentEvent a)
  {

  }

  @SuppressWarnings("static-access")
  @Override
  public void windowStateChanged(WindowEvent a)
  {
    // minimized
    if ((a.getNewState() & gui.ICONIFIED) == gui.ICONIFIED)
    {
      resetAnimation();
    }

  }

  /**
   * Calls all the listener adder methods in once place.
   */
  private void callListeners()
  {

    zeroButtonListener();
    oneButtonListener();
    twoButtonListener();
    threeButtonListener();
    fourButtonListener();
    fiveButtonListener();
    sixButtonListener();
    sevenButtonListener();
    eightButtonListener();
    nineButtonListener();

    resetButtonListener();
    clearButtonListener();
    plusButtonListener();
    minusButtonListener();
    multiButtonListener();
    diviButtonListener();
    equalsButtonListener();

    histButtonListener();
    backsButtonListener();
    signButtonListener();

  }

  // ******************************Listener Methods*********************************

  private void zeroButtonListener()
  {
    gui.getButton().getZeroButton().addActionListener(this);
  }

  private void oneButtonListener()
  {
    gui.getButton().getOneButton().addActionListener(this);
  }

  private void twoButtonListener()
  {
    gui.getButton().getTwoButton().addActionListener(this);
  }

  private void threeButtonListener()
  {
    gui.getButton().getThreeButton().addActionListener(this);
  }

  private void fourButtonListener()
  {
    gui.getButton().getFourButton().addActionListener(this);
  }

  private void fiveButtonListener()
  {
    gui.getButton().getFiveButton().addActionListener(this);
  }

  private void sixButtonListener()
  {
    gui.getButton().getSixButton().addActionListener(this);
  }

  private void sevenButtonListener()
  {
    gui.getButton().getSevenButton().addActionListener(this);
  }

  private void eightButtonListener()
  {
    gui.getButton().getEightButton().addActionListener(this);
  }

  private void nineButtonListener()
  {
    gui.getButton().getNineButton().addActionListener(this);
  }

  private void resetButtonListener()
  {
    gui.getButton().getResetButton().addActionListener(this);
  }

  private void clearButtonListener()
  {
    gui.getButton().getClearButton().addActionListener(this);
  }

  private void plusButtonListener()
  {
    gui.getButton().getPlusButton().addActionListener(this);
  }

  private void minusButtonListener()
  {
    gui.getButton().getMinusButton().addActionListener(this);
  }

  private void multiButtonListener()
  {
    gui.getButton().getMultiButton().addActionListener(this);
  }

  private void diviButtonListener()
  {
    gui.getButton().getDiviButton().addActionListener(this);
  }

  private void equalsButtonListener()
  {
    gui.getButton().getEqualsButton().addActionListener(this);
  }

  private void histButtonListener()
  {
    gui.getButton().getHistButton().addActionListener(this);
  }

  private void backsButtonListener()
  {
    gui.getButton().getBacksButton().addActionListener(this);
  }

  private void signButtonListener()
  {
    gui.getButton().getSignButton().addActionListener(this);
  }

}
