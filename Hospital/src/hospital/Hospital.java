/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital;

/**
 *
 * @author kabir
 */
import hospital.employee.doctor;
import hospital.employee.nurse;
import hospital.employee.staff;
public class Hospital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        patient patient1 = new patient(" Tan", 21);
        doctor doctor1 = new doctor(" Dr. Sara", 59, " Cardiology");
        nurse nurse1 = new nurse(" Niel", 30, " Evening");
        staff staff1= new staff(" Tom", 40, " Janitor");

        patient1.displayPatient();
        System.out.println();

        doctor1.displayDoctor();
        System.out.println();

        nurse1.displayNurse();
        System.out.println();

        staff1.displayStaff();
    }
    
}
