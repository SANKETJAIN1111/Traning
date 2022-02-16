package Day3;

public class Movie implements MovieInterface{

	
    private String movieID;
	private String movieName;
	private String producedBy;
	private String directedBy;
	private double duration;
	private int year;
	private String catagory;
	static int movieCount;
	{
		movieCount++;
	}
	public Movie(String movieName, String producedBy) {
		
		this.movieName = movieName;
		this.producedBy = producedBy;
	}
	public Movie(String movieName, String producedBy, String directedBy, double duration, int year, String catagory) {
		
		this.movieName = movieName;
		this.producedBy = producedBy;
		this.directedBy = directedBy;
		this.duration = duration;
		this.year = year;
		this.catagory = catagory;
		
	}
	public String getMovieName() {
		return movieName;
	}
	public String getProducedBy() {
		return producedBy;
	}
	public String getDirectedBy() {
		return directedBy;
	}
	public double getDuration() {
		return duration;
	}
	public int getYear() {
		return year;
	}
	public String getCatagory() {
		return catagory;
	}
	public static int getMovieCount() {
		return movieCount;
	}
	final public String getMovieID() {
		return movieName+"_"+movieCount;
	}
	
	@Override
	public String toString() {
		
		return "Movie [movieName=" + movieName + ", producedBy=" + producedBy + ", directedBy=" + directedBy
				+ ", duration=" + duration + " hours , year=" + year + ", catagory=" + catagory + " Total Movie Count : "+movieCount+" MovieId : "+getMovieID()+" ]";
	}
	public static void showDetails(Movie m) {
		System.out.println(m.toString()+"\n");
		 
	}
	public static void showDetails(MovieInterface m) {
		System.out.println(m.toString()+"\n");
	}
}
