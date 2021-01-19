/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder.abstractpattern;

/**
 *
 * @author adam
 */
public abstract class AbstractBuilder {
    
    protected AbstractProduct product;
    
    public abstract void buildBase();
    
    public abstract void buildItem(AbstractProductItem item);
    
    public abstract AbstractProduct build();
    
}
