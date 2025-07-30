@FunctionalInterface
public interface UserDetailsService {

    boolean getUser(String username, String password);

}
