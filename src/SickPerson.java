
public class SickPerson extends Person {

	private int severity;
	public SickPerson(String name, int age, int severity) {
		super(name, age);
		// TODO DONE
		this.severity = severity;
	}
	
	public String toString() {
		// TODO DONE
		String statement = super.toString();
		statement = statement + " Severity: " + severity;
		return statement;
		
	}

	@Override
	protected int compareToImpl(Person p) {
		// TODO DONE
		if (p instanceof SickPerson) {
			if (this.severity > ((SickPerson) p).severity) {
				return -1;
			}
			
			else if (this.severity < ((SickPerson) p).severity) {
				return 1;
			}
			
			else {
				return 0;
			}
		}
		
		else {
			return -1;
		}
	}

}
