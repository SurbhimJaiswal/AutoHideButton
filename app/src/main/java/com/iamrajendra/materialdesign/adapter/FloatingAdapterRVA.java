package com.iamrajendra.materialdesign.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.iamrajendra.materialdesign.R;

/**
 * Created by rajendraverma on 24-07-2016.
 */
public class FloatingAdapterRVA extends RecyclerView.Adapter<FloatingAdapterRVA.CustomAdatper> {
    private Context mContext;

    public FloatingAdapterRVA(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public CustomAdatper onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater  = LayoutInflater.from(mContext);

        return new CustomAdatper(layoutInflater.inflate(R.layout.floting_adapter_rva,null));
    }

    @Override
    public void onBindViewHolder(CustomAdatper holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 500;
    }

    public class CustomAdatper extends RecyclerView.ViewHolder {
        public CustomAdatper(View itemView) {
            super(itemView);
        }
    }
}
