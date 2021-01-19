/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.abstractfactory.library;

/**
 *
 * @author adam
 */
public abstract class AbstractFactory {
    
    public abstract AbstractReader getReader();
    public abstract AbstractReadersCard getReaderCard();
    
}
