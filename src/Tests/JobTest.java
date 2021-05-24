package Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    private Job One;
    private Job Two;
    private Job Three;

    @Before
    public void createJobObjects() {
        One = new Job();
        Two = new Job();
        Three = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId() {
        assertTrue(One.getId() != Two.getId());
//assertEquals(1, JobTwo.getId() - JobOne.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        //new Job ("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", Three.getName());
    }


    @Test
    public void testJobsForEquality() {
//assertTrue(One.equals(Two));
    }
}