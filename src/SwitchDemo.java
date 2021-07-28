public class SwitchDemo {
    public static void main(String[] args) {
        int i;
        for (i=0; i<10; i++)
        {
            switch(i) {
                case 0:
                     System.out.println("i es 0");
                     break;
                case 1:
                    System.out.println("i es 1");
                    break;
                case 2:
                    System.out.println("i es 2");
                    break;
                case 3:
                    System.out.println("i es 3");
                    break;
                case 4:
                    System.out.println("i es  4");
                    break;

                default:
                    System.out.println("i es 5 o mes");
            }

        }
    }
}
