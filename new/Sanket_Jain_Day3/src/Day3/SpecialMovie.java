package Day3;

public class SpecialMovie extends Movie implements MovieInterface, SpecialMovieInterface{
	
	private String soundEffect;
	private String visualEffect;
	public String getSoundEffect() {
		return soundEffect;
	}

	public void setSoundEffect(String soundEffect) {
		this.soundEffect = soundEffect;
	}

	public String getVisualEffect() {
		return visualEffect;
	}

	public void setVisualEffect(String visualEffect) {
		this.visualEffect = visualEffect;
	}
	public SpecialMovie(String movieName, String producedBy, String soundEffect, String visualEffect) {
		super(movieName, producedBy);
		this.soundEffect = soundEffect;
		this.visualEffect = visualEffect;
	}

	public SpecialMovie(String movieName, String producedBy, String directedBy, double duration, int year,
			String catagory,String soundEffect,String visualEffect) {
		super(movieName, producedBy, directedBy, duration, year, catagory);
		this.soundEffect = soundEffect;
		this.visualEffect = visualEffect;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Movie details : "+super.toString() +"SpecialMovie [soundEffect=" + soundEffect + ", visualEffect=" + visualEffect + ", toString()="
				+  "]";
	}


	


}
