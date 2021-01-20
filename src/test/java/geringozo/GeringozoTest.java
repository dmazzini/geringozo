package geringozo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeringozoTest {
	
	@Test
	public void test01() {
		String actual = new Geringozo().geringozo("hola");
		String expected = "hopolapa";
		
		assertEquals(expected, actual);
	}

	@Test
	public void test02() {
		String actual = new Geringozo().geringozo("¿como estas?");
		String expected = "¿copomopo epestapas?";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test03() {
		String actual = new Geringozo().geringozo("estoy bien ¿y vos?");
		String expected = "epestopoy bipiepen ¿y vopos?";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test04() {
		String actual = new Geringozo().geringozo("a todo ritmo");
		String expected = "apa topodopo ripitmopo";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test05() {
		String actual = new Geringozo().geringozo("quiero queso");
		String expected = "quipieperopo quepesopo";
		
		assertEquals(expected, actual);
	}
}
