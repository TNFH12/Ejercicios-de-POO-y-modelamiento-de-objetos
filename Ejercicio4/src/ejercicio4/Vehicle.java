/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author tania
 */
public class Vehicle {
    public String id, passenger_number, crew_member, number_of_wheels, registration_date, communting;

    public Vehicle(String id, String passenger_number, String crew_member, String number_of_wheels, String registration_date, String communting) {
        this.id = id;
        this.passenger_number = passenger_number;
        this.crew_member = crew_member;
        this.number_of_wheels = number_of_wheels;
        this.registration_date = registration_date;
        this.communting = communting;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassenger_number() {
        return passenger_number;
    }

    public void setPassenger_number(String passenger_number) {
        this.passenger_number = passenger_number;
    }

    public String getCrew_member() {
        return crew_member;
    }

    public void setCrew_member(String crew_member) {
        this.crew_member = crew_member;
    }

    public String getNumber_of_wheels() {
        return number_of_wheels;
    }

    public void setNumber_of_wheels(String number_of_wheels) {
        this.number_of_wheels = number_of_wheels;
    }

    public String getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(String registration_date) {
        this.registration_date = registration_date;
    }

    public String getCommunting() {
        return communting;
    }

    public void setCommunting(String communting) {
        this.communting = communting;
    }

    @Override
    public String toString() {
        return "id=" + id + ", passenger_number=" + passenger_number + ", crew_member=" + crew_member + ", number_of_wheels=" + number_of_wheels + ", registration_date=" + registration_date + ", communting=" + communting;
    }
    
}
