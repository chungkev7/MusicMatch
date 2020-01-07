package co.kc.MusicMatch.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class Lyrics {

	private Integer lyrics_id;
	private String lyrics_body;

	public Lyrics() {
		super();
	}

	public Lyrics(Integer lyrics_id, String lyrics_body) {
		super();
		this.lyrics_id = lyrics_id;
		this.lyrics_body = lyrics_body;
	}

	public Integer getLyrics_id() {
		return lyrics_id;
	}

	public void setLyrics_id(Integer lyrics_id) {
		this.lyrics_id = lyrics_id;
	}

	public String getLyrics_body() {
		return lyrics_body;
	}

	public void setLyrics_body(String lyrics_body) {
		this.lyrics_body = lyrics_body;
	}

	@Override
	public String toString() {
		return "Lyrics [lyrics_id=" + lyrics_id + ", lyrics_body=" + lyrics_body + "]";
	}

}
