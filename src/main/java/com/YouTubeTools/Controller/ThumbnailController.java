package com.YouTubeTools.Controller;

import com.YouTubeTools.Service.ThumbnailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ThumbnailController {

    @Autowired
    ThumbnailService service;
    @GetMapping("/thumbnail")
    public String getThumbnail() {
        return "thumbnails";
    }

    @PostMapping("/get-thumbnail")
    public String showThumbnail(@RequestParam("videoUrlOrId") String videoUrlOrId, Module model) {
        String videoId= service.extractVideoId(videoUrlOrId);
        return "thumbnails";
    }

}
