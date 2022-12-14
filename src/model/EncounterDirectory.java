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
public class EncounterDirectory {

    private ArrayList<Encounter> encounter;
    
    public EncounterDirectory() {
    }

    public ArrayList<Encounter> getEncounter() {
        return encounter;
    }

    public void setEncounter(ArrayList<Encounter> encounter) {
        this.encounter = encounter;
    }

    public void addEncounter(Encounter encounter) {
        this.encounter.add(encounter);
    }

    public void deleteEncounter(Encounter encounter) {
        this.encounter.remove(encounter);
    }
}
