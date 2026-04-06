public class Assignments {
    public static void main(String[] args) {
        int num = 12;
        int n = 2;

        int bitStatus = (num >> n) & 1;

        System.out.println(n + " bit of " + num + " is Set(" + bitStatus + ")");
    }
}