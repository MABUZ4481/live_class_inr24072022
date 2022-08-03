package LiveClass;

import java.util.Scanner;



class participants{
	
	int players;
	public int totalPlayers() {
	
	Scanner sc=new Scanner(System.in);
	players=sc.nextInt();
	if(players>5) {
		System.out.println("Please enter valid input! Maximum 5 Participants can Playe at Time");
		totalPlayers();
	}else {
		System.out.println("Plaers Number "+players);
		return players;
	}
	
	return players;
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

class PlayerGuess{
	double playersNum;
	Scanner sc=new Scanner(System.in);
	
     public double	playerNumber(){
	
	 System.out.println("Hi! Players Please Guess your Number");
	 playersNum =sc.nextDouble();
	 if(playersNum%1!=0) {
		 
		 System.out.println("Please Guess only Inter Number");
		 playerNumber();
	 }else {
	 return playersNum;
	 }
	 return playersNum;
	}
     
	
}
class Umpire{

	int keyValue;
	double firstPlayer,secondPlayer,thirdPlayer;
	GuesserGues guesserKey=new GuesserGues();
	
	PlayerGuess player1=new PlayerGuess();
	PlayerGuess player2=new PlayerGuess();
	PlayerGuess player3=new PlayerGuess();
	
    public void	umpireDecision(){
    	
		 keyValue=(int) guesserKey.guesserNumber();
		 //System.out.println(keyValue);
		 
		 firstPlayer=player1.playerNumber();
		 secondPlayer=player2.playerNumber();
		 thirdPlayer=player3.playerNumber();
		 
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
		  participants pts=new participants();
		  System.out.println("Please enter the No. of Participants");
	        pts.totalPlayers();
		System.out.println("Hi! Please Guesser, First guess Your Number");	
		Umpire task=new Umpire();
		task.umpireDecision();
	}

}
