import java.util.ArrayList;

public class QueueHospital<PatientType> extends Hospital<PatientType> {

	ArrayList<PatientType> queuePatients;
	
	public QueueHospital() {
		queuePatients = new ArrayList<PatientType>();
	}
	
	@Override
	public void addPatient(PatientType patient) {
		// TODO DONE
		queuePatients.add(patient);
	}

	@Override
	public PatientType nextPatient() {
		// TODO DONE
		PatientType next = queuePatients.get(queuePatients.size() - 1);
		return next;
	}

	@Override
	public PatientType treatNextPatient() {
		// TODO DONE
		PatientType next = nextPatient();
		queuePatients.remove(queuePatients.size() - 1);
		return next;
	}

	@Override
	public int numPatients() {
		// TODO DONE
		return queuePatients.size();
	}

	@Override
	public String hospitalType() {
		// TODO DONE
		return "QueueHospital";
	}

	@Override
	public String allPatientInfo() {
		// TODO DONE
		String info = "";
		
		for (int index = 0; index < queuePatients.size(); ++index) {
			info = info + queuePatients.get(index).toString();
		}
		
		return info;
	}

}
