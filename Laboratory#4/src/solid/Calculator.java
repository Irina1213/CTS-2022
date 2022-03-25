package solid;

public abstract interface Calculator {

	//private enum Operations{ADD, SUBSTRACT, MULTIPLY, DIVIDE};
	
	
	
//	public double calculate(double a, double b, int i) {
//		
//	   switch(i) {
//	   case 1:
//		   return a +b;
//		   //break;
//	   case 2:
//		   return a -b;
//		   default:
//			   return 0;
//	   }
//	}
	
	public abstract double Calculator(double a, double b);
}
