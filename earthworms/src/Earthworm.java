import java.util.Objects;

public class Earthworm {
    private int life ;
    private int pointAttack ;
    private int id;


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

    public void attack (){
        this.pointAttack = this.pointAttack - 15 ;
        System.out.println(" vous venez d'attaquer l'adversaire vous perdez 10 point d'attaque");
    }
}
