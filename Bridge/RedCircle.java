package Bridge;

public class RedCircle extends DrawApi{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius  + " x: " + x + ", " + y + "]");
    }

    }

