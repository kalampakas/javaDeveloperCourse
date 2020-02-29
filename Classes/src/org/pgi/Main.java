package org.pgi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("Carrera");
        System.out.println("Model is "+porsche.getModel());
    }

    public class SimpleCalculator {
        private double firstNumber;
        private double secondNumber;

        public double getFirstNumber(){
            return this.firstNumber;
        }

        public double getSecondNumber(){
            return this.secondNumber;
        }

        public void setFirstNumber(double a) {
            this.firstNumber=a;
        }

        public void setSecondNumber(double a) {
            this.secondNumber=a;
        }

        public double getAdditionResult() {
            return this.firstNumber+this.secondNumber;
        }

        public double getSubtractionResult() {
            return this.firstNumber-this.secondNumber;
        }

        public double getMultiplicationResult() {
            return this.firstNumber*this.secondNumber;
        }

        public double getDivisionResult() {
            if(secondNumber!=0) return this.firstNumber/this.secondNumber;
            else return 0;
        }
    }

    public class Person {
        // write your code here
        private String firstName;
        private String lastName;
        private int age;

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getAge() {
            return this.age;
        }

        public void setFirstName(String name) {
            this.firstName=name;
        }

        public void setLastName(String name) {
            this.lastName=name;
        }

        public void setAge(int age) {
            if(age<0 || age>100) this.age=0;
            else this.age=age;
        }

        public boolean isTeen() {
            return (this.age>12 && this.age<20);
        }

        public String getFullName() {
            if(this.firstName.isEmpty() && this.lastName.isEmpty()) return "";
            else if(this.lastName.isEmpty()) return this.firstName;
            else if(this.firstName.isEmpty()) return this.lastName;
            else return this.firstName+" "+this.lastName;
        }
    }
}
