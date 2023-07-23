package com.mycodetest.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class MyTransactions {

    public static void main(String[] args) {

        List<Transaction> transactions = TransactionDB.getTransactions();

        List<Integer> txnIds = transactions.stream()
                .filter(t -> Objects.equals(t.getType(), Transaction.GROCERY))
                .sorted(Comparator.comparing(Transaction::getValue).reversed())
                .map(Transaction::getId)
                .toList();

        System.out.println(txnIds);

    }
}
