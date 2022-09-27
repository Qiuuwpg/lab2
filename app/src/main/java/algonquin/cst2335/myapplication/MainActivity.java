package algonquin.cst2335.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import algonquin.cst2335.myapplication.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private TextView mytext;
    private Button btn;
    private EditText myedit ;
    private ImageButton image;
    private Switch Jack;


    //private ActivityMainBinding variableBinding;
   //TextView text = findViewById(R.id.textView);
    //Button btn = findViewById(R.id.mybutton);
   // EditText edit = findViewById(R.id.myedittext);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mytext = findViewById(R.id.textView);
        Button btn = findViewById(R.id.mybutton);
        EditText myedit = findViewById(R.id.myedittext);

             btn.setOnClickListener(new OnClickListener(){
                 @Override
                 public void onClick(View view){
                     String editString = myedit.getText().toString();
                     mytext.setText( "Your edit text has: " + editString);
                 }
             });

     image = (ImageButton) findViewById(R.id.imageButton);

     int width = image.getWidth();
     int height = image.getHeight();
     String hj = "width is"+width+"height is"+height;

     image.setOnClickListener(new OnClickListener(){
         @Override
         public void onClick(View view){
             Toast.makeText(MainActivity.this, hj,
                     Toast.LENGTH_LONG).show();
         }
     });

     Jack = findViewById(R.id.switch1);
        Jack.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton AB, boolean b){
                Context context = MainActivity.this;
                int duration = Toast.LENGTH_SHORT;




                if(AB.isChecked()){
                   Toast toast = Toast.makeText(context,"Yes",duration);

                    toast.show();
                }
                else{
                    Toast toast = Toast.makeText(context,"No",duration);
                    toast.show();
                }
            }


        });

        }

    }


