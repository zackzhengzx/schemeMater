package com.wuwen.zackxd.scheme;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * H5唤起功能页面
 */
public class SchemeActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String data =getIntent().getData().getQueryParameter("page");

//       结果值 显示出来 ，本Demo提供演示地址 http://gylmvip.club/github/h5-scheme.html ，浏览器访问本地址

// Toast.makeText(this,data,Toast.LENGTH_LONG).show();

        AlertDialog.Builder dialog = new  AlertDialog.Builder(this);
        dialog.setTitle("提示").setMessage(data).setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                finish();
            }
        });
        dialog.create().show();


    }
}
