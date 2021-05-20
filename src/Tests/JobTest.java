package Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    private Job JobOne;
    private Job JobTwo;

    @Before
    public void createJobObjects(){
        Job JobOne= new Job();
        Job JobTwo= new Job();
    }
    @Test
public void testSettingJobId(){
assertTrue(JobOne.getId() != JobTwo.getId());
        //assertEquals(1, JobTwo.getId() - JobOne.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }
}
