public class Poem {
    private String poemName;
    private int numberOfLines;

    public Poem(String name, int numberOfLines) {
        this.poemName = name;
        this.numberOfLines = numberOfLines;
    }

    public String getName() {
        return poemName;
    }

    public int getNumberOfLines() {
        return numberOfLines;
    }
}
