public class TestBloodData {
    public static void main(String[] args) {
        BloodData bloodData1  = new BloodData();
        BloodData bloodData2 = new BloodData("A","-");
        displayInfo(bloodData1);
        displayInfo(bloodData2);
        bloodData1.setBloodType("AB");
        bloodData2.setRhFactor("-");
        displayInfo(bloodData1);
    }
    public static void displayInfo(BloodData bloodData){
        System.out.println("The blood is type "+ bloodData.getBloodType()+bloodData.getRhFactor());
    }
}
