public class User {
    private String username;
    private String firstname;
    private int age;

    /**
     * This is the constructor for the User-class
     * @param username
     * @param firstname
     * @param age
     */
    public User(String username, String firstname, int age) {
        this.username = username;
        this.firstname = firstname;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
