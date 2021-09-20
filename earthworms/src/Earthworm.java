import java.util.Objects;

public class Earthworm {
    private int life ;
    private int pointAttack ;

    public Earthworm(int life, int pointAttack) {
        this.life = life;
        this.pointAttack = pointAttack;
    }

    public int getLife() {
        return life;
    }

    @Override
    public String toString() {
        return "Earthworm{" +
                "life=" + life +
                ", pointAttack=" + pointAttack +
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
}
