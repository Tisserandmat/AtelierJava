import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Earthworm worm1 = new Earthworm(1, 100, 100);
        Earthworm worm2 = new Earthworm(2, 100, 100);

        while (worm1.getLife() > 0 && worm2.getLife() > 0) {


            Random randomDeleteLife1 = new Random();
            Random randomDeleteLife2 = new Random();

            worm1.attack();
            worm2.setLife(worm2.getLife() - randomDeleteLife1.nextInt(30));
            System.out.println(worm1.toString());

            worm2.attack();
            worm1.setLife(worm1.getLife() - randomDeleteLife2.nextInt(30));
            System.out.println(worm2.toString());

            if (worm1.getLife() <= 0) {
                worm1.setLife(0);
                System.out.println(worm1.toString() + " vous venez de battre votre adversaire");
            }

            if (worm2.getLife() <= 0) {
                worm2.setLife(0);
                System.out.println(worm2.toString() + " vous venez de battre votre adversaire");
            }

        }
    }

}






