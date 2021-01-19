/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.proxy.library;

/**
 *
 * @author adam
 */
public class AuthorsCommentProxyBook implements Book {
    
    private RealBook realBook;

    @Override
    public String getPage(int pageNo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
