package hw14Abstraction;

public class TestInstitute {

	public static void main(String[] args) {
		
		ColumbiaUniversity columbiaUniversity = new ColumbiaUniversity();
		University university = new ColumbiaUniversity();
		MedicalSchool medicalSchool = new ColumbiaUniversity();
		
		columbiaUniversity.vocationalInfo();
		columbiaUniversity.classSize();
		columbiaUniversity.playGround();
		columbiaUniversity.teacher();
		columbiaUniversity.gymnasium();
		columbiaUniversity.commonRoom();
		columbiaUniversity.laboratory();
		columbiaUniversity.languageClub();
		columbiaUniversity.studyRoom();
		columbiaUniversity.emergencyRoom();
		columbiaUniversity.surgeryRoom();
		columbiaUniversity.cafeteria();
		columbiaUniversity.morgue();
		columbiaUniversity.anatomyLab();
		columbiaUniversity.biochemistryLab();
		columbiaUniversity.hygiene();
		columbiaUniversity.caring();
		columbiaUniversity.lawInfo();
		columbiaUniversity.maths();
		columbiaUniversity.aeronauticalInfo();
		columbiaUniversity.mechanicalLab();
		columbiaUniversity.computerLab();
		columbiaUniversity.anthropology();
		System.out.println("-----------------------------");
		university.classSize();
		university.playGround();
		university.teacher();
		university.gymnasium();
		university.commonRoom();
		university.laboratory();
		university.languageClub();
		university.studyRoom();
		university.emergencyRoom();
		university.surgeryRoom();
		university.cafeteria();
		university.morgue();
		System.out.println("-------------------------------");
		medicalSchool.anatomyLab();
		medicalSchool.biochemistryLab();
		medicalSchool.hygiene();
		medicalSchool.caring();
		medicalSchool.lawInfo();
		medicalSchool.maths();
		medicalSchool.aeronauticalInfo();
		medicalSchool.mechanicalLab();
		medicalSchool.computerLab();
		medicalSchool.anthropology();
		
		
		
		

	}

}
