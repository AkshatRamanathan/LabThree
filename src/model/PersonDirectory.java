/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author akshb
 */
public class PersonDirectory {

    private ArrayList<Person> persons;

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public void addPersons(Person person) {
        this.persons.add(person);
    }

    public void deletePersons(Person person) {
        this.persons.remove(person);
    }
}
