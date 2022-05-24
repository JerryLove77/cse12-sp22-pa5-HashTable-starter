/**
 * Name: Jianrui Zhang
 * ID: A16878087
 * Email: Jiz145@ucsd.edu
 * Sources used: None
 * 
 * Concreted Student class in this file.
 * There are its own methods and overrided methods to 
 * access and manipulate variable
 */
import java.util.Objects;

/**
 * Concreted class student implement Comparable student class
 * Its own methods about student object and override some methods
 * to access and manipulate variable.
 */
public class Student implements Comparable<Student> {
    private final String firstName;
    private final String lastName;
    private final String PID;
    /**
     * constructor to inialize local variables
     * @param firstName (the first name of student)
     * @param lastName (the last name of student)
     * @param PID (the PID of student)
     */
    public Student(String firstName, String lastName, String PID) {
        if(firstName == null || lastName == null || PID == null){
            throw new IllegalArgumentException();
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.PID = PID;

    }

    /** @return lastname*/
    public String getLastName() {
        return this.lastName;
    }

    /** @return firstname */
    public String getFirstName() {
        return this.firstName;
    }

    /** @return PID */
    public String getPID() {
        return this.PID;
    }

    /**
     * @param o (the object student will be compared)
     * @return (whether Object o equals to this student)
     */
    @Override
    public boolean equals(Object o) {
        if (o.getClass() != this.getClass()){
            return false;
        }
        Student other = (Student) o;
        String[] thisCheckList = {this.getFirstName(), this.getLastName(), this.getPID()};
        String[] otherCheckList = {other.getFirstName(), other.getLastName(), other.getPID()};
        for (int i = 0; i < thisCheckList.length; i++){
            if (! thisCheckList[i].equals(otherCheckList[i])){
                return false;
            }
        }
        return true; 
    }

    /**
     * @return Return the hash value generated by Object’s hash function.
     */
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, PID);
    }

    /**
     * @param o (the student object that will be compared)
     * @return (0 if all the instance variables are equivalent;
     *          a negative value if the current object 
     *          lexicographically comes before Student o;
     *          a positive value if the current object 
     *          lexicographically comes after Student o. ) 
     */
    @Override
    public int compareTo(Student o) {
        int last = this.lastName.compareTo(o.lastName);
        int first = this.firstName.compareTo(o.firstName);
        int PID = this.PID.compareTo(o.PID);
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
