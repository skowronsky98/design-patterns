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
public class StudentsCard implements ReadersCard{

    @Override
    public int getMaximumCount() {
        return 5;
    }

    @Override
    public int getMaximumTime() {
        return 30;
    }

    @Override
    public int getPrice() {
        return 0;
    }
    
}
