/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author USER
 */
public class Truck {
    public int cadance;
    public int gear;
    public int speed;
    public int brake;
    
    public Truck(int startCadance, int startSpeed, int startGear, int applybrake) 
    {
        gear = startGear;
        cadance = startCadance;
        speed = startSpeed;
        brake = applybrake;
    }
    public void setCadance(int newValue)
    {
        cadance = newValue;
    }
    public void setGear(int newValue)
    {
        gear = newValue;
    }
    public void applyBrake(int decrement)
    {
        brake = decrement;
    }
    public void speedUp(int increment)
    {
        speed = increment;
    }
}
