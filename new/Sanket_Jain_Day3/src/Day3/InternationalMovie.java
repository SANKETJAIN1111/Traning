package Day3;

public class InternationalMovie extends Movie implements MovieInterface , InternationalMovieInterface{
	
	private String countryName;
	
	public String getCountryName() {
		return countryName;
	}
	public String getLanguage() {
		return Language;
	}
	private String Language;
	public InternationalMovie(String movieName, String producedBy, String directedBy, double duration, int year,
			String catagory, String countryName, String language) {
		super(movieName, producedBy, directedBy, duration, year, catagory);
		this.countryName = countryName;
		Language = language;
		// TODO Auto-generated constructor stub
	}
	public InternationalMovie(String movieName, String producedBy, String countryName, String language) {
		super(movieName, producedBy);
		this.countryName = countryName;
		Language = language;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return  " Movie Details : "+super.toString() +"InternationalMovie [countryName=" + countryName + ", Language=" + Language + ", toString()="
				+ "]";
	}
	@Override
	public String getSoundEffect() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setSoundEffect(String soundEffect) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getVisualEffect() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setVisualEffect(String visualEffect) {
		// TODO Auto-generated method stub
		
	}

	

}
