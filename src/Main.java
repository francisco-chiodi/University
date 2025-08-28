public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public class Example{
        public int x;
        public int a;

        public void makingSomething(){
            x=1 + a *3;
        }

        public int sum(){
            return x + a;
        }

        public void print{

        }

    }
}



/*

Syntax classes

public class NameClass{
<atibutes>
<constructors>
<methods>
}

public class NameClass{
<atributes>
<constructors>
<methods>
}

public interface Interface{
<contrac of methods>
}

public interface Interface{
<contract of methods>
}

public enum Enum{
<fixed constants>
}

public enum Enum{
<fixed constants>
}

public record Record{
<inmutable data carrier>
}

public record Record{
<inmutable data carrier>
}

//enum and record accept "parameters" on they parenthesis, witch are actually auto-generated constructors.
//top level classes

public class PublicClass{
}

public class PublicClass{
}

class PackagePrivateClass{
}

class PackagePrivateClass{
}

//Nested classes on low level

protected class ProtectedNested{
}

protected class ProtectedNested{
}

private class PrivateNested{
}

private class PrivateNested{
}

class PackagePrivateNested{
}

class PackagePrivateNested{
}

//all methods are inside classes

Syntax methods

[return type] methodName(parameter type + name, ...){
}

[return type] methodName(parameter type + name) {
}

modifiers: public/private
modifiers: public/private

public TypeReturnValue MethodName (parametersList) {
}

private TypeReturnValue MethodName (parametersList){
}

private TypeReturnValue MethodName (parametersList) {
}

public TypeReturnValue MethodName (parametersList) {
}
private TypeReturnValue MethodName (parametersList) {
}
public TypeReturnValue MethodName (parametersList) {
}
private TyperReturnValue MethodName(parametersList) {
}

Primitive types methods

public byte MethodName(parametersList){
}

public byte MethodName(parametersList){
}

private byte MethodName() {
} //no parameter

private byte MethodName(){
}

public byte methodName(int x) {
}

public byte methodName(int x){
}

private byte methodName(String s, double d) {
}

private byte methodName(String s , double d){
}

public byte methodName(int[] arr) {
}

public byte methodName(int[] arr){
}

//casting on byte and short

casting like (byte)(x + 1) or (short)(...):

Java automatically promotes arithmetic operations to int if operands are byte or short.

That’s why you need (byte) or (short) when returning the result.

You don’t need casting for int, long, float, double because the operation result already matches the type.
Rule of thumb: only byte, short, and char need casting when doing arithmetic because Java promotes them to int.

public byte addOne(byte x) {
return (byte)(x+1);}

public byte add0ne(byte x) {
return (byte)(x+1);
}

public short square(short x) {
return (short) (x * x);}

public short square(short x) {
return (short) (x *) {
}

public int sum(int a, int b)
{return a + b;
}

public int sum(int a, int b)
{return a + b;
}

public int sum(int a, int b){
a = a + 10;
b = b * 2;
return a + b;
}

//you cant access the value outside the method. you can only pass values when calling the method:

int result = sum(5,7);

 //ask how java places 5 , 7 with a b what i know" int result → declares a new variable outside
 the method (in your main code) to store the value that sum returns.
 So yes, this is calling the method from outside and storing its return. a and b exist only inside the method,
 but the return value can be stored in a variable outside.

sum(5, 7) → calls the method with a = 5 and b = 7.

The method runs, returns a + b = 12.

That value is stored in result.

//compelling example

public class Calculator{

public int sum(int a, int b) {
return a + b; // a b are local to this method
}

public long multiply(long a , long b) {
return a * b;
}

public static void main(String[] args) {
Calculator calc = new Calculator();

int total = calc.sum(10,20); //calls sum, stores 30
long product = calc.multiply(5L, 6L); // calls multiply , stores 30 in product

System.out.println("Total: " + total);
System.out.println("Product: " + product);

//return value directly without storing

System.out.println("Sum directly: " + calc.sum(7,8)); // prints 15
 }
}

//on the example above: a and b exist only inside the methods.

//The returned value is assigned to total or product outside the method.

//You can also use the return value directly without storing it.

//This demonstrates parameters vs return values clearly: parameters are inputs, return is output you can use elsewhere.

public long multiply(long a, long b) {
return a * b;
}

public long multiply(long a, long b) {
return a * b;
}

public float half(float f) {
return f / 2;
}

public double power(double base, double exp) {
return Math.pow(base, exp);
}

public char firstChar(String s) {
return s.chartAt(0);
}

public boolean isPositive(int n) {
return n > 0;
}



private byte methodName(MyClass obj){
}



Reference method types
Reference method types means that the method returns an object



public class methodName(String name) {
return "hello, + name;
}

public int[] buildArray(int size){
return new int[size];
}

public java.util.List<String> getNames(){
return java.utilArrays.asList("Demetre","Hares", "Cronos");
}

public Persona createPersona(String name) {
return new Persona(name);
}

public DayOfWeek getToday()}
return java.time.DayOfweek.MONDAY;
}

//remember that every paramether must have its type. beside it , his name.

public class TestSyntax{

public String stringTest(String a, int n){

a = "name"
n = "age"

return a + n;
}
//making the same declaration but whit atributes instead of parameters

public class TestSyntax {
private String nombre;
private int edad;

public String stringTest(){
nombre = "name";
edad = 25;

return nombre + edad;

}

//los atributos guardan el estado del objeto y los parametros pasan informacion temporal a los metodos.

//ejemplo con parametros, atributos y constructores

public class Persona {

private String nombre;
private int edad;

public Persona(String nombre, int edad) {
this.nombre = nombre;
this.edad = edad;
}
//se asigno parametros a los atributos

public String cumpleanos(int yearSum){
edad += yearSum;
return nombre + "now has " + edad + "years.";
 }
}

//using it example

Persona p = new Persona("Ana", 20);

System.out.println(p.brithday(1)); // parámetro 1 suma temporal, atributo edad se actualiza

Atributos: nombre, edad → repre




sentan el estado permanente del objeto

//Parámetro: añosSumar → información temporal pasada al metodo


 */