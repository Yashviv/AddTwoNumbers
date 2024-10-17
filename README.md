# Add Two Numbers Project

This project implements a solution for adding two numbers represented by linked lists. The numbers are stored in reverse order, and each node contains a single digit.

## Problem Description

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

## Technologies Used

- Java
- JUnit 5
- Maven (for dependency management and building)

## How to Run the Project

### Prerequisites

- Java 11 or later
- Maven

### Steps

1. Clone this repository:
    ```bash
    git clone https://github.com/username/AddTwoNumbersProject.git
    ```

2. Navigate to the project directory:
    ```bash
    cd AddTwoNumbersProject
    ```

3. Run the tests using Maven:
    ```bash
    mvn test
    ```

## Test Cases

The following test cases are covered in `SolutionTest.java`:

1. **Same Length Lists**: `(2 -> 4 -> 3) + (5 -> 6 -> 4) = 7 -> 0 -> 8`
2. **One List is Empty**: `null + (1 -> 2 -> 3) = 1 -> 2 -> 3`
3. **Both Lists Are Empty**: `null + null = null`
4. **Different Lengths with Carrying**: `(9 -> 9) + (1) = 0 -> 0 -> 1`
5. **Large Numbers with Multiple Carries**: `(9 -> 9 -> 9 -> 9 -> 9) + (1) = 0 -> 0 -> 0 -> 0 -> 0 -> 1`
6. **Single Node Lists**: `(5) + (5) = 0 -> 1`
7. **All Zeros**: `(0 -> 0 -> 0) + (0 -> 0) = 0 -> 0 -> 0`

## License

This project is open-source and available under the MIT License.
