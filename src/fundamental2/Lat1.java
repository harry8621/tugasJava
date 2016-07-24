package fundamental2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lat1 {
	public static void main (String [] args){
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		scan.nextLine();
		List<String> kumpulannama = new ArrayList<String>();
		for(int i = 0; i <n;i++){
			 System.out.println("Masukan Nama:");	
			 String nama = scan.nextLine();
			 kumpulannama.add (nama);
		
		}
		
		System.out.println("Hallo "+ kumpulannama.get(0));
		
				
	}

	
}
