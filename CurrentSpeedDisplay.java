/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carspeeddispaly;

/**
 *
 * @author Welcome
 */
public class CurrentSpeedDisplay implements SpeedObserver {
    private double initialspeed,distance,time;
    
    public void updateSpeed(double initialspeed,double distance, double time)
    {
        this.initialspeed = initialspeed;
        this.distance = distance;
        this.time = time;
        displaySpeed();
    }
  
    public void displaySpeed()
    {
        double scale=Math.pow(10,2);
        double current=Math.round((distance/(time/60)));
        System.out.println("\nCurrent Speed Display:\n"+ "Speed: " + (current*scale)/scale +" KM/HR");
    }
    
}
