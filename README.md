<h1 align="center">🎥 YouTube Tools 🚀</h1>

<p align="center">
  A modern web app built with <b>Spring Boot</b> + <b>Thymeleaf</b> + <b>TailwindCSS</b> to supercharge your YouTube workflow.  
</p>

<hr/>

<h2>✨ Features</h2>

<ul>
  <li>🔎 <b>SEO Tag Generator</b> – Extract SEO tags from similar YouTube videos to optimize your content.</li>
  <li>🖼️ <b>Thumbnail Downloader</b> – Get high resolution (1280x720) thumbnails from YouTube videos.</li>
  <li>📊 <b>Video Details Retriever</b> – Fetch complete video data including <i>title, description, channel, publish date, tags</i>.</li>
  <li>🌗 <b>Dark/Light Theme Toggle</b> – Modern responsive navbar with theme switch.</li>
</ul>

<hr/>

<h2>📂 Project Structure</h2>

<ul>
  <li><code>controllers/</code> – Handle routes (PageController, ThumbnailController, VideoDetailsController, YouTubeTagsController)</li>
  <li><code>services/</code> – Business logic (YouTubeService, ThumbnailService)</li>
  <li><code>models/</code> – Data classes (Video, SearchVideo)</li>
  <li><code>resources/templates/</code> – Thymeleaf HTML pages (home, thumbnails, video-details, navbar)</li>
  <li><code>application.properties</code> – App configuration (port, API keys, endpoints)</li>
</ul>

<hr/>

<h2>🚀 Endpoints</h2>

<ul>
  <li><code>/</code> → SEO Tag Generator page</li>
  <li><code>/youtube/search</code> → POST – Extract tags from a video title</li>
  <li><code>/thumbnail</code> → Thumbnail Generator page</li>
  <li><code>/get-thumbnail</code> → POST – Fetch HQ thumbnail from video URL/ID</li>
  <li><code>/video-details</code> → Video Data Retriever page</li>
  <li><code>/youtube/video-details</code> → POST – Fetch title, description, channel, tags</li>
</ul>

<hr/>

<h2>⚡ How to Run</h2>

<ol>
  <li>Clone this repository:  
    <pre><code>git clone https://github.com/your-username/YouTube-Tool.git</code></pre>
  </li>
  <li>Navigate into the project folder:  
    <pre><code>cd YouTube-Tool</code></pre>
  </li>
  <li>Configure your <code>application.properties</code> with a valid YouTube Data API key.</li>
  <li>Run the Spring Boot app:  
    <pre><code>mvn spring-boot:run</code></pre>
  </li>
  <li>Open in browser:  
    <pre><code>http://localhost:8080</code></pre>
  </li>
</ol>


<hr/>

<h2>💡 Tech Stack</h2>

<ul>
  <li>⚙️ Spring Boot (Backend)</li>
  <li>🖥️ Thymeleaf (Server-side Rendering)</li>
  <li>🎨 TailwindCSS + Bootstrap Icons (Modern UI)</li>
  <li>📡 YouTube Data API v3</li>
</ul>

<hr/>

<h2>👨‍💻 Contributing</h2>
<p>Contributions are welcome! Feel free to fork this repo and submit pull requests. 💙</p>

<hr/>

<h2>👨‍💻 Creator</h2>
<p align="center">
  <a href="https://linkedin.com/in/ayuseth" target="_blank">
    <img src="https://readme-typing-svg.herokuapp.com?font=Orbitron&size=24&color=00FFAB&center=true&vCenter=true&width=600&lines=👨‍💻+Ayush+Seth;💡+Computer+Science+Engineer;🚀+Java+Developer" alt="Author Typing Effect" />
  </a>
</p>

<p align="center">
  <a href="https://linkedin.com/in/ayuseth" target="_blank">
    <img src="https://capsule-render.vercel.app/api?type=waving&color=00FFAB&height=100&section=footer&text=Ayush+Seth&fontSize=32&animation=twinkling&fontColor=ffffff" />
  </a>
