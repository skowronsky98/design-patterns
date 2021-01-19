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
public class ConcretePrimaryPart implements AbstractPrimaryPart {

    @Override
    public void doPrimaryJob() {
        System.out.println("Doing primary job");
    }
    
}
