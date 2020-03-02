package tests;
import domain.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class test {

    private static final String name = "studentName";
    private static final String name2 = "anotherStudent";

    private Student student;

    @Before
    public void setUp() throws Exception {
        student = new Student(name);
    }

    @After
    public void tearDown() throws Exception {
        student = null;
    }

    @Test
    public void testGetName() throws Exception {
        assertEquals(name,student.getName());
    }

    @Test
    public void testSetName() throws Exception {
        student.setName(name2);
        assertEquals(name2,student.getName());
    }

    @Test
    public void testToString throws Exception {
        String expected=name+'1';
        assertEquals(expected,student.toString());
    }
}
