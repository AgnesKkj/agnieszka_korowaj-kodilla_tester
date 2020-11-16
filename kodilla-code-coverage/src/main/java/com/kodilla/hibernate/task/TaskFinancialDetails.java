package com.kodilla.hibernate.task;

import java.math.BigDecimal;

public class TaskFinancialDetails {
    int id;
    BigDecimal price;
    boolean paid;

    public TaskFinancialDetails() {

    }

    public TaskFinancialDetails(int id, BigDecimal price, boolean paid) {
        this.id = id;
        this.price = price;
        this.paid = paid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
