package nyc.c4q.tarynking.finalreview2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import layout.BlankFragment;

/**
 * Created by tarynking on 2/8/17.
 */

public class MainActivity2 extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_frag);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frag_1_container, new BlankFragment())
                .add(R.id.frag_2_container, new BlankFragment())
                .commit();
    }



}
