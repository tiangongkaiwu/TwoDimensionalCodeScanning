package com.tgku.twodimensionalcodescanning;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by 宋家任 on 2016/4/29 16:41.
 * 扫一扫的扫描结果
 */

public class Sao1SaoResultActivity extends Activity {
    private EditText etSao1SaoResult;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sao1sao_result);
        etSao1SaoResult = (EditText) findViewById(R.id.et_sao1sao_result);
        btnBack = (Button) findViewById(R.id.btn_back);
        String result = getIntent().getStringExtra("result");
        etSao1SaoResult.setText(result);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sao1SaoResultActivity.this.finish();
            }
        });
    }

}
