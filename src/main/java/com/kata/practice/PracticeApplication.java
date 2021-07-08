package com.kata.practice;

/**

For this exercise, you are a distributor who needs to order and deliver products to a customer on a specific date.
 1. You use just-in-time ordering to minimize warehousing costs, so you want to order it as late as possible.
 2. It takes one day for you to provide product from your warehouse to your customer.

Manufacturer A sells blue widgets and delivers within two to three business days. Per your contract with this
manufacturer, you can only order on Tuesdays.

Manufacturer B sells green widgets and has next-day delivery. Per your contract with this manufacturer, you can only
order on Fridays.

Manufacturer C sells red widgets and delivers in five to seven business days. You have no contract with this
manufacturer so that you can order from them every day.

Scenarios

Today is Monday, February 3rd, 2020. As a customer, I order three blue widgets to gift them on Valentine's Day.
What day do you as the distributor need to place the order?

Today is Monday, February 4th, 2019. As a customer, I order three blue widgets and two green widgets to gift them on
Valentine's Day. What day do you as the distributor need to place the order?

Today is Monday, February 1st, 2021. As a customer, I order three blue widgets, two green widgets, and one red widget
to gift them on Valentine's Day. What day do you as the distributor need to place the order?

 **/

public class PracticeApplication {

    public static void main(String[] args) {
        PracticeApplication practiceApplication = new PracticeApplication();
        System.out.println(practiceApplication.getText());
    }

    public String getText() {
        return "Hello world!";
    }
}
