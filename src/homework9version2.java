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
            System.out.println(" Задание 2 .2 ");
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
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.println(" Задание 2 .3 ");
        int money = 0;
        int sallary = 15000;
        int persent=7;
        int month=108;
        int i = 0;
        for (; i <= month; i++) {
            money = money + sallary;
            money = money / 100 * persent + money;
                System.out.println(" Месяц " + i + " " + money);

            }
        int Ycont=12_000_000;
        int money1=0;
        int sallery1=15000;
        int a=0;

        while (money1<=Ycont) {
            money1 = money1 + sallery1;
            money1 = money1 / 100 * 7 + money1;
            a++;
            if (a % 6 == 0)
            {
                System.out.println(" Месяц " + a + " " + money1);

            }
        }
        /// задание 2.4 про пятницу
        int friday=5;
        int allDay=31;
        for (int q=0;q<allDay;q++){
            if (q%friday==0&&q!=0){
                System.out.println("Сегодня пятница"+" "+ q+ "е число. Необходимо подготовить отчет.");
            }
    }
        ///// задание про форвайл 1.1-1.2
        int u=0;
        while ( u<10){
            u++;
            System.out.print(u+" ");

        }
        System.out.println("\n");
        for (  u=10;u>0;u-- ){
            System.out.print(i+" ");
        }
        ///задача 1/3 про население
         int allPeople=12_000_000;

        int born=17;
        int die=8;
        for (int f=0;f<=10;f++){
            allPeople= allPeople+ (allPeople *17/1000-allPeople*8/1000);
            System.out.println("Год"+" "+f+" "+" численность населения составляет " +" "+allPeople);
        }
    }
        }



