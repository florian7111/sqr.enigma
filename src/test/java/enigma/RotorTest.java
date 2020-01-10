package enigma;

import static org.junit.Assert.*;

import org.junit.Test;

public class RotorTest {

     Rotor rotorTest = Rotor.rotorFactory("E K M F L G D Q V Z N T O W Y H X U S P A I B R C J", "Q");
	@Test
	public void test() {
		fail("Not yet implemented");
	}
        
        public void TestFactory()
        {
            Rotor rotor = new Rotor();
            rotor.rotorFactory("V Z B R G I T Y U P S D N H L X A W M J Q O F E C K", "Z");
            int start = rotor.getPosition();
            rotor.advance();
            assertEquals(start+1, rotor.getPosition());
            
        }
       public void rotor_advance_test()
       {
           int position = rotorTest.getPosition();
           rotorTest.advance();
           assertEquals(position+1,rotorTest.getPosition());
       }
       
        public void rotor_advance_testLimite()
       {
           rotorTest.setPosition(25);
           rotorTest.advance();
           assertEquals(0,rotorTest.getPosition());
       }
        public void testConvertForward()
        {
            Rotor r = new Rotor();
            r.rotorFactory("E K M F L G D Q V Z N T O W Y H X U S P A I B R C J", "Q");
            int res = r.convertForward(3);
            assertEquals('L',r.toLetter(res));
            
            
        }
        

}
