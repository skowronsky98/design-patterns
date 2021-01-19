/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.abstractfactory.abstractpattern;

/**
 *
 * @author adam
 */
public abstract class AbstractFactory {
    
    public abstract AbstractPrimaryPart getPrimaryPart();
    public abstract AbstractSecondaryPart getSeconaryPart();
    
}