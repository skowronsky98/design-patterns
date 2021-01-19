/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.state.library;

/**
 *
 * @author adam
 */
public class Reader implements Readerable{
    
    private ReaderState state;

    @Override
    public int getMaximumCount() {
        return state.getMaximumCount();
    }

    @Override
    public int getMaximumTime() {
        return state.getMaximumTime();
    }

    @Override
    public int getPenalty() {
        return state.getPenalty();
    }
    
    
}
