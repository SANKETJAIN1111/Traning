package Day3;

public interface InternationalMovieInterface extends MovieInterface,SpecialMovieInterface{
	public String getCountryName();
	public String getLanguage();
}
