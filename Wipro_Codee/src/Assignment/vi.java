package Assignment;

import java.util.*;

abstract class Bank {
    String accNo;
    String custName;
    int custGender; // 1 = Male, 2 = Female
    String custJob;
    double curBal;

    public Bank(String accNo, String custName, int custGender, String custJob, double curBal) {
        this.accNo = accNo;
        this.custName = custName;
        this.custGender = custGender;
        this.custJob = custJob;
        this.curBal = curBal;
    }

    public abstract double calcBalance();

    public String toString() {
        String gender = (custGender == 1) ? "Male" : "Female";
        return "Account No: " + accNo + "\nCustomer Name: " + custName +
               "\nGender: " + gender + "\nJob: " + custJob +
               "\nCurrent Balance: " + curBal;
    }

    public String getAccNo() {
        return accNo;
    }
}

// Subclass Saving
class Saving extends Bank {
    double savRate;

    public Saving(String accNo, String custName, int custGender, String custJob, double curBal, double savRate) {
        super(accNo, custName, custGender, custJob, curBal);
        this.savRate = savRate;
    }

    @Override
    public double calcBalance() {
        return curBal + (savRate * curBal);
    }
}

// Subclass Current
class Current extends Bank {
    boolean fixedDep;
    double curRate;

    public Current(String accNo, String custName, int custGender, String custJob, double curBal, double curRate, boolean fixedDep) {
        super(accNo, custName, custGender, custJob, curBal);
        this.curRate = curRate;
        this.fixedDep = fixedDep;
    }

    @Override
    public double calcBalance() {
        double balance = curBal + (curRate * curBal);
        if (fixedDep) {
            balance -= 150; // service fee
        }
        return balance;
    }

    public boolean hasFixedDeposit() {
        return fixedDep;
    }
}

