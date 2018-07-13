package Calculator;

public class Adder extends Main {
	
    public void operate(){
    	
    	if (st.size()==1 || st.size()==0 || Calculator_2.display.getText()==null ){
    		Calculator_2.display.setText("Error");
    	}
    	else {
        st.push(st.pop() + st.pop());
        Calculator_2.text.setText("stack: "+st);
        System.out.println("Elements in the stack: "+st);  //print element in stack
    	}
    }

}
