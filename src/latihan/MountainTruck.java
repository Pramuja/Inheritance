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
public class MountainTruck extends Truck{
    public int seatHeight;
    public MountainTruck (int startHeight, int startCadance, int startSpeed, int startGear, int applybrake)
    {
        super(startCadance, startSpeed, startGear, applybrake);
        seatHeight = startHeight;
    }
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }
    public static void main(String[] aku) {
        System.out.println("mulai berjalan");
        MountainTruck MB = new MountainTruck(0,0,0,0,0);
        System.out.println("gear  = "+MB.gear);
        System.out.println("speed = "+MB.speed);
        MB.setGear(2);
        MB.speedUp(2);
        System.out.println("gear  = "+MB.gear);
        System.out.println("speed = "+MB.speed);
        MB.speedUp(5);
        MB.applyBrake(2);
        System.out.println("gear  = "+MB.gear);
        System.out.println("speed = "+((MB.speed)-(MB.brake)));
        MB.setCadance(3);
        MB.setHeight(4);
        System.out.println("candance = "+MB.cadance);
        System.out.println("height   = "+MB.seatHeight);
    }
}
