import controllers.*;
import views.View;

public class Main {
    public static void main(String[] args) throws Exception {
     //Crear VISTA 
     View vista= new View();

     //CREAR CLASES CON METODOS DE ORDENAMIENTO Y BUSQUEDA 
     SortingMethods sortingMethods= new SortingMethods();
     SearchMethods searchMethods = new SearchMethods();

    // Crear Controlador
    Controller controller = new Controller(vista, sortingMethods, searchMethods);

    // Iniciar la App
    
    }

}
