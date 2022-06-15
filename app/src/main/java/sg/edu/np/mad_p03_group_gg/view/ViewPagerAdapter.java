package sg.edu.np.mad_p03_group_gg.view;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import sg.edu.np.mad_p03_group_gg.R;
import sg.edu.np.mad_p03_group_gg.models.AdBannerImage;

public class ViewPagerAdapter extends RecyclerView.Adapter<ViewPagerAdapter.RecyclerViewHolder> {
    ArrayList<Bitmap> adBannerImages;

    public ViewPagerAdapter(ArrayList<Bitmap> adBannerImages) {
        this.adBannerImages = adBannerImages;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.pager_item, parent, false);;

        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        Bitmap adBannerImage = adBannerImages.get(position);
        adBannerImage = Bitmap.createScaledBitmap(adBannerImage, holder.adBannerImage.getWidth(), holder.adBannerImage.getHeight(),false);
        holder.adBannerImage.setImageBitmap(adBannerImage);
    }

    @Override
    public int getItemCount() {
        return adBannerImages.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        ImageView adBannerImage;
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            adBannerImage = itemView.findViewById(R.id.imageView);
        }
    }
}