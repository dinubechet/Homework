public class MyCharacter {
    private String race;
    private int stamina;
    private int intellect;
    private String name;
    private String profession;

    public MyCharacter(String race, String profession, String name) {
        this.race = race;
        this.name = name;
        this.profession=profession;
        if (profession== "Warrior") {
            setStamina( + 50);
            setIntellect(+ 10);
        }else if (profession=="Mage"){
            setStamina( + 10);
            setIntellect(+ 50);
        }
        if (race=="Ork"){
            setStamina(this.stamina+15);
            setIntellect(this.intellect+5);
        }else if (race=="Human"){
            setStamina(this.stamina+5);
            setIntellect(this.intellect+15);
        }
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
       this.profession=profession;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
    this.race=race;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina=stamina;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect=intellect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void showAttributes(){
        System.out.print(getName() + " is a " + getRace() + " " + getProfession() + " with " + getStamina() + " Stamina and ");
        System.out.println(getIntellect() + " Intellect ");
    }
}
