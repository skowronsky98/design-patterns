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
public abstract class AbstractFactory {
    
    public static AbstractFactory getFactory(){
        return new ConcreteFactory();
    }
    
    public abstract AbstractProduct getProduct(String what);
    
}
