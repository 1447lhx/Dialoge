package cn.edu.bistu.cs.cnse.edu.bistu.cs.se.dialoge;

import android.app.AlertDialog;
 import android.app.Dialog;
 import android.content.DialogInterface;
 import android.support.v7.app.AppCompatActivity;
 import android.os.Bundle;
 import android.view.LayoutInflater;
 import android.view.View;
 import android.widget.Button;
 import android.widget.EditText;
 import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.buttonTest);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                // Get the layout inflater
                LayoutInflater inflater = getLayoutInflater();
                builder.setView(inflater.inflate(R.layout.login_dialoge, null))
                        .setTitle("登录")
                        .setPositiveButton("登录", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                EditText text_username = (EditText)findViewById(R.id.editTextUserId);
                                EditText text_password = (EditText) findViewById(R.id.editTextPwd);
                                String username = text_username.getText() + "";
                                String password = text_password.getText() + "";

                                if(username.equals("abc")&&password.equals("123"))
                                    Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_LONG).show();
                                else
                                    Toast.makeText(MainActivity.this, "登录失败", Toast.LENGTH_LONG).show();
                                dialog.cancel();
                            }
                        });


                builder.show();
            }
        });
    }}