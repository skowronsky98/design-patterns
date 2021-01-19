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
public class Element extends AbstractElement {

    @Override
    public boolean enterStage() {
        return true;
    }

    @Override
    public boolean exitStage() {
        return false;
    }

    @Override
    public int mainStage() {
        return 0;
    }
    
}
