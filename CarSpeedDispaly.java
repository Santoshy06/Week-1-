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
public class CarSpeedDispaly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AverageSpeedDisplay averageSpeedDisplay = new AverageSpeedDisplay();
        CurrentSpeedDisplay currentSpeedDisplay = new CurrentSpeedDisplay();
        SpeedData speedData = new SpeedData();
        speedData.registerVehicle(averageSpeedDisplay);
        speedData.registerVehicle(currentSpeedDisplay);
        speedData.speedChanged();
        speedData.unregisterVehicle(averageSpeedDisplay);
        speedData.speedChanged();
    }
    
}
