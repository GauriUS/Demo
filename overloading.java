package constractor_overloading;

public class overloading 
{
     static void arithmeticOperation(int a)       //static method
     {
    	 System.out.println("addition");
     }
     public void arithmeticOperation(char c)     // non static method
     {
    	 System.out.println("substration");
     }
	
	
	public static void main(String[] args) 
	{
		
		arithmeticOperation(10);                 // static method
		
		overloading a= new overloading();       //non static method
		
		a.arithmeticOperation('d');
		
		
		
		
	}
	
	
	
}
