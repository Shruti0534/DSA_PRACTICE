public class power {
    public static void main(String[] args) {
        int base = 2;
        int exp = 10;
        System.out.println("Power using recursion: " + pow(base, exp));
        System.out.println("Power using optimized recursion: " + optimed(base, exp));
    }
    public static int optimised_power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        int half=optimised_power(base, exp / 2)* optimised_power(base, exp / 2);
        if(exp%2!=0){
            half=base*half;
        }
        return half;
    }
}