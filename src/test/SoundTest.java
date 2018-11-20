package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import main.Sound;

public class SoundTest {
	
	public final double TIME = 7.2;
	public final double VELOCITY = 1100;
	
	Sound sound = new Sound();
	
	@Test
	void test() {
		
		assertEquals(7920.0,sound.calculateDistance(TIME, VELOCITY),"");
	}

}
