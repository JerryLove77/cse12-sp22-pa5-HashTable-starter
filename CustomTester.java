/**
 * TODO: Add your file header
 * Name:
 * ID:
 * Email:
 * Sources used: Put "None" if you did not have any external help
 * Some example of sources used would be Tutors, Zybooks, and Lecture Slides
 * 
 * 2-4 sentence file description here
 */

import java.util.*;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * TODO: Add your class header
 * 
 * IMPORTANT: Do not change the method names and points are awarded
 * only if your test cases cover cases that the public tester file
 * does not take into account.
 */
public class CustomTester {

    // ----------------Student class----------------
    /**
     * Test the equals method when [TODO: fill in a possible edge case here]
     */
    @Test
    public void testEquals() {
        Student a = new Student("Jianrui","Zhang","A16878087");
        Student b = new Student("Jerry","Zhang","A16878087");
        assertTrue(!a.equals(b));

    }

    /**
     * Test the compareTo method when [TODO]
     */
    @Test
    public void testCompareTo() {
        Student a = new Student("Jianrui","Zhang","A16878087");
        Student b = new Student("Jianrui","Zhang","A16878087");
        assertEquals(0,a.compareTo(b));

    }

    // ----------------Course class----------------
    /**
     * Test the enroll method when [TODO]
     */
    @Test
    public void testEnroll() {
        Course coursea = new Course("CSE","11","Introduction",0);
        Student a = new Student("Jianrui","Zhang","A16878087");
        coursea.enrolled = new HashSet<>();
        assertEquals(0,coursea.enrolled.size());
        assertTrue(!coursea.enroll(a));
        assertTrue(!coursea.enrolled.contains(a));
  

    }

    /**
     * Test the unenroll method when [TODO]
     */
    @Test(expected = IllegalArgumentException.class)
    public void testUnenroll() {
        Student nullstu = null;
        Course coursea = new Course("CSE","11","Introduction",0);
        coursea.unenroll(nullstu);


    }

    /**
     * Test the getRoster method when [TODO]
     */
    @Test
    public void testGetRoster() {
    }
    

    // ----------------Sanctuary class----------------
    /**
     * Test the constructor when [TODO]
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSanctuaryConstructor() {
        Sanctuary a = new Sanctuary(-1, -1);

    }

    /**
     * Test the rescue method when [TODO]
     */
    @Test
    public void testRescueTestOne(){

    }

    /**
     * Test the rescue method when [TODO: fill in another one here]
     */
    @Test
    public void testRescueTestTwo(){

    }

    /**
     * Test the release method when [TODO]
     */
    @Test
    public void testReleaseTestOne(){

    }

    /**
     * Test the release method when [TODO:fill in another one here]
     */
    @Test
    public void testReleaseTestTwo(){

    }
}

