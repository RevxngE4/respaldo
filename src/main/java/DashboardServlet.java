import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "andrescamilo4";
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/11-200";

    public void init() throws ServletException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tipoDeUsuario = obtenerTipoDeUsuario();  // Implementa la lógica para obtener el tipo de usuario actual.

        if ("restaurant".equals(tipoDeUsuario)) {
            // Este usuario es un restaurante, maneja la lógica para recuperar y mostrar mesas.
           // List<Mesa> mesas = obtenerMesasDeRestaurante();  // Implementa la lógica para obtener las mesas del restaurante.
            //request.setAttribute("mesas", mesas);
            request.getRequestDispatcher("/dashboard.jsp").forward(request, response);
        } else {
            // Este usuario no es un restaurante, puedes redirigir a la página de inicio o cualquier otra página.
            response.sendRedirect("/index.html");  // Ajusta la ruta según tu estructura de archivos.
        }
    }
    public List





}
