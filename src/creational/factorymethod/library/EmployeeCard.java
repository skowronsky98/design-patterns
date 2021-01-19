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
public class EmployeeCard implements ReadersCard {

    @Override
    public int getMaximumCount() {
        return 2;
    }

    @Override
    public int getMaximumTime() {
        return 365;
    }

    @Override
    public int getPrice() {
        return 0;
    }
    
}
