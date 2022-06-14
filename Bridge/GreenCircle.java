package Bridge;

public class GreenCircle extends DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: GREEN, radius: " + radius + " x: " + x + ", " + y + "]");
    }
}

