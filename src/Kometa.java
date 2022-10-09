public class Kometa {
    public static void main(String[] args) {
        int year=0;
        int yearMin=2022-200;
        int yearMax=2022+100;
        while (year<yearMax){

            if (year%79==0&&year>yearMin) {
                System.out.println(year);
            }
            year++;
        }
    }
}
