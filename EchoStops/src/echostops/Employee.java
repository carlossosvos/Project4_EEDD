/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echostops;

/**
 *
 * @author cgcv
 */
public class Employee extends Person {

    private String WorkID;

    public Employee(String name, String last_name, int ID, int phone, int age, boolean gender) {
        super(name, last_name, ID, phone, age, gender);
    }

    public Employee(String WorkID, String name, String last_name, int ID, int phone, int age, boolean gender) {
        super(name, last_name, ID, phone, age, gender);
        this.WorkID = WorkID;
    }

    public String getWorkID() {
        return WorkID;
    }

    public void setWorkID(String WorkID) {
        this.WorkID = WorkID;
    }

    @Override
    public String toString() {
        return super.toString()+ "Employee{" + "WorkID=" + WorkID + '}';
    }
    
}
