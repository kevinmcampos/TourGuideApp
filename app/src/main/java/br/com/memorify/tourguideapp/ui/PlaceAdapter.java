package br.com.memorify.tourguideapp.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.memorify.tourguideapp.R;
import br.com.memorify.tourguideapp.model.Place;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder> {

    private Context context;
    private List<Place> places;
    private ItemClickListener itemClickListener;

    public interface ItemClickListener {
        void onItemClicked(Place place);
    }

    public PlaceAdapter(Context context, List<Place> places, ItemClickListener listener) {
        this.context = context;
        this.places = places;
        this.itemClickListener = listener;
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_place, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(places.get(position));
    }

    @Override
    public int getItemCount() {
        return places.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        View thisView;
        TextView nameTextView;
        TextView neightborhoodTextView;
        TextView descriptionTextView;
        ImageView placeImageView;

        public ViewHolder(View itemView) {
            super(itemView);
            bindViews(itemView);
        }

        private void bindViews(View itemView) {
            thisView = itemView.findViewById(R.id.place_view);
            nameTextView = (TextView) itemView.findViewById(R.id.place_name);
            neightborhoodTextView = (TextView) itemView.findViewById(R.id.place_neightborhood);
            descriptionTextView = (TextView) itemView.findViewById(R.id.place_description);
            placeImageView = (ImageView) itemView.findViewById(R.id.place_image);
        }

        public void bind(final Place place) {
            nameTextView.setText(place.name);
            neightborhoodTextView.setText(place.neighborhood);
            descriptionTextView.setText(place.description);
            if (place.imagePath == null) {
                placeImageView.setVisibility(View.GONE);
            } else {
                placeImageView.setVisibility(View.VISIBLE);
                placeImageView.setImageBitmap(place.getImage(context));
            }
            thisView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (itemClickListener != null) {
                        itemClickListener.onItemClicked(place);
                    }
                }
            });
        }
    }
}
