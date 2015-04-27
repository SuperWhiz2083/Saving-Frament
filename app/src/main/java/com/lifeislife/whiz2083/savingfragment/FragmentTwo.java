package com.lifeislife.whiz2083.savingfragment;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends Fragment {

    TextView mText;
    String data;


    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_two, container, false);
        if(savedInstanceState==null){

        }
        else{

            data=savedInstanceState.getString("text");
            TextView mText= (TextView) view.findViewById(R.id.textView);
            mText.setText(data);
        }
                return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mText= (TextView) getActivity().findViewById(R.id.textView);

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("text", data);
    }

    public void changeText (String data){
        this.data=data;
        mText.setText(data);
    }
}
