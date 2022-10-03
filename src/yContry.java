public class yContry {
    public static void main(String[] args) {
        int Ycont=12_000_000;
        int born=17;
        int die=8;
        int i=0;

        while (i<10){
            Ycont = Ycont+(Ycont/1000 *17-Ycont/1000*8);
            i++;

        }
        System.out.println(" Год"+ " "+i+" "+ "составит"+" "+Ycont);

    }
}
