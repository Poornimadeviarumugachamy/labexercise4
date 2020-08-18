/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import java.util.Scanner;
import YEAR_I.*;
import YEAR_II.*;


/**
 *
 * @author ARUMUGASAMY
 */
public class grade {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter n value");
        int n=obj.nextInt();
        for(int i=0; i<n; i++)
        {
            System.out.println("enter the rollnumber");
            int rollnumber=obj.nextInt();
            System.out.println("enter the name");
            String name=obj.next();
            System.out.println("enter the marks");
            YearImarks s=new YearImarks();
            s.display();
            System.out.println("enter the marks");
            YearIImarks s1=new YearIImarks();
            s1.display();
            
        }    
        
        
        
    }
    
}
