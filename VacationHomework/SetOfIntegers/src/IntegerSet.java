public class IntegerSet {

    boolean[] integerSet = new boolean[100];

    public IntegerSet() {

    }

    public boolean[] getIntegerset() {
        return this.integerSet;
    }

    public static IntegerSet union(IntegerSet firstSet, IntegerSet secondSet) {
        IntegerSet result = new IntegerSet();
        for (int i = 0; i < result.getIntegerset().length; i++) {
            result.integerSet[i] = firstSet.integerSet[i] || secondSet.integerSet[i];
        }
        return result;
    }

    public static IntegerSet intersection(IntegerSet firstSet, IntegerSet secondSet) {
        IntegerSet result = new IntegerSet();
        for (int i = 0; i < result.getIntegerset().length; i++) {
            result.integerSet[i] = firstSet.integerSet[i] && secondSet.integerSet[i];
        }
        return result;
    }

    public static IntegerSet difference(IntegerSet firstSet, IntegerSet secondSet) {
        IntegerSet result = new IntegerSet();
        for (int i = 0; i < result.getIntegerset().length; i++) {
            if (firstSet.integerSet[i] && firstSet.integerSet[i] != secondSet.integerSet[i]) {
                result.integerSet[i] = firstSet.integerSet[i];
            }
        }
        return result;
    }

    public void insertElement(int element) {
        if (element < this.integerSet.length || element >= 0) {
            this.integerSet[element - 1] = true;
        }
    }

    public void deleteElement(int element) {
        if (element < this.integerSet.length || element >= 0) {
            this.integerSet[element - 1] = false;
        }
    }

    public String toString() {
        String result = "Integer{";
        for (int i = 0; i < this.integerSet.length; i++) {
            if (this.integerSet[i]) {
                result = result + i + " ";
            }
        }
        result += "}";


        return result;
    }
}