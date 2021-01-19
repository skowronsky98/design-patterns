/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder.library;

/**
 *
 * @author adam
 */
public abstract class AbstractBuilder {
    
    protected AbstractReadingSet set;
    
    public abstract void buildBase();
    
    public void buildItem(Book book){
        set.add(book);
    }
    
    public AbstractReadingSet build(){
        return set;
    }
    
}
