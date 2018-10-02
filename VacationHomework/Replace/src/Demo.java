public class Demo {
    public static void main(String[] args) {

        ReplaceChar newString = new ReplaceChar();
        String str1 = newString.replaceChar("Jora", 'o', 'a');
        System.out.println(str1);

        ReplaceChar secondString = new ReplaceChar();
        String str2 = secondString.replaceCharFromIndex("OCA Java course for ultimate beginners", 'e', 'E', 20);
        System.out.println(str2);

        ReplaceChar thirdString = new ReplaceChar();
        String str3 = thirdString.replaceCharTimes("OCA Java course for ultimate beginners", 'e', 'E', 2);
        System.out.println(str3);
    }
}
