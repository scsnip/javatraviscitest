import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSceleton{
    @Test
    public void testSceletonAlwaysOk(){

        assertEquals(0,0);
    }
    @Test
    public void testSceletonAlwaysFail(){

        assertEquals(0,1);
    }
}
