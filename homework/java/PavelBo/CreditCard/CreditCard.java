package by.jrr.start.bean;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.constant.Constable;

public class CreditCard {
    private String cardNumber;
    private String pinCode;
    private double balance;
    private double creditLimit;
    private double indebtedness;

    public int getTempInt() {
        return tempInt;
    }

    private int tempInt;

    private Logger log = LoggerFactory.getLogger("");

    public CreditCard(String cardNumber, String pinCode) throws Exception {
        String regexCardNumber = "\\d{16}";
        if (cardNumber.matches(regexCardNumber)) this.cardNumber = cardNumber;
        else {
            throw new Exception("Номер карты введен некорректно. Номер карты должен содердать 16 цифр.");
        }
        String regexPinCode = "\\d{4}";
        if (pinCode.matches(regexPinCode)) this.pinCode = pinCode;
        else {
            throw new Exception("ПИН код введен некорректно. ПИН код должен содердать 4 цифры.");
        }
        this.balance = 0;
        this.indebtedness = 0;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    private String getPinCode() {
        return pinCode;
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) throws Exception {
        if (creditLimit >= 0) this.creditLimit = creditLimit;
        else {
            throw new Exception("Кредитный лимит не может быть отрицательным");
        }
    }

    public double getIndebtedness() {
        return indebtedness;
    }

    public void setIndebtedness(double indebtedness) {
        this.indebtedness = indebtedness;
    }

    public  boolean deposit(double moneyToCard, String pinCode){
        if (pinCode.equals(this.pinCode)){
            if (this.indebtedness == 0) {
                this.balance += moneyToCard;
            } else if (this.indebtedness > 0) {
                this.indebtedness -= moneyToCard;
                if (this.indebtedness < 0){
                    this.balance = this.indebtedness * (-1);
                    this.indebtedness = 0;
                }
            }
            return true;
        } else  return false;

    }

    public  boolean withdraw(double moneyFromCard, String pinCode){
        tempInt = 0;
        if (pinCode.equals(this.pinCode)){
            if (this.balance > 0) {
                this.balance -= moneyFromCard;
                if (this.balance  < 0) {
                    if(this.creditLimit >= (this.balance * (-1))){
                        this.indebtedness = this.balance * (-1);
                        this.balance = 0;
                    }else return false;
                } else return true;
            } else {
                if((this.creditLimit - this.indebtedness) >= moneyFromCard) {
                    this.indebtedness += moneyFromCard;
                    return true;
                } else return false;
            } return true;
        } else {
            ++tempInt;
            return false;
        }
    }
}
