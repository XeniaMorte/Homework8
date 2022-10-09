public class Vasiliy {
    public static void main(String[] args) {
        int money=0;
        int sallary=15000;
        int i=0;
        for(;i<=108;i++ ){
            money=money+sallary;
            money=money/100*7+money;
            if (i%6==0) {
                System.out.println(" Месяц " + i + " " + money);

            }
        }
    }

}
