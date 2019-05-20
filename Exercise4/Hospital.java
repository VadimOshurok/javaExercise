package Exercise4;

import java.util.ArrayList;

public class Hospital {
	private String name;
	private ArrayList<Pacient> pacients = new ArrayList<Pacient>();
	private ArrayList<Doctor> doctors = new ArrayList<Doctor>();

	
	public Hospital(String name) {
		this.name=name;
	} 
	
	public String toString() {
		return "В госпитале " + name ;
	}
	
	public void addPacient (Pacient pac){
		if (! pacients.contains(pac)) {
			pacients.add(pac);
		}
	}
	
	public void deletePacient (Pacient pac) {
		if (pacients.contains(pac)) {
			pacients.remove(pac);
		}
	}

	public void addDoctor(Doctor doc){
		if (! doctors.contains(doc)) {
			doctors.add(doc);
		}
	}
	
	public void deleteDoctor (Doctor doc) {
		if (doctors.contains(doc)) {
			doctors.remove(doc);
		}
	}
	
	public int getTotalPacients() {
		return pacients.size();
	}
	
	public int getTotalDoctors() {
		return doctors.size();
	}
}