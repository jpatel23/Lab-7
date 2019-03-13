import org.junit.Assert;

import org.junit.Test;

public class PatientTypeTest {

	@Test
	public void ConstructorTest() {
		Animal boris = new Animal("dog", 2);
		HealthyPerson me = new HealthyPerson("me", 6, "u");
		SickPerson poppy = new SickPerson("a", 66, 1);
				
		Assert.assertEquals("Incorrect Animal name", "class Animal", boris.getClass().toString());
		Assert.assertEquals("Incorrect HealthyPerson name", "class HealthyPerson", me.getClass().toString());
		Assert.assertEquals("Incorrect SickPerson name", "class SickPerson", poppy.getClass().toString());
		
	}
	
	@Test
	public void toStringTest() {
		Animal boris = new Animal("dog", 2);
		HealthyPerson me = new HealthyPerson("me", 6, "u");
		SickPerson poppy = new SickPerson("a", 66, 1);
		
		Assert.assertEquals("Incorrect Animal info", "A 2-year old dog.", boris.toString());
		Assert.assertEquals("Incorrect HealthyPerson info", "me, a 6-year old. Reason: u", me.toString());
		Assert.assertEquals("Incorrect SickPerson info", "a, a 66-year old. Severity: 1", poppy.toString());
	}
	
	@Test
	public void compareToImplTest() {
		HealthyPerson me = new HealthyPerson("me", 6, "u");
		HealthyPerson met = new HealthyPerson("me", 7, "au");
		HealthyPerson metw = new HealthyPerson("u", 6, "me");
		
		Assert.assertEquals("Incorrect comparison", 0, me.compareToImpl(met));
		Assert.assertEquals("Incorrect comparison", -1, me.compareToImpl(metw));
		Assert.assertEquals("Incorrect comparison", 1, metw.compareToImpl(me));
		
		SickPerson poppy = new SickPerson("a", 66, 6);
		SickPerson pop = new SickPerson("f", 6, 6);
		SickPerson popp = new SickPerson("z", 1, 7);
		
		Assert.assertEquals("Incorrect comparison", 0, poppy.compareToImpl(pop));
		Assert.assertEquals("Incorrect comparison", 1, poppy.compareToImpl(popp));
		Assert.assertEquals("Incorrect comparison", -1, popp.compareToImpl(poppy));
	}
	
	@Test
	public void getBreedTest() {
		Animal boris = new Animal("dog", 2);
		Assert.assertEquals("Incorrect breed", "dog", boris.getBreed());
	}
	
	@Test
	public void getAgeTest() {
		Animal boris = new Animal("dog", 2);
		Assert.assertEquals("Incorrect age", 2, boris.getAge());
	}
	
	@Test
	public void compareToTest() {
		Animal boris = new Animal("dog", 2);
		Animal bigBoris = new Animal("dog", 6);
		Assert.assertEquals("Incorrect comparison", 4, boris.compareTo(bigBoris));
	}
	
	

}
