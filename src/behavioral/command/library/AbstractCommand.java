/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.command.library;

/**
 *
 * @author adam
 */
public interface AbstractCommand {
    
    public void execute();
    public void undo();
    
}
