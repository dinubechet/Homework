public class Rock {
    private int numberOfSamples;
    private String descriptionOfTypeOfRock;
    private int weightOfRockInGrams;

    public Rock(int numberOfSamples, int weightOfRockInGrams) {
        this.numberOfSamples = numberOfSamples;
        this.weightOfRockInGrams = weightOfRockInGrams;
        this.descriptionOfTypeOfRock = "Unclassified";
    }

    public int getNumberOfSamples() {
        return numberOfSamples;
    }

    public void setNumberOfSamples(int numberOfSamples) {
        this.numberOfSamples = numberOfSamples;
    }

    public String getDescriptionOfTypeOfRock() {
        return descriptionOfTypeOfRock;
    }

    public void setDescriptionOfTypeOfRock(String descriptionOfTypeOfRock) {
        this.descriptionOfTypeOfRock = descriptionOfTypeOfRock;
    }

    public int getWeightOfRockInGrams() {
        return weightOfRockInGrams;
    }

    public void setWeightOfRockInGrams(int weightOfRockInGrams) {
        this.weightOfRockInGrams = weightOfRockInGrams;
    }
}
