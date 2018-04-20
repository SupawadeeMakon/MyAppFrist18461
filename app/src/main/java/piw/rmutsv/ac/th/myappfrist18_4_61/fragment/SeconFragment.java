package piw.rmutsv.ac.th.myappfrist18_4_61.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import piw.rmutsv.ac.th.myappfrist18_4_61.R;

/**
 * Created by macbookpro on 4/18/2018 AD.
 */

public class SeconFragment extends Fragment {
    public Button button;
    private String showName;

    public static SeconFragment seconFragment(String strName) {
        SeconFragment seconFragment = new SeconFragment();
        Bundle bundle = new Bundle();
        bundle.putString("Name",strName);
        seconFragment.setArguments(bundle);
        return seconFragment;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        showName = getArguments().getString("Name");
        Log.d("20/4/61", "showName ==>" + showName);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        showMessage();

        NextToHome();


    }

    private void NextToHome() {
        button = getView().findViewById(R.id.btnNextPage1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });
    }

    private void showMessage() {

        //ShowName
        TextView textView = getView().findViewById(R.id.txtShowResult);
        textView.setText(showName);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.second_fragment, container, false);
        return view;
    }
}
