package com.example.collegeapp.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.collegeapp.R;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderLayout;

public class HomeFragment extends Fragment {


    private SliderLayout sliderLayout;
    private ImageView map;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);
        sliderLayout=view.findViewById(R.id.slider);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderLayout.setScrollTimeInSec(3);
        setSliderViews();
        map=view.findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMap();
            }
        });


        return view;
    }

    private void openMap() {
        Uri uri=Uri.parse("geo:0, 0?q=Bharati Vidyapeeth's College Of Engineering For Women");
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void setSliderViews() {
        for(int i=0;i<5;i++){
            DefaultSliderView sliderView=new DefaultSliderView(getContext());
            switch (i){
                case 0:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/admin-college-apps.appspot.com/o/gallery%2F%5BB%40c431da1jpg?alt=media&token=09a1b027-9476-4b94-ac14-e6cccd8fe082");
                    break;
                case 1:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/admin-college-apps.appspot.com/o/gallery%2F%5BB%401057c13jpg?alt=media&token=5dc2cb30-b7ed-4c78-bb1a-4a3df024de4e");
                    break;
                case 2:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/admin-college-apps.appspot.com/o/gallery%2F%5BB%40753df11jpg?alt=media&token=98e32657-1131-4d96-95d5-548b9fd8d935");
                    break;

                case 3:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/admin-college-apps.appspot.com/o/gallery%2F%5BB%40753df11jpg?alt=media&token=98e32657-1131-4d96-95d5-548b9fd8d935");
                    break;
                case 4:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/admin-college-apps.appspot.com/o/gallery%2F%5BB%40d6635f2jpg?alt=media&token=a97c43d3-fe8d-4d79-bd0f-d0a80abfddac");
                    break;


            }
            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            sliderLayout.addSliderView(sliderView);
        }
    }
}