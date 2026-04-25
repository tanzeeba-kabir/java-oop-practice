/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.employee;

/**
 *
 * @author kabir
 */
public class staff extends employee{
    private String role;

    public staff(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void displayStaff() {
        System.out.println("Staff name" + getName());
        System.out.println("Staff age" + getAge());
        System.out.println("Role" + role);
}
}
