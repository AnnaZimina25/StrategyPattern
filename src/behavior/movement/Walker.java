package behavior.movement;

public class Walker implements MovementBehavior{
    @Override
    public void move() {
        System.out.println("Я хожу пешком!");
    }
}
