/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.builder.simple;

/**
 *
 * @author adam
 */
public class ProductBuilder {
    
    private String name;
    private int price;
    private String description;
    
    public static ProductBuilder getBase(){
        return new ProductBuilder();
    } 
    
    public ProductBuilder buildName(String name){
        this.name = name;
        return this;
    }
    
    public ProductBuilder buildPrice(int price){
        this.price = price;
        return this;
    }
    
    public ProductBuilder buildDescription(String description){
        this.description = description;
        return this;
    }
    
    public Product build(){
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setDescription(description);
        return product;
    }
    
    public static void main(String[] args){
        Product product = ProductBuilder.getBase()
                .buildName("nazwa")
                .buildPrice(123)
                .buildDescription("opis")
                .build();
        System.out.println(product);
        
        Product product1 = new Product();
        product1.setName("nazwa");
        product1.setPrice(123);
        product1.setDescription("opis");
        System.out.println(product1);
    }
}
