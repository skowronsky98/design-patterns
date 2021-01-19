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
public class PrivatesFactory extends AbstractFactory {

    @Override
    public AbstractReader getReader() {
        return new PrivateReader();
    }

    @Override
    public AbstractReadersCard getReaderCard() {
        return new PrivatesCard();
    }
    
}
