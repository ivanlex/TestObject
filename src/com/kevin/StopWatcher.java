package com.kevin;

public class StopWatcher {

    long beginTime;
    long endTime;

    public StopWatcher(){
        beginTime = System.currentTimeMillis();
        System.out.println("Test started");
    }

    public void stop(){
        endTime = System.currentTimeMillis();
    }

    public long elapsedTime(){

        return endTime - beginTime;
    }


}
