/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.strategy.abstractpattern;

/**
 *
 * @author adam
 */
public class ConcreteStrategy extends AbstractStrategy {
    @Override
    public void doJob() {
        System.out.println("Executing");
    }
}
