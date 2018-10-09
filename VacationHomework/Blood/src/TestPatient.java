public class TestPatient {
    public static void main(String[] args) {
        Patient patient1 = new Patient();
        Patient patient2 = new Patient(getBloodData(bloodData), 231, 21);

        System.out.println("Patient ID :  " + patient1.getId());
        System.out.println("patient age : " + patient1.getAge());
        System.out.println("Blood type : " + patient1.getBloodData());


        System.out.println("Patient ID :  " + patient2.getId());
        System.out.println("patient age : " + patient2.getAge());
        System.out.println("Blood type : " + patient2.getBloodType());
        System.out.println("Rhesus factor : " + patient2.getRhesusFactor());
    }

}
