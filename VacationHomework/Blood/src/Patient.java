public class Patient  {
    private int id;
    private int age;
    private BloodData bloodData;

    public Patient() {
        this.id = 0;
        this.age = 0;
        this.bloodData = new BloodData("O",'+');

    }


    public Patient(BloodData bloodData, int id, int age) {
     setId(id);
     setAge(age);
     setBloodData(bloodData);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }
    public BloodData getBloodData() {
        return bloodData;
    }

    public void setBloodData(BloodData bloodData) {
        this.bloodData = bloodData;
    }


}
