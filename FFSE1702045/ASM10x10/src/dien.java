import java.util.Scanner;
public class dien {
	public static void main(String[] args) {
		System.out.println("Nhap 1 so");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(n);
		if(n<50) {
			System.out.println(n+"			1,549	 77460");
		}
		else if(n>50) {
			System.out.println("50			1,549	 77460");	
		}
		if(n>50 && n<100) {
			System.out.println(n-50+"			1,600	"+(n-50)*1600);	
		}
		else if(n>100) {
			System.out.println("50			1,600	 80000");	
		}

		if(n>100 && n<200) {
			System.out.println(n-100+"			1,858	"+(n-100)*1858);	
		}
		else if(n>200) {
			System.out.println("50			1,858	  92900");	
		}
		if(n>200 && n<300) {
			System.out.println(n-200+"			2,340	"+(n-200)*2340);	
		}
		else if(n>300) {
			System.out.println("50			2,340	  92900");	
		}
		if(n>300 && n<400) {
			System.out.println(n-300+"			2,615	"+(n-300)*2615);	
		}
		else if(n>300) {
			System.out.println("50			2,615	  130750");	
		}
		if(n>400) {
			System.out.println(n-400+"			2,701	"+(n-400)*2701);	
		}
	}
	}

