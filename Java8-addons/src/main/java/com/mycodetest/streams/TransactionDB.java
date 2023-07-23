package com.mycodetest.streams;

import java.util.ArrayList;
import java.util.List;

public class TransactionDB {

    public static List<Transaction> getTransactions(){

        ArrayList<Transaction> transactions = new ArrayList<>();
         transactions.add(new Transaction(1, 100));
         transactions.add(new Transaction(3, 80, Transaction.GROCERY));
         transactions.add(new Transaction(6, 120, Transaction.GROCERY));
         transactions.add(new Transaction(7, 40));
         transactions.add(new Transaction(10,50, Transaction.GROCERY));

         return  transactions;

    }
}
