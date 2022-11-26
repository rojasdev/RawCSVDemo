package com.demo.rawcsvdemo;

public class Income {
    private String month;
    private double gross;
    private double expense;

    public String getMonth() {
        return month;
    }
    public void setMonth(String month) {
        this.month = month;
    }

    public double getGross() {
        return gross;
    }
    public void setGross(double gross) {
        this.gross = gross;
    }

    public double getExpense() {
        return expense;
    }
    public void setExpense(double expense) { this.expense = expense; }

    @Override
    public String toString() {
        return "Income{" +
                "month='" + month + '\'' +
                ", gross=" + gross +
                ", expense=" + expense +
                '}';
    }
}
