package com.YouTubeTools.Controller;

import com.YouTubeTools.Service.ThumbnailService;
import com.YouTubeTools.Service.YouTubeService;
import com.YouTubeTools.Model.Video;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VideoDetailsController {

    @Autowired
    private ThumbnailService thumbnailService;

    @Autowired
    private YouTubeService youTubeService;

    @PostMapping("/youtube/video-details")
    public String getVideoDetails(@RequestParam("videoUrlOrId") String videoUrlOrId, Model model) {
        // Extract video ID from URL or use directly if it's an ID
        String videoId = thumbnailService.extractVideoId(videoUrlOrId);

        if (videoId == null) {
            model.addAttribute("error", "Invalid YouTube URL or Video ID");
            model.addAttribute("videoUrlOrId", videoUrlOrId);
            return "video-details";
        }

        try {
            // Fetch video details using YouTubeService
            Video video = youTubeService.getVideoById(videoId);

            if (video == null) {
                model.addAttribute("error", "Video not found or API error occurred");
                model.addAttribute("videoUrlOrId", videoUrlOrId);
                return "video-details";
            }

            // Create a VideoDetails object with all necessary information
            VideoDetails videoDetails = new VideoDetails();
            videoDetails.setId(video.getId());
            videoDetails.setTitle(video.getTitle());
            videoDetails.setChannelTitle(video.getChannelTitle());
            videoDetails.setTags(video.getTags());
            videoDetails.setThumbnailUrl("https://img.youtube.com/vi/" + videoId + "/maxresdefault.jpg");

            // Add to model
            model.addAttribute("videoDetails", videoDetails);
            model.addAttribute("videoUrlOrId", videoUrlOrId);

        } catch (Exception e) {
            model.addAttribute("error", "Error fetching video details: " + e.getMessage());
            model.addAttribute("videoUrlOrId", videoUrlOrId);
        }

        return "video-details";
    }

    // Inner class for video details
    @Data
    public static class VideoDetails {
        private String id;
        private String title;
        private String channelTitle;
        private String thumbnailUrl;
        private String description;
        private String publishedAt;
        private java.util.List<String> tags;

        // Getters and Setters
//        public String getId() { return id; }
//        public void setId(String id) { this.id = id; }
//
//        public String getTitle() { return title; }
//        public void setTitle(String title) { this.title = title; }
//
//        public String getChannelTitle() { return channelTitle; }
//        public void setChannelTitle(String channelTitle) { this.channelTitle = channelTitle; }
//
//        public String getThumbnailUrl() { return thumbnailUrl; }
//        public void setThumbnailUrl(String thumbnailUrl) { this.thumbnailUrl = thumbnailUrl; }
//
//        public String getDescription() { return description; }
//        public void setDescription(String description) { this.description = description; }
//
//        public String getPublishedAt() { return publishedAt; }
//        public void setPublishedAt(String publishedAt) { this.publishedAt = publishedAt; }
//
//        public java.util.List<String> getTags() { return tags; }
//        public void setTags(java.util.List<String> tags) { this.tags = tags; }
    }
}