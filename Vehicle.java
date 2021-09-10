/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carspeeddispaly;

/**
 *
 * @author 
 */
public interface Vehicle {
    public void registerVehicle(SpeedObserver o);
    public void unregisterVehicle(SpeedObserver o);
    public void notifyVehicles();  
}
