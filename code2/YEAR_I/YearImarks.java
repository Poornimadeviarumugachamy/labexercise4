/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YEAR_I;
import java.util.Scanner;

/**
 *
 * @author ARUMUGASAMY
 */
public class YearImarks {
    public void display()
    {
        Scanner obj=new Scanner(System.in);
        int sub1mark=obj.nextInt();
        int sub2mark=obj.nextInt();
        System.out.println("Mark1"+sub1mark);
        System.out.println("Mark2"+sub2mark);
        if(sub1mark>50)
        {
            System.out.println("Pass");
        }    
        else
        {
            System.out.println("Fail");
        }    
        if(sub2mark>50)
        {
            System.out.println("Pass");
        }    
        else
        {
            System.out.println("Fail");
        }    
    }        
    
}
