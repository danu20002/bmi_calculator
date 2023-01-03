package com.example.bmi_calculator;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView my_result=(TextView) findViewById(R.id.txt_result);
        EditText my_weight=(EditText) findViewById(R.id.editweight);
        EditText my_heightf=(EditText) findViewById(R.id.editheightf);
        EditText my_heighti=(EditText) findViewById(R.id.edit_heighti);
        Button calc_btn=(Button) findViewById(R.id.calculate_btn);
        LinearLayout my_liner=(LinearLayout) findViewById(R.id.linerlayout);
        calc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wt=Integer.parseInt(my_weight.getText().toString());
                int htf=Integer.parseInt(my_heightf.getText().toString());
               int hti=Integer.parseInt(my_heighti.getText().toString());
               int totalint=htf*12+hti;
               double totalcm=totalint*2.53;
               double totalm=totalcm/100;
               double bmi=wt/(totalm*totalm);
               if(bmi>25){
                   my_result.setText("you are overweight");
                   my_liner.setBackgroundColor(getResources().getColor(R.color.color_o));
               }else if(bmi<18){
                   my_result.setText("you are underweight ");
                   my_liner.setBackgroundColor(getResources().getColor(R.color.color_u));
               }else{
                   my_result.setText("you are healthy fuck yourself mc");
                   my_liner.setBackgroundColor(getResources().getColor(R.color.color_h));
               }

            }
        });
    }
}