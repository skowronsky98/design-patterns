/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.flyweight.library;

import java.io.Reader;

/**
 *
 * @author adam
 */
public class UnsharedBook implements Book {
    
    private SharedBook book;
    
    private Reader borrowedBy;
    private String itemNo;
    
    
}
