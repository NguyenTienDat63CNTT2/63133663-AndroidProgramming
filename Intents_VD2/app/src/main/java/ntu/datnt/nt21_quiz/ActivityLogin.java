package ntu.datnt.nt21_quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnOK = findViewById(R.id.btnXacNhan);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Xu li dang nhap
                //Lay du lieu
                //B1. Tim tham chieu den dk
                EditText edtTenDN = findViewById(R.id.edtUserName);
                EditText edtPass = findViewById(R.id.edtPassWord);
                //B2. Lay du lieu
                String tenDangNhap = edtTenDN.getText().toString();
                String matKhau = edtPass.getText().toString();
                //Kiem tra mat khau
                if(tenDangNhap.equals("maicuongtho")&&matKhau.equals("123")){
                    // mat khau dung
                    //Chuyen sang man hinh home
                    Intent iQuiz = new Intent(ActivityLogin.this,HomeActivity.class);
                    //Goi du lieu vao iQuiz
                    iQuiz.putExtra("ten_dang_nhap",tenDangNhap);
                    iQuiz.putExtra("mat_khau",matKhau);
                    //Gui di
                    startActivity(iQuiz);

                }else{
                    Toast.makeText(ActivityLogin.this,"BẠN NHẬP SAI THÔNG TIN",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}