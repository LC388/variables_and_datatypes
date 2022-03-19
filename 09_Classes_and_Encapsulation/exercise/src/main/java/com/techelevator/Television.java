package com.techelevator;

public class Television {
    private boolean isOn = false;
    private int currentChannel;
    private int currentVolume;
    private int MIN_CHANNEL = 3;
    private int MAX_CHANNEL = 18;
    private int MIN_VOLUME = 0;
    private int MAX_VOLUME = 10;

    public Television() {
        boolean isOn = false;
        currentChannel = MIN_CHANNEL;
        currentVolume = 2;
    }


    public boolean isOn() {
        return isOn;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void turnOff(){
        isOn = false;
    }
    public void turnOn(){
        this.isOn = true;
        this.MIN_CHANNEL = 3;
        this.currentVolume = 2;
    }

    public void changeChannel(int newChannel){
        if ((isOn()) && (newChannel >= MIN_CHANNEL) && (newChannel <= MAX_CHANNEL)) {
            currentChannel = newChannel;
        }
    }

    public void channelUp() {
        if (isOn()) {
            if (getCurrentChannel() == MAX_CHANNEL) {
                currentChannel = MIN_CHANNEL;
            } else {
                currentChannel++;
            }
        }
    }

    public void channelDown(){
        if(isOn()){
            if(getCurrentChannel() == MIN_CHANNEL){
                currentChannel = MAX_CHANNEL;
            } else{
                currentChannel--;
            }
        }
    }

    public void raiseVolume(){
        if((isOn()) && (getCurrentVolume() < MAX_VOLUME)){
            currentVolume++;
        }
    }

    public void lowerVolume(){
        if((isOn()) && (getCurrentVolume() > MIN_VOLUME)){
            currentVolume--;
        }
    }
}
