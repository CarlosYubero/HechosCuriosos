package com.example.carlos.hechoscuriosos;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class HechosCuriososActivity extends Activity {

    Button DameUnHechoCurioso;
    TextView LabelConElHecho;
    RelativeLayout LayoutPrincipal;
    HechoCurioso HechoCurioso;
    ColorWheel ColorWheel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hechos_curiosos);
        Inicializar();
        LabelConElHecho.setText(HechoCurioso.getHechoCurioso(this));
        ColorWheel.changeBackgroundColor(LayoutPrincipal);
        DameUnHechoCurioso.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                LabelConElHecho.setText(HechoCurioso.getHechoCurioso(v.getContext()));
                ColorWheel.changeBackgroundColor(LayoutPrincipal);
            }
        });
    }

    public void Inicializar () {
        LabelConElHecho = (TextView) findViewById(R.id.HechoCuriosoTextView);
        LayoutPrincipal = (RelativeLayout) findViewById(R.id.RelativeMain);
        DameUnHechoCurioso = (Button)findViewById(R.id.button);
        HechoCurioso = new HechoCurioso();
        ColorWheel = new ColorWheel();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hechos_curiosos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
