public class BinaryToDecimal {

    public static void main(String[] args) {
        binaryToDecimal(101);
    }

    public static void binaryToDecimal(int num) {
        int ans = 0;
        int power = 0;
        while (num > 0) {
            int digit = num % 10;
            num /= 10;
            ans = (int) (digit * Math.pow(2, power) + ans);
            power++;
        }
        System.out.println("Decimal of the number :::: " + ans);
    }
}
