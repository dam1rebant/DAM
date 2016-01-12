/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam1;

import java.util.Scanner;

/**
 *
 * @author Rebee
 */
public class DAM1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner in = new Scanner(System.in);
        double C1;
        int DIEZ;
        int CINCO;
        int CINCUENTA;
        int DIEZ2;
        int CINCO2;
        int UNO;
        double R;
        double R2;
        double R3;
        double R4;
        double R5;
        
        System.out.println("Introduzca cantidad");
        C1=in.nextDouble();
        
        DIEZ=(int) (C1/10);
        R=(double) (C1%10);
        CINCO=(int) (R/5);
        R2=(double) (R%5);
        R2=(double) (R2*100);
        CINCUENTA=(int) (R2/50);
        R3=(double) (R2%50);
        DIEZ2=(int) (R3/10);
        R4=(double) (R3%10);
        CINCO2=(int) (R4/5);
        R5=(double) (R4%5);
        UNO=(int) (R5/1);
        
        System.out.println("La distribución de billetes es:\n"+DIEZ+" billetes de diez \n"
                +CINCO+" billetes de cinco \n"+CINCUENTA+" monedas de cincuenta céntimos \n"
                +DIEZ2+" monedas de diez céntimos \n"+CINCO2+" monedas de cinco céntimos \n"
                +UNO+" monedas de un céntimo");
             
        
        
                    
    }
    }
    
