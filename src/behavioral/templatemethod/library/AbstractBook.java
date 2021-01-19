/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.templatemethod.library;

import behavioral.state.library.Reader;

/**
 *
 * @author adam
 */
public abstract class AbstractBook {
    
    public abstract boolean checkAvailability();
    public abstract boolean checkPermission(Reader reader);
    public abstract boolean checkConditionalAvailability();
    
}
