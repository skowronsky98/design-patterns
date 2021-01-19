/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.prototype.library;

/**
 *
 * @author adam
 */
public class Book extends Prototype{
    
    private String title;
    private String author;
    private String description;
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
}
