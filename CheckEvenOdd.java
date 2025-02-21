public class CheckEvenOdd {
   
    public static void main(String[] args) {
        checkEvenOdd(0);
    }
    public static void checkEvenOdd(int n){
        if(n %2==0){
            System.out.println(n +" is Even number");
        }
        else{
            System.out.println(n+" is Odd number");
        }
    }
}
