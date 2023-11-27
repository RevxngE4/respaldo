public interface UserRepositoryy <T>{
    User findByEmailAndPassword(String login, String password);
    User findByTypeofuser(String typeofuser);
}
