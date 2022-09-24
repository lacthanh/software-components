package menu;

import java.util.Scanner;

public class Menu {

	public static Scanner input = new Scanner(System.in);
	public static String[] arrayTest = { "Test" };

	public static void main(String[] args) {
		int choose;
		for (;;) {
			System.out.println("_____Menu_____");
			System.out.println("1. lab1");
			System.out.println("2. lab2");
			System.out.println("3. homework1");
			System.out.println("4. homework2");
			System.out.println("5. homework3");
			System.out.println("6. homework4");
			System.out.println("7. homework5");
			System.out.println("8. homework6");
			System.out.println("0. exit");
			do {
				System.out.print("Enter your choose: ");
				choose = input.nextInt();
			} while ((choose < 0) || (choose > 8));
			switch (choose) {
			case 1:
				runLab1();
				break;
			case 2:
				runLab2();
				break;
			case 3:
				runHomework1();
				break;
			case 4:
				runHomework2();
				break;
			case 5:
				runHomework3();
				break;
			case 6:
				runHomework4();
				break;
			case 7:
				runHomework5();
				break;
			case 8:
				runHomework6();
				break;
			case 0:
				System.out.println("Goodbye!");
				System.exit(0);
				break;
			default:
				main(arrayTest);
			}
		}
	}

	public static void runLab1() {
		int choose;
		for (;;) {
			System.out.println("_____Menu_____");
			System.out.println("1. lab1.AverageWithInputValidation");
			System.out.println("2. lab1.CheckOddEven");
			System.out.println("3. lab1.CheckPassFail");
			System.out.println("4. lab1.CircleComputation");
			System.out.println("5. lab1.ComputePI");
			System.out.println("6. lab1.ExtractDigits");
			System.out.println("7. lab1.Fibonacci");
			System.out.println("8. lab1.HarmonicSum");
			System.out.println("9. lab1.InputValidation");
			System.out.println("10. lab1.PensionContributionCalculator");
			System.out.println("11. lab1.PensionContributionCalculatorWithSentinel");
			System.out.println("12. lab1.PrintDayInWord");
			System.out.println("13. lab1.PrintNumberInWord");
			System.out.println("14. lab1.ReverseInt");
			System.out.println("15. lab1.SumAverageRunningInt");
			System.out.println("16. lab1.SumProductMinMax3");
			System.out.println("0. back");
			do {
				System.out.print("Enter your choose: ");
				choose = input.nextInt();
			} while ((choose < 0) || (choose > 16));
			switch (choose) {
			case 1:
				lab1.AverageWithInputValidation.main(arrayTest);
				break;
			case 2:
				lab1.CheckOddEven.main(arrayTest);
				break;
			case 3:
				lab1.CheckPassFail.main(arrayTest);
				break;
			case 4:
				lab1.CircleComputation.main(arrayTest);
				break;
			case 5:
				lab1.ComputePI.main(arrayTest);
				break;
			case 6:
				lab1.ExtractDigits.main(arrayTest);
				break;
			case 7:
				lab1.Fibonacci.main(arrayTest);
				break;
			case 8:
				lab1.HarmonicSum.main(arrayTest);
				break;
			case 9:
				lab1.InputValidation.main(arrayTest);
				break;
			case 10:
				lab1.PensionContributionCalculator.main(arrayTest);
				break;
			case 11:
				lab1.PensionContributionCalculatorWithSentinel.main(arrayTest);
				break;
			case 12:
				lab1.PrintDayInWord.main(arrayTest);
				break;
			case 13:
				lab1.PrintNumberInWord.main(arrayTest);
				break;
			case 14:
				lab1.ReverseInt.main(arrayTest);
				break;
			case 15:
				lab1.SumAverageRunningInt.main(arrayTest);
				break;
			case 16:
				lab1.SumProductMinMax3.main(arrayTest);
				break;
			case 0:
				main(arrayTest);
			}
		}
	}

	public static void runLab2() {
		int choose;
		for (;;) {
			System.out.println("_____Menu_____");
			System.out.println("1. lab2.Dec2Hex");
			System.out.println("2. lab2.Exponent");
			System.out.println("3. lab2.GradesHistogram");
			System.out.println("4. lab2.GradesStatistic2_11");
			System.out.println("5. lab2.GradesStatistics");
			System.out.println("6. lab2.Hex2Bin");
			System.out.println("7. lab2.MagicSum");
			System.out.println("8. lab2.PrintArray");
			System.out.println("9. lab2.PrintArrayInStars");
			System.out.println("10. lab2.PrintArrayMethod");
			System.out.println("0. back");
			do {
				System.out.print("Enter your choose: ");
				choose = input.nextInt();
			} while ((choose < 0) || (choose > 10));
			switch (choose) {
			case 1:
				lab2.Dec2Hex.main(arrayTest);
				break;
			case 2:
				lab2.Exponent.main(arrayTest);
				break;
			case 3:
				lab2.GradesHistogram.main(arrayTest);
				break;
			case 4:
				lab2.GradesStatistic2_11.main(arrayTest);
				break;
			case 5:
				lab2.GradesStatistics.main(arrayTest);
				break;
			case 6:
				lab2.Hex2Bin.main(arrayTest);
				break;
			case 7:
				lab2.MagicSum.main(arrayTest);
				break;
			case 8:
				lab2.PrintArray.main(arrayTest);
				break;
			case 9:
				lab2.PrintArrayInStars.main(arrayTest);
				break;
			case 10:
				lab2.PrintArrayMethod.main(arrayTest);
				break;
			case 0:
				main(arrayTest);
			}
		}
	}

	public static void runHomework1() {
		int choose;
		for (;;) {
			System.out.println("_____Menu_____");
			System.out.println("1. homework1.Bin2Dec");
			System.out.println("2. homework1.BoxPattern");
			System.out.println("3. homework1.CeasarCode");
			System.out.println("4. homework1.CheckerPattern");
			System.out.println("5. homework1.CheckHexStr");
			System.out.println("6. homework1.CountVowelsDigits");
			System.out.println("7. homework1.DecipherCeasarCode");
			System.out.println("8. homework1.ExchangeCipher");
			System.out.println("9. homework1.Factorial");
			System.out.println("10. homework1.Hex2Dec");
			System.out.println("11. homework1.HillPattern");
			System.out.println("12. homework1.Oct2Dec");
			System.out.println("13. homework1.PhoneKeyPad");
			System.out.println("14. homework1.RadixN2Dec");
			System.out.println("15. homework1.ReverseString");
			System.out.println("16. homework1.SquarePattern");
			System.out.println("17. homework1.TestPalindromicPhrase");
			System.out.println("18. homework1.TimeTable");
			System.out.println("19. homework1.TriangularPattern");
			System.out.println("0. back");
			do {
				System.out.print("Enter your choose: ");
				choose = input.nextInt();
			} while ((choose < 0) || (choose > 19));
			switch (choose) {
			case 1:
				homework1.Bin2Dec.main(arrayTest);
				break;
			case 2:
				homework1.BoxPattern.main(arrayTest);
				break;
			case 3:
				homework1.CeasarCode.main(arrayTest);
				break;
			case 4:
				homework1.CheckerPattern.main(arrayTest);
				break;
			case 5:
				homework1.CheckHexStr.main(arrayTest);
				break;
			case 6:
				homework1.CountVowelsDigits.main(arrayTest);
				break;
			case 7:
				homework1.DecipherCaesarCode.main(arrayTest);
				break;
			case 8:
				homework1.ExchangeCipher.main(arrayTest);
				break;
			case 9:
				homework1.Factorial.main(arrayTest);
				break;
			case 10:
				homework1.Hex2Dec.main(arrayTest);
				break;
			case 11:
				homework1.HillPattern.main(arrayTest);
				break;
			case 12:
				homework1.Oct2Dec.main(arrayTest);
				break;
			case 13:
				homework1.PhoneKeyPad.main(arrayTest);
				break;
			case 14:
				homework1.RadixN2Dec.main(arrayTest);
				break;
			case 15:
				homework1.ReverseString.main(arrayTest);
				break;
			case 16:
				homework1.SquarePattern.main(arrayTest);
				break;
			case 17:
				homework1.TestPalindromicPhrase.main(arrayTest);
				break;
			case 18:
				homework1.TimeTable.main(arrayTest);
				break;
			case 19:
				homework1.TriangularPattern.main(arrayTest);
				break;
			case 0:
				main(arrayTest);
			}
		}
	}

	public static void runHomework2() {
		int choose;
		for (;;) {
			System.out.println("_____Menu_____");
			System.out.println("1. homework2.BubbleSort");
			System.out.println("2. homework2.DateUtil");
			System.out.println("3. homework2.Factorial");
			System.out.println("4. homework2.FactorialRecusive");
			System.out.println("5. homework2.FibonacciInt");
			System.out.println("6. homework2.FibonacciRecusive");
			System.out.println("7. homework2.GCD");
			System.out.println("8. homework2.GCDRecursive");
			System.out.println("9. homework2.InsertionSort");
			System.out.println("10. homework2.LengthOfARunningNumberSequenceRecursive");
			System.out.println("11. homework2.LinearSearch");
			System.out.println("12. homework2.Matrix");
			System.out.println("13. homework2.NumberConversion");
			System.out.println("14. homework2.NumberGuess");
			System.out.println("15. homework2.PerfectPrimeFactorList");
			System.out.println("16. homework2.PerfectAndDeficientNumbers");
			System.out.println("17. homework2.PrimeNumbers");
			System.out.println("18. homework2.RecursiveBinarySearch");
			System.out.println("19. homework2.SelectionSort");
			System.out.println("20. homework2.SpecialSeries");
			System.out.println("21. homework2.TribonacciIntHandlingOverflow");
			System.out.println("22. homework2.TrigonometricSeries");
			System.out.println("23. homework2.WordGuess");
			System.out.println("0. back");
			do {
				System.out.print("Enter your choose: ");
				choose = input.nextInt();
			} while ((choose < 0) || (choose > 23));
			switch (choose) {
			case 1:
				homework2.BubbleSort.main(arrayTest);
				break;
			case 2:
				homework2.DateUtil.main(arrayTest);
				break;
			case 3:
				homework2.Factorial.main(arrayTest);
				break;
			case 4:
				homework2.FactorialRecusive.main(arrayTest);
				break;
			case 5:
				homework2.FibonacciInt.main(arrayTest);
				break;
			case 6:
				homework2.FibonacciRecusive.main(arrayTest);
				break;
			case 7:
				homework2.GDC.main(arrayTest);
				break;
			case 8:
				homework2.GDCRecursive.main(arrayTest);
				break;
			case 9:
				homework2.InsertionSort.main(arrayTest);
				break;
			case 10:
				homework2.LengthOfARunningNumberSequenceRecursive.main(arrayTest);
				break;
			case 11:
				homework2.LinearSearch.main(arrayTest);
				break;
			case 12:
				homework2.Matrix.main(arrayTest);
				break;
			case 13:
				homework2.NumberConversion.main(arrayTest);
				break;
			case 14:
				homework2.NumberGuess.main(arrayTest);
				break;
			case 15:
				homework2.PefectPrimeFactorList.main(arrayTest);
				break;
			case 16:
				homework2.PerfectAndDeficientNumbers.main(arrayTest);
				break;
			case 17:
				homework2.PrimeNumbers.main(arrayTest);
				break;
			case 18:
				homework2.RecursiveBinarySearch.main(arrayTest);
				break;
			case 19:
				homework2.SelectionSort.main(arrayTest);
				break;
			case 20:
				homework2.SpecialSeries.main(arrayTest);
				break;
			case 21:
				homework2.TribonacciInt.main(arrayTest);
				break;
			case 22:
				homework2.TrigonometricSeries.main(arrayTest);
				break;
			case 23:
				homework2.WordGuess.main(arrayTest);
				break;
			case 0:
				main(arrayTest);
			}
		}
	}

	public static void runHomework3() {
		int choose;
		for (;;) {
			System.out.println("_____Menu_____");
			System.out.println("1. homework3.account.TestMain");
			System.out.println("2. homework3.advanced.TestAuthor");
			System.out.println("3. homework3.advanced.TestBook");
			System.out.println("4. homework3.ball.TestMain");
			System.out.println("5. homework3.circle1.TestCircle");
			System.out.println("6. homework3.circle2.TestMain");
			System.out.println("7. homework3.customer_and_account.TestMain");
			System.out.println("8. homework3.customer_and_invoice.TestMain");
			System.out.println("9. homework3.date.TestMain");
			System.out.println("10. homework3.employee.TestMain");
			System.out.println("11. homework3.introduction.TestAuthor");
			System.out.println("12. homework3.introduction.TestBook");
			System.out.println("13. homework3.invoice_item.TestMain");
			System.out.println("14. homework3.point.TestMyCircle");
			System.out.println("15. homework3.point.TestMyLine");
			System.out.println("16. homework3.point.TestMyPoint");
			System.out.println("17. homework3.point.TestMyRectangle");
			System.out.println("18. homework3.point.TestMyTriangle");
			System.out.println("19. homework3.rectangle.TestMain");
			System.out.println("20. homework3.time.TestMain");
			System.out.println("21. homework3.your_turn.TestMain");
			System.out.println("0. back");
			do {
				System.out.print("Enter your choose: ");
				choose = input.nextInt();
			} while ((choose < 0) || (choose > 21));
			switch (choose) {
			case 1:
				homework3.account.TestMain.main(arrayTest);
				break;
			case 2:
				homework3.advanced.TestAuthor.main(arrayTest);
				break;
			case 3:
				homework3.advanced.TestBook.main(arrayTest);
				break;
			case 4:
				homework3.ball.TestMain.main(arrayTest);
				break;
			case 5:
				homework3.circle1.TestCircle.main(arrayTest);
				break;
			case 6:
				homework3.circle2.TestMain.main(arrayTest);
				break;
			case 7:
				homework3.customer_and_account.TestMain.main(arrayTest);
				break;
			case 8:
				homework3.customer_and_invoice.TestMain.main(arrayTest);
				break;
			case 9:
				homework3.date.TestMain.main(arrayTest);
				break;
			case 10:
				homework3.employee.TestMain.main(arrayTest);
				break;
			case 11:
				homework3.introduction.TestAuthor.main(arrayTest);
				break;
			case 12:
				homework3.introduction.TestBook.main(arrayTest);
				break;
			case 13:
				homework3.invoice_item.TestMain.main(arrayTest);
				break;
			case 14:
				homework3.point.TestMyCircle.main(arrayTest);
				break;
			case 15:
				homework3.point.TestMyLine.main(arrayTest);
				break;
			case 16:
				homework3.point.TestMyPoint.main(arrayTest);
				break;
			case 17:
				homework3.point.TestMyRectangle.main(arrayTest);
				break;
			case 18:
				homework3.point.TestMyTriangle.main(arrayTest);
				break;
			case 19:
				homework3.rectangle.TestMain.main(arrayTest);
				break;
			case 20:
				homework3.time.TestMain.main(arrayTest);
				break;
			case 21:
				homework3.your_turn.TestMain.main(arrayTest);
				break;
			case 0:
				main(arrayTest);
			}
		}
	}
	
	public static void runHomework4() {
		int choose;
		for (;;) {
			System.out.println("_____Menu_____");
			System.out.println("1. homework4.ball_player.TestBall");
			System.out.println("2. homework4.bouncing_ball.TestBouncingBall");
			System.out.println("3. homework4.complex.TestMyComplex");
			System.out.println("4. homework4.date.TestMyDate");
			System.out.println("5. homework4.polynomial.TestMyPolynomial");
			System.out.println("6. homework4.time.TestMyTime");
			System.out.println("0. back");
			do {
				System.out.print("Enter your choose: ");
				choose = input.nextInt();
			} while ((choose < 0) || (choose > 6));
			switch (choose) {
			    case 1:
			    	homework4.ball_player.TestBall.main(arrayTest);
			    	break;
			    case 2:
			    	homework4.bouncing_ball.TestBouncingBall.main(arrayTest);
			    	break;
			    case 3:
			    	homework4.complex.TestMyComplex.main(arrayTest);
			    	break;
			    case 4:
			    	homework4.date.TestMyDate.main(arrayTest);
			    	break;
			    case 5:
			    	homework4.polynomial.TestMyPolynomial.main(arrayTest);
			    	break;
			    case 6:
			    	homework4.time.TestMyTime.main(arrayTest);
			    	break;
			    case 0:
			    	main(arrayTest);
			}
		}
	}
	
	public static void runHomework5() {
		int choose;
		for (;;) {
			System.out.println("_____Menu_____");
			System.out.println("1. homework5.animal.TestMain");
			System.out.println("2. homework5.circle_cylinder.TestCylinder");
			System.out.println("3. homework5.person.TestMain");
			System.out.println("4. homework5.point.TestMain");
			System.out.println("5. homework5.shape.TestMain");
			System.out.println("0. back");
			do {
				System.out.print("Enter your choose: ");
				choose = input.nextInt();
			} while ((choose < 0) || (choose > 5));
			switch (choose) {
			    case 1:
			    	homework5.animal.TestMain.main(arrayTest);
			    	break;
			    case 2:
			    	homework5.circle_cylinder.TestCylinder.main(arrayTest);
			    	break;
			    case 3:
			    	homework5.person.TestMain.main(arrayTest);
			    	break;
			    case 4:
			    	homework5.point.TestMain.main(arrayTest);
			    	break;
			    case 5:
			    	homework5.shape.TestMain.main(arrayTest);
			    	break;
			    case 0:
			    	main(arrayTest);
			}
		}
	}
	
	public static void runHomework6() {
		int choose;
		for (;;) {
			System.out.println("_____Menu_____");
			System.out.println("1. homework6.animal.TestAnimal");
			System.out.println("2. homework6.geometric_object.TestMain");
			System.out.println("3. homework6.movable.TestMovablePoint");
			System.out.println("4. homework6.resizable.TestResizableCircle");
			System.out.println("5. homework6.shape.TestMain");
			System.out.println("0. back");
			do {
				System.out.print("Enter your choose: ");
				choose = input.nextInt();
			} while ((choose < 0) || (choose > 5));
			switch (choose) {
			    case 1:
			    	homework6.animal.TestAnimal.main(arrayTest);
			    	break;
			    case 2:
			    	homework6.geometric_object.TestMain.main(arrayTest);
			    	break;
			    case 3:
			    	homework6.movable.TestMovablePoint.main(arrayTest);
			    	break;
			    case 4:
			    	homework6.resizable.TestResizableCircle.main(arrayTest);
			    	break;
			    case 5:
			    	homework6.shape.TestMain.main(arrayTest);
			    	break;
			    case 0:
			    	main(arrayTest);
			}
		}
	}
}
