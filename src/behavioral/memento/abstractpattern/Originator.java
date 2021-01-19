/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.memento.abstractpattern;

/**
 *
 * @author adam
 */
public class Originator {
    
    private State state;
    
    public Memento createMemento(){
        return new Memento(state);
    }
    
    public void setMemento(Memento m){
        state = m.getState();
    }
    
}
