/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.composite.abstractpattern;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author adam
 */
public class Composite extends AbstractElement {
    
    List<AbstractElement> children;
    
    public Composite(){
        children = new LinkedList<>();
    }
    
    public void add(AbstractElement element){
        children.add(element);
    }

    @Override
    public String toString() {
        return "Composite{" + "children=" + children + '}';
    }
    
}
