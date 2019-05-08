
public class ParaYazdir {
	public static void ParaYazdir(int Para[],boolean durum,int dongu){
		for(int i=Para.length-1;i>=0;i--){
			if(i==dongu)
				System.out.println(Para[i]+" ***");
			else
				System.out.println(Para[i]);
			
			if(dongu==12){
				durum=false;
			}
			
		}
		
	}
}
