/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.adapter.abstractpattern;

/**
 *
 * @author adam
 */
public class Adapter extends Target implements Adaptee {

    @Override
    public void myOwnMethod() {
        super.specialMethod();
    }
    
}
