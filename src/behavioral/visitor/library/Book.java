/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.visitor.library;

/**
 *
 * @author adam
 */
public class Book {
    
    private int availability;
    
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
    
}
