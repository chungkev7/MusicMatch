package co.kc.MusicMatch.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class Artist {

	private Integer artist_id;
	private String artist_name;

	public Artist() {
		super();
	}

	public Artist(Integer artist_id, String artist_name) {
		super();
		this.artist_id = artist_id;
		this.artist_name = artist_name;
	}

	public Integer getArtist_id() {
		return artist_id;
	}

	public void setArtist_id(Integer artist_id) {
		this.artist_id = artist_id;
	}

	public String getArtist_name() {
		return artist_name;
	}

	public void setArtist_name(String artist_name) {
		this.artist_name = artist_name;
	}

	@Override
	public String toString() {
		return "Artist [artist_id=" + artist_id + ", artist_name=" + artist_name + "]";
	}

}
