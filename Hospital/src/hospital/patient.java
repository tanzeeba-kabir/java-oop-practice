/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author kabir
 */
public class patient {
    private String name;
    private int age;
    public patient(String name, int age){
      this.name = name;
      this.age = age;
      
    }
      public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void displayPatient() {
        System.out.println("Patient name" + name);
        System.out.println("Patient age" + age);
    }
}
