/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.employee;

/**
 *
 * @author kabir
 */


public class doctor extends employee {
    private String specl;

    public doctor(String name, int age, String specialization) {
        super(name, age);
        this.specl= specl;
    }

    public String getSpecialization() {
        return specl;
    }

    public void displayDoctor() {
        System.out.println("Doctor name" + getName());
        System.out.println("Doctor age" + getAge());
        System.out.println("Specialization" + specl);
    }
}
