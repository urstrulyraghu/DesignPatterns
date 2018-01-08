package com.accolite.singleton;
 
public class ObserverImpl{
    public static void main(String args[])
    {
        AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();
 
        CricketData cricketData = new CricketData();
 
        cricketData.registerObserver(averageScoreDisplay);
        cricketData.registerObserver(currentScoreDisplay);
 
        cricketData.dataChanged();
 
        cricketData.unregisterObserver(averageScoreDisplay);
 
        cricketData.dataChanged();
    }
}
