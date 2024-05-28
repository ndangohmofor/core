package com.meufty.ws.core.events;

import java.math.BigDecimal;

public class DepositRequestEvent {
    private String senderId;
    private String recepientId;
    private BigDecimal amount;

    public DepositRequestEvent() {
    }

    public DepositRequestEvent(String senderId, String recepientId, BigDecimal amount) {
        this.senderId = senderId;
        this.recepientId = recepientId;
        this.amount = amount;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getRecepientId() {
        return recepientId;
    }

    public void setRecepientId(String recepientId) {
        this.recepientId = recepientId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
