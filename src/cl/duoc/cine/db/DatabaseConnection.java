package cl.duoc.cine.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/Cine_DB";
    private static final String USER = "root"; // tu usuario MySQL
    private static final String PASSWORD = "Rabbit.89"; // la contraseña que usas en Workbench

    public static Connection getConnection() {
        try {
            // 1. Cargar el driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Conectar a la base de datos
            return DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (ClassNotFoundException e) {
            System.out.println("❌ Driver JDBC no encontrado.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("❌ Error al conectar con la base de datos.");
            e.printStackTrace();
        }
        return null;
    }
}
