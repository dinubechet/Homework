public class Patient extends BloodData {
    private int id;
    private int age;
    private BloodData blood = new BloodData(getBloodType(), getRhesusFactor());

    public Patient() {
        this.id = 0;
        this.age = 0;
        blood.setBloodType("O");
        blood.setRhesusFactor('+');

    }

    public Patient(String bloodType, char rhesusFactor, int id, int age) {
        super.getBloodType();
        super.getRhesusFactor();
        this.id = id;
        this.age = age;
        this.blood = blood;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public BloodData getBlood() {
        return blood;
    }

    public void showInfo2() {
        System.out.println("The blood type for id  : " + getId() + " and the age of " + getAge() + " is ");
        System.out.println(getBloodType() + " and Rh " + getRhesusFactor());

    }
}
