package com.example.project_instargram;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.project_instargram.common.CommonConn;
import com.example.project_instargram.common.CommonVar;
import com.example.project_instargram.databinding.ActivityRegisterBinding;
import com.example.project_instargram.member.MemberVO;
import com.google.gson.Gson;

import java.lang.reflect.Member;

public class RegisterActivity extends AppCompatActivity {

    ActivityRegisterBinding binding;
    
    String idcheckstatus;
    
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        actionBar = getSupportActionBar();
        actionBar.hide();


        //로그인 페이지로 이동
        binding.tvRegister.setOnClickListener(v -> {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        });

        //아이디 중복확인
        binding.btnIdCheck.setOnClickListener(v -> {
            idcheck();
        });

        //회원가입 버튼
        binding.btnRegister.setOnClickListener(v -> {
            if(idcheckstatus == "true"){
                register();
            }else if(idcheckstatus == "false"){
                Toast.makeText(this, "동일한 아이디가 가입되어 있습니다", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "아이디의 중복여부를 확인해주세요", Toast.LENGTH_SHORT).show();
            }

        });


    }








    public void idcheck(){
        CommonConn conn = new CommonConn(this, "member/idCheck");
        conn.addParamMap("id" , binding.edtId.getText().toString());

        if(binding.edtId.getText().toString().length() < 1){
            Toast.makeText(this,"아이디를 입력해주세요" , Toast.LENGTH_SHORT).show();
            return;
        }

        conn.onExcute((isResult, data) -> {
            if (isResult){
                 String test = new Gson().fromJson(data,String.class);
                if(test.equals("true")){
                    Toast.makeText(this, "사용가능한 아이디입니다.", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(this, "중복된 아이디입니다.", Toast.LENGTH_SHORT).show();
                }
                idcheckstatus = test;

            }

        });

    }


    //회원가입 기능
    public void register(){

        //사용자가 회원가입 칸에 입력하지 않을때 처리
        if(binding.edtId.getText().toString().length() < 1){
            Toast.makeText(this, "휴대폰번호 또는 이메일주소를 입력해주세요", Toast.LENGTH_SHORT).show();
            return;
        }else if (binding.edtName.getText().toString().length() < 1) {
            Toast.makeText(this, "성명을 입력해주세요", Toast.LENGTH_SHORT).show();
            return;
        }else if (binding.edtUsername.getText().toString().length() < 1) {
            Toast.makeText(this, "사용자 이름을 입력해주세요", Toast.LENGTH_SHORT).show();
            return;
        }else if (binding.edtPw.getText().toString().length() < 6) {
            Toast.makeText(this, "비밀번호는 6자 이상 입력해주세요.", Toast.LENGTH_SHORT).show();
            return;
        }


        CommonConn conn = new CommonConn(this, "member/register");
        conn.addParamMap("id", binding.edtId.getText().toString());
        conn.addParamMap("name", binding.edtName.getText().toString());
        conn.addParamMap("username", binding.edtUsername.getText().toString());
        conn.addParamMap("pw", binding.edtPw.getText().toString());

        conn.onExcute((isResult, data) -> {
            if (isResult){
                    Toast.makeText(this,"회원가입이 완료되었습니다", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(this, LoginActivity.class);
                    startActivity(intent);
                }


        });

    }
}