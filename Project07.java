public class Project012 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i==3) continue;
            System.out.format("%d\t%d\n", i, i*i);
            if (i==6) break;
        }
    }
}
