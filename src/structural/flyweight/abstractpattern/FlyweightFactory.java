/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.flyweight.abstractpattern;

import java.util.List;

/**
 *
 * @author adam
 */
public class FlyweightFactory {
    
    List<Flyweight> flyweight;
    
    public Flyweight getFlyweight(int key){
        return flyweight.get(key);
    }
    
}
