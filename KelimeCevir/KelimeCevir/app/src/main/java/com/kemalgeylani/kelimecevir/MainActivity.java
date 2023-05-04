package com.kemalgeylani.kelimecevir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/*
Kullanıcı, uygulama arayüzüne bir kelime girer
ve uygulama kelimeyi tersten çevirir ve sonucu gösterir. Örneğin, "merhaba" kelimesi "abahrem"
şeklinde çevrilebilir. Bunun için, kullanıcı girdisini tersine çeviren bir döngü
kullanabilirsiniz.
*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}