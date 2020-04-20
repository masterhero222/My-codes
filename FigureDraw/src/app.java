import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter x1 and y1\n");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.println("Enter x2 and y2\n");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		System.out.println("Enter x3 and y3");
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		System.out.println("Enter x4 and y4");
		int x4 = sc.nextInt();
		int y4 = sc.nextInt();
		System.out.println("Enter the point x and y coordinates");
		double x = sc.nextInt();
		double y = sc.nextInt();
		
		int[] xBottomWidth = {x4, x3};
		int[] xTopWidth = {x1, x2};
		int[] yRightLenght = {y2,y3};
		int[] yLeftLenght = {y1, y4};
		
		figure figure1 = new figure(yLeftLenght, yRightLenght, xTopWidth, xBottomWidth);
		
		figure1.area(x1, y1, x2, y2, x3, y3, x4, y4);
		figure1.area();
		figure1.paramether();
		
		System.out.println(figure1.getaSideLenght());
		System.out.println(figure1.getbSideLenght());
		System.out.println(figure1.getcSideLenght());
		System.out.println(figure1.getdSideLenght());
		
		System.out.println("\n");
		figure1.drawFigure();
		System.out.println("\n");
		
		
		
		if(figure1.inside(x,y)) {
			System.out.print("Inside");
		}else {
			System.out.print("Outside");
		}
	}

	
}
