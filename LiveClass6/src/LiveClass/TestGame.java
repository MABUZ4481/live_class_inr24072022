
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
			if(guesserKey>11 || guesserKey==0) {
				{
					System.out.println("Please enter the No. between 0 to  10 only");
					guesserKeyNum();
				}
			}
				else { 
			       return guesserKey;
			       
			}
		}
		return guesserKey;
	}
}

class TotalPlayer{

	int countPlayer=0;
	Scanner sc = new Scanner(System.in);

	public int countParticipants() {
		//System.out.println("Participants Please enter the number");
		countPlayer = sc.nextInt();
		if (countPlayer > 5) {
			System.out.println("No. of Participants above 5 is not allowed, Please Re-enter");
			countParticipants();
			
		} else {
			System.out.println("No. of Participants is " + countPlayer);
			return countPlayer;
		}
		return countPlayer;
	}
	
}


class PlayersGuessNum {
		
	int i;
	int r = 0;
	
	TotalPlayer pt = new TotalPlayer();
	int n = pt.countParticipants();
	
	int[] playersNum = new int[n];
	
	public int[] checkPlayersNum() {
		
		Scanner sc = new Scanner(System.in);
			
	//	System.out.println("\nPlayer Please guess your number");
		for (i = r; i < playersNum.length; i++) {
			
			System.out.println("\nPlayer number- "+(i+1)+ " :, Please guess your number" );
			
			double num = sc.nextDouble();

			if (num % 1 != 0) {
				System.out.println("\nDecimal number is not allowed. Please re-enter");
				r = i;
				checkPlayersNum();

			} else {
				
				if(num>=11 || num==0) {
					{
						System.out.println("\nPlease enter the No. between 0 to  11 only");
						checkPlayersNum();
						
					}
				}
					else { 
						
						playersNum[i] = (int) num;
						

				}
				
				
			}
		
		}

		return playersNum;

	}
	
	public void printPlayArray(int [] showNum) {
	
		
		//int []show=checkPlayersNum();
		System.out.println("------------- Player Input  --------------------");
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
		
	
		int j=playersNums.length;
	
		int [] winner = new int[j];
		for(int i=0;i<playersNums.length;i++) {
			 		 
			if(playersNums[i]==guesserKey){
							
				winner[i]=i+1;
				count++;
			
			}
		}
		
		return winner;
	}	
	
	
	public void showResult(int []result) {
				
        if (result.length==count) {
				
				System.out.println("\nMatch has been tied All guess the correct  number ");
				System.exit(0); // are you want to play again
							
			}
			else if(count==0) {
				
				System.out.println("\nNo one could  Won the match");
			}else {
				for (int j = 0; j <result.length; j++) { 
					if(result[j]==0) {
						continue;
					}
					else {
				System.out.println("\n Player number- "+result[j]+ "  "+"has won the match" );
				}
				}
			}
			
		}
			  			 	
}			
		
class ReExecute {

  public void playAgain() {

  	System.out.println("\nDo you want to play again: (Yes/No)");
      Scanner str = new Scanner(System.in);
      String status = str.nextLine();
      if (status.equals("yes") || status.equals("YES")) {
      	
      	 TestGame.main(null);
      }
          
      else if (status.equals("no") || status.equals("NO")) {
      	System.out.println("Thank you for playing fair");
      	 System.exit(0);
      	
      }
       
  }
}
class TestGame { 

	public static void main(String[] args) {
		
		System.out.println("\nTo Start the Game, Guesser Please Gues Any Integer Number First");
		
		GuesserNumber guesserNum=new GuesserNumber();
		int guesserKey=(int)guesserNum.guesserKeyNum();
		System.out.println("\nGueser Key is: "+guesserKey);
		System.out.println("\nNow Please Enter the no. of prticipants");	
		
		PlayersGuessNum playNum = new PlayersGuessNum();
		
		int []show=playNum.checkPlayersNum();
		
		playNum.printPlayArray(show);
		//Umpire Task
				
		UmpireTask utask=new UmpireTask();
		int []checkResult= utask.umpireDecision(show,guesserKey );
		  utask.showResult(checkResult);
		  //Play Again
		  ReExecute rs=new ReExecute();
		  rs.playAgain();
				
	}
}  
