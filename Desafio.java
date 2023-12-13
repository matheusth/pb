public class Desafio {
    public static void main(String[] args) {
        final int max = 10;
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max - i; j++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }
            System.out.println("\\");
        }
    }
}
