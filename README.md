# CS151-Spring2025-Restaurant

## Overview

This program emulates a restaurant system where the user can enter as an employee or customer and interact with the restaurant's menu and inventory.

## Design

Imagine you're entering the restaurant during the day so there are already some employees and customers inside. You can pretend to be an employee (full-time or part-time) or a customer and get access to different methods according to their respective roles.

Our UI throughout the restaurant uses multiple "Options" screens that can be jumped through back and forth by entering the number corresponding to the option.

**Classes**

- Welcome - the starting place for the program, creates starting data for the restaurant by adding some employees, customers, and menu items

- Employee - abstract super class, creates a standard Employee object (name, phone number, email) with unique employee ids

- FullTimeEmployee - subclass of employee, has "Full-time" job title, salary, access to restaurant admin and inventory management

- PartTimeEmployee - subclass of employee, has "Part-time" job title and hourly wage and access to iventory management

- Customer - properties:(name, email), can place orders using Orderable interface

- Menu - implements InventoryOptions interface to be the inventory and update each menuItem's quantity when an order is placed or item is restocked

- MenuItem - each individual item on the menu (name, category, price, stock)

- Restaurant - acts as the admin or HR, can hire or fire employees

- Options - controls all the UI in the terminal

- Exceptions - Invalid id, invalid pay, invalid item

## Installation Instructions

Use `git clone https://github.com/k3l4nee/CS151-Spring2025-Restaurant.git` in your IDE or text editor.

## Usage

```
javac Welcome.java
java Welcome
```

You may need to scroll back a bit in the terminal to see the displayed results.

## Contributions

- **Eric** - Implemented Employee, FullTimeEmployee, PartTimeEmployee, Restaurant, all UI screens in Options, Welcome, all custom exceptions, worked on Customer, Menu, MenuItem, and updated UML
- **Tina** - Implemented Orderable interface, worked on Customer, Menu, MenuItem, and updated UML
- **Kevin** - Implemented the UML Class Diagram, worked on Menu Class and UIOperations interface
- **Kelani** -
