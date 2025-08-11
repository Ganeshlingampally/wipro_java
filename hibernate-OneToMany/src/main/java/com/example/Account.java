package com.example;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String accountName;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TransactionEntity> transactions = new ArrayList<>();

    public Account() {}

    public Account(String accountName) {
        this.accountName = accountName;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getAccountName() { return accountName; }
    public void setAccountName(String accountName) { this.accountName = accountName; }

    public List<TransactionEntity> getTransactions() { return transactions; }
    public void setTransactions(List<TransactionEntity> transactions) { this.transactions = transactions; }

    public void addTransaction(TransactionEntity tx) {
        transactions.add(tx);
        tx.setAccount(this);
    }

    public void removeTransaction(TransactionEntity tx) {
        transactions.remove(tx);
        tx.setAccount(null);
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + accountName + "]";
    }
}
