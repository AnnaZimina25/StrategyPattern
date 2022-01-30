package behavior.movement;

public class Rider implements MovementBehavior{
    @Override
    public void move() {
        System.out.println("Я передвигаюсь на лошади");
    }
}
