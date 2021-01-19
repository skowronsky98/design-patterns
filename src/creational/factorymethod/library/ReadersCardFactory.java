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
public class ReadersCardFactory {
    
    public static ReadersCard getReaderCard(ReadersCardType type) throws Exception{
        switch (type){
            case STUDENT:
                return new StudentsCard();
            case PRIVATE:
                return new PrivateCard();
            case EMPLOYEE:
                return new EmployeeCard();
            default:
                throw new Exception("Can not get proper ReadersCard");
        }
    }
    
}
