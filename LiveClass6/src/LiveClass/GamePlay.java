package LiveClass;

import java.util.Scanner;

class GuesserGues{
	
	int guesserKey;
	Scanner sc=new Scanner(System.in);
	public int guesserNumber(){
		
		System.out.println("Hi! Please Guesser, First guess Your Number");
		guesserKey=sc.nextInt();	
		return guesserKey;
	}
}


class PlayerGuess{
	int playersNum;
	Scanner sc=new Scanner(System.in);
	
 public int	PlayerNumber(){
	
	 System.out.println("Hi! Players Please Guess your Number");
	 playersNum =sc.nextInt();
	 return playersNum;
	}
	
}

class Umpire{

	int keyValue;
	int firstPlayer,secondPlayer,thirdPlayer;
	GuesserGues guesserKey=new GuesserGues();
	
	PlayerGuess player1=new PlayerGuess();
	PlayerGuess player2=new PlayerGuess();
	PlayerGuess player3=new PlayerGuess();
	
    public void	umpireDecision(){
    	
		 keyValue=guesserKey.guesserNumber();
		 //System.out.println(keyValue);
		 
		 firstPlayer=player1.PlayerNumber();
		 secondPlayer=player2.PlayerNumber();
		 thirdPlayer=player3.PlayerNumber();
		 
		 if(keyValue==firstPlayer && keyValue==thirdPlayer) {
			 if(keyValue==secondPlayer)
			 System.out.println("Match Tie");
			 
		 }
		 	else if(keyValue==firstPlayer) {
			 
			 System.out.println("Player-1 won the Match");
			 
		 }
		 
		 else if(keyValue==secondPlayer) {
			 
			 System.out.println("Player-11 won the Match");
			 
		 }
		 else if( keyValue==thirdPlayer) {
			 System.out.println("Player-111 won the Match");
		 }
		 else {
			 System.out.println("No one won the Match");
			// System.out.println("Player-11I won the Match");
		 }	 
	}
      		 
}
	

public class GamePlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Umpire task=new Umpire();
		task.umpireDecision();
	}

}
