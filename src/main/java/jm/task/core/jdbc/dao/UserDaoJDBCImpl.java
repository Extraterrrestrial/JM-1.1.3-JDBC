package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
    private final Connection connection = Util.getConnection();

    private final String CREATE_TABLE = "CREATE TABLE `test`.`users` " +
            "(`id` BIGINT NOT NULL AUTO_INCREMENT," +
            " `name` VARCHAR(45) NOT NULL," +
            " `lastName` VARCHAR(45) NOT NULL," +
            " `age` TINYINT NOT NULL," +
            " PRIMARY KEY (`id`))";

    private final String DELETE_TABLE = "DROP TABLE IF EXISTS users";
    private final String SAVE_NEW_USER = "INSERT INTO users (name, lastName, age) VALUES (?, ?, ?)";
    private final String GET_ALL_USERS = "SELECT * FROM users";
    private final String CLEAR_TABLE = "DELETE FROM users";
    private final String DELETE_USER_BY_ID = "DELETE FROM users WHERE id = ?";

    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {
        try (Statement statement = connection.createStatement()){
            statement.executeUpdate(CREATE_TABLE);
            System.out.println("Таблица создана");
        } catch (SQLException e){
            e.printStackTrace();
        }

    }

    public void dropUsersTable() {

    }

    public void saveUser(String name, String lastName, byte age) {

    }

    public void removeUserById(long id) {

    }

    public List<User> getAllUsers() {
        return null;
    }

    public void cleanUsersTable() {

    }
}
