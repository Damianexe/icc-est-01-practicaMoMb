package views;
import java.util.Scanner;
import controllers.*;
import models.*;

public class View {
    private Scanner scanner = new Scanner(System.in);

  
    public int showMenu(){
        System.out.println("Menu");
        System.out.println("1. Ingresar Persona");
        System.out.println("2. Ordenar Personas");
        System.out.println("3. Buscar Personas");
        System.out.println("4. Salir del Programa");
        System.out.println("Selecciona una opcion");
        return scanner.nextInt();
    }

    public int inputInt(String message){
    System.out.println(message);
    return scanner.nextInt();

    }

    public Person inputPerson(){
        System.out.println("Ingrese Nombre");
        String name = scanner.next();
        System.out.println("Ingrese Edad");
        int age = scanner.nextInt();
        return new Person(age, name);
    }

    public void showMessage(String message){
        System.out.println(message);
    }

    public int selectSortingMethod(){
        System.out.println("Ingrese el metodo de ordenamiento");
        System.out.println("1. Sort by Name with Bubble");
        System.out.println("2. Sort by Name with Selection (Des)");
        System.out.println("3. Sort by Age with Insertion");
        System.out.println("4. Sort by Name with Insertion");
        return scanner.nextInt();
    }

    public int selectSearchCriterion(){
        System.out.println("Ingrese el criterio de busqueda");
        System.out.println("1. Buscar por Nombre");
        System.out.println("2. Buscar por Edad");
        return scanner.nextInt();
    }

    public void displayPersons(Person[] persons){
        for (Person person : persons){
            System.out.println(person.toString());
        }
    }

    public void displaySearchResult(Person person){
        if (person!=null){
            System.out.println("Persona Encontrada"+person.toString());
        }else{
            System.out.println("Persona no encontrada");
        }
    }

    public int InputAge(){
        System.out.println("Ingrese la edad");
        return scanner.nextInt();

    }

    public String inputName(){
        System.out.println("Ingrese el nombre");
        return scanner.nextLine();
    }
}
