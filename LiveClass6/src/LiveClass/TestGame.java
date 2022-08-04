
package LiveClass;

import java.util.Scanner;

class Parts{
	
	int x;
	Scanner sc=new Scanner(System.in);
	public int totalx(){
		
		x=sc.nextInt();
		if(x>5) {
		System.out.println("No. of Participants not allowed above 5");
		totalx();
	    }
		else 
		{
			System.out.println("No. of Participants is " +x);
			return x;
		}
		return x;
	}
}
class GuesserGues{
	
	double guesserKey;
	Scanner sc=new Scanner(System.in);
	public double guesserNumber(){
		
				
	 guesserKey=sc.nextDouble();
		
		if(guesserKey%1!=0) {
			System.out.println("Decimal Number is not Allowed. Please Enter the Integere Number Only");
			guesserNumber();
			
		}
		else {
		return guesserKey;
		}
		return guesserKey;
	}
}

 class Players{
	
	public double[] countPlayers(int xt){
		
		Scanner sc=new Scanner(System.in);
		
		double [] arr= new double[xt];
		for(int i=0;i<arr.length;i++) {
			
			//System.out.println("Please Enter Number " );
			arr[i]=sc.nextDouble();
			if(arr[i]%1!=0) {
				System.out.println("Decimal number is not allowed. Please re-enter");
				countPlayers(xt);
			}
			else {
			
				System.out.println("Please Enter Number next " );
			}
			
		}
		
          for(int j=0;j<arr.length;j++) {
			
			System.out.println("Player-"+(j+1)+": " +(int)arr[j]);
			
		}
          return arr;
	}
		
		
}
 


class TestGame{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the number of participants");
		Parts pt=new Parts();
		int k=pt.totalx();
		GuesserGues gnum=new GuesserGues();
		System.out.println("Guesser Please enter the number");
		gnum.guesserNumber();
		Players pn=new Players();
		//int k=pt.totalx();
		System.out.println("Participants Please enter the number");
		pn.countPlayers(k);
		System.exit(0);
	}
}
