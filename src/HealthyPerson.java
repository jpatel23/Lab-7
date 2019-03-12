
public class HealthyPerson extends Person {

	private String reason;
	public HealthyPerson(String name, int age, String reason) {
		super(name, age);
		// TODO DONE
		this.reason = reason;
	}
	
	public String toString() {
		//TODO DONE
		String info = super.toString();
		info = info + " Reason: " + reason;
		return info;
		
		
	}

	@Override
	protected int compareToImpl(Person p) {
		// TODO DONE
		if (p instanceof HealthyPerson) {
			if (this.getName().equals(p.getName())) {
				return 0;
			}
			else {
				int variable = this.getName().compareTo(p.getName());
				if (variable > 0) {
					return 1;
				}
				else {
					return -1;
				}
			}
		}
			else {
				return 1;
			}
		}
	
	}


