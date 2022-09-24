package homework5.point_line;

public class TestLineSub {

	public static void main(String[] args) {
        
		LineSub l1 = new LineSub(1, 2, 3, 4);
        System.out.println(l1);
        l1.setBegin(new Point(5, 6));
        l1.setEnd(new Point(7, 8));
        System.out.println(l1);
        System.out.println(l1.getBegin());
        System.out.println(l1.getEnd());
        
        LineSub l2 = new LineSub(new Point(9, 10), new Point(11, 12));
        System.out.println(l2);

        l1.setBeginX(13);
        l1.setBeginY(14);
        l1.setEndX(15);
        l1.setEndY(16);
        System.out.println(l1);
        System.out.println(l1);
        System.out.println(l1.getBeginX());
        System.out.println(l1.getBeginY());
        System.out.println(l1.getEndX());
        System.out.println(l1.getEndY());

        l1.setBeginXY(17, 18);
        l1.setEndXY(19, 20);
        System.out.println(l1);
        System.out.println(l1.getBeginXY()[0]);
        System.out.println(l1.getBeginXY()[1]);
        System.out.println(l1.getEndXY()[0]);
        System.out.println(l1.getEndXY()[1]);
        System.out.println(l1.getLength());
	}

}
