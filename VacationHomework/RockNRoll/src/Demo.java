public class Demo {
    public static void main(String[] args) {
        Rock rock = new Rock(55,120);
        System.out.println(rock.getDescriptionOfTypeOfRock());

        IgneousRock igneousRock = new IgneousRock(22,25);
        System.out.println(igneousRock.getDescriptionOfTypeOfRock());

        SedimentaryRock sedimentaryRock = new SedimentaryRock(12,22);
        System.out.println(sedimentaryRock.getDescriptionOfTypeOfRock());

        MetamorphicRock metamorphicRock = new MetamorphicRock(99,56);
        System.out.println(metamorphicRock.getDescriptionOfTypeOfRock());
    }
}
