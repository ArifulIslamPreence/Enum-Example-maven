package EnumEx.EnumEx;

import static org.junit.Assert.*;

import org.junit.Test;

public class EnumTest {

	@Test
	
	public void testDaysInMonth() {
		assertEquals(31, Months.JANUARY.Dates());
		assertEquals(28, Months.FEBRUARY.Dates());
		assertEquals(31, Months.MARCH.Dates());
		assertEquals(30, Months.APRIL.Dates());
		assertEquals(31, Months.MAY.Dates());
		assertEquals(30, Months.JUNE.Dates());
		assertEquals(31, Months.JULY.Dates());
		assertEquals(31, Months.AUGUST.Dates());
		assertEquals(30, Months.SEPTEMBER.Dates());
		assertEquals(31, Months.OCTOBER.Dates());
		assertEquals(30, Months.NOVEMBER.Dates());
		assertEquals(31, Months.DECEMBER.Dates());
	}

	@Test
	public void testGetShortName() {
		assertEquals("Jan",Months.JANUARY.getShortName());
		assertEquals("Feb",Months.FEBRUARY.getShortName());
		assertEquals("Mar",Months.MARCH.getShortName());
		assertEquals("Apr",Months.APRIL.getShortName());
		assertEquals("May",Months.MAY.getShortName());
		assertEquals("Jun",Months.JUNE.getShortName());
		assertEquals("Jul",Months.JULY.getShortName());
		assertEquals("Aug",Months.AUGUST.getShortName());
		assertEquals("Sep",Months.SEPTEMBER.getShortName());
		assertEquals("Oct",Months.OCTOBER.getShortName());
		assertEquals("Nov",Months.NOVEMBER.getShortName());
		assertEquals("Dec",Months.DECEMBER.getShortName());
	}

	
	/*public void testParse() {
		assertNotNull(Months.JANUARY.parse(("January")));
		assertNull(Months.parse(("Janu")));
		
		assertNotNull(Months.FEBRUARY.parse(("February")));
		assertNull(Months.FEBRUARY.parse(("febu")));
		
		assertNotNull(Months.MARCH.parse(("March")));
		assertNull(Months.MARCH.parse(("Marc")));
		
		assertNotNull(Months.APRIL.parse(("April")));
		assertNull(Months.APRIL.parse(("Apri")));
		
		assertNotNull(Months.MAY.parse(("May")));
		assertNull(Months.MAY.parse(("Mayy")));
		
		assertNotNull(Months.JUNE.parse(("June")));
		assertNull(Months.JUNE.parse(("Junn")));
		
		assertNotNull(Months.JULY.parse(("July")));
		assertNull(Months.JULY.parse(("Jully")));
		
		assertNotNull(Months.AUGUST.parse(("August")));
		assertNull(Months.AUGUST.parse(("augu")));
		
		assertNotNull(Months.SEPTEMBER.parse(("September")));
		assertNull(Months.SEPTEMBER.parse(("septe")));
		
		assertNotNull(Months.OCTOBER.parse(("October")));
		assertNull(Months.OCTOBER.parse(("octa")));
		
		assertNotNull(Months.NOVEMBER.parse(("November")));
		assertNull(Months.NOVEMBER.parse(("novam")));
		
		assertNotNull(Months.DECEMBER.parse(("December")));
		assertNull(Months.DECEMBER.parse(("decem")));
	}*/

}


