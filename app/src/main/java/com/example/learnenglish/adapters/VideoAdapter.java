package com.example.learnenglish.adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.learnenglish.R;
import com.example.learnenglish.domain.model.Video;

import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder> {

    private List<Video> videos;
    private LayoutInflater mInflater;
    private Context context;

    public VideoAdapter(Context context, List<Video> videos) {
        this.mInflater = LayoutInflater.from(context);
        this.videos = videos;
        this.context = context;
    }

    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.video_item, parent, false);
        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewHolder holder, int position) {
        String url = videos.get(position).getUrl();
        holder.coverImageView.setImageResource(R.drawable.video);

        holder.titleVideo.setText(videos.get(position).getTitle());

        holder.watchButton.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            context.startActivity(intent);
            Toast.makeText(context, "Opening video: " + url, Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return videos.size();
    }

    public static class VideoViewHolder extends RecyclerView.ViewHolder {
        private ImageView coverImageView;
        private Button watchButton;
        private TextView titleVideo;

        public VideoViewHolder(@NonNull View itemView) {
            super(itemView);
            coverImageView = itemView.findViewById(R.id.coverImageVideo);
            watchButton = itemView.findViewById(R.id.watchvideo);
            titleVideo = itemView.findViewById(R.id.titleVideo);
        }
    }
}

