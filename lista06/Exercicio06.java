/**
 * Exercicio06
 */
public class Exercicio06 {
    public static void main(String[] args) {
        int[] a = {1500, 5000, 8900, 3450};
        int[] b = {1850, 3215, 1200, 2900};
        int[] c = justMax(a, b);
        System.out.print("[");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + (i < c.length - 1 ? ", " : ""));   
        }
        System.out.print("]\n");
    }

    public static int[] justMax(int[] a, int[]b){
        int[] c = new int[a.length]; 
        for (int i = 0; i < b.length; i++) {
            if (a[i] > b[i]) {
                c[i] = a[i];
            }else{
                c[i] = b[i];
            }
        }
        return c;
    }
}
