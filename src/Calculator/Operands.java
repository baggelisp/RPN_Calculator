package Calculator;


public class Operands extends Main{
	
	
	StringBuffer buf = new StringBuffer();
	
	
	void addDigit(char ch){
		
		buf.append(ch);
		Calculator_2.display.setText(buf.toString());

	}
	
	
	public void deleteLastDigit(){
		
		try {

			buf.deleteCharAt(buf.length()-1);
			Calculator_2.display.setText(buf.toString());
		}catch(Exception e){
			Calculator_2.display.setText("Error");
			
		}
		
	} 
	
	public void complete(){
		
		
		try {
			String str=buf.toString();
			int num = Integer.parseInt(str);
			st.push(new Float(num)); //push into list
			Calculator_2.display.setText(null);
			buf.delete(0, buf.length()); //delete stringbuff
			System.out.println("Elements in the stack: "+st);  //print element in stack
			Calculator_2.text.setText("stack: "+st);
		}catch(Exception e){
			Calculator_2.display.setText("Error");
			
		}
		
		
		
	}
	
	public void reset(){
		
		
		
		try {
			st.removeAllElements();
			Calculator_2.display.setText("0");
			buf.delete(0, buf.length()); //delete stringbuff
			System.out.println("Elements in the stack: "+st);
			Calculator_2.text.setText("stack: "+st);
		}catch(Exception e){
			Calculator_2.display.setText("Error");
			
		}
		
	
	}
	
	
	
}
	

