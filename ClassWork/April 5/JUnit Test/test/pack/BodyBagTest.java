package pack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fefe-Hern <https://github.com/Fefe-Hern>
 */
public class BodyBagTest {
    
    public BodyBagTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testBodyBag() {
        BodyBag bb = new BodyBag(10);
        Person p1 = new Person("John", 1);
        Person p2 = new Person("Jane", 2);
        bb.add(p1);
        bb.add(p2);
        Person expected = new Person("John", 1);
        Person actual = bb.findById(1);
        assertEquals(expected.getName(), actual.getName());
        assertEquals(expected.getId(), actual.getId());
    }
    /**
    @Test
    public void testAdd() {
        System.out.println("add");
        Person person = null;
        BodyBag instance = null;
        instance.add(person);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    @Test
    public void testFindById() {
        System.out.println("findById");
        int id = 0;
        BodyBag instance = null;
        Person expResult = null;
        Person result = instance.findById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testRemoveById() {
        System.out.println("removeById");
        int id = 0;
        BodyBag instance = null;
        Person expResult = null;
        Person result = instance.removeById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
}
