package Exercise4;

import java.util.ArrayList;

public class Pacient extends Person {
	private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	
	public Pacient(String name) {
		super(name);
	}
	
	public void addDoctor(Doctor doc){
		if (! doctors.contains(doc)) {
			doctors.add(doc);
			doc.addSub(this);
		}
	}
	
	public void deleteDoctor (Doctor doc) {
		if (doctors.contains(doc)) {
			doctors.remove(doc);
			doc.unSub(this);
		}
	}
	
	public String toString() {
		return "pacient: " + name;
	}
	
	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}
}