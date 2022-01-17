public class Calculator{
	public static void main(String[] args){
		String mathOpp="/";
		int firstOperand=21;
		int SecondOperand=7;
		System.out.println(firstOperand+mathOpp+SecondOperand);
		System.out.println("Result:");
		if(mathOpp=="+")
		{
			System.out.println(firstOperand+SecondOperand);	
		}
		else if(mathOpp=="-")
		{
			System.out.println(firstOperand-SecondOperand);	
		}
		else if(mathOpp=="*")
		{
			System.out.println(firstOperand*SecondOperand);	
		}
		else if(mathOpp=="/")
		{
		if(firstOperand%SecondOperand==0)
			System.out.println(firstOperand/SecondOperand);	
		else
			System.out.println((double)firstOperand/SecondOperand);		
		}
		else if(mathOpp=="^")
		{ int Result=1;
          for(int i=1;i<=SecondOperand;i++)
          {
          	Result*=firstOperand;
          }
     	}
        else if(mathOpp=="%")
        {
			System.out.println(firstOperand%SecondOperand);	
        }
			
    }
}
	
