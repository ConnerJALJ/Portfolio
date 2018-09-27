<!doctype html>
<html lang="en">
  <head>
    <title>CS249 Assignments</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css" integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B" crossorigin="anonymous">
    <link rel="stylesheet" href="assets/css/style.css">
  </head>
  <!--Style the body's background for all browsers-->
  <body style="background: url(assets/images/triangles-1430105.svg) no-repeat center center fixed; 
               -webkit-background-size: cover;
               -moz-backgournd-size: cover;
               -o-backgournd-size: cover;
               background-size: cover;">
    <!--Start Navbar-->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark nav-shadow">
      <span class="navbar-brand mb-0 h1">CS249 Assignments</span>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <div class="navbar-nav">
          <a href="/" class="nav-item nav-link active">Home<span class="sr-only">(current)</span></a>
          <a href="CS249" class="nav-item nav-link">CS249 Assignments</a>
          <a href="#" class="nav-item nav-link disabled">Coming Soon</a>
        </div>
      </div>  
    </nav>
    <!--End Navbar-->
    <!--Start Assignment Cards-->
    <div class="container-fluid" style="padding-top: 50px;">
      <div class="row">
        <div class="col-12 col-sm-3 p-3 d-flex">
          <div class="card text-white bg-secondary card-shadow align-self-stretch flex-fill">
            <div class="card-header"><h4><Strong>Hello World</Strong></h4></div>
            <div class="card-body d-flex flex-wrap">
              <p class="card-text">Basic Hello World program.</p>
              <p class="card-text">Language: Java
                <br>Rough Date: September 2018
                <br>Author: Conner LaPage-Jenkins
              </p>
              <a href="assets/CS249Assignments/proj1.java" class="btn btn-primary align-self-end" target="_blank">proj1.java</a>
            </div>
          </div>
        </div>
        <div class="col-12 col-sm-9 p-3">
          <div class="card text-white bg-secondary card-shadow">
            <div class="card-header"><h4><Strong>Classroom Project Grades</Strong></h4></div>
            <div class="card-body">
              <h6 class="card-subtitle mb-3"><em>LABEL: V5_Project_11_page_97</em></h6>
              <p class="card-text"> Write a program that calculates the total grade for three classroom exercises as a
                percentage. Use the DecimalFormat class to output the value as a percent. The
                scores should be summarized in a table. Input the assignment information in this
                order: name of assignment (may include spaces), points earned (integer), and total
                points possible (integer). The percentage is the sum of the total points earned divided
                by the total points possible.
              </p>
              <p class="card-text">Language: Java
                <br>Rough Date: September 2018
                <br>Author: Conner LaPage-Jenkins
              </p>
              <a href="assets/CS249Assignments/proj2.java" class="btn btn-primary" target="_blank">proj2.java</a>
            </div>
          </div>
        </div>
        <div class="col-12 p-3">
          <div class="card text-white bg-secondary card-shadow">
            <div class="card-header"><h4><Strong>Single Pizza Order</Strong></h4></div>
            <div class="card-body">
              <h6 class="card-subtitle mb-3"><em>LABEL: V5_Project_11_page_257</em></h6>
              <p class="card-text">
                Create a class named Pizza that stores information about a single pizza. It should contain the following:
                <ul>
                  <li>Private instance variables to store the size of the pizza (either small, medium, or large), the number of cheese toppings, the number of pepperoni toppings, and the number of ham toppings.</li>
                  <li>Constructor(s) that set all of the instance variables.</li>
                  <li>Public methods to get and set the instance variables.</li>
                  <li>A public method named calcCost( ) that returns a double that is the cost of the pizza.</li>
                </ul>
                Pizza cost is determined by:
                <ul>
                  <li>Small: $10 + $2 per topping</li>
                  <li>Medium: $12 + $2 per topping</li>
                  <li>Large: $14 + $2 per topping</li>
                </ul>
                A public method named getDescription( ) that returns a String containing
                the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost( ).
                Write test code to create several pizzas and output their descriptions.
                For example, a large pizza with one cheese, one pepperoni and two ham toppings should cost a total of $22.
              </p>
              <p class="card-text">Language: Java
                <br>Rough Date: September 2018
                <br>Author: Conner LaPage-Jenkins
              </p>
              <a href="assets/CS249Assignments/proj3_all/proj3_11_test.java" class="btn btn-primary" target="_blank">proj3_11_test.java</a>
              <a href="assets/CS249Assignments/proj3_all/Pizza.java" class="btn btn-primary" target="_blank">Pizza.java</a>
            </div>
          </div>
        </div>
        <div class="col-12 p-3">
          <div class="card text-white bg-secondary card-shadow">
            <div class="card-header"><h4><Strong>Multiple Pizzas Order</Strong></h4></div>
            <div class="card-body">
              <h6 class="card-subtitle mb-3"><em>LABEL: V5_Project_12_page_257</em></h6>
              <p class="card-text">
                This programming project extends Programming Project 4.11. 
                Create a PizzaOrder class that allows up to three pizzas to be saved in an order. 
                Each pizza saved should be a Pizza object as described in Programming Project 4.11. 
                In addition to appropriate instance variables and constructors, add the following methods:
                <ul>
                  <li>public void setNumPizzas(int numPizzas) —sets the number of pizzas</li>
                  <li>in the order. numPizzas must be between 1 and 3</li>
                  <li>public void setPizza1(Pizza pizza1) —sets the first pizza in the order</li>
                  <li>public void setPizza2(Pizza pizza2) —sets the second pizza in the order</li>
                  <li>public void setPizza3(Pizza pizza3) —sets the third pizza in the order</li>
                  <li>public double calcTotal() —returns the total cost of the order</li>
                </ul>
                Write a main method to test the class. The setPizza2 and setPizza3 methods will 
                be used only if there are two or three pizzas in the order, respectively. 
                Sample code illustrating the methods is shown below. Note that first three lines are incomplete. 
                You must complete them as part of the Programming Project.
                <ul>
                  <li>Pizza pizza1 = // Code to create a large pizza, 1 cheese, 1 ham</li>
                  <li>Pizza pizza2 = // Code to create a medium pizza, 2 cheese, 2 pepperoni</li>
                  <li>PizzaOrder order = // Code to create an order</li>
                  <li>order.setNumPizzas(2); // 2 pizzas in the order</li>
                  <li>order.setPizza1(pizza1); // Set first pizza</li>
                  <li>order.setPizza2(pizza2); // Set second pizza</li>
                  <li>double total = order.calcTotal(); // Should be 18+20 = 38</li>
                </ul>
              </p>
              <p class="card-text">Language: Java
                <br>Rough Date: September 2018
                <br>Author: Conner LaPage-Jenkins
              </p>
              <a href="assets/CS249Assignments/proj3_all/proj3_12_test.java" class="btn btn-primary" target="_blank">proj3_12_test.java</a>
              <a href="assets/CS249Assignments/proj3_all/Pizza.java" class="btn btn-primary" target="_blank">Pizza.java</a>
              <a href="assets/CS249Assignments/proj3_all/PizzaOrder.java" class="btn btn-primary" target="_blank">PizzaOrder.java</a>
            </div>
          </div>
        </div>
        <div class="col-sm-6 col-md-4 pt-4 ">
          <div class="card text-white bg-secondary card-shadow">
            <div class="card-header"><h4><Strong>unknown</Strong></h4></div>
            <div class="card-body">
              <p class="card-text">Project yet to be Assigned and/or Completed</p>
              <a href="#" class="btn btn-primary">unkown</a>
            </div>
          </div>
        </div>
        <div class="col-sm-6 col-md-4 pt-4">
          <div class="card text-white bg-secondary card-shadow">
            <div class="card-header"><h4><Strong>unknown</Strong></h4></div>
            <div class="card-body">
              <p class="card-text">Project yet to be Assigned and/or Completed</p>
              <a href="#" class="btn btn-primary">unkown</a>
            </div>
          </div>
        </div>        
        <div class="col-sm-6 col-md-4 pt-4">
          <div class="card text-white bg-secondary card-shadow">
            <div class="card-header"><h4><Strong>unknown</Strong></h4></div>
            <div class="card-body">
              <p class="card-text">Project yet to be Assigned and/or Completed</p>
              <a href="#" class="btn btn-primary">unkown</a>
            </div>
          </div>
        </div>
        <div class="col-sm-6 col-md-4 pt-4">
          <div class="card text-white bg-secondary card-shadow">
            <div class="card-header"><h4><Strong>unknown</Strong></h4></div>
            <div class="card-body">
              <p class="card-text">Project yet to be Assigned and/or Completed</p>
              <a href="#" class="btn btn-primary">unkown</a>
            </div>
          </div>
        </div>
        <div class="col-sm-6 col-md-4 pt-4">
          <div class="card text-white bg-secondary card-shadow">
            <div class="card-header"><h4><Strong>unknown</Strong></h4></div>
            <div class="card-body">
              <p class="card-text">Project yet to be Assigned and/or Completed</p>
              <a href="#" class="btn btn-primary">unkown</a>
            </div>
          </div>
        </div>  
      </div> 
    </div>
    <!--End Assignment Cards-->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/js/bootstrap.min.js" integrity="sha384-o+RDsa0aLu++PJvFqy8fFScvbHFLtbvScb8AjopnFD+iEQ7wo/CG0xlczd+2O/em" crossorigin="anonymous"></script>
    </body>
</html>    