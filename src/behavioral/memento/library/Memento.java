/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.memento.library;

/**
 *
 * @author adam
 */
public class Memento {
    
    private BorrowingPolicy policy;
    
    public Memento(BorrowingPolicy policy){
        this.policy = policy;
    }

    public BorrowingPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(BorrowingPolicy policy) {
        this.policy = policy;
    }
    
    
    
}
