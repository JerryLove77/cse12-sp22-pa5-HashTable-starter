import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import org.junit.runner.Describable;

public class Course {
    HashSet<Student> enrolled;
    private final int capacity;
    private final String department;
    private final String number;
    private final String description;

    public Course(String department, String number, String description, 
        int capacity){
            if(department == null|| number == null|| description == null){
                throw new IllegalArgumentException();
            }

            if(capacity < 0){
                throw new IllegalArgumentException();
            }

            this.capacity = capacity;
            this.department = department;
            this.number = number;
            this.description = description;
        }

    public String getDepartment(){
        return this.department;
    }

    public String getNumber(){
        return this.number;
    }

    public String getDescription(){
        return this.description;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public boolean enroll(Student student) {
        return false;
    }

    public boolean unenroll(Student student) {
        return false;
    }

    public void cancel() {}

    public boolean isFull() {
        return false;
    }

    public int getEnrolledCount() {
        return 0;
    }

    public int getAvailableSeats() {
        return 0;
    }

    public HashSet<Student> getStudents() {
        return null;
    }

    public ArrayList<Student> getRoster() {
        return null;
    }

    public String toString() {
        return null;
    }
}

