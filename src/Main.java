import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        firstTask();
//        int[] weights = {90, 92, 95, 98, 88, 96, 97, 93, 0, 0, 0, 0};
//        weights[0] = 90;
//        int januaryWeight = weights[0];
//        System.out.println(januaryWeight);
//        System.out.println(weights[0]);
//        System.out.println(weights[4]);
//        int january = 0;
//        System.out.println(weights[january]);
//        for (int i = 0; i < weights.length; i++) {
//            System.out.println(weights[i]);
//        }
    }

    public static void firstTask() {
        System.out.println("Task 1.1");
        int[] nifNif;
        nifNif = new int[3];
        nifNif[0] = 1;
        nifNif[1] = 2;
        nifNif[2] = 3;
        System.out.println(nifNif[2]);

        System.out.println("Task 1.2");
        float[] nafNaf = new float[]{1.57f, 7.654f, 9.986f};
        System.out.println(nafNaf[2]);

        System.out.println("Task 1.3");
        float[] nufNuf = new float[]{23.02f, 17.03f, 11.06f, 22.06f, 7.08f, 24.09f, 25.12f};
        System.out.println("День варенья Нуф-Нуфа " + nufNuf[0] + " числа");

        System.out.println("Task 2");
        System.out.printf("%d, %d, %d\n", nifNif[0], nifNif[1], nifNif[2]);
        System.out.printf("%f, %f, %f\n", nafNaf[0], nafNaf[1], nafNaf[2]);
        System.out.printf("%f, %f, %f, %f, %f, %f, %f,\n", nufNuf[0], nufNuf[1], nufNuf[2], nufNuf[3], nufNuf[4], nufNuf[5], nufNuf[6]);

        System.out.println("Task 2 - remake");
        for (int i = 0; i < nifNif.length; i++) {
            System.out.print(nifNif[i]);
            if (i != nifNif.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < nafNaf.length; i++) {
            System.out.print(nafNaf[i]);
            if (i != nafNaf.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < nufNuf.length; i++) {
            System.out.print(nufNuf[i]);
            if (i != nufNuf.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Task 3");
        for (int i = nifNif.length - 1; i >= 0; i--) {
            System.out.print(nifNif[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = nafNaf.length - 1; i >= 0; i--) {
            System.out.print(nafNaf[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = nufNuf.length - 1; i >= 0; i--) {
            System.out.print(nufNuf[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Task 4");
        for (int i = 0; i < nifNif.length; i+=1) {
            if (nifNif[i] % 2 != 0) {
                nifNif[i] += 1;
            }
            if (i < nifNif.length + 1 && i > 0) {
                System.out.print(", ");
            }
            System.out.print(nifNif[i]);
        }
        System.out.println();

        System.out.println("Task 4 - remake");
        for (int i = 0; i < nifNif.length; i++) {
            if (nifNif[i] % 2 != 0) {
                nifNif[i] += 1;
            }
        }
        System.out.println(Arrays.toString(nifNif));
    }

}