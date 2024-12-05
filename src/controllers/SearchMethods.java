package controllers;
import models.Person;

public class SearchMethods {

    // Metodo que realiza una busqueda Binaria del arreglo de personas por edad

    public Person binarySearchbyAge(Person[] persons, int age){
        int bajo = 0;
        int alto = persons.length-1;
        while(bajo<=alto){
            int medio = (bajo+alto)/2;
            if(persons[medio].getAge()==age){
                return persons[medio]; 
            }else if(persons[medio].getAge()<age){
                bajo = medio+1;
            }else{
                alto = medio-1;
            }
        }
        return null;
    }

    // Metodo que realiza una busqueda Binaria del arreglo de personas por nombre

    public Person binarySearchByName(Person[] persons, String name) {
        int bajo = 0;
        int alto = persons.length - 1;

        while (bajo <= alto) {
            int medio = (bajo + alto) / 2;
            int comparison = persons[medio].getName().compareTo(name);

            if (comparison == 0) {
                return persons[medio];
            } else if (comparison < 0) {
                bajo = medio + 1;
            } else {
                alto = medio - 1;
            }
        }
        return null; 
    }


    //Metodo que valida si el arreglo de personas esta ordenado por edad

    public boolean isSortedByAge(Person[] persons) {
        for (int i = 0; i < persons.length - 1; i++) {
            if (persons[i].getAge() > persons[i + 1].getAge()) {
                return false; // Si un elemento es mayor que el siguiente, no está ordenado
            }
        }
        return true; // Ordenado por edad
    }

    //Metodo que valida si el arreglo de personas esta ordenado por nombre

    public boolean isSortedbyName(Person[] persons){
        for(int i=0;i<persons.length-1;i++){
            if(persons[i].getName().compareTo(persons[i+1].getName())>0){
                return false; // Si un nombre es mayor que el siguiente, no está ordenado
            }
        }
        return true; // Ordenado por nombre
    }

}

