/*
 * @Author: Kevin Chung
 */

package co.kc.MusicMatch.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class MusicController {

	@Value("${music.key}")
	private String musicKey;
	
	
}
