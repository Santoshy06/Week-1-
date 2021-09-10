/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carspeeddispaly;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Welcome
 */
public class SpeedData implements Vehicle {
    double distance; // speed in km
    double initialSpeed;
    double time; // time in minutes
    ArrayList<SpeedObserver> vehicleList;
    public SpeedData() {
        vehicleList = new ArrayList<SpeedObserver>();
    }
  
    @Override
    public void registerVehicle(SpeedObserver o) {
        vehicleList.add(o);
    }
  
    @Override
    public void unregisterVehicle(SpeedObserver o) {
        vehicleList.remove(vehicleList.indexOf(o));
    }
  
    @Override
    public void notifyVehicles()
    {
        for (Iterator<SpeedObserver> it =
              vehicleList.iterator(); it.hasNext();)
        {
            SpeedObserver o = it.next();
            o.updateSpeed(initialSpeed,distance,time);
        }
    }
  
  
    private int getCurrentDistance()
    {
        
        return 50;
    }
  
    // get latest wickets from stadium
    private int getCurrentTime()
    {
        
        return 70;
    }
    private int getInitialSpeed()
    {
        return 30;
    }
    
  
   
    public void speedChanged()
    {
       distance=getCurrentDistance();
       time=getCurrentTime();
       initialSpeed=getInitialSpeed();
  
        notifyVehicles();
    }
}
