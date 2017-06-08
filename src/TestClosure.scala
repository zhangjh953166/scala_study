

object TestClosure {
  def main(args:Array[String]){
    println("multiplier(1) = " + multiplier(1))
    factor = 4
    println("multiplier(2) = " + multiplier(2))
  }
  var factor = 3
  val multiplier = (i:Int) => i * factor
}