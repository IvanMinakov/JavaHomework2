public class Task1 {
    public static void main(String[] args) {
        String str1 = "abcdefg";
        String str2 = "cde";
        boolean found = true;

        for (int i = 0; i < str2.length(); i++) {
            if (str1.indexOf(str2.charAt(i)) == -1) {
                found = false;
                break;
            }
        }

        if (found) {
            System.out.println("Строка \"" + str1 + "\" содержит все символы строки \"" + str2 + "\"");
        } else {
            System.out.println("Строка \"" + str1 + "\" не содержит все символы строки \"" + str2 + "\"");
        }
    }
}
