package views;
import java.util.Scanner;
import controllers.*;
import models.*;

public class View {
    private Scanner scanner;

    public View (){
        scanner = new Scanner(System.in);
    }

    public int showMenu(){
        System.out.println("Menu");
        System.out.println("1. Ingresar Persona");
        return scanner.nextInt();
    }

    public int inputInt(String message){
    System.out.println(message);
    return scanner.nextInt();

    }

    public Person inputPerson(){
        int age = inputAge();
        String name = inputName();
        return new Person(age, name);
    }

    public String inputName(){
        System.out.println("Ingrese el nombre");
        return scanner.nextLine();
    }

    public int inputAge(){
        System.out.println("Ingrese la edad");
        return scanner.nextInt();
    }
}
