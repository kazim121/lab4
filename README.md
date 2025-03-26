Pipe and Filters README
Overview
The PipeAndFilters program demonstrates the pipe-and-filter design pattern, where a series of operations (filters) are applied sequentially to a list of data. Each operation processes the data and passes the output to the next filter in the pipeline. This approach promotes modularity, reusability, and readability in data processing workflows.

This implementation processes a list of integers through a sequence of transformations, such as filtering even numbers, squaring values, and adding a constant to each element.

Features
Filter even numbers: Retains only the even numbers from the input list.

Square numbers: Squares each number in the list.

Filter numbers greater than ten: Retains only numbers greater than 10 after squaring.

Add five to each number: Adds 5 to each number in the final list.

The program processes the input data in a series of steps, printing the result at each stage, and finally displaying the processed data after all filters have been applied.

Requirements
Java 8 or later (due to usage of lambda expressions and streams)

Java Development Kit (JDK)

How It Works
Input List: The program starts with a predefined list of integers: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].

Filter Sequence: A list of functions is defined, each representing a transformation or filtering step:

filterEvenNumbers: Retains only even numbers from the list.

squareNumbers: Squares each number in the list.

filterNumbersGreaterThanTen: Filters out any numbers less than or equal to 10.

addFiveToEachNumber: Adds 5 to each number in the list.

Pipeline Execution: The program then executes the pipeline by applying each filter in sequence. The result of each filter is printed at each step.

Final Output: The final result after applying all filters is printed.
