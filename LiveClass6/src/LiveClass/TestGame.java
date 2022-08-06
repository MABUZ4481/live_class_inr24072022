
package LiveClass;

import java.util.Scanner;

//import java.util.Scanner;



class GuesserGues1 {

	double guesserKey;
	Scanner sc = new Scanner(System.in);

	public double guesserNumber() {

		guesserKey = sc.nextDouble();

		if (guesserKey % 1 != 0) {
			System.out.println("Decimal Number is not Allowed. Please Enter the Integere Number Only");
			guesserNumber();

		} else {
			return guesserKey;
		}
		return guesserKey;
	}
}

class Parts {

	int x;
	Scanner sc = new Scanner(System.in);

	public int totalx() {
		//System.out.println("Participants Please enter the number");
		x = sc.nextInt();
		if (x > 5) {
			System.out.println("No. of Participants not allowed above 5");
			totalx();
		} else {
			System.out.println("No. of Participants is " + x);
			return x;
		}
		return x;
	}
}


class Players {
	
	int i;
	int r = 0;
	Parts pt = new Parts();
	int k = pt.totalx();
	int[] arr = new int[k];
	public int[] countPlayers() {
		
		
		Scanner sc = new Scanner(System.in);
		
		//int[] arr = new int[k];
		System.out.println("Array Length: " + arr.length);
		System.out.println("Player Please guess your number");
		for (i = r; i < arr.length; i++) {
			
			double x = sc.nextDouble();

			//r = i;
			if (x % 1 != 0) {
				System.out.println("Decimal number is not allowed. Please re-enter");
				r = i;
				countPlayers();

			} else {
				
				arr[i] = (int) x;
				System.out.println("Next Please Guess Number  ");
//				for (int j = r; j <= r; j++) {
//					
//				System.out.println("Player input " + (int) x);
//
//				arr[i] = (int) x;
//				System.out.println("aar at: [" + i + "] = " + arr[i]);
//				System.out.println("Next Please Guess Number  ");
//				
//				}
			}
			//return arr;
		}

//}

		return arr;

	}
	
	public void printPlayArray() {
	
		
		int []show=countPlayers();
		System.out.println("------------- Printing Array =1 --------------------");
		for (int j = 0; j <show.length; j++) {
			
			System.out.println("Player input at: [" + j + "] = " +show[j] );	
	}

}

}
class TestGame {

	public static void main(String[] args) {
		
	// TODO Auto-generated method stub
		System.out.println("Please enter the number of participants");
		//Parts pt = new Parts();
		//int k = pt.totalx();
	
		Players pn = new Players();
		
		pn.printPlayArray();
		
	}
}
