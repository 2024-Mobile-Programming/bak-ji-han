package com.example.detailscreenmaster;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.ImageView;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //아이디 연결
        ImageView book_image = findViewById(R.id.book_image);
        EditText book_title = findViewById(R.id.book_title);
        EditText book_author = findViewById(R.id.book_author);
        EditText date = findViewById(R.id.date);
        EditText book_description = findViewById(R.id.book_description);
        Button clearButton = findViewById(R.id.clearButton);
        RatingBar ratingBar1 = findViewById(R.id.ratingBar1);
        Button plusButton = findViewById(R.id.plusButton);
        Button minusButton = findViewById(R.id.minusButton);


        //+버튼과 -버튼의 기능입니다. step size는 0.5로 했습니다.
        plusButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ratingBar1.setRating(ratingBar1.getRating()+ratingBar1.getStepSize());
            }
        });
        minusButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ratingBar1.setRating(ratingBar1.getRating()-ratingBar1.getStepSize());
            }
        });


        // 삭제 버튼
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // EditText 내용 지우기
                book_title.setText("");
                book_author.setText("");
                date.setText("");
                book_description.setText("");
            }
        });
    }
}