
package LiveClass;

import java.util.Scanner;

//import java.util.Scanner;



class GuesserNumber {

	double guesserKey;
	Scanner sc = new Scanner(System.in);

	public double guesserKeyNum() {

		guesserKey = sc.nextDouble();

		if (guesserKey % 1 != 0) {
			System.out.println("Decimal Number is not Allowed. Please Enter the Integere Number Only");
			guesserKeyNum();

		} else {
			return guesserKey;
		}
		return guesserKey;
	}
}

class TotalPlayer{

	int count;
	Scanner sc = new Scanner(System.in);

	public int countParticipants() {
		//System.out.println("Participants Please enter the number");
	int	count = sc.nextInt();
		if (count > 5) {
			System.out.println("No. of Participants not allowed above 5");
			countParticipants();
		} else {
			System.out.println("No. of Participants is " + count);
			return count;
		}
		return count;
	}
	
}


class PlayersGuessNum {
	

	
	int i;
	int r = 0;
	

	TotalPlayer pt = new TotalPlayer();
	int n = pt.countParticipants();
	
	//int n=getCount();
	int[] arr = new int[n];


	
	public int[] checkPlayersNum() {
		
		System.out.println("Arra: "+n);
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
				checkPlayersNum();

			} else {
				
				arr[i] = (int) x;
				System.out.println("Next Please Guess Number  ");

			}
		
		}


		return arr;

	}
	
	public void printPlayArray(int [] showNum) {
	
		
		//int []show=checkPlayersNum();
		System.out.println("------------- Printing Array =1 --------------------");
		for (int j = 0; j <showNum.length; j++) {
			
			System.out.println("Player input at: [" + j + "] = " +showNum[j] );	
	}

  }

}
class UmpireTask{
	
	int count=0;
	int rest=0;
	int [] winner = new int[count];
	public int[] umpireDecision(int [] playersNums, int guesserKey) {
		
		//int count=0;
		int j=playersNums.length;
		System.out.println("in umpire Decision value of ply length is: "+playersNums.length );
		int [] winner = new int[j];
		for(int i=0;i<playersNums.length;i++) {
			 		 
			if(playersNums[i]==guesserKey){
				//count++;
				//int [] winner = new int[i];
				
				winner[i]=i+1;
				count++;
				//count=winner.length;
				System.out.println("Length in decision " +winner.length);
				//return winner;
				rest=count;
								
			}
		}
		System.out.println("Length in decision is " +winner.length);
		return winner;
	}	
	
	
	public void showResult(int []result) {
		
		System.out.println("Check aaray: "+result.length+ " and Check Count: "+count);
		
          if (result.length==rest) {
				
				System.out.println("Match has been tied All guess the correct  number ");
				System.exit(0); // are you want to play again
							
			}
			else if(count==0) {
				
				System.out.println("No one Won the match");
			}else {
				for (int j = 0; j <result.length; j++) { 
					if(result[j]==0) {
						continue;
					}
					else {
				System.out.println("Player "+result[j]+ " "+"has won the match" );
				}
				}
			}
			
		}
			  			 
			//System.out.println("Players: "+playersNums[i]+ " guesserKey " +guesserKey);		
}			
		
 

class TestGame {

	public static void main(String[] args) {
		
	
		System.out.println("To Start the Game, Please enter the number of participants");
		TotalPlayer tp= new TotalPlayer();
		int k=tp.countParticipants();
	
		System.out.println("Now, Guesser Please Gues Any Integer Number First");
		
		GuesserNumber guesserNum=new GuesserNumber();
		int guesserKey=(int)guesserNum.guesserKeyNum();
		System.out.println("Gueser Key is: "+guesserKey);
		System.out.println("Please re-confirm no. of prticipants");
		
		
		PlayersGuessNum playNum = new PlayersGuessNum();
		
		int []show=playNum.checkPlayersNum();
		
			
		playNum.printPlayArray(show);
		//Umpire Task
				
		UmpireTask utask=new UmpireTask();
		int []checkResult= utask.umpireDecision(show,guesserKey );
		   
		   utask.showResult(checkResult);
				
	}
}
