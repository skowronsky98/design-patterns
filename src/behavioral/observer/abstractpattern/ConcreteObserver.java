/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.observer.abstractpattern;

/**
 *
 * @author adam
 */
public class ConcreteObserver implements AbstractObserver {

    @Override
    public void update() {
        System.out.println("An event occurs");
    }
    
}
