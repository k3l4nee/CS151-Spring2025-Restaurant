# CS151-Spring2025-Restaurant

## Overview

This program emulates a restaurant system where the user can enter as an employee or customer and interact with the restaurant's menu, tables, or inventory.

## Design

Imagine you're entering the restaurant during the day so there are already some employees and customers inside. You can pretend to be an employee (full-time or part-time) or a customer and get access to different methods according to their respective roles.\

Our navigation throughout the restaurant uses multiple "Options" screens that can be jumped through back and forth by entering the number corresponding to the option.\

**Classes**

- Welcome - the starting place for the program, creates starting data for the restaurant by adding some employees and customers

- Employee - abstract super class, creates a standard Employee object with unique employee ids

- FullTimeEmployee - subclass of employee, has "Full-time" job title, salary, access to restaurant admin

- PartTimeEmployee - subclass of employee, has "Part-time" job title and hourly wage

- Customer - can place orders using Orderable

- Menu - acts as the inventory and keeps track of each menuItem's quantity

- Restaurant - acts as the admin or HR, can add or remove employees, customers, or tables

- Table - uses Reservable interface to reserve tables

- Options - controls all the option screens/menus in the terminal

## Installation Instructions

Use `git clone https://github.com/k3l4nee/CS151-Spring2025-Restaurant.git` in your IDE or text editor.

## Usage

```
javac Welcome.java
java Welcome
```

You may need to scroll back a bit in the terminal to see the displayed results.

## Contributions

- **Eric** - Implemented Employee, FullTimeEmployee, PartTimeEmployee, Restaurant, Options, Welcome
- **Tina** -
- **Kevin** -
- **Kelani** -
