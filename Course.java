import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import org.junit.runner.Describable;

public class Course {
    HashSet<Student> enrolled;
    private final int capacity;
    private final String department;
    private final String number;
    private final String description;
    private final String formatting = "%s %s [%d]\n%s";

    public Course(String department, String number, String description, 
        int capacity){
            if(capacity < 0){
                throw new IllegalArgumentException();
            }
            if(department == null|| number == null
            || description == null){
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
        if(student == null) {
            throw new IllegalArgumentException();
        }
        if(capacity > getEnrolledCount()) {
            return enrolled.add(student);
        }
        else{
            return false;
        }
    }

    public boolean unenroll(Student student) {
        if(student == null){
            throw new IllegalArgumentException(); 
        }
        if(enrolled.contains(student)){
            enrolled.remove(student);
            return true;
        }
        else{
            return false;
        }
    }

    public void cancel() {
        enrolled.clear();
    }

    public boolean isFull() {
        if(capacity == getEnrolledCount()) {
            return true;
        }
        return false;
    }

    public int getEnrolledCount() {
        return this.enrolled.size();
    }

    public int getAvailableSeats() {
        return capacity - enrolled.size();
    }

    public HashSet<Student> getStudents() {
        return null;
    }

    public ArrayList<Student> getRoster() {
        ArrayList<Student> enrolledarrlist = new ArrayList<>();
        //creates an iterator 
        Iterator<Student> enrollit = enrolled.iterator();
        for(int i = 0; i < enrolled.size(); i++) {
            //adds the student to the ArrayList by the iterator
            enrolledarrlist.add(enrollit.next());
        }
        //sorts the ArrayList
        Collections.sort(enrolledarrlist);
        return enrolledarrlist;
    }

    public String toString() {
        String temp = String.format(formatting, getDepartment(), getNumber(), getCapacity(), getDescription());
        return temp;
    }
}

