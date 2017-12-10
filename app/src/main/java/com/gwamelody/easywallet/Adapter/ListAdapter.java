package com.gwamelody.easywallet.Adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.gwamelody.easywallet.Model.incom;
import com.gwamelody.easywallet.Model.incom;
import com.gwamelody.easywallet.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gwa Melody on 9/12/2560.
 */

public class ListAdapter extends ArrayAdapter<incom> {

    private Context mContext;

    private ArrayList <incom> mincom;
    private int mLayout;


    public ListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<incom> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mincom = objects;
        this.mLayout = resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        View view = mInflater.inflate(mLayout, null);

//        ImageView im = (ImageView) view.findViewById(R.id.imageView);
//        TextView te =  (TextView) view.findViewById(R.id.textView);
//
//        incom a = mincom.get(position);
//
//



        return view;
    }
}
