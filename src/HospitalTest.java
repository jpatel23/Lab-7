import org.junit.Assert;

import org.junit.Test;

public class HospitalTest {

	@Test
	public void ConstructorTest() {
		StackHospital one = new StackHospital<Person>();
		StackHospital oneo = new StackHospital<Animal>();
		Assert.assertEquals("Incorrect StackHospital name", "class StackHospital", one.getClass().toString());
		Assert.assertEquals("Incorrect StackHospital name", "class StackHospital", oneo.getClass().toString());
		
		
		QueueHospital two = new QueueHospital<Person>();
		QueueHospital twoo = new QueueHospital<Animal>();
		Assert.assertEquals("Incorrect QueueHospital name", "class QueueHospital", two.getClass().toString());
		Assert.assertEquals("Incorrect QueueHospital name", "class QueueHospital", twoo.getClass().toString());
		
		PriorityQueueHospital three = new PriorityQueueHospital<Person>();
		PriorityQueueHospital threeo = new PriorityQueueHospital<Animal>();
		Assert.assertEquals("Incorrect PriorityQueueHospital name", "class PriorityQueueHospital", three.getClass().toString());
		Assert.assertEquals("Incorrect PriorityQueueHospital name", "class PriorityQueueHospital", threeo.getClass().toString());
		
	}
	
	@Test
	public void addPatientTest() {
		//TODO
		HealthyPerson Bob = new HealthyPerson("u", 6, "me");
		SickPerson Sindy = new SickPerson("who", 6, 66);
		
		StackHospital<Person> one = new StackHospital<Person>();
		one.addPatient(Bob);
		Assert.assertEquals("Patient not added", "u", one.nextPatient().getName());
	
		QueueHospital<Person> two = new QueueHospital<Person>();
		two.addPatient(Bob);
		Assert.assertEquals("Patient not added", "u", two.nextPatient().getName());
	
		PriorityQueueHospital<Person> three = new PriorityQueueHospital<Person>();
		three.addPatient(Sindy);
		Assert.assertEquals("Patient not added", "who", three.nextPatient().getName());
		
		
	}
	
	@Test
	public void nextPatientTest() {
		HealthyPerson Bob = new HealthyPerson("u", 6, "me");
		SickPerson Sindy = new SickPerson("who", 6, 66);
		
		StackHospital<Person> one = new StackHospital<Person>();
		one.addPatient(Bob);
		Assert.assertEquals("Not next patient", "u, a 6-year old. Reason: me", one.nextPatient().toString());
	
		QueueHospital<Person> two = new QueueHospital<Person>();
		two.addPatient(Bob);
		Assert.assertEquals("Not next patient", "u, a 6-year old. Reason: me", two.nextPatient().toString());
	
		PriorityQueueHospital<Person> three = new PriorityQueueHospital<Person>();
		three.addPatient(Sindy);
		Assert.assertEquals("Not next patient", "who, a 6-year old. Severity: 66", three.nextPatient().toString());
		
	}
	
	@Test
	public void treatNextPatientTest() {
		Person Bob = new SickPerson("u", 6, 5);
		Person Sindy = new HealthyPerson("who", 6, "me");
		
		StackHospital<Person> one = new StackHospital<Person>();
		one.addPatient(Bob);
		Assert.assertEquals("Patient not treated", "u, a 6-year old. Severity: 5", one.treatNextPatient().toString());
	
		QueueHospital<Person> two = new QueueHospital<Person>();
		two.addPatient(Bob);
		two.addPatient(Sindy);
		Assert.assertEquals("Patient not treated", "who, a 6-year old. Reason: me", two.treatNextPatient().toString());
	
		PriorityQueueHospital<Person> three = new PriorityQueueHospital<Person>();
		three.addPatient(Sindy);
		three.addPatient(Bob);
		Assert.assertEquals("Patient not treated", "u, a 6-year old. Severity: 5", three.treatNextPatient().toString());
	}
	
	@Test
	public void numPatientsTest() {
		HealthyPerson Bob = new HealthyPerson("u", 6, "me");
		SickPerson Sindy = new SickPerson("who", 6, 66);
		
		StackHospital<Person> one = new StackHospital<Person>();
		one.addPatient(Bob);
		Assert.assertEquals("Incorrect number of patients", 1, one.numPatients());
	
		QueueHospital<Person> two = new QueueHospital<Person>();
		two.addPatient(Bob);
		two.addPatient(Sindy);
		Assert.assertEquals("Incorrect number of patients", 2, two.numPatients());
	
		PriorityQueueHospital<Person> three = new PriorityQueueHospital<Person>();
		three.addPatient(Sindy);
		three.addPatient(Bob);
		Assert.assertEquals("Incorrect number of patients", 2, three.numPatients());
	}
	
	@Test
	public void hospitalTypeTest() {
		StackHospital<Person> one = new StackHospital<Person>();
		Assert.assertEquals("Incorrect type", "StackHospital", one.hospitalType());
	
		QueueHospital<Person> two = new QueueHospital<Person>();
		Assert.assertEquals("Incorrect type", "QueueHospital", two.hospitalType());
	
		PriorityQueueHospital<Person> three = new PriorityQueueHospital<Person>();
		Assert.assertEquals("Incorrect type", "PriorityQueueHospital", three.hospitalType());
	}
	
	@Test
	public void allPatientInfoTest() {
		HealthyPerson Bob = new HealthyPerson("u", 6, "me");
		SickPerson Sindy = new SickPerson("who", 6, 66);
		
		StackHospital<Person> one = new StackHospital<Person>();
		one.addPatient(Bob);
		Assert.assertEquals("Incorrect patient info", "A StackHospital-type hospital with 1 patients.", one.toString());
	
		QueueHospital<Person> two = new QueueHospital<Person>();
		two.addPatient(Bob);
		two.addPatient(Sindy);
		Assert.assertEquals("Incorrect patient info", "A QueueHospital-type hospital with 2 patients.", two.toString());
	
		PriorityQueueHospital<Person> three = new PriorityQueueHospital<Person>();
		three.addPatient(Sindy);
		three.addPatient(Bob);
		Assert.assertEquals("Incorrect patient info", "A PriorityQueueHospital-type hospital with 2 patients.", three.toString());
	}

}
