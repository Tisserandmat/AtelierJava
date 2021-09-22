import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Earthworm worm1 = new Earthworm(1, 100, 100);
        Earthworm worm2 = new Earthworm(2, 100, 100);
        System.out.println(worm1.toString());
        System.out.println(worm2.toString());
        Random randomDeleteLife1 = new Random();
        Random randomDeleteLife2 = new Random();
        while (worm1.getLife() > 0 && worm2.getLife() > 0) {
            int randDelete = randomDeleteLife1.nextInt(30);
            int randDelete2 = randomDeleteLife1.nextInt(30);


            worm1.attack(worm2, randDelete);
            if (worm2.getLife() > 0) {
                worm2.attack(worm1, randDelete2);
            }
        }
    }

}