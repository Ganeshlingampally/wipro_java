package com.example;

import jakarta.persistence.*;

@Entity
@Table(name = "transactions")
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String description;
    private double amount;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    public TransactionEntity() {}

    public TransactionEntity(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public Account getAccount() { return account; }
    public void setAccount(Account account) { this.account = account; }

    @Override
    public String toString() {
        return "Transaction [id=" + id + ", description=" + description + ", amount=" + amount + "]";
    }
}
