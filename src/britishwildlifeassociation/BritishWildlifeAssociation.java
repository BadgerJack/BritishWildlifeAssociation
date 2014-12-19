/*
 * Copyright (C) 2014 Jack 'Hobbes' Tolley
 *
 * This program is produced as part of a student project:
 * The author gives no permission for it to be edited
 * and/or redistributed  in any way, with the exception of use
 * by the governing body (University of Plymouth) for marking.
 * 
 * For queries relating to the program and the use of any
 * included components, the author can be contacted
 * at <Jack.Tolley-1@Students.Plymouth.ac.uk>
 */
package britishwildlifeassociation;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author hobbes
 */
public class BritishWildlifeAssociation {

    /*
     Array lists used by the rest of the program
     and the GUI to keep track of various objects.
     Observations not included as they are kept with
     their relative animals.
     */
    static ArrayList<Animal> animals;
    static ArrayList<Volunteer> volunteers;
    static ArrayList<Professional> professionals;

    public static void main(String[] args) {
        animals = new ArrayList<>();
        volunteers = new ArrayList<>();
        professionals = new ArrayList<>();
        
        initHardCodeData();
        GUI dash = new GUI();
        dash.setVisible(true);
    }

    /*
     Hardcoded data to fill out the tables
     when first running the program
     */
    static void initHardCodeData() {
        Date date = new Date();
        animals.add(new Animal("Fox", 0));
        animals.add(new Animal("Hedgehog", 1));
        animals.add(new Animal("Rabbit", 1));

        volunteers.add(new Volunteer("Matt", "Smith", "23 Hamilton Gardens", "01626256312", "fezandbowtie@hotmail.co.uk"));
        volunteers.add(new Volunteer("David", "Tennant", "23 Hamilton Gardens", "01626256312", "awholenewspectrum@hotmail.com"));
        volunteers.add(new Volunteer("Peter", "Capaldi", "42 Current Lane", "02182823012", "newera@gmail.com"));
        
        Volunteer v = new Volunteer("Tom","Baker","Watchtower, Fort Boyard","N/A","jellybeans@hotmail.com");
        //keep as date or set long?
        professionals.add(new Professional(date.getTime(), date.getTime(), 1200, 0, v));
    }

}
