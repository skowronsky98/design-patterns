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
public class ConcreteFactory extends AbstractFactory {

    @Override
    public AbstractPrimaryPart getPrimaryPart() {
        return new ConcretePrimaryPart();
    }

    @Override
    public AbstractSecondaryPart getSeconaryPart() {
        return new ConcreteSecondaryPart();
    }
    
}
