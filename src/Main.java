public class Main {

    static boolean bool = true;
    static int a = 1;

    public static void main(String[] args){

        if(a == 3){
            System.out.println("a = 3");
        }else if(a<3){
            System.out.println("a<3");
        }else if (a>3){
            System.out.println("a>3");
        }

        switch (5){
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
        }

    }
}
