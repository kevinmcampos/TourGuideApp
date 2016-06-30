package br.com.memorify.tourguideapp.model;

import android.content.Context;
import android.graphics.Bitmap;

import java.io.Serializable;

import br.com.memorify.tourguideapp.util.ImageHelper;

public class Place implements Serializable {

    public String name;
    public String neighborhood;
    public String imagePath;
    public String description;
    public Type type;

    public Place(Type type, String name, String neighborhood, String imagePath, String description) {
        this.name = name;
        this.neighborhood = neighborhood;
        this.imagePath = imagePath;
        this.description = description;
        this.type = type;
    }

    public Bitmap getImage(Context context) {
        final int res = context.getResources().getIdentifier("@drawable/" + imagePath, null, context.getPackageName());
        if (res == 0) {
            return null;
        }
        return ImageHelper.decodeSampledBitmapFromResource(context.getResources(), res, 100, 100);
    }

    public enum Type {
        ATTRACTION,
        BEACH,
        RESTAURANTS,
        COMPANY
    }
}
