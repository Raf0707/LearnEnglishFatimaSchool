package com.example.learnenglish.ui.main.web;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learnenglish.R;
import com.example.learnenglish.adapters.VideoAdapter;
import com.example.learnenglish.domain.model.Video;

import java.util.ArrayList;
import java.util.List;

public class VideoActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private VideoAdapter videoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.video_recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Create a list of video URLs
        List<Video> videos = new ArrayList<>();
        videos.add(new Video("Useful English phrases", "https://www.youtube.com/playlist?list=PLcetZ6gSk96_9lZML__KM6mODmWkV5IxP"));
        videos.add(new Video("Learn English with THE MORNING SHOW — Jennifer Aniston & Reese Witherspoon","https://www.youtube.com/watch?v=fO4hWM0qi9A"));
        videos.add(new Video("Практика английского языка с рассказом на английском языке | Веселые английские истории","https://www.youtube.com/watch?v=TbmSCdn_iUo"));
        videos.add(new Video("Английская история для прослушивания | Практикуйте разговорный английский с историями","https://www.youtube.com/watch?v=dWHesaU7s74"));
        videos.add(new Video("Learn English with FRIENDS","https://www.youtube.com/playlist?list=PLrqHrGoMJdTRbUwBAfEJRNcL7slLPKIX1"));
        videos.add(new Video("English Pronunciation Training | Improve Your Accent & Speak Clearly","https://www.youtube.com/watch?v=n4NVPg2kHv4"));
        videos.add(new Video("Improve your English ⭐ English Short Story - The Invisible Writer","https://www.youtube.com/watch?v=vpqXtMELNUs"));
        videos.add(new Video("Learn English through short story level 3 ⭐| Listen and practice","https://www.youtube.com/watch?v=yVdP-nfXaiw"));
        videos.add(new Video("Lost Love ⭐ Level 1 ⭐ Learn English Through Story • English audio books","https://www.youtube.com/watch?v=oe6nibooTbc"));
        videos.add(new Video("My House | Improve Your English | Learning English Speaking | Level 1 | Listen and practice","https://www.youtube.com/watch?v=uUcjK5pevyo"));
        videos.add(new Video("Top 15 Jokes in English: Can you understand them?","https://www.youtube.com/watch?v=jWCbVrjJe3g"));
        videos.add(new Video("funny english\n","https://www.youtube.com/results?search_query=funny+english"));

        videoAdapter = new VideoAdapter(this, videos);
        recyclerView.setAdapter(videoAdapter);
    }
}
