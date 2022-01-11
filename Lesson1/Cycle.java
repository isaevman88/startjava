public class Cycle{
	public static void main(String[] args){
		System.out.println("for----------------------");
		for(int i=0;i<=20;i++){
			System.out.print(i+" ");
		}
		System.out.println("");
		int cnt=6;
		System.out.println("while----------------------");
		while(cnt>=-6)
		{
        	System.out.print(cnt+" ");
  			cnt-=2;

		}
		System.out.println("");
		System.out.println("do-while----------------------");
		int result=0;
		int bufNumb =9;
		do{
			bufNumb+=2;
		    result+=bufNumb;
		  }	  
		 while(bufNumb<=20);
System.out.println(result);
	}
}