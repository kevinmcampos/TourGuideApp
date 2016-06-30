package br.com.memorify.tourguideapp.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.memorify.tourguideapp.R;
import br.com.memorify.tourguideapp.model.Place;
import br.com.memorify.tourguideapp.util.DataHelper;

public class PlaceListFragment extends Fragment {

    private static final String LIST_PLACE_TYPE_KEY = "LIST_PLACE_TYPE_KEY";

    private View rootView;
    private RecyclerView recyclerView;

    public static PlaceListFragment newInstance(Place.Type type) {
        Bundle args = new Bundle();
        args.putSerializable("LIST_PLACE_TYPE_KEY", type);
        PlaceListFragment fragment = new PlaceListFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_placelist, container, false);
        bindViews();
        setupViews();
        return rootView;
    }

    private void bindViews() {
        recyclerView = (RecyclerView) rootView.findViewById(R.id.place_list);
    }

    private void setupViews() {
        Place.Type type = (Place.Type) getArguments().getSerializable(LIST_PLACE_TYPE_KEY);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), DataHelper.getPlacesByType(type), new PlaceAdapter.ItemClickListener() {
            @Override
            public void onItemClicked(Place place) {
                DetailActivity.startDetail(getActivity(), place);
            }
        });
        recyclerView.setAdapter(placeAdapter);
    }
}
