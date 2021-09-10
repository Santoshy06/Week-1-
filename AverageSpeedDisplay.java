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
public class AverageSpeedDisplay implements SpeedObserver{
    private double avgSpeed;
    public void updateSpeed(double initialSpeed, double distance, double time)
    {
        double currentSpeed=(float)(distance/(time/60));
        this.avgSpeed =(float)((currentSpeed-initialSpeed)/time);
        displaySpeed();
    }
  
    public void displaySpeed()
    {
        double scale=Math.pow(10,2);
        System.out.println("\nAverage Speed Display: \n"+ "Average Speed: " + Math.round(avgSpeed*scale)/scale+" KM/HR");
    }  
}
