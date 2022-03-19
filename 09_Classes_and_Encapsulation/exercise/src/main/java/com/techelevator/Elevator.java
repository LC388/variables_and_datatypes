package com.techelevator;

public class Elevator {
    private int currentFloor;
    private int numberOfFloors;
    private boolean doorOpen;

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }

    public Elevator(int numberOfLevels) {
        this.currentFloor = 1;
        this.numberOfFloors = numberOfLevels;
    }

    public void openDoor(){
        this.doorOpen = true;
    }
    public void closeDoor(){
        this.doorOpen = false;
    }

    public void goUp(int desiredFloor){
        if ((!doorOpen) && (desiredFloor > getCurrentFloor() && desiredFloor <= getNumberOfFloors())){
            currentFloor = desiredFloor;
        }
        }
     public void goDown(int desiredFloor){
        if((!doorOpen) && (desiredFloor < getCurrentFloor() && desiredFloor >= 1)){
            currentFloor = desiredFloor;
        }
     }
}
