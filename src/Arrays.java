
public class Arrays {
    public static void main(String[] args) {
        int[] vals = {1,2,56,78,4, 23};
        int power = 3;
        double[][] vals2 = new double[power][vals.length];
        for (int i = 0; i < vals2.length; i++) {
            for (int j = 0; j < vals.length; j++) {
                vals2[i][j] = Math.pow(vals[j], i+1);
            }
        }
        System.out.println(java.util.Arrays.toString(vals));

        for (double[] arr : vals2) {
            System.out.println(java.util.Arrays.toString(arr));
        }
    }
}
