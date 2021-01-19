/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.singleton.library;

/**
 *
 * @author adam
 */
public class ForbiddenBookApprover {
    
    private static ForbiddenBookApprover instance = null;
    
    private ForbiddenBookApprover(){
        
    }
    
    public static ForbiddenBookApprover getInstance(){
        if (instance == null)
            instance = new ForbiddenBookApprover();
        return instance;
    }
    
    public boolean approve(String reader){
        return false;
    }
    
    
    
}
