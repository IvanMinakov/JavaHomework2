public class Main {
    public static void main(String[] args) {
        String str1 = "vfnjv";
        String str2 = "aqwe";

        boolean isRotation = false;

        if (str1.length() == str2.length()) {
            String concat = str1 + str1;
            if (concat.indexOf(str2) != -1) {
                isRotation = true;
            }
        }

        System.out.println("Являются ли строки вращением друг друга: " + isRotation);
    }
}