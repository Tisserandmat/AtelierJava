import java.util.Random;

public class Tournament {
    public static void main(String[] args) {

        Random intRandom = new Random();


        int hundredRand = intRandom.nextInt(100);
        int hundredRand1 = intRandom.nextInt(100);
        int hundredRand2 = intRandom.nextInt(100);
        int hundredRand3 = intRandom.nextInt(100);
        int hundredRand4 = intRandom.nextInt(100);
        int hundredRand5 = intRandom.nextInt(100);
        int hundredRand6 = intRandom.nextInt(100);
        int hundredRand7 = intRandom.nextInt(100);
        int hundredRand8 = intRandom.nextInt(100);
        int hundredRand9 = intRandom.nextInt(100);


        Earthworm worms = new Earthworm(0, hundredRand, hundredRand);
        Earthworm worms1 = new Earthworm(1, hundredRand1, hundredRand1);
        Earthworm worms2 = new Earthworm(2, hundredRand2, hundredRand2);
        Earthworm worms3 = new Earthworm(3, hundredRand3, hundredRand3);
        Earthworm worms4 = new Earthworm(4, hundredRand4, hundredRand4);
        Earthworm worms5 = new Earthworm(5, hundredRand5, hundredRand5);
        Earthworm worms6 = new Earthworm(6, hundredRand6, hundredRand6);
        Earthworm worms7 = new Earthworm(7, hundredRand7, hundredRand7);
        Earthworm worms8 = new Earthworm(8, hundredRand8, hundredRand8);
        Earthworm worms9 = new Earthworm(9, hundredRand9, hundredRand9);

        Earthworm[] team1 = new Earthworm[]{worms, worms1, worms2, worms3, worms4};
        Earthworm[] team2 = new Earthworm[]{worms5, worms6, worms7, worms8, worms9};

        int counterTeam1 = 0;
        int counterTeam2 = 0;

        for (int loop = 0; loop < 5; loop++) {
            int damagewt1 = intRandom.nextInt(30);
            int damagewt2 = intRandom.nextInt(30);
            for (int i = 0; i < team1.length; i++) {
                for (int j = 0; j < team2.length; j++)
                    while (team1[i].getLife() > 0 && team2[j].getLife() > 0) {

                        team1[i].attack(team2[j], damagewt1, i);
                        if (team2[j].getLife() > 0) {
                            team2[j].attack(team1[i], damagewt2, j);
                        }

                    }
            }

        }


    }


}



