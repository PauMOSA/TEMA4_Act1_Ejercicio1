/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act1_ejercicio1;
import java.util.Scanner;

/**
 *
 * @author GLORIA PAULINA MORENO SALDIVAR
 */
public class Act1_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner asignar = new Scanner(System.in);
        
        double CalPyt, CalEF, CalPar;
        double PorcPar, PorcPyt, PorcEF, CF;
        
        
        System.out.println("Ingresa la calificacion de los parciales: ");
        CalPar = asignar.nextDouble();
        if(CalPar >= 0 && CalPar <= 100)
        {
            PorcPar = (CalPar*40)/100;  
            System.out.println("Ingresa la calificacion del proyecto: ");
            CalPyt = asignar.nextDouble();
            if(CalPyt >= 0 && CalPyt <= 100)
            {
                PorcPyt = (CalPyt*30)/100;
                System.out.println("Ingresa la calificacion del examen final: ");         
                CalEF = asignar.nextDouble();
                if(CalPyt >= 0 && CalPyt <= 100)
                {
                    PorcEF = (CalEF*30)/100;
                    CF = PorcPar + PorcPyt + PorcEF;
                    System.out.println("La calificacion final del alumno es: " + CF);
                }
                else
                {
                    System.out.println("Recuerda que la calificacion debe estar entre 0 a 100");
                }
            }
            else
            {
                System.out.println("Recuerda que la calificacion debe estar entre 0 a 100");
            }
        }
        else
        {
            System.out.println("Recuerda que la calificacion debe estar entre 0 a 100");
        }
    }   
}
