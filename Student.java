
import java.util.Objects;

public class Student implements Comparable<Student> {
    private final String firstName;
    private final String lastName;
    private final String PID;

    public Student(String firstName, String lastName, String PID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.PID = PID;

    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getPID() {
        return this.PID;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null){
            return false;
        }
        Student temp = (Student) o;
        if(!temp.getFirstName().equals(this.firstName)){
            return false;
        }
        if(!temp.getLastName().equals(this.lastName)){
            return false;
        }
        if(!temp.getPID().equals(this.PID)){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, PID);
    }

    @Override
    public int compareTo(Student o) {
        int last = o.lastName.compareTo(this.lastName);
        int first = o.firstName.compareTo(this.firstName);
        int PID = o.PID.compareTo(this.PID);
        if(last != 0) {
            return last; 
        }
        if(first != 0) {
            return first;
        }
        if(PID != 0){
            return PID;
        }
        return 0;
    }
}
