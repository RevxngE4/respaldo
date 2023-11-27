public class User {
    private Long id;
    private String firstname;
    private String surname;
    private String login;
    private String password;
    private String typeofuser;

    public User(Long id, String firstname, String surname, String login, String password, String typeofuser){
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.typeofuser = typeofuser;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTypeofuser() {
        return typeofuser;
    }

    public void setTypeofuser(String typeofuser) {
        this.typeofuser = typeofuser;
    }
}
