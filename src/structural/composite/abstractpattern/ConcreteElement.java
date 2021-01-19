/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.composite.abstractpattern;

/**
 *
 * @author adam
 */
public class ConcreteElement extends AbstractElement {
    
    public static void main(String[] args){
        Composite root = new Composite();
        Composite branch = new Composite();
        AbstractElement leef = new ConcreteElement();
        branch.add(leef);
        root.add(branch);
        root.add(new ConcreteElement());
        System.out.println(root);
    }
    
}
