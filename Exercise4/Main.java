package Exercise4;

public class Main {
	public static void main(String[] args) {
		Hospital CentralHospital = new Hospital("ЦРБ");
		Hospital ChildHospital = new Hospital("Детская поликлиника");
		Doctor doc1 =new Doctor("Stas", Specification.SURGEON);
		Doctor doc2 =new Doctor("Yarik", Specification.SURGEON);
		Doctor doc3 =new Doctor("Tom", Specification.LORE);
		Doctor doc4 =new Doctor("Alex", Specification.THERAPIST);
		Pacient pac1 = new Pacient("Adam");
		Pacient pac2 = new Pacient("Ed");
		Pacient pac3 = new Pacient("Oliver");
		Pacient pac4 = new Pacient("Celvin");
		Pacient pac5 = new Pacient("Kevin");
		Pacient pac6 = new Pacient("Kim");
		
		CentralHospital.addDoctor(doc4);
		CentralHospital.addDoctor(doc3);
		CentralHospital.addDoctor(doc2);
		CentralHospital.addPacient(pac1);
		CentralHospital.addPacient(pac3);
		CentralHospital.addPacient(pac4);
		
		CentralHospital.deletePacient(pac4);
		CentralHospital.deleteDoctor(doc2);
		
		ChildHospital.addDoctor(doc3);
		ChildHospital.addPacient(pac5);
		
		pac1.addDoctor(doc1);
		pac1.addDoctor(doc4);
		pac2.addDoctor(doc3);
		pac3.addDoctor(doc4);
		pac6.addDoctor(doc4);
		pac6.deleteDoctor(doc4);
		doc1.addSub(pac5);
		doc1.unSub(pac5);
		
		System.out.println(CentralHospital + " всего врачей "+CentralHospital.getTotalDoctors());
		System.out.println(CentralHospital + " всего пациентов "+CentralHospital.getTotalPacients());
		System.out.println(ChildHospital + " всего врачей "+ChildHospital.getTotalDoctors());
		System.out.println(ChildHospital + " всего пациентов "+ChildHospital.getTotalPacients());
		System.out.println("На приём к " + doc1 + " : " +  "записан(о) : " + doc1.getTotalPacients() + " человек(а)");
		System.out.println("На приём к " + doc2 + " : " +  "записан(о) : " + doc2.getTotalPacients() + " человек(а)");
		System.out.println("На приём к " + doc3 + " : " +  "записан(о) : " + doc3.getTotalPacients() + " человек(а)");
		System.out.println("На приём к " + doc4 + " : " +  "записан(о) : " + doc4.getTotalPacients() + " человек(а)");
	}
}