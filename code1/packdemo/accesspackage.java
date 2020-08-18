/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packdemo;
import pack1.*;
import pack1.subpackage.*;
import pack2.*;
import pack2.subpackage.*;

/**
 *
 * @author ARUMUGASAMY
 */
public class accesspackage {
    public static void main(String args[]) {
        first s=new first();
        s.display();
        second s1=new second();
        s1.display();
        third s3=new third();
        s3.display();
        fourth s4=new fourth();
        s4.display();
        
        
    }
    
    
}
