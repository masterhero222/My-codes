import java.util.Arrays;



public class figure implements shape {
	
	private static final int[] bSideWidthArray = null;

	boolean isRectangle = false;
	
	//I need user input for all 4 coordinates and 1 for the point
	//I need formula that checks if the coordinates forms rectangle
	//I need to draw the figure to the screen

	double aSideLenght = 0;
	 double bSideLenght = 0;
	 double cSideLenght = 0;
	 double dSideLenght = 0;
	
	  double area = 0;
	
	  int x1 = 0; //x-max
	  int x2 = 0; //x-max
	  
	  int x3 = 0; //x-min 
	  int x4 = 0; //x-min
	  
	  int y1 = 0; //y-max 
	  int y2 = 0; //y-max
	  
	  int y3 = 0; //y-min 
	  int y4 = 0; //y-min
	  
	   double pointX = 0;
	  double pointY = 0;
	  
	  int[] A = {2};
	  int[] B = {2};
	  int[] C = {2};
	  int[] D = {2};
	  int[] P = {(int) pointX,(int) pointY};
	  
	 
	  
	  int xBottomWidth[] = {x4, x3}; // first cordinate //bot !!!!!!!!
	  int xTopWidth[] = {x1, x2}; // whole line //top
	  
	  int yRightLenght[] = {y2, y3}; // 2 lines //right
	  int yLeftLenght[] = {y1, y4}; // 4 lines - rectangle //left
	  
	  double[] point = {pointY, pointX};
	 
	  
	  
	 // int Coordinates[] = {x1, x2, x3, x4, y1, y2, y3, y4};
	  //int pointCoordinates[] = {pointX, pointY};
	  
	  
	  
	 

	public figure(int[] xBottomWidth, int[] xTopWidth, int[] yRightLenght, int[] yLeftLenght) {
		super();
		this.xBottomWidth = xBottomWidth;
		this.xTopWidth = xTopWidth;
		this.yRightLenght = yRightLenght;
		this.yLeftLenght = yLeftLenght;
		
		
		
		
	}
	
	//I need to caluculata the space between the points to set the area or the paramether
	
	

	@Override
	public void area() {
		System.out.println(getArea());
	}
	
	 float area(int x1, int y1, int x2, int y2 , int x3, int y3, int x4, int y4 ) { 
		 
		 double rectangleArea = 0;
		 
		 double aSideLenght = 0;
		 double bSideLenght = 0;
		 double cSideLenght = 0;
		 double dSideLenght = 0;
		 
		 this.aSideLenght = aSideLenght;
		 this.bSideLenght = bSideLenght;
		 this.cSideLenght = cSideLenght;
		 this.dSideLenght = dSideLenght;
		 
		 this.x1 = x1; // Where do I used them as an input ?
		 this.x2 = x2; // 
		 this.x3 = x3; //
		 this.x4 = x4; //
		 
		 this.y1 = y1; //
		 this.y2 = y2; //
		 this.y3 = y3; //
		 this.y4 = y4; //
		 
		 x1 = Math.abs(x1);
		 x2 = Math.abs(x2);
		 x3 = Math.abs(x3);
		 x4 = Math.abs(x4);
		 
		 y1 = Math.abs(y1);
		 y2 = Math.abs(y2);
		 y3 = Math.abs(y3);
		 y4 = Math.abs(y4);
		 
		 //we have to converte to Math.abs(), becouse we dont want to receave negative values for our area
		/* double diferenceBetweenXa = Math.abs(x2-x1); // A side
		 double diferenceBetweenXb = Math.abs(x4-x3); // B side
		 double diferenceBetweenYc = Math.abs(y4-y2); // C side
		 double diferenceBetweenYd = Math.abs(y3-y1); // D side
		 */
		 
		 //A side - top side
		 //B side - bot side
		 //C side - right side
		 //D side - left side
		 
		 //widt - A
		 aSideLenght =  Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));	 	//we need to know the lenght of the side, so I am using the formula for 2 point lenght
		 bSideLenght =  Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
		 
		 setaSideLenght(aSideLenght);
		 setbSideLenght(bSideLenght);
		 
		 int[] aSideWidthArray = {x1, x2}; // we need to converte in order to pass it like a side
		 int[] bSideWidthtArray = {x4, x3};
		 
		 setxBottomWidth(bSideWidthArray);
		 setxTopWidth(aSideWidthArray);
		 
		 
		 //lenght - B
		 cSideLenght =  2 * ( Math.sqrt(Math.pow(x4 - x2, 2) + Math.pow(y4 - y2, 2)));
		 dSideLenght =  2 * ( Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2)));
		 
		 setcSideLenght(cSideLenght);
		 setdSideLenght(dSideLenght);
		 
		 int[] cSideArray = {y2, y3};
		 int[] dSideArray = {y1, y4};
		 
		 setyRightLenght(cSideArray);
		 setyLeftLenght(dSideArray);
		 
		 //we have setted the sides, now we can draw the figure!
		 
		// rectangleArea = ((aSideLenght + bSideLenght) * (cSideLenght + dSideLenght));
		 
		 rectangleArea = ((aSideLenght) * (cSideLenght));
		 
		 System.out.println("The Area of the figure is " + rectangleArea);
		 setArea(rectangleArea);
		 System.out.println(getArea());
		 return (float) getArea();
	 } 
	 
	

	@Override
	public void paramether() {
		
		 double paramether = 0;
		
		 double aSideLenght = 0;
		 double bSideLenght = 0;
		 double cSideLenght = 0;
		 double dSideLenght = 0;
		 
		 paramether = (aSideLenght + bSideLenght + cSideLenght + dSideLenght);
		 
		 this.aSideLenght = getaSideLenght();
		 this.bSideLenght = getbSideLenght();
		 this.cSideLenght = getcSideLenght();
		 this.dSideLenght = getdSideLenght();
		 
		System.out.println("The paramether is: " + paramether);

	}

	@Override
	public void drawFigure() {
		// This will display our rectangle on the screen
		double aSidelenght = 0;
		double cSideLenght = 0;
		
		aSideLenght = getaSideLenght();
		cSideLenght = getcSideLenght();
		
		for(int i = 1; i <= aSideLenght; i++)
		{
			for(int j = 1; j <= cSideLenght; j++)
			{
				System.out.print("* "); 
			}
			System.out.print("\n"); 
		}	

	}
	
	public boolean inside(double x, double y) {
		
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		int x3 = 0;
		int y3 = 0;
		int x4 = 0;
		int y4 = 0;
		
		this.x1 = x1; // Where do I used them as an input ?
		 this.x2 = x2; // 
		 this.x3 = x3; //
		 this.x4 = x4; //
		 
		 this.y1 = y1; //
		 this.y2 = y2; //
		 this.y3 = y3; //
		 this.y4 = y4; //
		
		this.pointX = x;
		this.pointY = y;
		double pointCoordinates[] = {x,y};
		this.point	= pointCoordinates;
		
		//we need to take the lenght of the side by ussing the formula
		
		
		//make the same formule for the coordinates as before
		int AP = (int) Math.sqrt(Math.pow(x - x4, 2) + Math.pow(y - y4, 2));
		int PB = (int) Math.sqrt(Math.pow(x - x3, 2) + Math.pow(y - y3, 2));
		int AB = (int) Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
		int PC = (int) Math.sqrt(Math.pow(x - x2, 2) + Math.pow(y - y2, 2));
		int BC = (int) Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
		int DC = (int) Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		int AD = (int) Math.sqrt(Math.pow(x4 - x1, 2) + Math.pow(y4 - y1, 2));
		int PD = (int) Math.sqrt(Math.pow(x - x4, 2) + Math.pow(y - y4, 2));
		
		
		
		
		
		
		if(AP+PB+AB+PC+BC+DC+AD+PD == getArea()) {
			return true;
		}else {
			
			return false;
		}
		
			
		
	}
	
	public boolean rectangle(boolean isRectangle) {
		
		//if the shape is rectangle we are going to return true
		//else we are going to return false
		
		//if isRectangle == true - System.out.println("The shape is rectangle")
		//else - System.out.println("The shape is not rectangle")
		
		if(inside(pointX, pointY) == true) {
			return true;
		}else {
			return false;
		}
			
		
		
		
	}

	public boolean isRectangle() {
		return isRectangle;
	}

	public void setRectangle(boolean isRectangle) {
		this.isRectangle = isRectangle;
	}

	public double getPointX() {
		return pointX;
	}

	public void setPointX(double pointX) {
		this.pointX = pointX;
	}

	public double getPointY() {
		return pointY;
	}

	public void setPointY(double pointY) {
		this.pointY = pointY;
	}

	public int[] getxBottomWidth() {
		return xBottomWidth;
	}

	public void setxBottomWidth(int[] xMax) {
		this.xBottomWidth = xMax;
	}

	public int[] getxTopWidth() {
		return xTopWidth;
	}

	public void setxTopWidth(int[] xMin) {
		this.xTopWidth = xMin;
	}

	public int[] getyRightLenght() {
		return yRightLenght;
	}

	public void setyRightLenght(int[] yMax) {
		this.yRightLenght = yMax;
	}

	public int[] getyLeftLenght() {
		return yLeftLenght;
	}

	public void setyLeftLenght(int[] yMin) {
		this.yLeftLenght = yMin;
	}


	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getaSideLenght() {
		return aSideLenght;
	}

	public void setaSideLenght(double aSideLenght) {
		this.aSideLenght = aSideLenght;
	}

	public double getbSideLenght() {
		return bSideLenght;
	}

	public void setbSideLenght(double bSideLenght) {
		this.bSideLenght = bSideLenght;
	}

	public double getcSideLenght() {
		return cSideLenght;
	}

	public void setcSideLenght(double cSideLenght) {
		this.cSideLenght = cSideLenght;
	}

	public double getdSideLenght() {
		return dSideLenght;
	}

	public void setdSideLenght(double dSideLenght) {
		this.dSideLenght = dSideLenght;
	}
	
	

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getX3() {
		return x3;
	}

	public void setX3(int x3) {
		this.x3 = x3;
	}

	public int getX4() {
		return x4;
	}

	public void setX4(int x4) {
		this.x4 = x4;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public int getY3() {
		return y3;
	}

	public void setY3(int y3) {
		this.y3 = y3;
	}

	public int getY4() {
		return y4;
	}

	public void setY4(int y4) {
		this.y4 = y4;
	}

	public double[] getPoint() {
		return point;
	}

	public void setPoint(double[] point) {
		this.point = point;
	}

	public static int[] getBsidewidtharray() {
		return bSideWidthArray;
	}

	@Override
	public String toString() {
		return "figure [isRectangle=" + isRectangle + ", aSideLenght=" + aSideLenght + ", bSideLenght=" + bSideLenght
				+ ", cSideLenght=" + cSideLenght + ", dSideLenght=" + dSideLenght + ", area=" + area + ", x1=" + x1
				+ ", x2=" + x2 + ", x3=" + x3 + ", x4=" + x4 + ", y1=" + y1 + ", y2=" + y2 + ", y3=" + y3 + ", y4=" + y4
				+ ", pointX=" + pointX + ", pointY=" + pointY + ", A=" + Arrays.toString(A) + ", B="
				+ Arrays.toString(B) + ", C=" + Arrays.toString(C) + ", D=" + Arrays.toString(D) + ", P="
				+ Arrays.toString(P) + ", xBottomWidth=" + Arrays.toString(xBottomWidth) + ", xTopWidth="
				+ Arrays.toString(xTopWidth) + ", yRightLenght=" + Arrays.toString(yRightLenght) + ", yLeftLenght="
				+ Arrays.toString(yLeftLenght) + ", point=" + Arrays.toString(point) + "]";
	}

		
	
	
	
	
	
	
	
	
	

}
