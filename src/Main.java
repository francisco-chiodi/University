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

public interface Interface{
<contrac of methods>
}

publiic enum Enum{
<fixed constants>
}

public record Record{
<inmutable data carrier>
}
//enum and record accept "parameters" on they parenthesis, wich are actually auto-generated constructors.
//top level classes

public class PublicClass{
}

class PackagePrivateClass{
}

//Nested classes on low level

protected class ProtectedNested{
}

private class PrivateNested{
}

class PackagePrivateNested{
}


//all methods are inside classes

Syntax methods

[return type] methodName(parameter type + name, ...){
}


modifiers: public/private

public TypeReturnValue MethodName (parametersList) {
}
private TypeReturnValue MethodName (parametersList) {
}
public TypeReturnValue MethodName (parametersList) {
}
private TyperReturnValue MethodName (parametersList) {
}
public TyperReturnValue MethodName (parametersList) {
}
private TyperReturnValue MethodName(parametersList) {
}

Primitive types methods

public byte MethodName(parametersList){
}

private byte MethodName() {
} //no parameter

public byte methodName(int x) {
}

private byte methodName(String s, double d) {
}

public byte methodName(int[] arr) {
}

//casting on byte and short

casting like (byte)(x + 1) or (short)(...):

Java automatically promotes arithmetic operations to int if operands are byte or short.

That’s why you need (byte) or (short) when returning the result.

You don’t need casting for int, long, float, double because the operation result already matches the type.
Rule of thumb: only byte, short, and char need casting when doing arithmetic because Java promotes them to int.

public byte addOne(byte x) {
return (byte)(x+1);}

public short square(short x) {
return (short) (x * x);}

public int sum(int a, int b)
{return a + b;}

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

//Atributos: nombre, edad → representan el estado permanente del objeto

//Parámetro: añosSumar → información temporal pasada al metodo










 */