/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.command.abstractpattern;

/**
 *
 * @author adam
 */
public class ConcreteCommand extends AbstractCommand {

    @Override
    public void execute() {
        System.out.println("Doing concrete command");
    }
    
}
