/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.factorymethod.polymorphic;

/**
 *
 * @author adam
 */
public class ConcreteFactory extends AbstractFactory{

    @Override
    public AbstractProduct getProduct(String what) {
        return new ConcreteProduct();
    }
    
}
