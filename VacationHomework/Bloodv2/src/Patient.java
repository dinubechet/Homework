public class Patient {
    private String id;
    private int age;
    private BloodData bloodData;

    public Patient() {
        this.id = "0";
        this.bloodData = new BloodData();
    }

    public Patient(String id, int age, String bloodType, String rhFactor) {
        this.id = id;
        this.age = age;
        this.bloodData = new BloodData(bloodType, rhFactor);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BloodData getBloodData() {
        return bloodData;
    }

    public void setBloodData(BloodData bloodData) {
        this.bloodData = bloodData;
    }
}
