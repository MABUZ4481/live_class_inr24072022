
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

 class Players{
	
	public void countPlayers(int xt){
		
		Scanner sc=new Scanner(System.in);
		
		double [] arr= new double[xt];
		for(int i=0;i<arr.length;i++) {
			
			System.out.println("Please Enter Number " );
			arr[i]=sc.nextDouble();
			if(arr[i]%1!=0) {
				System.out.println("Decimal number is not allowed. Please re-enter");
				countPlayers(xt);
			}
			else {
				System.out.println("Valid number");
			}
		}
		
      for(int j=0;j<arr.length;j++) {
			
			System.out.println("Player-"+(j+1)+": " +(int)arr[j]);
			
		}
	}
		
		
}


class TestGame{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the number of participants");
		Parts pt=new Parts();
		int k=pt.totalx();
		Players pn=new Players();
		//int k=pt.totalx();
		pn.countPlayers(k);
		System.exit(0);
	}
}
