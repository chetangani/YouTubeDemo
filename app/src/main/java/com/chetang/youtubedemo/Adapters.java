package com.chetang.youtubedemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Chetan G on 6/19/2016.
 */
public class Adapters {

    public class MasterAdapter extends RecyclerView.Adapter<MasterAdapter.MasterViewHolder> {
        ArrayList<Demodetails> arrayList = new ArrayList<Demodetails>();
        Context context;

        public MasterAdapter(ArrayList<Demodetails> arrayList, Context context) {
            this.arrayList = arrayList;
            this.context = context;
        }

        @Override
        public MasterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mastercard, parent, false);
            MasterViewHolder viewHolder = new MasterViewHolder(view);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(MasterViewHolder holder, int position) {
            Demodetails details = arrayList.get(position);
            holder.tvmaster_slno.setText(details.getCourse_slno());
            holder.tvmaster_name.setText(details.getCourse_name());
        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }

        public class MasterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
            TextView tvmaster_slno, tvmaster_name;

            public MasterViewHolder(View itemView) {
                super(itemView);
                itemView.setOnClickListener(this);
                tvmaster_slno = (TextView) itemView.findViewById(R.id.course_slno);
                tvmaster_name = (TextView) itemView.findViewById(R.id.course_name);
            }

            @Override
            public void onClick(View v) {
                int pos = getAdapterPosition();

                Intent master = new Intent(context, Details.class);
                master.putExtra("POS", "" + pos);
                context.startActivity(master);
            }
        }
    }

    public class DetailsAdapter extends RecyclerView.Adapter<DetailsAdapter.DetailsViewHolder> {
        ArrayList<Demodetails> arrayList = new ArrayList<Demodetails>();
        Context context;

        public DetailsAdapter(ArrayList<Demodetails> arrayList, Context context) {
            this.arrayList = arrayList;
            this.context = context;
        }

        @Override
        public DetailsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.detailscard, parent, false);
            DetailsViewHolder viewHolder = new DetailsViewHolder(view);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(DetailsViewHolder holder, int position) {
            Demodetails details = arrayList.get(position);
            holder.tvdetails_slno.setText(details.getDetails_slno());
            holder.tvdetails_name.setText(details.getDetails_name());
            holder.tvdetails_duration.setText(details.getDetails_duration());
        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }

        public class DetailsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
            TextView tvdetails_slno, tvdetails_name, tvdetails_duration;

            public DetailsViewHolder(View itemView) {
                super(itemView);
                itemView.setOnClickListener(this);
                tvdetails_slno = (TextView) itemView.findViewById(R.id.details_slno);
                tvdetails_name = (TextView) itemView.findViewById(R.id.details_name);
                tvdetails_duration = (TextView) itemView.findViewById(R.id.details_duration);
            }

            @Override
            public void onClick(View v) {
                int pos = getAdapterPosition();
                Demodetails demo = arrayList.get(pos);

                Intent details = new Intent(context, MainActivity.class);
                details.putExtra("VIDEOURL", demo.details_content);
                context.startActivity(details);
            }
        }
    }
}
