package com.kevinllanos.mywalletapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class AccountAdapter extends RecyclerView.Adapter<AccountAdapter.ViewHolder> {

        private ArrayList<Account> dataset;

    public AccountAdapter(ArrayList<Account> dataset) {
        this.dataset = dataset;
    }

    @NonNull
        @Override
        public AccountAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_account_list, parent, false);
            return new ViewHolder(myView);
        }

        @Override
        public void onBindViewHolder(@NonNull AccountAdapter.ViewHolder holder, int position) {
        Account myAccount= dataset.get(position);
        holder.loadItem(myAccount);

        }

        @Override
        public int getItemCount() {
            return dataset.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvName, tvCurrentValue, tvType;
        private ImageView ivPrincipal;
            public ViewHolder(@NonNull View itemView) {

                super(itemView);

                tvName = itemView.findViewById(R.id.tv_nombre);
                tvCurrentValue = itemView.findViewById(R.id.tv_dinero);
                tvType = itemView.findViewById(R.id.tv_tipo);
            }

            public void loadItem(Account myAccount) {
                tvName.setText(myAccount.getName());
                tvCurrentValue.setText(String.valueOf(myAccount.getCurrentValue()));
                tvType.setText(myAccount.getTypeAccount());
            }
        }
    }
