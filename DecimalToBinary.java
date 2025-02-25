

public class DecimalToAnyBase {
    public static void main(String[] args) {
        decimalToAnybase(357,10);
    }
    public static void decimalToAnybase(int num , int base){
        int ans = 0;
        int power = 0;
        while(num > 0){
            int digit = num%2;
            num /=2;
            ans = (int)(digit*Math.pow(base,power) + ans);
            power++;
        }
        System.out.println("Binary of the number "+ans);
    }
}


