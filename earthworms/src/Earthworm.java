import java.util.Objects;
import java.util.Random;


public class Earthworm {
    private int life;
    private int pointAttack;
    private int id;

    private int attackRand;

    public Earthworm(int id, int life, int pointAttack) {
        this.id = id;
        this.life = life;
        this.pointAttack = pointAttack;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLife() {
        return life;
    }

    @Override
    public String toString() {
        return "Earthworm{" +
                "life=" + life +
                ", pointAttack=" + pointAttack +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Earthworm earthworm = (Earthworm) o;
        return life == earthworm.life && pointAttack == earthworm.pointAttack;
    }

    @Override
    public int hashCode() {
        return Objects.hash(life, pointAttack);
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getPointAttack() {
        return pointAttack;
    }

    public void setPointAttack(int pointAttack) {
        this.pointAttack = pointAttack;
    }

    public void attack(Earthworm worm, int attackRand) {
        worm.setLife(worm.getLife() - attackRand);

        if (worm.getLife() < 1) {
            this.pointAttack = this.pointAttack - 5;
            worm.setLife(0);
            System.out.println("le ver " + this.getId() + " a gagner le combat face au ver " + worm.getId());
            System.out.println(this.toString());

        } else {

            this.pointAttack = this.pointAttack - 5;
            System.out.println("votre adversaire le vers " + worm.getId() + " perd " + attackRand + "pdv  " + "il lui reste " + worm.getLife() + " pdv");
            System.out.println(" vous venez d'attaquer l'adversaire vous perdez 5 point d'attaque");
            System.out.println();
        }

    }

    public void attackToWorm(Earthworm worm, int attackRand, int i , int counter) {
        worm.setLife(worm.getLife() - attackRand);

        if (worm.getLife() < 1) {
            this.pointAttack = this.pointAttack - 5;
            worm.setLife(0);
            System.out.println("le ver " + this.getId() + " a gagner le combat face au ver " + worm.getId());
            System.out.println(this.toString());
            i = i - 1;
            int prct = 100 / this.getLife() * 2;
            this.setLife(this.getLife() + prct);
            System.out.println(" le ver " + this.getId() + " récupére 20% de ses points vie il a maintenant " + this.getLife() + " pdv ");

        } else {
            System.out.println("votre adversaire le vers " + worm.getId() + " perd " + attackRand + "pdv  " + "il lui reste " + worm.getLife() + " pdv");
            this.pointAttack = this.pointAttack - 5;
            System.out.println(" vous venez d'attaquer l'adversaire vous perdez 5 point d'attaque");
            System.out.println();
        }

    }
}
