/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodLocalInnerClass;

/**
 *
 * @author ASUS
 */
public class Outher {
    void outerMethod()
      {
        final int var1=98;
        System.out.println("Method Luar Dalam");
        class Inner
        {
          void innerMethod()
          {
           System.out.println("Nilai var1 adalah = "+var1);
          }
       }
        Inner innerObj = new Inner();
        innerObj.innerMethod();
      }
 }
class MethodLocalClass1
     {
       public static void main(String[] args)
        {
         Outher outerObj = new Outher();
         outerObj.outerMethod();
        }
       }

