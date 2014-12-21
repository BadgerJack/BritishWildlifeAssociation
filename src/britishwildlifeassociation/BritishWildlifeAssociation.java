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
     their relative Controller.animals.
     */
    static Date date = new Date();

    public static void main(String[] args) {
        Controller.animals = new ArrayList<>();
        Controller.volunteers = new ArrayList<>();
        Controller.professionals = new ArrayList<>();
        Controller.observations = new ArrayList<>();

        initHardCodeData();

        Controller.animals.add(new Animal("Penguin", 3));
        for (Animal animal : Controller.animals) {
            if ("Penguin".equals(animal.getName())) {
                animal.setThreatLevel(2);
                break;
            }
        }

        Controller.volunteers.add(new Volunteer("M", "S", "24", "0000", "bees@bees"));
        for (Volunteer volunteer : Controller.volunteers) {
            if ("M".equals(volunteer.getFirstName()) && "S".equals(volunteer.getLastName())) {
                volunteer.setFirstName("P");
                Controller.professionals.add(new Professional("start", "end", 900, volunteer));
                Controller.volunteers.remove(volunteer);
                break;
            }

        }

        for (Professional professional : Controller.professionals) {
            if (("P".equals(professional.getPrevStatus().getFirstName()) && ("S".equals(professional.getPrevStatus().getLastName())))) {
                professional.getPrevStatus().setLastName("C");
                Controller.volunteers.add(professional.getPrevStatus());
                Controller.professionals.remove(professional);
                break;
            }

        }

        for (Volunteer volunteer : Controller.volunteers) {
            if ("P".equals(volunteer.getFirstName()) && "C".equals(volunteer.getLastName())) {
                volunteer.setAddress("15");
                break;
            }
        }
        GUI dash = new GUI();
        dash.setVisible(true);
    }

    /*
     Hardcoded data to fill out the tables
     when first running the program
     */
    static void initHardCodeData() {
        Controller.animals.add(new Animal("Fox", 0));
        Controller.animals.add(new Animal("Hedgehog", 1));
        Controller.animals.add(new Animal("Rabbit", 1));

        Controller.volunteers.add(new Volunteer("Matt", "Smith", "23 Hamilton Gardens", "01626256312", "fezandbowtie@hotmail.co.uk"));
        Controller.volunteers.add(new Volunteer("David", "Tennant", "23 Hamilton Gardens", "01626256312", "awholenewspectrum@hotmail.com"));
        Controller.volunteers.add(new Volunteer("Peter", "Capaldi", "42 Current Lane", "02182823012", "newera@gmail.com"));

        Volunteer v = new Volunteer("Tom", "Baker", "Watchtower, Fort Boyard", "N/A", "jellybeans@hotmail.com");
        //keep as date or set long?
        Controller.professionals.add(new Professional("start", "end", 1200, v));

        Controller.animals.get(0).getAnnualObservations().add(new Observation(Controller.animals.get(0), Controller.volunteers.get(0), "observationtime", "Somewhere", "Hordes of bees", 1, false));
    }

}
