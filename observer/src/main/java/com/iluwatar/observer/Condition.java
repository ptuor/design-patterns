package com.iluwatar.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Neues Subject, informiert Observer
 */

public abstract class Condition {
    private List<ConditionObserver> observers = new ArrayList<>();

    public void addObserver(ConditionObserver obs) {
        observers.add(obs);
    }

    public void removeObserver(ConditionObserver obs) {
        observers.remove(obs);
    }

    protected void notifyObservers(Condition currentCondition) {
        for (ConditionObserver obs : observers) {
            obs.update(currentCondition);
        }
    }
}
