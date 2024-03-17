package Tutorial22.exe5.exe51;

public class TestLine {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(10, 10);
        Line line = new Line(p1, p2);
        System.out.println(line);

        line.setBeginXY(5, 5);
        line.setEndXY(15, 15);
        System.out.println(line);
    }
}
