/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.interpreter.abstractpattern;

/**
 *
 * @author adam
 */
public class BinaryExpression extends AbstractExpression {
    
    AbstractExpression[] expressions;

    @Override
    public String resolve() {
        return expressions[0].resolve()+expressions[1].resolve();
    }
    
}
