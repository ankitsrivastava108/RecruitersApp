package com.khoslalabs.recruiters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.khoslalabs.recruiters.models.Collection1;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by ankitsrivastava on 07/08/15.
 */
public class RecruiterAdapter extends BaseAdapter {

    WeakReference<Context> contextWeakReference;
    List<Collection1> recruiterList;
    public RecruiterAdapter(Context context, List<Collection1> recruiterList) {
        this.contextWeakReference = new WeakReference<Context>(context);
        this.recruiterList = recruiterList;
    }

    @Override
    public int getCount() {
        return recruiterList.size();
    }

    @Override
    public Object getItem(int position) {
        return recruiterList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    private class ViewHolder {
        TextView RecruiterName;
        TextView Skills;
        TextView Position;
        ImageView Image;
        TextView location;
        TextView ActiveJobs;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        ViewHolder viewHolder = null;

        if (convertView == null) {
            LayoutInflater layoutInflater = LayoutInflater.from(contextWeakReference.get());
            view = layoutInflater.inflate(R.layout.item_recruiters, parent, false);

            viewHolder = new ViewHolder();

            viewHolder.RecruiterName = (TextView) view.findViewById(R.id.item_recruitername);
            viewHolder.Skills = (TextView) view.findViewById(R.id.item_skills);
            viewHolder.Position = (TextView) view.findViewById(R.id.item_position);
            viewHolder.Image= (ImageView) view.findViewById(R.id.recruiter_image);
            viewHolder.location = (TextView) view.findViewById(R.id.item_location);
            viewHolder.ActiveJobs = (TextView) view.findViewById(R.id.item_activejobs);
            view.setTag(viewHolder);
        }

        if (viewHolder == null) {
            viewHolder = (ViewHolder) view.getTag();
        }

        Collection1 collection1 = (Collection1) getItem(position);

        //if(collection1.getImage().getSrc()!="") {
            viewHolder.RecruiterName.setText(collection1.getName().getText());
        viewHolder.Skills.setText(collection1.getSkills());
        if(collection1.getImage().getSrc()!="") {
            Picasso
                    .with(contextWeakReference.get())
                    .load(collection1.getImage().getSrc())
                    .error(R.drawable.darpan)
                    .into(viewHolder.Image);
        } else {
            Picasso
                    .with(contextWeakReference.get())
                    .load(R.drawable.anonymous)
                    .into(viewHolder.Image);
        }
        //}
        //viewHolder.Position.setText(collection1.getPosition().);
        return view;
    }
}
