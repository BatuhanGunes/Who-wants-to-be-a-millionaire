import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String Cevap;
		int deger,dongu=0,secim,jokersecim,aramajokersecim;
		boolean durum=true;
		Random randomNum=new Random();
		String AramaJoker1,AramaJoker2,AramaJoker3;
		int Para[]={0,500,1000,2500,5000,7500,15000,25000,50000,10000,250000,500000,1000000};
		String Joker[]={"Seyirciye Sorma","0","Arama","0","Yarý Yarýya","0","Çift Cevap","0"};
		String Soru[][]=Sorular.Soru();
		
			
			System.out.println("Arama Jokeri için 3 isim giriniz: ");
			AramaJoker1=input.nextLine();
			AramaJoker2=input.nextLine();
			AramaJoker3=input.nextLine();

			System.out.println("Lütfen Cevaplarý büyük harfle yazýnýz.");
			
			while(durum){
				
				deger=randomNum.nextInt(Soru.length);
				
				Sor.Sor(Soru, deger);
				
				System.out.print("Cevap için 1\nJoker için 2\nÇekilmek için 3\nSeçiminiz: ");
				secim=input.nextInt();
				
				if(secim==1)
				{
					
					System.out.print("Cevabýnýz: ");
					Cevap=input.next();
					
					if(Cevap.equals(Soru[deger][5])){
						System.out.println("dogru cevap verdiniz.Tebrikler.");
						dongu++;
				}
				else{
					System.out.println("yanlýþ cevap verdiniz.");
					
					if(dongu>=0 && dongu<=2)
						dongu=0;
					else if(dongu>=3 && dongu<=6)
						dongu=2;
					else 
						dongu=6;
						
					durum=false;
					}
				}
				else if(secim==2){
					Secim.jokerYazdir(dongu, Joker);
					
					System.out.print("Hangi jokeri kullanmak istiyorsunuz:");
					jokersecim=input.nextInt();
					
					if(jokersecim==1 && Joker[1]=="0"){
						Joker[1]="1";
						
						Secim.SeyirciYazdir(Soru, deger);
						
						System.out.print("Cevabýnýz: ");
						Cevap=input.next();
						
						if(Cevap.equals(Soru[deger][5])){
							System.out.println("dogru cevap verdiniz.Tebrikler.");
							dongu++;
						}
						else{
							System.out.println("yanlýþ cevap verdiniz.");
							
							if(dongu>=0 && dongu<=2)
								dongu=0;
							else if(dongu>=3 && dongu<=6)
								dongu=2;
							else 
								dongu=6;
							
							durum=false;
						}
					}
					else if(jokersecim==2 && Joker[3]=="0"){
						Joker[3]="1";
						
						Secim.AramaYazdir(Soru, deger, AramaJoker1, AramaJoker2, AramaJoker3);
						
						System.out.print("Cevabýnýz: ");
						Cevap=input.next();
						
						if(Cevap.equals(Soru[deger][5])){
							System.out.println("dogru cevap verdiniz.Tebrikler.");
							dongu++;
						}
						else{
							System.out.println("yanlýþ cevap verdiniz.");
							if(dongu>=0 && dongu<=2)
								dongu=0;
							else if(dongu>=3 && dongu<=6)
								dongu=2;
							else 
								dongu=6;
							
							durum=false;
						}
						
					}
					else if(jokersecim==3 && Joker[5]=="0"){
						Joker[5]="1";
						
						Secim.YariYariyaYazdir(Soru, deger);
						
						System.out.print("Cevabýnýz: ");
						Cevap=input.next();
						
						if(Cevap.equals(Soru[deger][5])){
							System.out.println("dogru cevap verdiniz.Tebrikler.");
							dongu++;
						}
						else{
							System.out.println("yanlýþ cevap verdiniz.");
							if(dongu>=0 && dongu<=2)
								dongu=0;
							else if(dongu>=3 && dongu<=6)
								dongu=2;
							else 
								dongu=6;
							
							durum=false;
						}
							
					}
					else if(jokersecim==4 && Joker[7]=="0"){
						System.out.print("Cevabýnýz: ");
						Cevap=input.next();
						
						if(Cevap.equals(Soru[deger][5])){
							System.out.println("dogru cevap verdiniz.Tebrikler.");
							dongu++;
						}
						else{
							if(Cevap.equals("A")){
								
								Secim.xCevapYazdir(Cevap, Soru, deger);
								
								System.out.print("Cevabýnýz: ");
								Cevap=input.next();
								
								if(Cevap.equals(Soru[deger][5])){
									System.out.println("dogru cevap verdiniz.Tebrikler.");
									dongu++;
								}
								else{
									System.out.println("yanlýþ cevap verdiniz.");
									if(dongu>=0 && dongu<=2)
										dongu=0;
									else if(dongu>=3 && dongu<=6)
										dongu=2;
									else 
										dongu=6;
									
									durum=false;
								}
							}
							else if(Cevap.equals("B")){
								Secim.xCevapYazdir(Cevap, Soru, deger);

								System.out.print("Cevabýnýz: ");
								Cevap=input.next();
								
								if(Cevap.equals(Soru[deger][5])){
									System.out.println("dogru cevap verdiniz.Tebrikler.");
									dongu++;
								}
								else{
									System.out.println("yanlýþ cevap verdiniz.");
									if(dongu>=0 && dongu<=2)
										dongu=0;
									else if(dongu>=3 && dongu<=6)
										dongu=2;
									else 
										dongu=6;
									
									durum=false;
								}
							}
							else if(Cevap.equals("C")){
								Secim.xCevapYazdir(Cevap, Soru, deger);

								System.out.print("Cevabýnýz: ");
								Cevap=input.next();
								
								if(Cevap.equals(Soru[deger][5])){
									System.out.println("dogru cevap verdiniz.Tebrikler.");
									dongu++;
								}
								else{
									System.out.println("yanlýþ cevap verdiniz.");
									if(dongu>=0 && dongu<=2)
										dongu=0;
									else if(dongu>=3 && dongu<=6)
										dongu=2;
									else 
										dongu=6;
									
									durum=false;
								}
							}
							else if(Cevap.equals("D")){
								Secim.xCevapYazdir(Cevap, Soru, deger);

								System.out.print("Cevabýnýz: ");
								Cevap=input.next();
								
								if(Cevap.equals(Soru[deger][5])){
									System.out.println("dogru cevap verdiniz.Tebrikler.");
									dongu++;
								}
								else{
									System.out.println("yanlýþ cevap verdiniz.");
									if(dongu>=0 && dongu<=2)
										dongu=0;
									else if(dongu>=3 && dongu<=6)
										dongu=2;
									else 
										dongu=6;
									
									durum=false;
								}
							}
							else{
								System.out.println("hatalý tuþlama yaptýnýz.");
								dongu=0;
								durum=false;
							}	
						}
					}
					
					else{
						System.out.println("hatalý tuþlama yaptýnýz.");
						dongu=0;
						durum=false;
					}
				}						
				
				else if(secim==3){
					durum=false;
				}
				else {
					System.out.println("hatalý tuþlama yaptýnýz.");
					dongu=0;
					durum=false;
				}
			
				ParaYazdir.ParaYazdir(Para, durum, dongu);		
	}
			System.out.println("kazandýðýnýz para ödülü: "+Para[dongu]);
	

}}
