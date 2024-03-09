public class Loops {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0){
            System.out.println(i--);
        }
        do {
            System.out.println(i++);
        } while (i <= 10);
        System.out.println(111111111);
        for (int i1 = 10; i1 > 0; i1--){
            System.out.println(i1);
        }
        for (int i1 = 0; i1 <= 100; i1++) {
            if (i1 == 5) continue;
            if (i1 > 10) break;
            System.out.println(i1);
        }
    }
}
