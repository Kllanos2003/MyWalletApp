package com.kevinllanos.mywalletapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ListAccountActivity extends AppCompatActivity {

    private ArrayList<Account> listAccountRv = new ArrayList<>();
    private RecyclerView rvListAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_account);
        loadFakeData();

        rvListAccount = findViewById(R.id.rv_accounts);

        AccountAdapter myAdapter = new AccountAdapter(listAccountRv);
        rvListAccount.setAdapter(myAdapter);

        rvListAccount.setLayoutManager(new LinearLayoutManager(ListAccountActivity.this));
    }

    private void loadFakeData(){
        Account myAccount1 = new Account("Bancolombia" , "Cuenta Corriente", 1000012.0, "https://upload.wikimedia.org/wikipedia/commons/8/81/Logo_Bancolombia2.png");
        Account myAccount2 = new Account("Davivienda" , "Cuenta Ahorros", 5316532.0, "https://pbs.twimg.com/profile_images/1002552048620134400/qZ1XCo_9_400x400.jpg");
        Account myAccount3 = new Account("Bogota" , "Tarjeta Creadito", 78465465.0 , "https://storage.googleapis.com/img-searcher-ath/images/bogotaIconBancoCuadrado.png");
        listAccountRv.add(myAccount1);
        listAccountRv.add(myAccount2);
        listAccountRv.add(myAccount3);
    }

}