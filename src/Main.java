import cl.duoc.cine.db.DatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            if (conn != null) {
                System.out.println("✅ Conexión establecida con Cine_DB.");

                // Consulta de prueba: mostrar las películas de Cartelera
                String query = "SELECT * FROM Cartelera";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(query);

                System.out.println("🎬 Cartelera de películas:");
                while (rs.next()) {
                    System.out.println(
                            rs.getInt("id") + " - " +
                                    rs.getString("titulo") + " (" +
                                    rs.getInt("anio") + "), Dir: " +
                                    rs.getString("director") + " [" +
                                    rs.getString("genero") + "]"
                    );
                }
            } else {
                System.out.println("❌ No se pudo conectar a la base de datos.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
