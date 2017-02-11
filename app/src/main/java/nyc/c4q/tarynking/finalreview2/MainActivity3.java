package nyc.c4q.tarynking.finalreview2;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import layout.BlankFragment;

/**
 * Created by tarynking on 2/9/17.
 */

public class MainActivity3 extends AppCompatActivity{

    ImageButton button1;
    ImageButton button2;
    ImageButton button3;

    BottomNavigationView bottomNavigationView;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag_bottom_navigation);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frag_3_container, new BlankFragment())
                .commit();

        bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        button1 = (ImageButton) findViewById(R.id.search_button1);
        button2 = (ImageButton) findViewById(R.id.search_button2);
        button3 = (ImageButton) findViewById(R.id.search_button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Button 1 clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }




}
