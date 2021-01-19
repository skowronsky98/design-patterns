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
public class ConcreteDecorator extends Decorator {
    
    public ConcreteDecorator(AbstractElement element){
        super(element);
    }

    @Override
    public String toString() {
        return "Concrete "+super.toString();
    }
    
    public static void main(String [] args){
        AbstractElement element1 = new ConcreteElement();
        AbstractElement element2 = new ConcreteDecorator(new ConcreteElement());
        System.out.println(element1);
        System.out.println(element2);
    }

}
