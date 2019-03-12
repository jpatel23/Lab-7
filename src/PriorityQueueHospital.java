import java.util.ArrayList;
import java.util.Collections;

public class PriorityQueueHospital<PatientType extends Comparable<PatientType>> extends Hospital<PatientType> {
	
	ArrayList<PatientType> priorQueuePatients;
	
	public PriorityQueueHospital() {
		priorQueuePatients = new ArrayList<PatientType>();
	}
	
	@Override
	public void addPatient(PatientType patient) {
		// TODO DONE
		priorQueuePatients.add(patient);
		Collections.sort(priorQueuePatients);

	}

	@Override
	public PatientType nextPatient() {
		// TODO DONE
		return priorQueuePatients.get(0);
	}

	@Override
	public PatientType treatNextPatient() {
		// TODO DONE
		PatientType treated = priorQueuePatients.get(0);
		priorQueuePatients.remove(0);
		return treated;
	}

	@Override
	public int numPatients() {
		// TODO DONE
		return priorQueuePatients.size();
	}

	@Override
	public String hospitalType() {
		// TODO DONE
		return "PriorityQueueHospital";
	}

	@Override
	public String allPatientInfo() {
		// TODO DONE
		String info = "";
		
		for (int index = 0; index < priorQueuePatients.size(); ++index) {
			info = info + priorQueuePatients.get(index).toString() + "\n";
		}
		
		return info;
	}

}
