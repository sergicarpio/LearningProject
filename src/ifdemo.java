public class ifdemo {
    public static void main(String[] args) {
        int a,b,c;
        a= 2;
        b =3;

        if (a<b) System.out.println("a mes petit que b");
        // no mostrara res
        if (a==b) System.out.println("a es igual a b");

        System.out.println();

        c = a - b;
        System.out.println("c val -1");

        if (c>=0) System.out.println(" c es un numero no negatiu");
        if (c<0) System.out.println(" c es un numero negatiu");


    }
}
