import controllers.Controller;
import controllers.SortingMethods;
import controllers.SearchMethods;
import views.View;

public class Main {
    public static void main(String[] args) {

        // Crear instancias
        View view = new View();
        SortingMethods sortingMethods = new SortingMethods();
        SearchMethods searchMethods = new SearchMethods();

        // Crear el controlador con las dependencias
        Controller controller = new Controller(view, sortingMethods, searchMethods);

        // Iniciar la aplicación
        controller.start();
    }
}

