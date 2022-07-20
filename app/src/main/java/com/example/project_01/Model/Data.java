package com.example.project_01.Model;

public class Data {

    private int amount;
    private String type;
    private String description;
    private String id;
    private String date;

    public Data(int amount, String type, String description, String id, String date) {
        this.amount = amount;
        this.type = type;
        this.description = description;
        this.id = id;
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Data(){

    }
    public String togetdata(){
        return   "Date : " + date + "\nType :" + type + "\nAmount : "+ amount;
    }
    


}