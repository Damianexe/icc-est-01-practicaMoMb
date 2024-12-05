package controllers;
import models.Person;
import views.View;
import java.util.ArrayList;

public class Controller {
    private View view;
    private Person[] persons;
    private SortingMethods sortingMethods;
    private SearchMethods searchMethods;

    

    public Controller(View view, SortingMethods sortingMethods, SearchMethods searchMethods) {
        this.view = view;
        this.sortingMethods = sortingMethods;
        this.searchMethods = searchMethods;
        this.persons= new Person[0]; //Arreglo Inicializado
        System.out.println("Controlador Creado");
    }

    public void start() {
        int option = 0;
        do {
            option = view.showMenu();
            switch (option) {
                case 1:
                    inputPersons();
                    break;
                case 2:
                    sortPersons();
                    break;
                case 3:
                    searchPerson();
                    break;
                case 100:
                    System.out.println("Salir");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (option != 0);
    }


    public void inputPersons() {
        Person person = view.inputPerson();
        addPerson(person);
    }

    public void addPerson(Person person) {
        Person[] newPersons = new Person[persons.length+1];
        System.out.println("Persona Agregada");
        System.arraycopy(persons, 0, newPersons, 0, persons.length);
        newPersons[persons.length] = person;
        persons= newPersons;
    }

    
    public void sortPersons() {
        int metodo = view.selectSortingMethod();
        switch (metodo) {
            case 1:
            sortingMethods.SortByNameWithBuble(persons);
            break;
            case 2:
            sortingMethods.sortbyNamewithSelectionDes(persons);
            break;
            case 3:
            sortingMethods.sortByAgeWithInsertion(persons);
            break;
            case 4:
            sortingMethods.sortByNamewithInsertion(persons);
            break;
        }
       view.displayPersons(persons); 
    }

    public void searchPerson(){
        int criterion = view.selectSearchCriterion();
        Person result = null;
        if (criterion == 1) {
            if (!searchMethods.isSortedbyName(persons)) {
                System.out.println("List is not sorted by name.");
                return;
            }
            String name = view.inputName();
            result = searchMethods.binarySearchByName(persons, name);
        } else if (criterion == 2) {
            if (!searchMethods.isSortedbyName(persons)) {
                System.out.println("List is not sorted by age.");
                return;
            }
            int age = view.InputAge();
            result = searchMethods.binarySearchbyAge(persons, age);
        }
        view.displaySearchResult(result);
    }
}
