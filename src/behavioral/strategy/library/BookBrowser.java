/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.strategy.library;

import structural.adapter.library.Book;

/**
 *
 * @author adam
 */
public class BookBrowser {
    
    AbstractStrategy strategy;
    
    private class Category{}
    private class Content{}
    private class Title{}
    
    public Book search(Category category){
        return null;
    }
    
    public Book search(Content content){
        return null;
    }
    
    public Book search(Title title){
        return null;
    }
    
}
