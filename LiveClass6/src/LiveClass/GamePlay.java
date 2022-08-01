package LiveClass;

import java.util.*;

class GuesserGuess{
	
	int guesserNumber;
	
	
	public int guesserNum() {
		Scanner sc=new Scanner(System.in);
	guesserNumber = sc.nextInt();
	System.out.println("Hi Guesser ! Please Guess any Number");
	guesserNumber=sc.nextInt();	
	return guesserNumber;
	
	}	
}
class PlayersGuess{
	
	int playerNum,scndPlayerNum1,thdPlayerGuess;
	
	
	
	public int playerGuess() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Hi Player ! Please Guess any Number -1");
		playerNum=sc.nextInt();		
		return playerNum;
	}
	

}

class UmpireDecision{
	
	int keyValue;
	int f1Player, f2Player,f3Player;
	public void umpireTask() {
		//System.out.println(" Hi all ! Welcome, Play now");
	GuesserGuess gsr=new GuesserGuess();
	//gsr.guesserNum();
	keyValue=gsr.guesserNumber;
	PlayersGuess pgs=new PlayersGuess();
	//pgs.playerGuess();
	
	if(keyValue==pgs.playerNum) {
		
		System.out.println("Weldone Player-I ! You won the Game " );
	}
	else if (keyValue==pgs.scndPlayerNum1) {
		
		System.out.println("Weldone Player-II ! You won the Game " );
	}
	else if(keyValue==pgs.thdPlayerGuess) {
		
		System.out.println("Weldone Player-III ! You won the Game");
	}
	System.out.println("Oh!!! All lost the Game");
	}
	
}

public class GamePlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Hi all ! Welcome in Number  Guess Game");
		GuesserGuess gs=new GuesserGuess();
		gs.guesserNum();
		PlayersGuess pgs=new PlayersGuess();
		pgs.playerGuess();
		UmpireDecision umpire = new UmpireDecision();
		umpire.umpireTask();
	}
}
