package com.auca.StockFlow.model;

import java.time.Instant;

public final class AuthToken {
    private final String token;
    private final Instant issuedAt;
    private final Instant expiresAt;

    public AuthToken(String token, Instant issuedAt, Instant expiresAt) {
        this.token = token;
        this.issuedAt = issuedAt;
        this.expiresAt = expiresAt;
    }

    public String getToken() {
        return token;
    }

    public Instant getIssuedAt() {
        return issuedAt;
    }

    public Instant getExpiresAt() {
        return expiresAt;
    }

}
