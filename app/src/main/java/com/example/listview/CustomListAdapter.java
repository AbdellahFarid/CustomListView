package com.example.listview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomListAdapter extends BaseAdapter {

    private List<Article> listArticle;
    private LayoutInflater layoutInflater;
    private Context context;

    public CustomListAdapter(List<Article> listArticle, Context context) {
        this.listArticle = listArticle;
        this.context = context;
    }


    @Override
    public int getCount() {
        return listArticle.size();
    }

    @Override
    public Object getItem(int position) {
        return listArticle.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Article article = this.listArticle.get(position);
        ViewHolder holder;
        if(view == null){
            view = layoutInflater.inflate(R.layout.list_item_layout, null);
            holder = new ViewHolder();
            holder.articleImage = (ImageView) view.findViewById(R.id.articleImage);
            holder.articleName = (TextView) view.findViewById(R.id.articleName);
            holder.articlePrice = (TextView) view.findViewById(R.id.articlePrice);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        holder.articleName.setText(article.getArticleName());
        holder.articlePrice.setText(String.valueOf(article.getArticlePrice()));

        int imageId = this.getMipmapResIdByName(article.getArticleImage());
        holder.articleImage.setImageResource(imageId);

        return view;
    }

    static class ViewHolder{
        ImageView articleImage;
        TextView articleName;
        TextView articlePrice;
    }

    public int getMipmapResIdByName(String resName){
        String pkgName = context.getPackageName();
        int resID = context.getResources().getIdentifier(resName, "mipmap", pkgName);
        Log.i("CustomListView", "Res Name: "+ resName+"==> Res ID = "+ resID);
        return resID;
    }
}
