/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alp.yalantisfirsttask;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by alphari on 24.03.2016.
 */
//Create Recycler view Adapter
public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewHolder> {

    private Context mContext;
    private ArrayList<DataModel> imageslist;

    public RecycleViewAdapter(Context context, ArrayList<DataModel> imageslist){
        this.mContext = context;
        this.imageslist = imageslist;
    }

    @Override
    public RecycleViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclerview_item, null);
        return new RecycleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecycleViewHolder holder, int position) {
        DataModel dataModel = imageslist.get(position);

        Picasso.with(mContext)
                .load(dataModel.getImagesUrl())
                .into(holder.mImageView);
    }

    @Override
    public int getItemCount() {
        return (null != imageslist ? imageslist.size(): 0 );
    }
}
