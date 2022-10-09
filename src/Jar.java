public class Jar {
    public static void main(String[] args) {
        int sallary=29000;
        int money=0;
        for (int i=1;i<=12;i++){
            money=money+sallary;
            money=money+money/100;
            System.out.println( "Месяц "+i+" "+" сумма накоплений равна"+" " +money+" "+" рублей" );
        }
    }
}
