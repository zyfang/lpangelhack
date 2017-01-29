package com.example.fang.speakup;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import static com.example.fang.speakup.R.id.cameraButton;

/**
 * A placeholder fragment containing a simple view.
 */
public class DiveInActFragment extends Fragment {
    View v;
    VideoView vv;

    public DiveInActFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_dive_in, container, false);

        vv = (VideoView) v.findViewById(R.id.diveVideoView);
        String path = "android.recource://" + getActivity().getPackageName() + "/" + R.raw.divevid;
        vv.setVideoURI(Uri.parse(path));
        vv.setMediaController(new MediaController(v.getContext()));
        return v;
    }
}
