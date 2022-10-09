public class PingPong {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        String w = " ping";
        String r = "pong";
        for (int i = 1; i <= 30; i++) {
            System.out.print(i + ":");
            if (i % a == 0) {
                System.out.print(w);
                if(i%b==0){
                    System.out.print(r);
                }
            }
            System.out.print("\n");
        }
    }
}
