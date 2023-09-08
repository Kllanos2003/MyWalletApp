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
        loadFakeData();
    }

    private void loadFakeData(){
        Account myAccount1 = new Account("Bancolombia" , "Cuenta Corriente", 1000012.0);
        Account myAccount2 = new Account("Davivienda" , "Cuenta Ahorros", 5316532.0);
        Account myAccount3 = new Account("Bancolombia" , "Tarjeta Creadito", 78465465.0);
        listAccountRv.add(myAccount1);
        listAccountRv.add(myAccount2);
        listAccountRv.add(myAccount3);
    }

}