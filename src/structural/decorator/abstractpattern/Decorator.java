/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.decorator.abstractpattern;

/**
 *
 * @author adam
 */
public class Decorator extends AbstractElement {
    
    protected AbstractElement element;
    
    public Decorator(AbstractElement element){
        this.element = element;
    }

    @Override
    public String toString() {
        return "Decorated " + element;
    }

}
