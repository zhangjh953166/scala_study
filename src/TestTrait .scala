

trait Equal {
  def isEqual(x: Any): Boolean
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}

class PointTrait(xc: Int, yc: Int) extends Equal {
  var x: Int = xc
  var y: Int = yc
  def isEqual(obj: Any) =
    obj.isInstanceOf[PointTrait] &&
    obj.asInstanceOf[PointTrait].x == x
}

object TestTrait {
   def main(args: Array[String]) {
      val p1 = new PointTrait(2, 3)
      val p2 = new PointTrait(2, 4)
      val p3 = new PointTrait(3, 3)

      println(p1.isNotEqual(p2))
      println(p1.isNotEqual(p3))
      println(p1.isNotEqual(2))
   }
}