package com.sara.project.app.converter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class secondMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        final EditText edtmm = (EditText) findViewById(R.id.edtmm);
        final EditText edtcm = (EditText) findViewById(R.id.edtcm);
        final EditText edtM = (EditText) findViewById(R.id.edtM);
        final EditText edtkm = (EditText) findViewById(R.id.edtkm);
        final EditText edtIN = (EditText) findViewById(R.id.edtIN);

        Button convert = (Button) findViewById(R.id.btnconvert);
        edtmm.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                edtcm.setText("");
                edtM.setText("");
                edtkm.setText("");
                edtIN.setText("");

            }
        });
        edtcm.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                edtmm.setText("");
                edtM.setText("");
                edtkm.setText("");
                edtIN.setText("");

            }
        });
        edtM.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                edtmm.setText("");
                edtcm.setText("");
                edtkm.setText("");
                edtIN.setText("");

            }
        });
        edtkm.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                edtmm.setText("");
                edtcm.setText("");
                edtM.setText("");
                edtIN.setText("");

            }
        });
        edtIN.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                edtmm.setText("");
                edtcm.setText("");
                edtM.setText("");
                edtkm.setText("");

            }
        });
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtmm.getText().toString().length() > 0){
                   double value = Double.parseDouble(edtmm.getText().toString());
                   edtcm.setText(""+(value * 0.1));
                   edtM.setText(""+(value * 0.001));
                   edtkm.setText(""+(value * 0.000001));
                   edtIN.setText(""+(value * 0.03937008));
                   return;
                }
                if(edtcm.getText().toString().length() > 0){
                    double value = Double.parseDouble(edtcm.getText().toString());
                    edtmm.setText(""+(value * 10.0));
                    edtM.setText(""+(value * 0.01));
                    edtkm.setText(""+(value * 0.0001));
                    edtIN.setText(""+(value * 0.39370079));
                    return;
                }
                if(edtM.getText().toString().length() > 0){
                    double value = Double.parseDouble(edtM.getText().toString());
                    edtmm.setText(""+(value * 1000.0));
                    edtcm.setText(""+(value * 100.0));
                    edtkm.setText(""+(value * 0.001));
                    edtIN.setText(""+(value * 39.37007874));
                    return;
                }
                if(edtkm.getText().toString().length() > 0){
                    double value = Double.parseDouble(edtkm.getText().toString());
                    edtmm.setText(""+(value * 1000000.0));
                    edtcm.setText(""+(value * 100000.0));
                    edtM.setText(""+(value * 1000.0));
                    edtIN.setText(""+(value * 39370.07874016));
                    return;
                }
                if(edtIN.getText().toString().length() > 0){
                    double value = Double.parseDouble(edtIN.getText().toString());
                    edtmm.setText(""+(value * 25.4));
                    edtcm.setText(""+(value * 2.54));
                    edtM.setText(""+(value * 0.0254));
                    edtkm.setText(""+(value * 0.0000254));
                    return;
                }
            }
        });
    }
}
