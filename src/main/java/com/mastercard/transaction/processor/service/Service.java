package com.mastercard.transaction.processor.service;


import com.mastercard.transaction.processor.domain.Transaction;

import java.util.Optional;
import java.util.concurrent.CompletionStage;

public interface Service {
    CompletionStage<Optional<String>> processTransaction(Transaction tx);
}
