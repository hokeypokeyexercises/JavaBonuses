package src;

public class Bounuses {

    public static void main(String[] args) {


//        2) write a loop which will output all the prime
//        numbers (evenly divisible by only 1 and themselves)
//        between 10 and 10000 .

        prime();






    }

public static void prime(){

    int num = 10;
    while (num < 1000) {

        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number");
        }
    num += 1;
}

}







}
