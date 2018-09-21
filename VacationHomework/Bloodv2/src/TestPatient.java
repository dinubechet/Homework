public class TestPatient {
    public static void main(String[] args) {
        Patient patient1 = new Patient();
        Patient patient2 = new Patient("1234",32,"B","+");
        BloodData bloodData2 = new BloodData("A","-");
        displayInfo(patient1);
        displayInfo(patient2);
        patient1.setId("7895");
        patient1.setAge(22);
        BloodData bloodData = new BloodData("B","+");
        patient1.setBloodData(bloodData);
        displayInfo(patient1);
    }
    public static void displayInfo(Patient patient){
        BloodData bt = patient.getBloodData();
        System.out.print("Patient nr " + patient.getId()+ " with the age of "+ patient.getAge());
        System.out.println(" has the blood type "+ bt.getBloodType()+ bt.getRhFactor());
    }
}
