package com.YouTubeTools.Controller;

import com.YouTubeTools.Service.YouTubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/youtube")
public class YouTubeTagsController {

    @Autowired
    private YouTubeService youTubeService;
    @Value("${youtube.api.key}")
    private String apiKey;

    private boolean isApiKeyConfigured(){
        return apiKey!=null && !apiKey.isEmpty();
    }

    @PostMapping("/search")
    public String videoTags(@RequestParam ("videoTitle") String videoTitle, Model model){
       if(!isApiKeyConfigured()){
           model.addAttribute("error","API is not configured");
           return "home";
       }
       if(videoTitle==null||videoTitle.isEmpty()){
            model.addAttribute("error","Video title is required");
       }
       return "home";
    }

}
