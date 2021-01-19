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
public class ConcreteSecondaryPart implements AbstractSecondaryPart{

    @Override
    public void doSecondaryJob() {
        System.out.println("Doing secondary job");
    }
    
}
