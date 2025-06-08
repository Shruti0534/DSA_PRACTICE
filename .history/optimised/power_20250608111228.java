public class power {
    public static void main(String[] args) {
        int base = 2;
        int exp = 10;
        System.out.println("Power using recursion: " + pow(base, exp));
        System.out.println("Power using optimized recursion: " + powOptimized(base, exp));
    }
    public static int pow(int base, int exp) { // O(n)
        if (exp == 0) {
            return 1;
        }
        return base * pow(base, exp - 1);
    }
}
