/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.iterator.library;

/**
 *
 * @author adam
 */
public class SpecialBookCollection {
    
    public AbstractIterator getIterator(){
        return new OrderByChronologyIterator();
    }
}
