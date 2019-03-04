import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }



  // if (args.length == 1)
  @Test
  public void test1() { 
	int arr[] = {1};
	assertFalse( c.compute(arr) );}



  //if (args.length %2 == 0)
  @Test
  public void test2() { 
	int arr[] = {1,2};
	assertFalse( c.compute(arr) );}



}
