package Calculator;
import java.awt.*;
import java.awt.event.*;


public class Calculator extends Frame{
	
	public static Operands op;
	private static final long serialVersionUID = 1L;
	public static TextField display;
	public Button button0, button1, button2, button3, button4;
	public Button button5, button6, button7, button8, button9;
	public Button buttonEnter, buttonBackSpace, buttonClear;
	public Button buttonAdd,buttonResult,buttonMul,buttonDiv;

	
	public static TextField helpText;
	
	
	

	public Calculator(Operands op){			//Constractor
		
		Calculator.op = op;
		
		//super("JAVA Polish Reverse Calculator");
		this.setLayout(null);
		Frame frame = new Frame("CALCULATOR");
		frame.setFont(new Font("Helvetica", Font.PLAIN, 20));
		frame.setBackground(Color.black);
		frame.setSize(510,280);
		frame.setLocation(400, 250);

		

		int a=25; //katebasma twn buttons kata a pixels


		button0 = new Button("0");
		button0.addActionListener(new Button0Handler(frame));
		frame.add(button0);
		button0.setBounds(65, 194+a, 50, 30);
		button0.setBackground(Color.red);
		button0.setForeground(Color.green);
		
		button1 = new Button("1");
		button1.addActionListener(new Button1Handler(frame));
		frame.add(button1);
		button1.setBounds(65, 156+a, 50, 30);
		button1.setBackground(Color.red);
		button1.setForeground(Color.green);
		
		button2 = new Button("2");
		button2.addActionListener(new Button2Handler(frame));
		frame.add(button2);
		button2.setBounds(125, 156+a, 50, 30);
		button2.setBackground(Color.red);
		button2.setForeground(Color.green);

		button3 = new Button("3");
		button3.addActionListener(new Button3Handler(frame));
		frame.add(button3);
		button3.setBounds(185, 156+a, 50, 30);
		button3.setBackground(Color.red);
		button3.setForeground(Color.green);

		button4 = new Button("4");
		button4.addActionListener(new Button4Handler(frame));
		frame.add(button4);
		button4.setBounds(65, 118+a, 50, 30);
		button4.setBackground(Color.red);
		button4.setForeground(Color.green);

		button5 = new Button("5");
		button5.addActionListener(new Button5Handler(frame));
		frame.add(button5);
		button5.setBounds(125, 118+a, 50, 30);
		button5.setBackground(Color.red);
		button5.setForeground(Color.green);

		button6 = new Button("6");
		button6.addActionListener(new Button6Handler(frame));
		frame.add(button6);
		button6.setBounds(185, 118+a, 50, 30);
		button6.setBackground(Color.red);
		button6.setForeground(Color.green);

		button7 = new Button("7");
		button7.addActionListener(new Button7Handler(frame));
		frame.add(button7);
		button7.setBounds(65, 80+a, 50, 30);
		button7.setBackground(Color.red);
		button7.setForeground(Color.green);

		button8 = new Button("8");
		button8.addActionListener(new Button8Handler(frame));
		frame.add(button8);
		button8.setBounds(125, 80+a, 50, 30);
		button8.setBackground(Color.red);
		button8.setForeground(Color.green);

		button9 = new Button("9");
		button9.addActionListener(new Button9Handler(frame));
		frame.add(button9);
		button9.setBounds(185, 80+a, 50, 30);
		button9.setBackground(Color.red);
		button9.setForeground(Color.green);
		
		buttonEnter = new Button("ENTER");
		buttonEnter.addActionListener(new ButtonEnterHandler(frame));
		frame.add(buttonEnter);
		buttonEnter.setBounds(385, 90+a, 80, 30);
		buttonEnter.setBackground(Color.DARK_GRAY);
		buttonEnter.setForeground(Color.green);
		
		
		buttonBackSpace = new Button("DEL");
		buttonBackSpace.addActionListener(new ButtonBackSpaceHandler(frame));
		frame.add(buttonBackSpace);
		buttonBackSpace.setBounds(125, 194+a, 50, 30);
		buttonBackSpace.setBackground(Color.DARK_GRAY);
		buttonBackSpace.setForeground(Color.green);

		buttonClear = new Button("C");
		buttonClear.addActionListener(new ButtonClearHandler(frame));
		frame.add(buttonClear);
		buttonClear.setBounds(185, 194+a, 50, 30);
		buttonClear.setBackground(Color.DARK_GRAY);
		buttonClear.setForeground(Color.green);
		
		
		buttonAdd = new Button("+");
		buttonAdd.addActionListener(new ButtonAddHandler(frame));
		frame.add(buttonAdd);
		buttonAdd.setBounds(300, 80+a, 30, 30 );
		buttonAdd.setBackground(Color.DARK_GRAY);
		buttonAdd.setForeground(Color.green);
		
		buttonResult = new Button("=");
		buttonResult.addActionListener(new ButtonResultHandler(frame));
		frame.add(buttonResult);
		buttonResult.setBounds(300, 120+a, 30, 30 );
		buttonResult.setBackground(Color.DARK_GRAY);
		buttonResult.setForeground(Color.green);
		
		buttonMul = new Button("*");
		buttonMul.addActionListener(new ButtonMulHandler(frame));
		frame.add(buttonMul);
		buttonMul.setBounds(300, 160+a, 30, 30 );
		buttonMul.setBackground(Color.DARK_GRAY);
		buttonMul.setForeground(Color.green);
		
		buttonDiv = new Button("/");
		buttonDiv.addActionListener(new ButtonDivHandler(frame));
		frame.add(buttonDiv);
		buttonDiv.setBounds(300, 200+a, 30, 30 );
		buttonDiv.setBackground(Color.DARK_GRAY);
		buttonDiv.setForeground(Color.green);
		
		
		
		
		//Display Settings

		display = new TextField("0",14);
		display.setVisible(true);
		display.setEditable(false);  //disable edditing
		display.setBounds(33, 50, 240, 32); 
		display.setBackground(Color.black);
		display.setForeground(Color.white);
		
		
		helpText = new TextField("",14);
		helpText.setBackground(Color.black);
		helpText.setForeground(Color.white);
		helpText.setEditable(false);

		
		//Frame Settings
		frame.add(display);  
		frame.add(helpText);
		
		frame.setVisible(true);
		frame.toFront();          
		frame.setResizable(false);  
		frame.addWindowListener(new CloseWindowAndExit()); 
		
		

	
		
		
        }
	
	
	
}

class CloseWindowAndExit extends WindowAdapter {
		
		public void windowClosing (WindowEvent closeWindowAndExit){
		System.exit(0);
		
		}
}
	



/////////////////////////////////////////////////////////////////////////////////


class Button0Handler implements ActionListener
{
	Frame frame;
	public Button0Handler(Frame f)
	{ frame=f; }

	public void actionPerformed(ActionEvent pushingButton0){ 
		Calculator.op.addDigit('0'); 
	}
}
	

class Button1Handler implements ActionListener
{
	Frame frame;
	public Button1Handler(Frame f)
	{ frame=f; }

	public void actionPerformed(ActionEvent pushingButton1){ 
		Calculator.op.addDigit('1'); 
	}
}
	
class Button2Handler implements ActionListener
{
	Frame frame;
	public Button2Handler(Frame f)
	{ frame=f; }

	public void actionPerformed(ActionEvent pushingButton2){ 
		Calculator.op.addDigit('2'); 
	}
}

class Button3Handler implements ActionListener
{
	Frame frame;
	public Button3Handler(Frame f)
	{ frame=f; }

	public void actionPerformed(ActionEvent pushingButton3){ 
		Calculator.op.addDigit('3'); 
	}
}

class Button4Handler implements ActionListener
{
	Frame frame;
	public Button4Handler(Frame f)
	{ frame=f; }

	public void actionPerformed(ActionEvent pushingButton4){ 
		Calculator.op.addDigit('4'); 
	}
}

class Button5Handler implements ActionListener
{
	Frame frame;
	public Button5Handler(Frame f)
	{ frame=f; }

	public void actionPerformed(ActionEvent pushingButton5){ 
		Calculator.op.addDigit('5'); 
	}
}

class Button6Handler implements ActionListener
{
	Frame frame;
	public Button6Handler(Frame f)
	{ frame=f; }

	public void actionPerformed(ActionEvent pushingButton6){ 
		Calculator.op.addDigit('6'); 
	}
}

class Button7Handler implements ActionListener
{
	Frame frame;
	public Button7Handler(Frame f)
	{ frame=f; }

	public void actionPerformed(ActionEvent pushingButton7){ 
		Calculator.op.addDigit('7'); 
	}
}

class Button8Handler implements ActionListener
{
	Frame frame;
	public Button8Handler(Frame f)
	{ frame=f; }

	public void actionPerformed(ActionEvent pushingButton8){ 
		Calculator.op.addDigit('8'); 
	}
}

class Button9Handler implements ActionListener
{
	Frame frame;
	public Button9Handler(Frame f)
	{ frame=f; }

	public void actionPerformed(ActionEvent pushingButton9){ 
		Calculator.op.addDigit('9'); 
	}
}


class ButtonEnterHandler implements ActionListener {
	Frame frame;
	public ButtonEnterHandler(Frame f){ frame=f; }

	public void actionPerformed(ActionEvent pushingButtonEnter){ 
		
		
		Calculator.op.complete(); 
	}
}


class ButtonBackSpaceHandler implements ActionListener
{
	Frame frame;
	public ButtonBackSpaceHandler(Frame f)
	{ frame=f; }

	public void actionPerformed(ActionEvent pushingButtonBackSpace)
	{ 
		Calculator.op.deleteLastDigit(); 
	}
}

class ButtonClearHandler implements ActionListener
{
	Frame frame;
	public ButtonClearHandler(Frame f)
	{ frame=f; }

	public void actionPerformed(ActionEvent pushingButtonClear)
	{ 
		Calculator.op.reset(); 
		Main.st.removeAllElements();
	}
}


class ButtonAddHandler implements ActionListener
{
	Frame frame;
	public ButtonAddHandler(Frame f)
	{ frame=f; }

	public void actionPerformed(ActionEvent pushingButtonAdd)
	{ 
		
		Adder add=new Adder();
		add.operate();

		
	}
	
}

class ButtonSubHandler implements ActionListener
{
	Frame frame;
	public ButtonSubHandler(Frame f)
	{ frame=f; }

	public void actionPerformed(ActionEvent pushingButtonSub)
	{ 
		
		Sub sub=new Sub();
		sub.operate();

		
	}
	
}


class ButtonResultHandler implements ActionListener
{
	Frame frame;
	public ButtonResultHandler(Frame f)
	{ frame=f; }

	public void actionPerformed(ActionEvent pushingButtonResult)
	{ 
		ResultPresenter result=new ResultPresenter();
		result.operate();
	}
	
}

class ButtonMulHandler implements ActionListener
{
	Frame frame;
	public ButtonMulHandler(Frame f)
	{ frame=f; }

	public void actionPerformed(ActionEvent pushingButtonMul)
	{ 
		Multiplier mul=new Multiplier();
		mul.operate();
	}
}


class ButtonDivHandler implements ActionListener
{
	Frame frame;
	public ButtonDivHandler(Frame f)
	{ frame=f; }

	public void actionPerformed(ActionEvent pushingButtonDiv)
	{ 
		Divider div=new Divider();
		div.operate();
	
	}
	
}
