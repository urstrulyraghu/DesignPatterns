package com.accolite.singleton;

import java.util.ArrayList;
import java.util.Iterator;

public class CricketData {
	
    int runs;
    int wickets;
    float overs;
    ArrayList<Observer> observerList;
 
    public CricketData() {
        observerList = new ArrayList<Observer>();
    }
 
    public void registerObserver(Observer o) {
        observerList.add(o);
    }
 
    public void unregisterObserver(Observer o) {
        observerList.remove(observerList.indexOf(o));
    }
 
    public void notifyObservers()
    {
        for (Iterator<Observer> it =
              observerList.iterator(); it.hasNext();)
        {
            Observer o = it.next();
            o.update(runs,wickets,overs);
        }
    }
 
    private int getLatestRuns()
    {
        return 90;
    }
 
    private int getLatestWickets()
    {
        return 2;
    }
 
    private float getLatestOvers()
    {
        return (float)10.2;
    }
 
    public void dataChanged()
    {
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();
 
        notifyObservers();
    }
}
