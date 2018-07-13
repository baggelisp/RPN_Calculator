package Calculator;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class Calculator_2 extends Frame{
	
	public static Operands op;
	private static final long serialVersionUID = 1L;
	public MyButton button0, button1, button2, button3, button4, button5;
    public MyButton button6, button7, button8, button9;
    public MySpButton buttonAdd, buttonSub, buttonMul, buttonDiv;
    public MySpButton buttonEnter,buttonBackSpace,buttonClear,buttonResult;
    public static TextField display;
   public static Label text;
	
	
	
	public Calculator_2(Operands op){			//Constractor
		
		Calculator_2.op = op;
		
		//Frame Settings
		this.setLayout(null);
		Frame frame = new Frame("RPN CALCULATOR @ Evangelos Spathonis ®");
		frame.setFont(new Font("Helvetica", Font.PLAIN, 20));
		frame.setBackground(Color.black);
		frame.setSize(510,310);
		frame.setLocation(400, 250);
		
		frame.toFront();          
		frame.setResizable(false);  
		frame.setLayout(null);
		frame.addWindowListener(new CloseWindowAndExit()); 
		
		button0=new MyButton("0",65, 220, 50, 30);
		button0.addActionListener(new MyButtonHandler("0"));
		frame.add(button0);
		
		button1=new MyButton("1",65, 180, 50, 30);
		button1.addActionListener(new MyButtonHandler("1"));
		frame.add(button1);
		
		button2=new MyButton("2",125, 180, 50, 30);
		button2.addActionListener(new MyButtonHandler("2"));
		frame.add(button2);
		
		button3=new MyButton("3",185, 180, 50, 30);
		button3.addActionListener(new MyButtonHandler("3"));
		frame.add(button3);
		
		button4=new MyButton("4",65,140, 50, 30);
		button4.addActionListener(new MyButtonHandler("4"));
		frame.add(button4);
		
		button5=new MyButton("5",125, 140, 50, 30);
		button5.addActionListener(new MyButtonHandler("5"));
		frame.add(button5);
		
		button6=new MyButton("6",185, 140, 50, 30);
		button6.addActionListener(new MyButtonHandler("6"));
		frame.add(button6);
		
		button7=new MyButton("7",65, 100, 50, 30);
		button7.addActionListener(new MyButtonHandler("7"));
		frame.add(button7);
		
		button8=new MyButton("8",125, 100, 50, 30);
		button8.addActionListener(new MyButtonHandler("8"));
		frame.add(button8);
		
		button9=new MyButton("9",185, 100, 50, 30);
		button9.addActionListener(new MyButtonHandler("9"));
		frame.add(button9);
		
		buttonAdd=new MySpButton("+",300, 100, 30, 30);
		buttonAdd.addActionListener(new MySpButtonHandler("+"));
		frame.add(buttonAdd);
		
		buttonSub=new MySpButton("-",300, 140, 30, 30);
		buttonSub.addActionListener(new MySpButtonHandler("-"));
		frame.add(buttonSub);
		
		buttonMul=new MySpButton("*",300, 180, 30, 30);
		buttonMul.addActionListener(new MySpButtonHandler("*"));
		frame.add(buttonMul);
		
		buttonDiv=new MySpButton("/",300, 220, 30, 30);
		buttonDiv.addActionListener(new MySpButtonHandler("/"));
		frame.add(buttonDiv);
		
		buttonBackSpace=new MySpButton("DEL",125, 220, 50, 30);
		buttonBackSpace.addActionListener(new MySpButtonHandler("BackSpace"));
		frame.add(buttonBackSpace);
		
		buttonClear=new MySpButton("C",185, 220, 50, 30);
		buttonClear.addActionListener(new MySpButtonHandler("Clear"));
		frame.add(buttonClear);
		
		buttonEnter=new MySpButton("Enter",380, 80, 60, 50);
		buttonEnter.addActionListener(new MySpButtonHandler("Enter"));
		frame.add(buttonEnter);
		
		buttonResult=new MySpButton("=",390, 170, 40, 40);
		buttonResult.addActionListener(new MySpButtonHandler("="));
		frame.add(buttonResult);
		
		//Display Settings

		display = new TextField("0",14);
		display.setVisible(true);
		display.setEditable(false);  //disable edditing
		display.setBounds(33, 50, 240, 32); 
		display.setBackground(Color.black);
		display.setForeground(Color.white);
		
		
		text = new Label("stack: []");
		text.setFont(new Font("Serif", Font.PLAIN, 12));
		text.setForeground(Color.white);
		text.setBounds(25, 270, 450, 20);
		
		
		  
		frame.add(text);
		
		frame.add(display);
		frame.setVisible(true);
	}
	

	
	

}
///////////////////////////////////////////////////////////////////////////////////////////////////


class MyButton extends Button {
	private static final long serialVersionUID = 1L;
	String label;		
	public MyButton(String label, int x, int y, int width, int height){   
		super(label);
		this.label = label;
		setBounds(new Rectangle(x, y, width, height));
		setFont(new Font("TimesRoman",Font.PLAIN,14));
		setBackground(Color.red);
		setForeground(Color.BLUE);			
	    }
}
	
class MySpButton extends Button {
	private static final long serialVersionUID = 1L;
	String label;
	public MySpButton(String label, int x, int y, int width, int height){   
		super(label);
		this.label = label;
		setBounds(new Rectangle(x, y, width, height));
		setFont(new Font("TimesRoman",Font.PLAIN,14));
		setBackground(Color.BLUE);
		setForeground(Color.red);		
	    }
}



class MyButtonHandler implements ActionListener {
	String label;
	
	public MyButtonHandler(String l)
	{this.label=l;}

	public void actionPerformed(ActionEvent pushingButton){ 
		Calculator_2.op.addDigit(label.charAt(0)); 
	}
}

class MySpButtonHandler implements ActionListener {
	String label;

	
	public MySpButtonHandler(String l)
	{this.label=l;}

	public void actionPerformed(ActionEvent pushingButton){ 
		
	
		switch (label) {
		case "Enter":
			Calculator_2.op.complete(); 
			break;
		case "BackSpace":
			Calculator_2.op.deleteLastDigit(); 
			break;
		case "Clear":
			Calculator_2.op.reset(); 
			Main.st.removeAllElements();
			break;
		case "+":
			Adder add=new Adder();
			add.operate();
			break;
		case "-":
			Sub sub=new Sub();
			sub.operate();
			break;
		case "*":
			Multiplier mul=new Multiplier();
			mul.operate();
			break;
		case "/":
			Divider div=new Divider();
			div.operate();
			break;
		case "=":
			ResultPresenter result=new ResultPresenter();
			result.operate();
			break;
		default:
			Calculator_2.display.setText("-Error-");
		
		
		
		}
	
			
		
	}
}