/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.templatemethod.library;

/**
 *
 * @author adam
 */
public class Borrower {
    
    public boolean borrow(AbstractBook book){
        if (book.checkAvailability() == false){
            if (book.checkAvailability() == false)
                return false;
        }
        if (book.checkPermission(null) == false)
            return false;
        return true;
    }
    
}
