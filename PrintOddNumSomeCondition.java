public class PrintOddNumSomeCondition
{
	public static void main(String[] args) {
	    int count = 0;
		int num = 465456;
		while(num /2 != 0){
		    num = num /2;
		    
		    if (num % 2 == 0){
		        continue;
		        } 
		         if ( num % 2 != 0 && count  < 5) {
		             
		            System.out.println(num+" ");
		        }
		        else{
		            break;
		        }
		       count++; 
		}
	}
}
