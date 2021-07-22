package com.example.mochi;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.Viewholder> {

    private Context context;
    private ArrayList<CourseModel> courseModelArrayList;
    private static MediaPlayer player = new MediaPlayer();

    // Constructor
    public CourseAdapter(Context context, ArrayList<CourseModel> courseModelArrayList) {
        this.context = context;
        this.courseModelArrayList = courseModelArrayList;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        // to set data to textview and imageview of each card layout
        CourseModel model = courseModelArrayList.get(position);
        holder.courseNameTV.setText(model.getCourse_name());
        holder.courseIV.setImageResource(model.getCourse_image());

        holder.itemView.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String song=model.getCourse_name().toString();
                if (player.isPlaying())
                {
                    player.pause();
                }
                switch (song)
                {
                    case"Starry Nights":
                        player = MediaPlayer.create(context,R.raw.tune_1);
                        break;
                    case"Spring Blue":
                        player = MediaPlayer.create(context,R.raw.tune_2);
                        break;
                    case"Summer Daze":
                        player = MediaPlayer.create(context,R.raw.tune_3);
                        break;
                    case"Milky Way":
                        player = MediaPlayer.create(context,R.raw.tune_4);
                        break;
                    case"Night High":
                        player = MediaPlayer.create(context,R.raw.tune_5);
                        break;
                    case"Inside Me":
                        player = MediaPlayer.create(context,R.raw.tune_6);
                        break;
                    case"Waterfall":
                        player = MediaPlayer.create(context,R.raw.tune_7);
                        break;
                }
                player.start();
            }
        }));
        holder.button_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player.pause();
            }
        });

    }

    @Override
    public int getItemCount() {
        // this method is used for showing number
        // of card items in recycler view.
        return courseModelArrayList.size();
    }

    // View holder class for initializing of
    // your views such as TextView and Imageview.
    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageView courseIV;
        private TextView courseNameTV, courseRatingTV;
        private ImageView button_pause;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            courseIV = itemView.findViewById(R.id.idIVCourseImage);
            courseNameTV = itemView.findViewById(R.id.idTVCourseName);
            button_pause=itemView.findViewById((R.id.button_pause));
        }
    }
}