/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.observer.abstractpattern;

import java.util.List;

/**
 *
 * @author adam
 */
public abstract class AbstractSubject {
    
    List<AbstractObserver> observers;
    
    public void notifyObservers(){
        for (AbstractObserver observer: observers){
            observer.update();
        }
    };
    
    public void addObserver(AbstractObserver observer){
        observers.add(observer);
    }
    
}
