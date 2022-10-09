public class Jar {
    public static void main(String[] args) {
        int sallary = 15000;
        int money = 0;
        int max = 2459000;
        int i = 1;
        while (money <= max) {
            money = money + sallary;
            System.out.println("Месяц " + i + " " + " сумма накоплений равна" + " " + money + " " + " рублей");
            i++;
        }
    }
}
