import java.util.Scanner;
class PrimeLogic
{
	private int n;
	//private int count=0;
	//private int i;
	private boolean r;
	public PrimeLogic()
	{
		r=false;
	}
		

	public void userInput()
	{
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no:");
			n = sc.nextInt();
			sc.close();
			
		}catch(Exception J) {
			System.out.println("invalid input");
			System.exit(0);
		}
		
		
	}
	public void calc()
	{
		if(n>1)
	    //{

			//System.out.println(n+" not prime");
			
		//}
	    //else
		 {
			int k=(int)Math.sqrt(n);
			for(int i=2;i<=k;i++)
			{
				if(n%i==0)
				{
					r=true;
					break;
				}
			}
			
		}
		
	}
	public void displayResult()
	{
		if(n<0)
		{
			System.out.println("invalid input");
		}
		else if(n==0 || n==1 ||r==true)
		{
			System.out.println(n+"  is not  prime");
		}
		else
		{
			System.out.println(n+" is  prime");
		}
	}
}




public class PrimeInputMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeLogic obj = new PrimeLogic();
		obj.userInput();
		obj.calc();
		obj.displayResult();


	}

}