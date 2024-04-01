import java.util.Scanner;

class GCD {

	public static void main(String[]args){
	
	int a , b , ans = 1;
	Scanner scn = new Scanner(System.in);
	System.out.print("Enter First number = ");
	a = scn.nextInt();
	System.out.print("Enter Second number = ");
	b = scn.nextInt();
	int x = Math.min(a,b);
	
	for(int i = 1; i<=x; i++){
		
		if(a%i==0 && b%i==0){
				ans = i ;
				}
		}
		System.out.println("GCD  = "+ans);
	}
}