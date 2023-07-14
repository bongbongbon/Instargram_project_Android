package com.example.project_instargram;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.project_instargram.common.CommonConn;
import com.example.project_instargram.common.CommonVar;
import com.example.project_instargram.databinding.ActivityLoginBinding;
import com.example.project_instargram.member.MemberVO;
import com.google.gson.Gson;

public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding binding;

    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        actionBar = getSupportActionBar();
        actionBar.hide();

        binding.btnLogin.setOnClickListener(v -> {
        login();
        });

        binding.tvRegister.setOnClickListener(v -> {
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
        });

    }



    public void login(){
        if(binding.edtId.getText().toString().length() < 1 || binding.edtPw.toString().length() < 1){
            Toast.makeText(this, "아이디 또는 패스워드를 입력하세요!", Toast.LENGTH_SHORT).show();
            return;
        }
        CommonConn conn = new CommonConn(this,"member/login");
        conn.addParamMap("id" , binding.edtId.getText().toString());
        conn.addParamMap("pw" , binding.edtPw.getText().toString());
        conn.onExcute((isResult, data) -> {
            if(isResult){
                MemberVO vo = new Gson().fromJson(data, MemberVO.class);
                if (vo==null){
                    Toast.makeText(this, "아이디 또는 비밀번호를 확인하세요", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(this,"로그인성공!", Toast.LENGTH_SHORT).show();
                    CommonVar.loginInfo = vo;
                    Intent intent = new Intent(LoginActivity.this , MainActivity.class);
                    startActivity(intent);
                }

            }

        });

    }





}