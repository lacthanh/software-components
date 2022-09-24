package homework3.point;

public class TestMyLine {

	public static void main(String[] args) {
		
		MyPoint point1 = new MyPoint(1, 2);
        MyPoint point2 = new MyPoint(3, 4);

        MyLine line1 = new MyLine(point1, point2);
        System.out.println(line1);
        
        MyLine line2 = new MyLine(5, 6, 7, 8);
        System.out.println(line2);

        System.out.println(line1.getBegin());
        System.out.println(line1.getEnd());

        line2.setBegin(point2);
        line2.setEnd(point1);
        System.out.println(line2);

        System.out.println(line2.getBeginX());
        System.out.println(line2.getBeginY());
        System.out.println(line1.getEndX());
        System.out.println(line1.getEndY());

        line2.setBeginX(9);
        line2.setBeginY(10);
        line2.setEndX(11);
        line2.setEndY(12);
        System.out.println(line2);

        System.out.println(line1.getBeginXY()[0]);
        System.out.println(line1.getBeginXY()[1]);
        System.out.println(line2.getEndXY()[0]);
        System.out.println(line2.getEndXY()[1]);

        line1.setBeginXY(13, 14);
        line1.setEndXY(15, 16);
        System.out.println(line1);
        System.out.println(line1.getLength());
        System.out.println(line1.getGradient());		
	}

}
