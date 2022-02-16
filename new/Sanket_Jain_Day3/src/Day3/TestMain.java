package Day3;


public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		System.out.println("=======================Q.1 Create Class Movie ==============\n");
		System.out.println("=======================All Details without Interface   ==============\n");
		System.out.println("=======================Q.1 Create Movie Object with 5 Parameters  ==============\n");
		Movie mv = new Movie("DHOOM", "YRF","Aditya Chopda", 2.30,2007,"Action");
		
		System.out.println(mv.toString());
		System.out.println("=======================Q.1 Create Movie Object with 2 Parameters  ==============\n");
		Movie mv1 = new Movie("DHOOM", "YRF");
		System.out.println(mv1.toString());
		
		System.out.println("=======================Q.1 Create International Movie Object with 7 Parameters  ==============\n");
		InternationalMovie im1 = new InternationalMovie("DHOOM", "YRF","Aditya Chopda", 2.30,2007,"Action","dolby","UTV");
		System.out.println(im1.toString());
		System.out.println("=======================Q.1 Create International Movie Object with 2 Parameters  ==============\n");
		InternationalMovie im2 = new InternationalMovie("DHOOM1", "YRF","dolby","UTV");
		System.out.println(im2.toString());
		System.out.println("=======================Q.1 Create Special Movie Object with 7 Parameters  ==============\n");
		SpecialMovie sm1 = new SpecialMovie("MI6", "Colambia","Hardward", 2.30,2017,"Action","US","English");
		System.out.println(sm1.toString());
		System.out.println("=======================Q.1 Create International Movie Object with 2 Parameters  ==============\n");
		SpecialMovie sm2 = new SpecialMovie("DHOOM", "YRF","India","Hindi");
		System.out.println(sm2.toString());
	
		
//		Movie.showDetails(mv);
//		Movie.showDetails(mv1);
//		Movie.showDetails(im1);
//		Movie.showDetails(im2);
//		Movie.showDetails(sm1);
//		Movie.showDetails(sm2);
		System.out.println("=======================Q.6 Create Interface  ==============\n");
		
	

		System.out.println("=======================All Details with Interface   ==============\n");
		MovieInterface mi = new Movie("DHOOM", "YRF");
		Movie.showDetails(mi);
		MovieInterface mi1 = new Movie("DHOOM3", "YRF","Siddharth Anand ", 2.30,2007,"Action");
		Movie.showDetails(mi1);
		InternationalMovieInterface ami =   new InternationalMovie("DHOOM1", "YRF","dolby","UTV");
		Movie.showDetails(ami);
		InternationalMovieInterface ami1 =   new InternationalMovie("DHOOM2", "YRF","Aditya Chopda", 2.30,2007,"Action","dolby","UTV");
		Movie.showDetails(ami1);
		SpecialMovieInterface smi = new SpecialMovie("DHOOM3", "YRF","India","Hindi");
		Movie.showDetails(smi);
		SpecialMovieInterface smi1 = new SpecialMovie("MI6", "Colambia","Hardward", 2.30,2017,"Action","US","English");
		Movie.showDetails(smi1);
	
		
		
		
	
		
		
	}
}
