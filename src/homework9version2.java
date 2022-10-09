public class homework9version2 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }

        /// Комета

        {
            System.out.println(" Комета");
            int year = 0;
            int yearMin = 2022 - 200;
            int yearMax = 2022 + 100;
            while (year < yearMax) {

                if (year % 79 == 0 && year > yearMin) {
                    System.out.println(year);
                }
                year++;
            }
        }
        System.out.println(" куб");
        int k=2;
        for (int i=0; i<10;i++){
            System.out.println(k);
            k = k * k;
        }
        {
            System.out.println(" банка");
            int sallary=15000;
            int money=0;
            int max=2459000;
            int i=1;
            while (money<=max){
                money=money+sallary;
                System.out.println( "Месяц "+i+" "+" сумма накоплений равна"+" " +money+" "+" рублей" );
                i++;
            }
        }
        {
            System.out.println(" форвайл");
            int i=0;
            while ( i<10){
                i++;
                System.out.print(i+" ");

            }
            System.out.println("\n");
            for (  i=10;i>0;i-- ){
                System.out.print(i+" ");
            }
        }
        {
            System.out.println(" василий");
            int money = 0;
            int sallary = 15000;
            int i = 0;
            for (; i <= 108; i++) {
                money = money + sallary;
                money = money / 100 * 7 + money;
                if (i % 6 == 0) {
                    System.out.println(" Месяц " + i + " " + money);

                }
            }
        }
        { System.out.println(" таблица умножения ");
                int a = 2;
                for (int i = 1; i <= 10; i++) {
                    System.out.print(a + " " + " *" + i + " " + "=" + " " + (a * i));
                    System.out.println("\n");
                }
        }
        { System.out.println(" ПингПонг ");
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
}
