package com.example.fang.speakup;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import static android.app.Activity.RESULT_OK;

/**
 * A placeholder fragment containing a simple view.
 */
public class Exercise1ActivityFragment extends Fragment implements View.OnClickListener{

    public Exercise1ActivityFragment() {
    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_exercise1, container, false);
//    }

    View v;
    Button cameraButton;
    VideoView vv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.tab_fragment_3, container, false);
        cameraButton = (Button) v.findViewById(R.id.cameraButton);
        cameraButton.setOnClickListener(this);

        vv = (VideoView) v.findViewById(R.id.videoView);
        vv.setMediaController(new MediaController(v.getContext()));
        return v;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if (requestCode == REQUEST_VIDEO_CAPTURE && resultCode == RESULT_OK) {
            Uri videoUri = intent.getData();
            vv.setVisibility(View.VISIBLE);
            cameraButton.setVisibility(View.INVISIBLE);
            vv.setVideoURI(videoUri);
        }
    }

    @Override
    public void onClick(View v) {
        //do what you want to do when button is clicked
        dispatchTakeVideoIntent();
    }

    static final int REQUEST_VIDEO_CAPTURE = 1;

    private void dispatchTakeVideoIntent() {
        Intent takeVideoIntent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        if (takeVideoIntent.resolveActivity(getActivity().getPackageManager()) != null) {
            startActivityForResult(takeVideoIntent, REQUEST_VIDEO_CAPTURE);
        }
    }
}
