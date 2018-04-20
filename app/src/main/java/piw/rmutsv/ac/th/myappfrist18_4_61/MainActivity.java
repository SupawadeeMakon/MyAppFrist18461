package piw.rmutsv.ac.th.myappfrist18_4_61;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import piw.rmutsv.ac.th.myappfrist18_4_61.fragment.MainFragment;
import piw.rmutsv.ac.th.myappfrist18_4_61.fragment.RegisterFragment;
import piw.rmutsv.ac.th.myappfrist18_4_61.fragment.SeconFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add Fragment for First Create Activity
        if (savedInstanceState==null) {
            MainFragment mainFragment = new MainFragment();
//            for MainFragment
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fraContent, new MainFragment())
                    .commit();



        }
    }

}
