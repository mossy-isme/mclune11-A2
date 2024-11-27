/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mosscluney
 */
public class Person {
    private int ID;
    private String name;
    private String DOB;
    
    public Person() {
    }

    public Person(int ID, String name, String DOB) {
        this.ID = ID;
        this.name = name;
        this.DOB = DOB;
    }

    public int getID() {
        return this.ID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return this.DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    

    
}
