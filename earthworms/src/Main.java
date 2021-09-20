import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Earthworm worm1 = new Earthworm(1, 100, 100);
        Earthworm worm2 = new Earthworm(2, 100, 100);
        System.out.println(worm1.toString());
        System.out.println(worm2.toString());
        while (worm1.getLife() > 0 && worm2.getLife() > 0) {




            Random randomDeleteLife1 = new Random();
            int randDelete = randomDeleteLife1.nextInt(30);
            Random randomDeleteLife2 = new Random();
            int randDelete2 = randomDeleteLife1.nextInt(30);
;

            worm1.attack();
            worm2.setLife(worm2.getLife() - randDelete);
            System.out.println(worm2.toString() + "voys avez perdu " + randDelete + " pdv");

            worm2.attack();
            worm1.setLife(worm1.getLife() - randDelete2);
            System.out.println(worm1.toString() + "voys avez perdu " + randDelete2 + " pdv");

            if (worm1.getLife() < 0) {
                worm1.setLife(0);
                System.out.println(worm1.toString() + " vous venez de perdre " );
            }

            if (worm2.getLife() < 0) {
                worm2.setLife(0);
                System.out.println(worm2.toString() + " vous venez de perdre    ");
            }

        }
    }

}






