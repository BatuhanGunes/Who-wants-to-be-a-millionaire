import java.util.Scanner;
public class Secim {
public static void jokerYazdir(int dongu,String Joker[]){
	if(dongu<6){
		int a=1;
	for(int i=0;i<Joker.length-2;i=i+2){
		if(Joker[i+1]=="0"){
			System.out.println(a +": "+Joker[i]);
			a++;}
		else{
			System.out.println(a +": "+Joker[i]+" ***");
			a++;}
	}
	}
	else{
		int a=1;
		for(int i=0;i<Joker.length;i=i+2){
			
			if(Joker[i+1]=="0"){
				System.out.println(a +": "+Joker[i]);
				a++;}
			else{
				System.out.println(a +": "+Joker[i]+" ***");
				a++;}
		}
	}
}

public static void SeyirciYazdir(String Soru[][],int deger){
	if(Soru[deger][5].equals("A")){
		System.out.println("A) %80");
		System.out.println("B) %1");
		System.out.println("C) %14");
		System.out.println("D) %5");
	}
	else if(Soru[deger][5]=="B"){
		System.out.println("A) %8");
		System.out.println("B) %72");
		System.out.println("C) %7");
		System.out.println("D) %3");
	}
	else if(Soru[deger][5]=="C"){
		System.out.println("A) %8");
		System.out.println("B) %17");
		System.out.println("C) %62");
		System.out.println("D) %13");
	}
	else  {
		System.out.println("A) %9");
		System.out.println("B) %1");
		System.out.println("C) %13");
		System.out.println("D) %77");
	}
}

public static void AramaYazdir(String Soru[][],int deger,String AramaJoker1,String AramaJoker2,String AramaJoker3){
	int aramajokersecim;
	Scanner input=new Scanner(System.in);

	System.out.println("1- "+AramaJoker1);
	System.out.println("2- "+AramaJoker2);
	System.out.println("3- "+AramaJoker3);
	System.out.print("Seçiminiz:");
	aramajokersecim=input.nextInt();
	
	if(aramajokersecim==1){
		System.out.println(AramaJoker1+"'in cevabý "+Soru[deger][5]);
	}
	else if(aramajokersecim==2){
		System.out.println(AramaJoker2+"'in cevabý "+Soru[deger][5]);
	}
	else if(aramajokersecim==3){
		System.out.println(AramaJoker2+"'in cevabý "+Soru[deger][5]);
	}
	else{
		System.out.println("hatalý tuþlama yaptýnýz.");
		
	}
	
}
	
public static void YariYariyaYazdir(String Soru[][],int deger){
	if(Soru[deger][5]=="A"){
		System.out.println(Soru[deger][0]);
		System.out.println("A)"+Soru[deger][1]);
		System.out.println("B)");
		System.out.println("C)");
		System.out.println("D)"+Soru[deger][4]);
	}
	else if(Soru[deger][5]=="B"){
		System.out.println(Soru[deger][0]);
		System.out.println("A)");
		System.out.println("B)"+Soru[deger][2]);
		System.out.println("C)"+Soru[deger][3]);
		System.out.println("D)");
	}
	else if(Soru[deger][5]=="C"){
		System.out.println(Soru[deger][0]);
		System.out.println("A)");
		System.out.println("B)");
		System.out.println("C)"+Soru[deger][3]);
		System.out.println("D)"+Soru[deger][4]);
	}
	else{
		System.out.println(Soru[deger][0]);
		System.out.println("A)");
		System.out.println("B)"+Soru[deger][2]);
		System.out.println("C)");
		System.out.println("D)"+Soru[deger][4]);
	}
}

public static void xCevapYazdir(String Cevap,String Soru[][],int deger){
	if(Cevap.equals("A")){
		System.out.println(Soru[deger][0]);
		System.out.println("A)");
		System.out.println("B)"+Soru[deger][2]);
		System.out.println("C)"+Soru[deger][3]);
		System.out.println("D)"+Soru[deger][4]);
		System.out.println();
	}
	else if(Cevap.equals("B")){
		System.out.println(Soru[deger][0]);
		System.out.println("A)"+Soru[deger][1]);
		System.out.println("B)");
		System.out.println("C)"+Soru[deger][3]);
		System.out.println("D)"+Soru[deger][4]);
		System.out.println();
	}
	else if(Cevap.equals("C")){
		System.out.println(Soru[deger][0]);
		System.out.println("A)"+Soru[deger][1]);
		System.out.println("B)"+Soru[deger][2]);
		System.out.println("C)");
		System.out.println("D)"+Soru[deger][4]);
		System.out.println();
	}
	else if(Cevap.equals("D")){
		System.out.println(Soru[deger][0]);
		System.out.println("A)"+Soru[deger][1]);
		System.out.println("B)"+Soru[deger][2]);
		System.out.println("C)"+Soru[deger][3]);
		System.out.println("D)");
		System.out.println();
	}
}
}
