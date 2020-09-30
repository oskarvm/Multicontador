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
    int contadorAll;

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.sum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorAll++;
                contador1++;
                binding.contador1.setText(String.valueOf(contador1));
                binding.contadorAll.setText(String.valueOf(contadorAll));

            }
      });

        binding.sum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorAll++;
                contador2++;
                binding.contador2.setText(String.valueOf(contador2));
                binding.contadorAll.setText(String.valueOf(contadorAll));
            }
        });

        binding.sum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorAll++;
                contador3++;
                binding.contador3.setText(String.valueOf(contador3));
                binding.contadorAll.setText(String.valueOf(contadorAll));
            }
        });

        binding.sum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorAll++;
                contador4++;
                binding.contador4.setText(String.valueOf(contador4));
                binding.contadorAll.setText(String.valueOf(contadorAll));
            }
        });

        binding.reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorAll = contadorAll - contador1;
                binding.contadorAll.setText(String.valueOf(contadorAll));
                contador1 = 0;
                binding.contador1.setText(String.valueOf(contador1));
            }
        });

        binding.reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorAll = contadorAll - contador2;
                binding.contadorAll.setText(String.valueOf(contadorAll));
                contador2 = 0;
                binding.contador2.setText(String.valueOf(contador2));
            }
        });

        binding.reset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorAll = contadorAll - contador3;
                binding.contadorAll.setText(String.valueOf(contadorAll));
                contador3 = 0;
                binding.contador3.setText(String.valueOf(contador3));
            }
        });

        binding.reset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorAll = contadorAll - contador4;
                binding.contadorAll.setText(String.valueOf(contadorAll));
                contador4 = 0;
                binding.contador4.setText(String.valueOf(contador4));
            }
        });

        binding.resetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorAll = 0;
                binding.contadorAll.setText(String.valueOf(contadorAll));
                contador1 = 0;
                binding.contador1.setText(String.valueOf(contador1));
                contador2 = 0;
                binding.contador2.setText(String.valueOf(contador2));
                contador3 = 0;
                binding.contador3.setText(String.valueOf(contador3));
                contador4 = 0;
                binding.contador4.setText(String.valueOf(contador4));
            }
        });

    }
}