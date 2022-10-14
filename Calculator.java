class Calculator
{
String brand; 
int price; 

Calculator(String brand, int price) // parameterized constructor
{
System.out.println("No-args Constructor");
}
Calculator() // Zero-args 
{

}
public static void main(String[] args)
{
Calculator calc2 = new Calculator();
Calculator calc = new Calculator("casio", 750);


// default constructor is invisible. 
// default constructor is taken out. It is being overloaded 
//and called as parameterized constructor
}

}
