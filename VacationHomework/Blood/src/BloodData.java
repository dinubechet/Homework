public class BloodData {
    private String bloodType;
    private char rhesusFactor;

    public BloodData() {
        this.bloodType ="O";
        this.rhesusFactor = '+';
    }

    public BloodData(String bloodType, char rhesusFactor) {
        this.bloodType = bloodType;
        this.rhesusFactor = rhesusFactor;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public char getRhesusFactor() {
        return rhesusFactor;
    }

    public void setRhesusFactor(char rhesusFactor) {
        this.rhesusFactor = rhesusFactor;
    }

    public void showInfo(){
        System.out.println("The blood type is " + getBloodType() + " and Rh " + getRhesusFactor());
    }


}
