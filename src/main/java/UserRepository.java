import javax.servlet.annotation.WebServlet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class UserRepository implements UserRepositoryy {
    private  Connection connection;
    private static final String SQl_SELECT_ALL_FROM_DRIVER = "SELECT * FROM users WHERE login = ? AND password = ?";
    private static final String SQL_For_Typeofuser = "SELECT * FROM users WHERE typeofusers = ?";
    public UserRepository(Connection connection){
        this.connection = connection;
    }
    @Override
    public User findByEmailAndPassword(String login, String password) {
        User result = null;

        try (PreparedStatement preparedStatement = connection.prepareStatement(SQl_SELECT_ALL_FROM_DRIVER)) {
            preparedStatement.setString(1, login);
            preparedStatement.setString(2, password);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    result = new User(
                            resultSet.getLong("id"),
                            resultSet.getString("firstname"),
                            resultSet.getString("surname"),
                            resultSet.getString("login"),
                            resultSet.getString("password"),
                            resultSet.getString("typeofuser")

                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public User findByTypeofuser(String typeofuser) {
        User result = null;
        try (PreparedStatement preparedStatement = connection.prepareStatement(SQL_For_Typeofuser)){
            preparedStatement.setString(1, typeofuser);

            try (ResultSet resultSet = preparedStatement.executeQuery()){
                if (resultSet.next()){
                    result = new User(
                            resultSet.getLong("id"),
                            resultSet.getString("firstname"),
                            resultSet.getString("surname"),
                            resultSet.getString("login"),
                            resultSet.getString("password"),
                            resultSet.getString("typeofuser")
                    );
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return result;
    }
}

