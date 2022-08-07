
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
			if(guesserKey>=11 || guesserKey==0) {
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
		
		//System.out.println("Arra: "+n);
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Array Length: " + arr.length);
		System.out.println("\nPlayer Please guess your number");
		for (i = r; i < arr.length; i++) {
			
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
						arr[i] = (int) num;
						System.out.println("\nNext Please Guess Number  ");

				}
				
				
			}
		
		}

		return arr;

	}
	
	public void printPlayArray(int [] showNum) {
	
		
		//int []show=checkPlayersNum();
		System.out.println("------------- Player Input =1 --------------------");
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
		//System.out.println("in umpire Decision value of ply length is: "+playersNums.length );
		int [] winner = new int[j];
		for(int i=0;i<playersNums.length;i++) {
			 		 
			if(playersNums[i]==guesserKey){
							
				winner[i]=i+1;
				count++;
				//count=winner.length;
				//System.out.println("Length in decision " +winner.length);
				//return winner;
				rest=count;
								
			}
		}
		//System.out.println("Length in decision is " +winner.length);
		return winner;
	}	
	
	
	public void showResult(int []result) {
		
		//System.out.println("Check aaray: "+result.length+ " and Check Count: "+count);
		
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
				System.out.println("Player "+result[j]+ " "+"has won the match" );
				}
				}
			}
			
		}
			  			 
			//System.out.println("Players: "+playersNums[i]+ " guesserKey " +guesserKey);		
}			
		
class ReExecute {

    public void playAgain() {

    	System.out.println("\nDo you want play again: (Yes/No)");
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
