import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


import org.junit.Test;

public class TestCompute {

 Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }


  // if (mq.size() == 0) 
  @Test
  public void test1(){
     MessageQueue mq = mock(MessageQueue.class);
     c = new Compute(mq);
     when(mq.size()).thenReturn(0);
	 assertEquals(-1, c.countNumberOfOccurrences("i"));
  }

  // if (!mq.contains(e))
  @Test
  public void test2(){
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.size()).thenReturn(5);
	when(mq.contains("i")).thenReturn(false);
	assertEquals(0, c.countNumberOfOccurrences("i"));
  }



  // for (int i = 0; i < mq.size(); i++) {
  @Test
  public void test3(){
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.size()).thenReturn(5);
	when(mq.contains("i")).thenReturn(true);
	when(mq.getAt(1)).thenReturn("i");
	assertTrue(c.countNumberOfOccurrences("i")>=0);
  }


}
