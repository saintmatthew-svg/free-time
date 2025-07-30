@FunctionalInterface
public interface PasswordEncoder {

    boolean isReversed (String password, String reverse);

}