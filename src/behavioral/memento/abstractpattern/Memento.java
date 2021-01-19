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
public class Memento {
    
    private State state;
    
    public Memento(State state){
        
    }
    
    public State getState(){
        return state;
    }
    
    public void setState(State state){
        this.state = state;
    }
    
}
