package com.github.RuSichPT.Crypto.exchange.repositories.entities;

public enum TransactionName {
    ADD("add"),
    SUBTRACT("subtract"),
    EXCHANGE("exchange");

    private final String name;

    TransactionName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}