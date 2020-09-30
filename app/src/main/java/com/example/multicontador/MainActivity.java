package com.example.multicontador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.multicontador.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    int contador1;
    int contador2;
    int contador3;
    int contador4;

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.sum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador1++;
                binding.contador1.setText(contador1);
            }
      });

        binding.sum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador2++;
                binding.contador2.setText(contador2);
            }
        });

        binding.sum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador3++;
                binding.sum3.setText(String.valueOf(contador3));;
            }
        });

        binding.sum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador4++;
                binding.contador4.setText(String.valueOf(contador4));
            }
        });
    }
}