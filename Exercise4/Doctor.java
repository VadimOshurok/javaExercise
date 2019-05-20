package Exercise4;

import java.util.ArrayList;

public class Doctor extends Person{
	private Specification spec;
	private ArrayList<Pacient> pacients = new ArrayList<Pacient>();
	
	public Doctor(String name, Specification spec) {
		super(name);
		this.spec=spec;
	}
	
	public void addSub (Pacient pac){
		if (! pacients.contains(pac)) {
			pacients.add(pac);
			pac.addDoctor(this);
		}
	}
	
	public void unSub (Pacient pac) {
		if (pacients.contains(pac)) {
			pacients.remove(pac);
			pac.deleteDoctor(this);
		}
	}
		
	public Specification getSpec() {
		return spec;
	}

	public void setSpec(Specification spec) {
		this.spec = spec;
	}
	
	public String toString() {
		return "Doctor: " + name + " " + spec;
	}

	public ArrayList<Pacient> getPacients() {
		return pacients;
	}
	
	public int getTotalPacients() {
		return pacients.size();
	}
}