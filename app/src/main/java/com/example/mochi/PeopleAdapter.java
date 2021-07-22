package com.example.mochi;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.Viewholder> {

    private Context context;
    private ArrayList<PeopleModel> peopleModelArrayList;
    private static MediaPlayer player = new MediaPlayer();

    // Constructor
    public PeopleAdapter(Context context, ArrayList<PeopleModel> peopleModelArrayList) {
        this.context = context;
        this.peopleModelArrayList = peopleModelArrayList;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // to inflate the layout for each item of recycler view.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gethelp_card_layout, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        // to set data to textview and imageview of each card layout
        PeopleModel model = peopleModelArrayList.get(position);
        holder.courseNameTV.setText(model.getCourse_name());
        holder.courseProfession.setText(model.getCourse_profession());

        holder.button_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+model.getCourse_no()));
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        // this method is used for showing number
        // of card items in recycler view.
        return peopleModelArrayList.size();
    }

    // View holder class for initializing of
    // your views such as TextView and Imageview.
    public class Viewholder extends RecyclerView.ViewHolder {
        private ImageView courseIV;
        private TextView courseNameTV;
        private ImageView button_pause;
        private TextView courseProfession;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            courseNameTV = itemView.findViewById(R.id.idTVCourseName);
            button_pause=itemView.findViewById(R.id.button_pause);
            courseProfession = itemView.findViewById(R.id.courseProfession);

        }
    }
}