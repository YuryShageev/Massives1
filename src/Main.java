public class Main {
    public static void main(String[] args) {
        firstBlock();
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

    public static void firstBlock () {
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
    }
}