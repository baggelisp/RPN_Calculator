
package Calculator;
import java.util.Stack;



public class Main {

    static Stack<Float> st= new Stack<Float>();
    static Operands op;
    static Adder add;
    static Sub sub;
    static Divider div;
    static Multiplier mult;
    static ResultPresenter rp;
	
	
	public static void main(String[] args) {
		
		
		System.out.println("RPN Calculator");
		
		
		op = new Operands();
        add = new Adder();
        sub = new Sub();
        mult = new Multiplier();
        div = new Divider();
        rp = new ResultPresenter();
        //calc = new CalculatorGui(op, add, sub, mult, div, rp);
 
		Calculator_2 calc=new Calculator_2(new Operands());

	}

}
