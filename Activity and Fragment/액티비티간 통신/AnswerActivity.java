package com.koo.hanmo.androidsampletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AnswerActivity extends AppCompatActivity implements View.OnClickListener{


    String question=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        question= getIntent().getStringExtra("Question");
        setLayout();
        updateLayout();
    }
    private void setLayout(){
        findViewById(R.id.txt_question).setOnClickListener(this);
        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
    }
    private void updateLayout(){
        ((TextView)findViewById(R.id.txt_question)).setText(question);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_1 :
                setResult(1);
                Toast.makeText(this, "1번 선택",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_2 :
                setResult(2);
                Toast.makeText(this, "2번 선택",Toast.LENGTH_SHORT).show();
                break;
            default: break;
        }
    }
}
