package LiveClass;

import java.util.*;

class GuesserGuess{
	
	int guesserNumber;
	
	Scanner sc=new Scanner(System.in);
	public void guesserNum() {
			
	guesserNumber = sc.nextInt();
	System.out.println("Hi Guesser ! Please Guess any Number");
	guesserNumber=sc.nextInt();		
	}	
}
class PlayersGuess{
	
	int fstPlayerNum,scndPlayerNum1,thdPlayerGuess;
	
	Scanner sc=new Scanner(System.in);
	public void playerGuess() {
		System.out.println("Hi Player ! Please Guess any Number -1");
		fstPlayerNum=sc.nextInt();
		System.out.println("Hi Player ! Please Guess any Number -1");
		scndPlayerNum1=sc.nextInt();
		System.out.println("Hi Player ! Please Guess any Number -1");
		thdPlayerGuess=sc.nextInt();
	}
	
}

class UmpireDecision{
	
	
}

public class GamePlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
