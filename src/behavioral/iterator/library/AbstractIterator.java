/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.iterator.library;

import structural.adapter.library.Book;

/**
 *
 * @author adam
 */
public interface AbstractIterator {
    
    public boolean hasNext();
    public Book next();
    
}
