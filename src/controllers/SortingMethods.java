package controllers;

import models.Person;

public class SortingMethods {


    // Metodo que ordena el arreglo de personas por nombre usando Bubble Sort
    public void SortByNameWithBuble(Person[] persons) {
        int n = persons.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (persons[j].getName().compareTo(persons[j + 1].getName()) > 0) {
                    // intercambio
                    Person temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
    }
    //Metodo que ordena el arreglo de personas por nombre usando Selection Sort de manera descendente
    public void sortbyNamewithSelectionDes(Person[] persons) {
        int n = persons.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (persons[j].getName().compareTo(persons[minIndex].getName()) > 0) {
                    minIndex = j;
                }
            }
            // intercambio
            Person temp = persons[minIndex];
            persons[minIndex] = persons[i];
            persons[i] = temp;
        }
    }
    // Metodo que ordena el arreglo por edad usando Insertion Sort
    public void sortByAgeWithInsertion(Person[] persons) {
        int n = persons.length;
        for (int i = 1; i < n; i++) {
            Person key = persons[i];
            int j = i - 1;

            while (j >= 0 && persons[j].getAge() > key.getAge()) {
                persons[j + 1] = persons[j];
                j--;
            }
            persons[j + 1] = key;
        }
    }

    // Metodo que ordena el arreglo por nombre usando Insertion Sort
    public void sortByNamewithInsertion(Person[]persons){
        int n = persons.length;
        for (int i = 1 ; i < n ; i++){
            Person key = persons[i];
            int j = i - 1;
            while (j >= 0 && persons[j].getName().compareTo(key.getName()) > 0){
                persons[j+1]=persons[j];
                j--;
            }
            persons[j+1]=key;
        }
    }


}
