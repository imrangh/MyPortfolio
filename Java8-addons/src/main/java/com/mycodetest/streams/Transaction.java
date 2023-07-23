package com.mycodetest.streams;

public class Transaction {
    private int id;
    private int value;

    private String type;

    public String getType() {
        return type;
    }



    public Transaction(int id, int value, String type) {
        this.id = id;
        this.value = value;
        this.type = type;
    }

    public static final String GROCERY = "GROCERY";

    public Transaction(int id, int value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public int getValue() {
        return value;
    }


}
