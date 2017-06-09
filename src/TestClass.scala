
import java.io._
class Point(val xc: Int,val yc: Int) {
   var x: Int = xc
   var y: Int = yc

   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
      println ("x �������: " + x);
      println ("y �������: " + y);
   }
}
/**
object Test {
  
   def main(args: Array[String]) {
      val pt = new Point(10, 20);

      // �Ƶ�һ���µ�λ��
      pt.move(10, 10);
   }
   
   def main(args: Array[String]) {
      val loc = new Location(10, 20, 15);

      // �Ƶ�һ���µ�λ��
      loc.move(10, 10, 5);
   }
}
* 
*/
class Location(override val xc: Int, override val yc: Int,
   val zc :Int) extends Point(xc, yc){
   var z: Int = zc

   def move(dx: Int, dy: Int, dz: Int) {
      x = x + dx
      y = y + dy
      z = z + dz
      println ("x ������� : " + x);
      println ("y ������� : " + y);
      println ("z ������� : " + z);
   }
}

class Person {
  var name = ""
  override def toString = getClass.getName + "[name=" + name + "]"
}

class Employee extends Person {
  var salary = 0.0
  override def toString = super.toString + "[salary=" + salary + "]"
}

object Test extends App {
  val fred = new Employee
  fred.name = "Fred"
  fred.salary = 50000
  println(fred)
}