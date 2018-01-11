/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author S M H S CHANDRASENA
 */
public class Methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Patient p1 = new Patient ();
        p1.name = "Hemal";
        p1.age = 36;
        p1.ht=1.67;p1.wt=80;
        p1.patientDeatails();
        double bmi1 = p1.getBmi();
        System.out.println("BMI is " + bmi1);
        
        
        Patient p2 = new Patient ();
        p2.name = "Chandrasena";
        p2.age = 37;
        p2.ht= 1.7; p2.wt =68;
        p2.patientDeatails();
        p2.printBmi();
        
    }
    
}
