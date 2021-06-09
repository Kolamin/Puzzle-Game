import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Game extends JFrame{
    private ArrayList<Point> solution;
    private JPanel panel;
    private BufferedImage source;
    private BufferedImage resize;
    private int width, height;
    private final int DESIRED_WIDTH = 400;

    public Game(){
        initUI();
    }

    public void initUI(){
        solution = new ArrayList<>();
        solution.add(new Point(0, 0));
        solution.add(new Point(0, 1));
        solution.add(new Point(0, 2));
        solution.add(new Point(1, 0));
        solution.add(new Point(1, 1));
        solution.add(new Point(1, 2));
        solution.add(new Point(2, 0));
        solution.add(new Point(2, 1));
        solution.add(new Point(2, 2));
    }

}
