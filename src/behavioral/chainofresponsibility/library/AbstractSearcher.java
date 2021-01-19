/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.chainofresponsibility.library;

/**
 *
 * @author adam
 */
public abstract class AbstractSearcher {
    
    private AbstractSearcher successor;
    
    public abstract void search(String criteria);
    
}
