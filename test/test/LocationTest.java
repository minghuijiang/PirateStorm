package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import component.Location;

public class LocationTest {

	Location from = new Location(100,100);
	Location to = new Location(400,500);
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testLocation() {
		fail("Not yet implemented");
	}

	@Test
	public void testDistanceFrom() {
		assertTrue(to.distanceFrom(from)==500);
		assertTrue(from.distanceFrom(to)==500);
		assertTrue(from.distanceFrom(from)==0);
		assertTrue(to.distanceFrom(to)==0);
	}

	@Test
	public void testDeepInto() {
		for(int i=0;i<50;i++){
			System.out.println(i+" "+from.deepInto(to, i*10));
		}
	}

	@Test
	public void testGetX() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetY() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetX() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetY() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

}
