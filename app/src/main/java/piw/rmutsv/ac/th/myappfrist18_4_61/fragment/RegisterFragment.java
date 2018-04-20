package piw.rmutsv.ac.th.myappfrist18_4_61.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import piw.rmutsv.ac.th.myappfrist18_4_61.R;

/**
 * Created by macbookpro on 4/18/2018 AD.
 */

public class RegisterFragment extends Fragment {

    public Button button;

    public static RegisterFragment newInstance() {

        RegisterFragment registerFragment = new RegisterFragment();
        Bundle bundle = new Bundle();
        registerFragment.setArguments(bundle);
        return registerFragment;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        NextToHome1();

    }
        private void NextToHome1() {
            button = getView().findViewById(R.id.btnNextPage2);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    getActivity().getSupportFragmentManager().popBackStack();
                }
            });

        }





    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.register_fragment, container, false);

        return view;
    }
}


