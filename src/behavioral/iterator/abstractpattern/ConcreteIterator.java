/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.iterator.abstractpattern;

/**
 *
 * @author adam
 */
public class ConcreteIterator implements AbstractIterator{

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public boolean hasPrev() {
        return true;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public Object prev() {
        return null;
    }
    
}
