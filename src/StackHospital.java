import java.util.ArrayList;

public class StackHospital<PatientType> extends Hospital<PatientType> {

	ArrayList<PatientType> stackPatients;
	
	public StackHospital() {
		stackPatients = new ArrayList<PatientType>();
	}
	
	@Override
	public void addPatient(PatientType patient) {
		// TODO DONE
		stackPatients.add(patient);

	}

	@Override
	public PatientType nextPatient() {
		// TODO DONE
		PatientType next = stackPatients.get(stackPatients.size() - 1);
		return next;
	}

	@Override
	public PatientType treatNextPatient() {
		// TODO DONE
		PatientType treated = nextPatient();
		stackPatients.remove(stackPatients.size() - 1);
		return treated;
	}

	@Override
	public int numPatients() {
		// TODO DONE
		return stackPatients.size();
	}

	@Override
	public String hospitalType() {
		// TODO DONE
		return "StackHospital";
	}

	@Override
	public String allPatientInfo() {
		// TODO DONE
	
		return String.format("A %s-type hospital with %d patients.", hospitalType(), numPatients());
	}

}
