/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.visitor.abstractpattern;

/**
 *
 * @author adam
 */
public class ConcreteElement extends AbstractElement {
    @Override
    public void accept(AbstractVisitor visitor) {
        visitor.visitConcreteElement(this);
    }
}
