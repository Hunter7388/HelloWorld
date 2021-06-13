package Stack;

import java.util.Stack ;

public class StackOperation {

	static  Stack<Integer> demo =new Stack<Integer>();
	public static void main(String[] args) {
 
   
    demo.push(1);
    demo.push(12);
    demo.push(123);
    demo.push(1234);
    demo.push(12345);
    demo.pop();
    demo.push(12345);
    
    StackOperation SO=new StackOperation();
    SO.printData();

	}
	
	public void printData()
	{ 
	 
	for (Integer integer : demo) {
		System.out.println(integer);
	}
		
	}

}
