package br.com.memorify.tourguideapp.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import br.com.memorify.tourguideapp.R;
import br.com.memorify.tourguideapp.model.Place;

public class DetailActivity extends AppCompatActivity {

    private final static String PLACE_KEY = "PLACE_KEY";

    private ImageView placeImageView;
    private TextView nameTextView;
    private TextView neightborhoodTextView;
    private TextView descriptionTextView;

    private Place place;

    public static void startDetail(Activity activity, Place place) {
        Intent intent = new Intent(activity, DetailActivity.class);
        intent.putExtra(PLACE_KEY, place);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        if (getIntent() == null || getIntent().getSerializableExtra(PLACE_KEY) == null) {
            throw new IllegalArgumentException();
        }
        place = (Place) getIntent().getSerializableExtra(PLACE_KEY);
        bindViews();
        setupViews();
    }

    private void bindViews() {
        placeImageView = (ImageView) findViewById(R.id.place_image);
        nameTextView = (TextView) findViewById(R.id.place_name);
        neightborhoodTextView = (TextView) findViewById(R.id.place_neightborhood);
        descriptionTextView = (TextView) findViewById(R.id.place_description);
    }

    private void setupViews() {
        placeImageView.setImageBitmap(place.getImage(getBaseContext()));
        nameTextView.setText(place.name);
        neightborhoodTextView.setText(place.neighborhood);
        descriptionTextView.setText(place.description);
    }
}
