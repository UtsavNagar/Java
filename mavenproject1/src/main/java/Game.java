import java.io.Serializable;

public class Game implements Serializable {
    private static final long serialVersionUID = 1L;
    private int x;
    private int y;

    public Game() {
        this.x = 0;
        this.y = 0;
    }

    public void move(int newX, int newY) {
        this.x += newX;
        this.y += newY;
    }

    public void show() {
        System.out.println("Game state: x = " + x + ", y = " + y);
    }
}
