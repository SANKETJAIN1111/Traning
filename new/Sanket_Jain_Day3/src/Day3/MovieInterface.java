package Day3;

public interface MovieInterface {
	public String getMovieName();
	public String getProducedBy();
	public String getDirectedBy();
	public double getDuration();
	public int getYear() ;
	public String getCatagory();
	public String toString() ;
	public static String showDetails(Movie m) {
		return m.toString();
	}
	
        
}
