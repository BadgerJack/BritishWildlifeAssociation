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

        GUI dash = new GUI();
        dash.setVisible(true);
    }

    /*
     Hardcoded data to fill out the tables
     when first running the program
     */
    static void initHardCodeData() {
        Controller.animals.add(new Animal("Fox", "0"));
        Controller.animals.add(new Animal("Hedgehog", "1"));
        Controller.animals.add(new Animal("Rabbit", "1"));

        Controller.animals.get(0).getCallsHistory().add(new ObservationCall("12/12/2012", "12/10/2015", "Torbay", "Mass migration"));
        Controller.animals.get(1).getCallsHistory().add(new ObservationCall("12/12/2010", "12/10/2012", "Londonderry", "Mass migration"));

        Controller.volunteers.add(new Volunteer("Matt", "Smith", "23 Hamilton Gardens", "01626256312", "fezandbowtie@hotmail.co.uk"));
        Controller.volunteers.add(new Volunteer("David", "Tennant", "23 Hamilton Gardens", "01626256312", "awholenewspectrum@hotmail.com"));
        Controller.volunteers.add(new Volunteer("Peter", "Capaldi", "42 Current Lane", "02182823012", "newera@gmail.com"));

        Volunteer v = new Volunteer("Tom", "Baker", "Watchtower, Fort Boyard", "N/A", "jellybeans@hotmail.com");
        Volunteer s = new Volunteer("Peter", "Davison", "Cricket Field", "01626242135", "purpleleek@hotmail.com");
        Controller.professionals.add(new Professional("26/09/2012", "31/12/2015", 1200, v));
        Controller.professionals.add(new Professional("26/09/2012", "22/12/2012", 1500, s));

        Controller.animals.get(0).getAnnualObservations().add(new Observation(Controller.animals.get(0), Controller.volunteers.get(0), "12/12/12", "Londonderry", "Hordes of bees", "1", false));
    }
}
