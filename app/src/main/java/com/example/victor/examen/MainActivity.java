package com.example.victor.examen;

/*import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;*/
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import static android.view.View.*;


public class MainActivity extends Activity implements OnClickListener {

    String numtel[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
        String[] personas = getResources().getStringArray(R.array.personas);
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, personas);
        textView.setAdapter(adapter);


        numtel=new String['5'];

        numtel[0]="12345";
        numtel[1]="67890";
        numtel[2]="24680";
        numtel[3]="13579";
        numtel[4]="8712741362";

        Button btn=(Button)findViewById(R.id.button);
        btn.setOnClickListener(this);
        /*Button btn1=(Button)findViewById(R.id.button2);
        Button btn2=(Button)findViewById(R.id.button3);*/



    }
    public void marcar(String num){
        String Marcador="tel: "+num;
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(Marcador)));
    }


   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }*/

    //@Override
   /* public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                AutoCompleteTextView b=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
                String op=b.getText().toString();
                switch(op) {
                    case "Blanca":
                        marcar(numtel[1]);
                        break;
                    case "Ana Sofia":
                        marcar(numtel[0]);
                        break;
                    case "Camila":
                        marcar(numtel[2]);
                        break;
                    case "Damian":
                        marcar(numtel[3]);
                        break;
                    case "Ernesto":
                        marcar(numtel[4]);
                        break;
                }
                break;
        }
    }


}
