package Assignment;

public class Que1 {


	public static void main(String[] args) {
		//Write a program(WAP) to print INEURON using pattern programming logic.
		int n=7;
		
		System.out.println();
		for(int i=0;i<n;i++) {
			
           for(int j=0;j<n; j++) {// I
				
				if(j==1||(i==0&&j<3)||(i==n-1&&j<3)) {
					
					System.out.print("* ");
					
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
			for(int j=0;j<n; j++) {//N
				
				if(j==0||j==n-1||(j==i&&i!=0&&j<n-1)) {
					
					System.out.print("* ");
					
				}
				else {
					System.out.print("  ");
				}
			}
			for(int j=0;j<n; j++) {// E
				
				if(j==0||i==0||(i==(n-1)/2 && j!=n-1)||i==n-1) {
					
					System.out.print("* ");
					
				}
				else {
					System.out.print("  ");
				}
			}
							
		System.out.print(" ");
		
			 for(int j=0;j<n; j++) { //U
					
					if((i<n-1&&j==0)||(i<n-1&&j==n-1)||(i==n-1&&j!=0&&j!=n-1)) {
						
						System.out.print("* ");
						
					}
					else {
						System.out.print("  ");
					}
				}
			 for(int j=0;j<n; j++) {// R
				 
					
					if(j==0||(i==0&&j!=n-1)||(i==(n-1)/2 && j!=n-1)||(j==n-1&&i!=0&&i<(n-1)/2)||(i>(n-1)/2&&i==j)) {
						
						System.out.print("* ");
						
					}
					else {
						System.out.print("  ");
					}
				}
								
			System.out.print(" ");
			
			for(int j=0;j<n; j++) {// O
				 
				
				if((i==0&&j!=0&&j!=n-1)||(j==0&&i!=0&&i!=n-1)||(i==n-1&&j!=0&&j!=n-1)||(j==n-1&&i!=0&&i!=n-1)) {
					
					System.out.print("* ");
					
				}
				else {
					System.out.print("  ");
				}
			}
							
		System.out.print(" ");
		
		for(int j=0;j<n; j++) {// N
			 
			
			if(j==0||j==n-1||(j==i&&n!=0&&n!=n-1)) {
				
				System.out.print("* ");
				
			}
			else {
				System.out.print("  ");
			}
		}
						
	System.out.print(" ");
								
			System.out.println();
			
		}
		

	}

}
