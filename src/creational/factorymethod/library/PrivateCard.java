/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.factorymethod.library;

/**
 *
 * @author adam
 */
public class PrivateCard implements ReadersCard{

    @Override
    public int getMaximumCount() {
        return 10;
    }

    @Override
    public int getMaximumTime() {
        return 14;
    }

    @Override
    public int getPrice() {
        return 50;
    }
    
}
