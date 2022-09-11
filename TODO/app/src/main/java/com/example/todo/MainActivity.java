package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public ListView listView1;
    public ArrayList<String> arrayCourse;
    public FloatingActionButton button, buttonEdit, buttonDelete;
    EditText editText;
    int vitri = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        listView1 = findViewById(R.id.list_item1);
        button = findViewById(R.id.btnThem);
        buttonEdit = findViewById(R.id.btnCapNhat);
        buttonDelete = findViewById(R.id.btnDelete);
        arrayCourse = new ArrayList<>();

        arrayCourse.add("Trung Anh");
        arrayCourse.add("Trung Anh");
        arrayCourse.add("Trung Anh");
        arrayCourse.add("Trung Anh");


        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, arrayCourse);

        listView1.setAdapter(adapter);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                editText.setText(arrayCourse.get(i));
                vitri = i;
            }
        });

        buttonEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayCourse.set(vitri, editText.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                arrayCourse.remove(vitri);
                adapter.notifyDataSetChanged();

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Todolist = editText.getText().toString();
                arrayCourse.add(Todolist);
                adapter.notifyDataSetChanged();
            }
        });
    }


}