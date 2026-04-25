/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.employee;

/**
 *
 * @author kabir
 */
public class nurse extends employee {
      private String shift;

    public nurse(String name, int age, String shift) {
        super(name, age);
        this.shift = shift;
    }

    public String getShift() {
        return shift;
    }

    public void displayNurse() {
        System.out.println("Nurse name" + getName());
        System.out.println("Nurse age" + getAge());
        System.out.println("Shift" + shift);
    }
}
