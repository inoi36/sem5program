public class pr2 {
    public static void main (String[] args){

        int a=5;
        int factorial = 1;
        int i;

        for(i=a; i>0; i--)
        {
            factorial=factorial*i;
        }

        System.out.println("Factorial is ="+ factorial);

    }
}
