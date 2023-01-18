package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    public boolean cheeseCheck=false;
    public boolean toggleCheck=false;
    public  boolean bagCheck=false;
    public  String cheeseString;
    public  String toggleString;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg){
            price=300;
            bill="Base Price Of The Pizza: 300\n";
        }
        else{
            price=400;
            bill="Base Price Of The Pizza: 400\n";
        }
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!cheeseCheck)
        cheeseString="Extra Cheese Added: 80\n";
        cheeseCheck=true;

    }

    public void addExtraToppings(){
        // your code goes here
        if(!toggleCheck){
            if(isVeg) toggleString="Extra Toppings Added: 70\n";
            else{
                toggleString="Extra Toppings Added: 120\n";
            }
        }
        toggleCheck=true;

    }

    public void addTakeaway(){
        // your code goes here
//        if(!bagCheck)
//        bill=bill+
        bagCheck=true;
    }

    public String getBill(){
        // your code goes here
        int total=0;
        String fakeBill="";

        if(cheeseCheck){
            total+=80;
            fakeBill+=cheeseString;
        }
        if(isVeg){
            total+=300;
            if(toggleCheck){
                total+=70;
                fakeBill+=toggleString;
            }

        }
        else{
            total+=400;
            if(toggleCheck){
                total+=120;
                fakeBill+=toggleString;
            }
        }
        if(bagCheck){
            total+=20;
            fakeBill+="Paperbag Added: 20\n";
        }
//        bill=bill+fakeBill+"Total Price: "+total+"\n";
        return this.bill+fakeBill+"Total Price: "+total+"\n";
    }
}
