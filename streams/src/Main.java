public class Main {
    public static void main(String[] args) {

        PasswordEncoder checkIfEquals = (password, reversal) -> {
            return password.equals(reversal);
        };
        System.out.println(checkIfEquals.isReversed("matt", "mart"));

        PasswordEncoder checkReversal = (password, reversal) -> {
            return new StringBuilder(password).reverse().toString().equals(reversal);
        };
        System.out.println(checkReversal.isReversed("matt", "ttam"));

        PasswordEncoder checkLength = (password, reversal) -> {
            return password.length() == reversal.length();
        };
        System.out.println(checkLength.isReversed("matt", "mattt"));
    }
}