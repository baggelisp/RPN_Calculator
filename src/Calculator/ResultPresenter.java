package Calculator;


public class ResultPresenter extends Main{
	
	
	public void operate(){
		
		
		if (st.size()==0){
    		Calculator_2.display.setText("Error");
    	}
    	else {
    		float n = st.pop();
 	       // System.out.println(n);
 	    
 	        if (n/Math.round(n)!=1.0) {
 	            String buffer = String.valueOf(n);
 	           Calculator_2.text.setText("stack: "+st);
 	            Calculator_2.display.setText("="+buffer.toString());
 	        }
 	        else{
 	            int val = Math.round(n);
 	            String buffer = String.valueOf(val);
 	            Calculator_2.display.setText("="+buffer.toString());
 	            Calculator_2.text.setText("stack: "+st);
 	            System.out.println("Elements in the stack: "+st);  //print element in stack
 	        }
    	}

    		
    	
		
		
        

    }

}
