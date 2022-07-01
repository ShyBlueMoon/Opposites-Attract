import java.util.Scanner;

/*
Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each.
If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.

Write a function that will take the number of petals of each flower
and return true if they are in love and false if they aren't.
*/

public class Principal {

    public static Boolean inLoveOrNot(int flower1, int flower2) {
        boolean inLove = false;
        if (flower1 % 2 == 0 && flower2 % 2 != 0) {
            inLove = true;

        } else if (flower1 % 2 != 0 && (flower2 % 2) == 0) {
            inLove = true;

        } else {
            inLove = false;
        }

        return inLove;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Timmy, how many petals does your flower have?");
        int timmyFlower = scanner.nextInt();
        System.out.println("Sarah, how many petals does your flower have?");
        int sarahFlower = scanner.nextInt();

        System.out.println("Are you in love with each other? Answer is...");
        System.out.println(inLoveOrNot(timmyFlower,sarahFlower));

    }



}
