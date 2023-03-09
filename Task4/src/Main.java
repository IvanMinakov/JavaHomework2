public class Main {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 56;
        StringBuilder sb = new StringBuilder();
        sb.append(num1).append(" + ").append(num2).append(" = ").append(num1 + num2).append("\n")
                .append(num1).append(" - ").append(num2).append(" = ").append(num1 - num2).append("\n")
                .append(num1).append(" * ").append(num2).append(" = ").append(num1 * num2);
        System.out.println(sb.toString());
    }
}
