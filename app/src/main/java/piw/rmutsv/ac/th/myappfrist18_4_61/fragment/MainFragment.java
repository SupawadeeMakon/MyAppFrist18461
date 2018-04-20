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
import android.widget.EditText;
import android.widget.Toast;

import piw.rmutsv.ac.th.myappfrist18_4_61.R;

/**
 * Created by macbookpro on 4/18/2018 AD.
 */

public class MainFragment extends Fragment {

    public Button button1,button2;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        addNameController();

        Resgister();


    }

    private void Resgister() {

        button2 = getView().findViewById(R.id.btnNextPage3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RegisterFragment registerFragment = new RegisterFragment();
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fraContent, RegisterFragment.newInstance())
                        .commit();
            }
        });

    }

    private void addNameController() {
        final EditText editText = getView().findViewById(R.id.edtName);
        button1 = getView().findViewById(R.id.btnNextPage);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameString = editText.getText().toString().trim();
                if (nameString.equals("")) {
                    nameString ="Not Thing";
                }

                Log.d("20/4/61", "Username ==>" + nameString);

                SeconFragment seconFragment = new SeconFragment();
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fraContent, SeconFragment.seconFragment(nameString))
                        .addToBackStack(null)
                        .commit();

            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment_layout, container, false);
        return view;

    }


}
