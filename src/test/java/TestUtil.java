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



  // if (i == 0) 
  //    throw new RuntimeException();
  @Test
  public void test3() { 
	int arr[] = {1,0,6};
	try {
   	 c.compute(arr);
     fail("The test should have failed"); }
    catch (RuntimeException e) {
     assertTrue("Sanity check", true);    }
	}



  //if (sum % i == 0) 
  //    return true;
  @Test
  public void test4() {
	int arr2[] = {2,3,1};
  	assertTrue(c.compute(arr2));
   }



  //return false
  @Test
  public void test5(){
	int arr3[] = {3,6,2};
	assertFalse(c.compute(arr3));
}

}
