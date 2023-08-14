package method;

import java.util.Scanner;

public class Method_Change_From_Height_to_feet {
	static Scanner sc = new Scanner(System.in);
	static int ff;
	static float fi; 
	static int sf;
	static float si;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f1 = inputdata();
		float f2 = inputdata2();
		float total_feets = add(f1,f2);
		
		display(total_feets);
		

	}
	public static float inputdata() {
		System.out.println("Enter first feet : ");
		 ff = sc.nextInt();
		System.out.println("Enter first inches : ");
		 fi = sc.nextFloat();
		 if(fi>=12) {
				ff++;
				fi -= 12;
			}
		float total_ft = converttoft();
		return total_ft;
		
		
	}
	public static float converttoft() {
		return ff + (fi/12);
	}
	public static float inputdata2() {
		System.out.println("Enter second feet : ");
		 sf = sc.nextInt();
		System.out.println("Enter second inches : ");
		 si = sc.nextFloat();
		 if(si>=12) {
				sf++;
				si -= 12;
			}
		float total_ft2 = converttoft2();
		return total_ft2;
		
	}
	public static float converttoft2() {
		return sf + (si/12);
	}
	public static float add (float f1,float f2) {
		return f1 + f2 ;
	}
	public static void display(float tft) {
		System.out.println("The final total feets is "+tft+"\'");
	}
	

}
