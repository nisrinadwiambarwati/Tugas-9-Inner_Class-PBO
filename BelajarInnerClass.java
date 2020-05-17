/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InnerClass;

/**
 *
 * @author ASUS
 */
public class BelajarInnerClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        innerClass a = new innerClass(); 
        innerClass.innerClass1 b = a.new innerClass1(); 
        b.lakukanSesuatu();
    }
}
    

