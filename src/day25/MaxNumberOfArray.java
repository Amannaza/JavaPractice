package day25;

public class MaxNumberOfArray {
    public static void main(String[] args) {

        int[] num = {1213442, 4643522, -123523, 112342579};
        int max = MaxNumber(num);
        System.out.println("max double = " + max);


        double[] numd = {1213442.82396d, 4643522623875d, -1235.253523, 1123.42523579};
        double maxd = MaxNumber(numd);
        System.out.println("max double = " + maxd);


        long[] numl = {12712987527313442l, 4648623652833522l, -1235232785238756723l, 11234258328368579l};
        long maxl = MaxNumber(numl);
        System.out.println("max long = " + maxl);


        short[] nums = {13442, 32522, -13523, 1579};
        int maxs = MaxNumber(nums);
        System.out.println("max short = " + maxs);


        float[] numf = {121.3442f, 46.43522f, -12.3523f, 1123.42579f};
        float maxf = MaxNumber(numf);
        System.out.println("max float = " + maxf);


        byte[] numb = {127, 34, -12, 99};
        byte maxb = MaxNumber(numb);
        System.out.println("max byte = " + maxb);





    }


//           1. create a method that can return the max number from an integer array

    public static int MaxNumber(int[] arr) {
        int res = arr[0];
        for (int each : arr) {
            if (each > res) {
                res = each;
            }
        }
        return res;
    }


    //          	2. create a method that can return the max number from double array
    public static double MaxNumber(double[] arr) {
        double res = arr[0];
        for (double each : arr) {
            if (each > res) {
                res = each;
            }
        }
        return res;
    }


    //          	3. create a method that can return the max number from long array
    public static long MaxNumber(long[] arr) {
        long res = arr[0];
        for (long each : arr) {
            if (each > res) {
                res = each;
            }
        }
        return res;
    }


    //          	4. create a method that can return the max number from short array
    public static short MaxNumber(short[] arr) {
        short res = arr[0];
        for (short each : arr) {
            if (each > res) {
                res = each;
            }
        }
        return res;
    }


    //          	5. create a method that can return the max number from float array
    public static float MaxNumber(float[] arr) {
        float res = arr[0];
        for (float each : arr) {
            if (each > res) {
                res = each;
            }
        }
        return res;
    }


    //          	6. create a method that can return the max number from byte array
    public static byte MaxNumber(byte[] arr) {
        byte res = arr[0];
        for (byte each : arr) {
            if (each > res) {
                res = each;
            }
        }
        return res;
    }


}