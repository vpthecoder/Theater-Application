/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author vedantprakash
 */
@Named(value = "payforTicketsBean")
//session scoped
@SessionScoped
public class PayforTicketsBean implements Serializable {
    //private variables to display data
private int tickets;
 private int total;
 private String number;
 private String result;
 private String date;
 private String name;
 private int authNumber;
    /**
     * Creates a new instance of PayforTicketsBean
     */
    public PayforTicketsBean() {
    }

        //getters and setters
    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAuthNumber() {
        return authNumber;
    }

    public void setAuthNumber(int authNumber) {
        this.authNumber = authNumber;
    }
    
    
        
    
    
    //finds amount to pay
    public String pay()
    {
        total = tickets * 10;
        return "ConfirmandPay.xhtml";
    }
    
    //checks if the credit card number is 16 digits and only has numbers
    public String checkNumber()
    {
         Pattern pattern = Pattern.compile("\\b\\d+\\b");
        Matcher matcher = pattern.matcher(number);
        boolean matchFound = matcher.matches();
        if (number.length() == 16 & matchFound)
        {
            result = "Payment has been received successfully";
            
        }
        else
        {
            result =  "Enter a valid credit card number";
        }
        return "PaymentAccept.xhtml";
    }
    }
