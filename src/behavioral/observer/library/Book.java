/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.observer.library;

import java.util.List;

/**
 *
 * @author adam
 */
public class Book {
    
    List<Observer> observers;
    
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    
    public void notifyObservers(){
        for (Observer o: observers)
            o.update(this);
    }
    
    public void borrowBook(){
        
    }
    
    public void returnBook(){
        
    }
    
    
}
