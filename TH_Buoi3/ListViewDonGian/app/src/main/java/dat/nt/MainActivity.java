package dat.nt;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //Khai báo các biến toàn cục là các biến tham chiếu đến các điều khiển
    Button btnThemTen;
    EditText edtThongTin;
    ListView lsvTen;
    //Bien luu tru danh sach ten
    ArrayList<String> dsTen;
    ArrayAdapter<String> bo_Nguon;
    //Ham lay tham chieu
    void getControls(){
        edtThongTin = findViewById(R.id.edThongTin);
        lsvTen = findViewById(R.id.lvTen);
        btnThemTen = findViewById(R.id.btnThem);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //Ta muốn có ngay list view hiện dữ liẹu khi màn hình được tạo ra và hiện lên
        // nên ta viết tại đây
        getControls();
        //Tao nguon du lieu, danh sach ten
        dsTen = new ArrayList<String>();
        //O day, ta tao cung ( hardcode ) mot danh sach ten
        dsTen.add("Mai");
        dsTen.add("Cúc");
        dsTen.add("Lan");
        dsTen.add("Hồng");
        //Tao adapter va gan vao nguon du lieu
        bo_Nguon = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,dsTen);
        //Cam bo nguon vao danh sach ten
        lsvTen.setAdapter(bo_Nguon);
        //Xử lí sự kiện khi một mục nào đó trong List View được chọn
        lsvTen.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Lay item tai vi tri duoc chon
                String selectedItem = dsTen.get(position);
                //Hien thi Toast
                Toast.makeText(MainActivity.this, "Selected: " + selectedItem, Toast.LENGTH_SHORT).show();
            }
        });
        btnThemTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edtThemTen = findViewById(R.id.edtThem);
                String tenMoi = edtThemTen.getText().toString();
                dsTen.add(tenMoi);
                bo_Nguon.notifyDataSetChanged();
            }
        });
    }
}