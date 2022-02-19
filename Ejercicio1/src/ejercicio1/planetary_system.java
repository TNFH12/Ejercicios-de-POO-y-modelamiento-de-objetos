/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author tania
 */
public class planetary_system {
    public String Id, Name, Mass, Density, Diameter, Distance_to_the_sun;

    public planetary_system(String Id, String Name, String Mass, String Density, String Diameter, String Distance_to_the_sun) {
        this.Id = Id;
        this.Name = Name;
        this.Mass = Mass;
        this.Density = Density;
        this.Diameter = Diameter;
        this.Distance_to_the_sun = Distance_to_the_sun;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getMass() {
        return Mass;
    }

    public void setMass(String Mass) {
        this.Mass = Mass;
    }

    public String getDensity() {
        return Density;
    }

    public void setDensity(String Density) {
        this.Density = Density;
    }

    public String getDiameter() {
        return Diameter;
    }

    public void setDiameter(String Diameter) {
        this.Diameter = Diameter;
    }

    public String getDistance_to_the_sun() {
        return Distance_to_the_sun;
    }

    public void setDistance_to_the_sun(String Distance_to_the_sun) {
        this.Distance_to_the_sun = Distance_to_the_sun;
    }
    
    @Override
    public String toString() {
        return "planetary_system{" + "Id=" + Id + ", Name=" + Name + ", Mass=" + Mass + ", Density=" + Density + ", Diameter=" + Diameter + ", Distance_to_the_sun=" + Distance_to_the_sun + '}';
    }
}
