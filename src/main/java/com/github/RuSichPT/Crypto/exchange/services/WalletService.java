package com.github.RuSichPT.Crypto.exchange.services;

import com.github.RuSichPT.Crypto.exchange.repositories.entities.Wallet;
import org.json.JSONObject;

import java.util.HashMap;

public interface WalletService {

    Integer saveWallet(Wallet wallet);

    Wallet createWallet();

    HashMap<String, String> fillUpWallet(JSONObject jsonObject, Wallet wallet);

    HashMap<String, String> withdrawWallet(JSONObject jsonObject, Wallet wallet);

}