import java.util.Scanner;
public class nhapsoco2chuaso {
	public static void main(String args[]) {
		String ln = "return";
		while (ln == "return") {
			String[]  docso = new String[10] ;
			docso[0] ="không";
			docso[1] ="một";
			docso[2] ="hai";
			docso[3] ="ba";
			docso[4] ="bốn";
			docso[5] ="năm";
			docso[6] ="sáu";
			docso[7] ="bảy";
			docso[8] ="tám";
			docso[9] ="chín"; 
			Scanner bien = new Scanner(System.in);
			System.out.println("Nhập 1 số từ 1-9999");
			int n = bien.nextInt();
			int x = n/1000;
			int y = (n-x*1000)/100;
			int z = (n-x*1000-y*100)/10;
			int k = (n-x*1000-y*100-z*10);
			if (n < 1 || n > 9999) {
				System.out.println("số cần nhập phải từ 1-9999");
			}
			else
			{
				System.out.println("số vừa nhập là:");
				if(n<10) {
					System.out.println( docso[k]);	
				}
				else {
					if(n<100) {
						if(z==1 && k==0) {
							System.out.println("mười" );	 
						}
						else if(z>1 && k==1) {
							System.out.println( docso[z] +" "+"mươi mốt" );	
						}
						else if(z==1) {
							System.out.println("mười" +" "+ docso[k]);
						}	
						else if(k==0) {
							System.out.println( docso[z] +" "+"mươi" );
						}
						else { 
							System.out.println( docso[z] +" "+"mươi" +" "+ docso[k]);
						}
					}
					else
					{
						if(n<1000)
						{

							if(z==0 && k==0) {
								System.out.println( docso[y] +" "+"trăm");
							}

							else if(z==1 && k==0) {
								System.out.println( docso[y] +" "+"trăm mười");
							}

							else if(z==1 && k==1) {
								System.out.println( docso[y] +" "+"trăm mười một");
							}
							else if(z==1 && k>0) {
								System.out.println( docso[y] +" "+"trăm" + " " + docso[z]+" "+"mười" +" "+ docso[k] );
							}

							else if(z>1 && k==0) {
								System.out.println( docso[y] +" "+"trăm" + " " + docso[z]+" "+"mươi");
							}
							else if(z==0) {
								System.out.println( docso[y] +" "+"trăm linh" + " " + docso[k] );
							}
							else if(z>0 && k==1) {
								System.out.println( docso[y] +" "+"trăm" + " " + docso[z]+" "+"mươi mốt" );
							}
							else 
							{
								System.out.println( docso[y] + " " + "trăm" + " " +  docso[z] + " " + "mươi" + " " +  docso[k] );
							}
						}
						else {
							if(y==0 && z==0 && k==0) {
								System.out.println( docso[x] +" "+"nghìn");
							}
							else if(z==1 && k==0) {
								System.out.println( docso[x] +" "+"nghìn" + " " +docso[y] +" "+"trăm mười");
							}
							else if(z==1 && k>0) {
								System.out.println( docso[x] +" "+"nghìn" + " " +docso[y] +" "+"trăm mười" +" "+ docso[k] );
							}
							else if(z==0)
							{
								System.out.println( docso[x] +" "+"nghìn" +" "+ docso[y] + " " + "trăm"
									+ " " +"linh" + " " +  docso[k] );	
							}
							else if(z>0 && k==1)
							{
								System.out.println( docso[x] +" "+"nghìn" +" "+ docso[y] + " " + "trăm"
									+" "	+  docso[z]	+ " " +"mươi mốt" );	
							}
							else if(k==0)
							{
								System.out.println( docso[x] +" "+"nghìn" +" "+ docso[y] + " " + "trăm"
									+ " " +  docso[z] + " " + "mươi" );
							}

							else {
								System.out.println( docso[x] +" "+"nghìn" +" "+ docso[y] + " " + "trăm"
									+ " " +  docso[z] + " " + "mươi" + " " +  docso[k] );
							}

						}

					}

				}

			}
			Scanner lenh = new Scanner(System.in);
			System.out.println("		");
			System.out.println("Nhấn phím bất kì để lặp lại nhấn phím S để dừng chương trình  ");
			ln = lenh.nextLine();
			if (ln.equalsIgnoreCase("S") || ln.equalsIgnoreCase("Stop")) {
				ln = "Stop";
			} else {
				ln = "return";
			}
		}
	}
}