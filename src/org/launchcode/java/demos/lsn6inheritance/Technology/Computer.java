package org.launchcode.java.demos.lsn6inheritance.Technology;

public class Computer extends AbstractEntity {
    private Double screenSize;
    private String processorType;
    private Double memorySize;
    private Boolean isOn;

    public Computer(Double screenSize, String processorType, Double memorySize) {
        this.screenSize = screenSize;
        this.processorType = processorType;
        this.memorySize = memorySize;
    }

    public void switchOnOff() {
        if (isOn == false) {
            isOn = true;
        } else {
            isOn = false;
        }
    }




}
