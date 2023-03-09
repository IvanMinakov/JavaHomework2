public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("a = b");
        int index = sb.indexOf("=");
        sb.deleteCharAt(index);
        sb.insert(index, "равно");
        System.out.println(sb.toString());
    }
}
