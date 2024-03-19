package dat.nt;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //Khai bao cac doi tuong gan voi dieu khien tuong ung o day
    EditText edtso1;
    EditText edtso2;
    EditText edtKQ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
    }

    void TimDieuKhien(){
        edtso1 = findViewById(R.id.edtSo1);
        edtso2 = findViewById(R.id.edtSo2);
        edtKQ = findViewById(R.id.edtKetQua);
    }
    public void XuLyCong(View view){
        // Lay du lieu tu dieu khien cat vao bien
        String soThuNhat = edtso1.getText().toString();
        String soThuHai = edtso2.getText().toString();
        //Chuyen chuoi sang so
        Float so1 = Float.parseFloat(soThuNhat);
        Float so2 = Float.parseFloat(soThuHai);
        float tong = so1 + so2;
        String chuoiKetQua = String.valueOf(tong);
        edtKQ.setText(chuoiKetQua);
    }

    public void XuLyTru(View view){
        // Lay du lieu tu dieu khien cat vao bien
        String soThuNhat = edtso1.getText().toString();
        String soThuHai = edtso2.getText().toString();
        //Chuyen chuoi sang so
        Float so1 = Float.parseFloat(soThuNhat);
        Float so2 = Float.parseFloat(soThuHai);
        float tong = so1 - so2;
        String ketqua = String.valueOf(tong);
        edtKQ.setText(ketqua);
    }
    public void XuLyNhan(View view){
        //Tim dieu khien can xu li
        // Lay du lieu tu dieu khien cat vao bien
        String soThuNhat = edtso1.getText().toString();
        String soThuHai = edtso2.getText().toString();
        //Chuyen chuoi sang so
        Float so1 = Float.parseFloat(soThuNhat);
        Float so2 = Float.parseFloat(soThuHai);
        float tong = so1 * so2;
        String ketqua = String.valueOf(tong);
        edtKQ.setText(ketqua);
    }
    public void XuLyChia(View view){
        // Lay du lieu tu dieu khien cat vao bien
        String soThuNhat = edtso1.getText().toString();
        String soThuHai = edtso2.getText().toString();
        //Chuyen chuoi sang so
        Float so1 = Float.parseFloat(soThuNhat);
        Float so2 = Float.parseFloat(soThuHai);
        float tong = so1 / so2;
        String ketqua = String.valueOf(tong);
        edtKQ.setText(ketqua);
    }
}