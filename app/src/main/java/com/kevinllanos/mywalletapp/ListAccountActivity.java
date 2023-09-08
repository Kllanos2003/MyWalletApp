package com.kevinllanos.mywalletapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class ListAccountActivity extends AppCompatActivity {

    private ArrayList<Account> listAccountRv = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_account);
    }

    private void loadFakeData(){
        Account myAccount1 = new Account("Bancolombia" , "Cuenta Corriente", 1000012.0);
    }

}