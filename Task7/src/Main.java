public class Main {
    public static void main(String[] args) {
        // Задача 6
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append("=");
        }
        long startTime1 = System.nanoTime();
        sb.replace(sb.indexOf("="), sb.indexOf("=") + 1, "равно");
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;
        System.out.println("Time taken by StringBuilder replace method: " + duration1 + " nanoseconds");

        // Задача 7
        int iterations = 10000;
        String str4 = new String(new char[iterations]).replace("\0", "=");
        StringBuilder sb4 = new StringBuilder(str4);

        long startTime2 = System.nanoTime();
        str4 = str4.replace("=", "равно");
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;
        System.out.println("Time taken by String replace method: " + duration2 + " nanoseconds");

        long startTime3 = System.nanoTime();
        sb4 = sb4.replace(sb4.indexOf("="), sb4.indexOf("=") + 1, "равно");
        long endTime3 = System.nanoTime();
        long duration3 = endTime3 - startTime3;
        System.out.println("Time taken by StringBuilder replace method: " + duration3 + " nanoseconds");
    }
}
