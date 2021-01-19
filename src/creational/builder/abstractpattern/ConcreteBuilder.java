/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder.abstractpattern;

/**
 *
 * @author adam
 */
public class ConcreteBuilder extends AbstractBuilder{

    @Override
    public void buildBase() {
        product = new ConcreteProduct();
    }

    @Override
    public void buildItem(AbstractProductItem item) {
        product.addItem(item);
    }

    @Override
    public AbstractProduct build() {
        return product;
    }
    
}
