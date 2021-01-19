/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.chainofresponsibility.abstractpattern;

/**
 *
 * @author adam
 */
public abstract class AbstractHandler {
    
    private AbstractHandler successor;
    
    public AbstractHandler(AbstractHandler succ){
        this.successor = succ;
    }
    
    public void handle(){
        if (successor != null)
            successor.handle();
    }
    
}
