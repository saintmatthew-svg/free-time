public class User {
    private final String username;
    private final String password;
    private final boolean isValid;

    public User(String username, String password, boolean isValid) {
        this.username = username;
        this.password = password;
        this.isValid = isValid;
    }

    public static void validateUser(String Username, String Password) {
        UserDetailsService service = (username, password) -> "admin".equals(username) && "sam".equals(password);

        boolean result = service.getUser(Username, Password);
        User user;
        if (result) {
            user = new User(Username, Password, true);
        } else {
            user = new User(Username, Password, false);
        }
        System.out.println(user);
    }

    @Override
    public String toString() {
        return "user = {" +
                "\n        username = " + username +
                "\n        password = " + password +
                "\n        isValid = " + isValid +
                "\n     }";
    }
}
