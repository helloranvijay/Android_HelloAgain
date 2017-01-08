package in.ranvijay.www.helloagain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //manually added
        final TextView firstTextView=(TextView) findViewById(R.id.textView);
        Button firstButton=(Button) findViewById(R.id.firstbutton);

        firstButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                firstTextView.setText("You Clicked");
            }
        });
    }
}
