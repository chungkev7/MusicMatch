/*
 * @Author: Kevin Chung
 */

package co.kc.MusicMatch.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MusicController {

	@Value("${music.key}")
	private String musicKey;
	
	RestTemplate rt = new RestTemplate();
	
	private String uriBase = "https://api.musixmatch.com/ws/1.1/";
	
	private String artistSearch = "artist.search?q_artist=eminem&page_size=5";
	
	private String relatedArtists= "artist.related.get?artist_id=426&page_size=2&page=1";
	
	@RequestMapping("/")
	public ModelAndView test() {
		ModelAndView mv = new ModelAndView("/index");
//		String test = rt.getForObject("https://api.musixmatch.com/ws/1.1/artist.search?q_artist=eminem&page_size=5" + apiKey, String.class);
		String test = rt.getForObject(uriBase + artistSearch + "&apikey=" + musicKey, String.class);
		System.out.println(test);
		return mv;
	}
	
	@RequestMapping("/artist-search")
	public ModelAndView artistSearch() {
		ModelAndView mv = new ModelAndView("artist-search");
		
		return mv;
	}
}
