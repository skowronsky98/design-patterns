/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.mediator.abstractpattern;

/**
 *
 * @author adam
 */
public class ConcreteMediator implements AbstractMediator {

    @Override
    public void mediate(AbstractPrimaryPart primary, AbstractSecondaryPart secondary) {
        primary.doPrimaryJob();
        secondary.doSecondaryJob();
    }
    
}
