public class Whileloops
{

    int a = 5;
    int b = 2; 
    int c = 1; 
    int d = -8;

    public static void main(String[] args) { 
        int i = 0;
        while (i < 15) {
            System.out.println("i is  " + i + " but less than 15");
            i += 1;
        }
        int k = 10;
        while (k > 5) {
            System.out.println ("k is greater than 5");
            k = k - 1;
        }
        int a = 5;
        int b = 2; 
        while (a < 10 && b <= 20) {
            System.out.println ("abc");
            a++;
            b++;
        }

    }   
}