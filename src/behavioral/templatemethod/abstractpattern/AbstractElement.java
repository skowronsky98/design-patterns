/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.templatemethod.abstractpattern;

/**
 *
 * @author adam
 */
public abstract class AbstractElement {
    
    public abstract boolean enterStage();
    public abstract boolean exitStage();
    public abstract int mainStage();
    
    public int doJob(){
        if (enterStage() == false)
            return -1;
        int result = mainStage();
        if (exitStage() == false)
            return -2;
        if (result == -1)
            return -3;
        else
            return result;          
    } 
    
}
