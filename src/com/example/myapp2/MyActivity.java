package com.example.myapp2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    EditText[] quantitiesOfVegetable = new EditText[15];
    TextView[] rateOfVegetable = new TextView[15];

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        quantitiesOfVegetable[0]=(EditText)findViewById(R.id.editText1);
        quantitiesOfVegetable[1]=(EditText)findViewById(R.id.editText2);
        quantitiesOfVegetable[2]=(EditText)findViewById(R.id.editText3);
        quantitiesOfVegetable[3]=(EditText)findViewById(R.id.editText4);
        quantitiesOfVegetable[4]=(EditText)findViewById(R.id.editText5);
        quantitiesOfVegetable[5]=(EditText)findViewById(R.id.editText6);
        quantitiesOfVegetable[6]=(EditText)findViewById(R.id.editText7);
        quantitiesOfVegetable[7]=(EditText)findViewById(R.id.editText8);
        quantitiesOfVegetable[8]=(EditText)findViewById(R.id.editText9);
        quantitiesOfVegetable[9]=(EditText)findViewById(R.id.editText10);
        quantitiesOfVegetable[10]=(EditText)findViewById(R.id.editText11);
        quantitiesOfVegetable[11]=(EditText)findViewById(R.id.editText12);
        quantitiesOfVegetable[12]=(EditText)findViewById(R.id.editText13);
        quantitiesOfVegetable[13]=(EditText)findViewById(R.id.editText14);
        quantitiesOfVegetable[14]=(EditText)findViewById(R.id.editText15);

        rateOfVegetable[0]=(TextView)findViewById(R.id.textView1);
        rateOfVegetable[1]=(TextView)findViewById(R.id.textView2);
        rateOfVegetable[2]=(TextView)findViewById(R.id.textView3);
        rateOfVegetable[3]=(TextView)findViewById(R.id.textView4);
        rateOfVegetable[4]=(TextView)findViewById(R.id.textView5);
        rateOfVegetable[5]=(TextView)findViewById(R.id.textView6);
        rateOfVegetable[6]=(TextView)findViewById(R.id.textView7);
        rateOfVegetable[7]=(TextView)findViewById(R.id.textView8);
        rateOfVegetable[8]=(TextView)findViewById(R.id.textView9);
        rateOfVegetable[9]=(TextView)findViewById(R.id.textView10);
        rateOfVegetable[10]=(TextView)findViewById(R.id.textView11);
        rateOfVegetable[11]=(TextView)findViewById(R.id.textView12);
        rateOfVegetable[12]=(TextView)findViewById(R.id.textView13);
        rateOfVegetable[13]=(TextView)findViewById(R.id.textView14);
        rateOfVegetable[14]=(TextView)findViewById(R.id.textView15);

    }
}
