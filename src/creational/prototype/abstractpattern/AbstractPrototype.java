/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.prototype.abstractpattern;

/**
 *
 * @author adam
 */
public abstract class AbstractPrototype implements Cloneable{
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
}
