package Calculator;

public class Sub extends Main {

	public void operate(){
		if (st.size()==1 || st.size()==0){
    		Calculator_2.display.setText("Error");
    	}
    	else {
    		float n = st.pop();
            st.push(st.pop() - n);
            Calculator_2.text.setText("stack: "+st);
            System.out.println("Elements in the stack: "+st);  //print element in stack
    	}
        
    }

}
