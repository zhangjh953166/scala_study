

object TestList {
  /**
  def main(args: Array[String]){
    // 字符串列表
val site: List[String] = List("Runoob", "Google", "Baidu")
// 整型列表
val nums: List[Int] = List(1, 2, 3, 4)
// 空列表
val empty: List[Nothing] = List()
// 二维列表
val dim: List[List[Int]] =
   List(
      List(1, 0, 0),
      List(0, 1, 0),
      List(0, 0, 1)
   )
  }
  * 
  */
  /**
  def main(args:Array[String]){
    // 字符串列表
val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
// 整型列表
val nums = 1 :: (2 :: (3 :: (4 :: Nil)))
// 空列表
val empty = Nil
// 二维列表
val dim = (1 :: (0 :: (0 :: Nil))) ::
          (0 :: (1 :: (0 :: Nil))) ::
          (0 :: (0 :: (1 :: Nil))) :: Nil
  }
  * 
  */
  /**
  def main(args: Array[String]) {
      val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
      val nums = Nil

      println( "第一网站是 : " + site.head )
      println( "最后一个网站是 : " + site.tail )
      println( "查看列表 site 是否为空 : " + site.isEmpty )
      println( "查看 nums 是否为空 : " + nums.isEmpty )
   }
  def main(args:Array[String]){
    val site1 = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
      val site2 = "Facebook" :: ("Taobao" :: Nil)
      // 使用 ::: 运算符
      var fruit = site1 ::: site2
      println( "site1 ::: site2 : " + fruit )
      // 使用 Set.:::() 方法
      fruit = site1.:::(site2)
      println( "site1.:::(site2) : " + fruit )
      // 使用 concat 方法
      fruit = List.concat(site1, site2)
      println( "List.concat(site1, site2) : " + fruit  )
  }

  def main(args: Array[String]) {
      val site = List.fill(3)("Runoob") // 重复 Runoob 3次
      println( "site : " + site  )
      val num = List.fill(10)(2)         // 重复元素 2, 10 次
      println( "num : " + num  )
   }

   def main(args: Array[String]) {
      // 通过给定的函数创建 5 个元素
      val squares = List.tabulate(6)(n => n * n)
      println( "一维 : " + squares  )
      // 创建二维列表
      val mul = List.tabulate( 4,5 )( _ * _ )      
      println( "多维 : " + mul  )
   }

   def main(args: Array[String]) {
      val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
      println( "site 反转前 : " + site )

      println( "site 反转前 : " + site.reverse )
   }
   * 
   */
}

object TestSet{
  
  /**
   * import scala.collection.mutable.Set
  def main(args:Array[String]){
    val mutableSet = Set(1,2,3)
    println(mutableSet.getClass.getName)
    
    mutableSet.add(4)
    mutableSet.remove(1)
    mutableSet += 5
    mutableSet -= 2

    println(mutableSet) 

    val another = mutableSet.toSet
    println(another.getClass.getName)
  }

  def main(args: Array[String]) {
      val site = Set("Runoob", "Google", "Baidu")
      val nums: Set[Int] = Set()

      println( "第一网站是 : " + site.head )
      println( "最后一个网站是 : " + site.tail )
      println( "查看列表 site 是否为空 : " + site.isEmpty )
      println( "查看 nums 是否为空 : " + nums.isEmpty )
   }

   def main(args: Array[String]) {
      val site1 = Set("Runoob", "Google", "Baidu")
      val site2 = Set("Faceboook", "Taobao")
      // ++ 作为运算符使用
      var site = site1 ++ site2
      println( "site1 ++ site2 : " + site )
      //  ++ 作为方法使用
      site = site1.++(site2)
      println( "site1.++(site2) : " + site )
   }

  def main(args: Array[String]) {
      val num = Set(5,6,9,20,30,45)
      // 查找集合中最大与最小元素
      println( "Set(5,6,9,20,30,45) 集合中的最小元素是 : " + num.min )
      println( "Set(5,6,9,20,30,45) 集合中的最大元素是 : " + num.max )
   }

  def main(args: Array[String]) {
      val num1 = Set(5,6,9,20,30,45)
      val num2 = Set(50,60,9,20,35,55)
      // 交集
      println( "num1.&(num2) : " + num1.&(num2) )
      println( "num1.intersect(num2) : " + num1.intersect(num2) )
   }
   * 
   */
}

object TestMap{
  /**
   def main(args: Array[String]) {
      val colors = Map("red" -> "#FF0000",
                       "azure" -> "#F0FFFF",
                       "peru" -> "#CD853F")

      val nums: Map[Int, Int] = Map()

      println( "colors 中的键为 : " + colors.keys )
      println( "colors 中的值为 : " + colors.values )
      println( "检测 colors 是否为空 : " + colors.isEmpty )
      println( "检测 nums 是否为空 : " + nums.isEmpty )
   }

     def main(args: Array[String]) {
      val colors1 = Map("red" -> "#FF0000",
                        "azure" -> "#F0FFFF",
                        "peru" -> "#CD853F")
      val colors2 = Map("blue" -> "#0033FF",
                        "yellow" -> "#FFFF00",
                        "red" -> "#FF0000")
      //  ++ 作为运算符
      var colors = colors1 ++ colors2
      println( "colors1 ++ colors2 : " + colors )
      //  ++ 作为方法
      colors = colors1.++(colors2)
      println( "colors1.++(colors2)) : " + colors )
   }

   def main(args: Array[String]) {
      val sites = Map("runoob" -> "http://www.runoob.com",
                       "baidu" -> "http://www.baidu.com",
                       "taobao" -> "http://www.taobao.com")
      sites.keys.foreach{ i =>  
                           print( "Key = " + i )
                           println(" Value = " + sites(i) )}
   }
   * 
   */
}
object TestTuple{
  /**
   def main(args: Array[String]) {
      val t = (4,3,2,1)
      val sum = t._1 + t._2 + t._3 + t._4
      println( "元素之和为: "  + sum )
      t.productIterator.foreach{ i =>println("Value = " + i )}
      println("连接后的字符串为: " + t.toString() )
      
   }

  def main(args: Array[String]) {
      val t = new Tuple2("www.google.com", "www.runoob.com")
     
      println("交换后的元组: " + t.swap )
      val t1 = new Tuple2(1, 2)
     
      println("交换后的元组: " + t1.swap )
   }
   * 
   */
}
object TestOption{
  /**
  def main(args:Array[String]){
    val myMap: Map[String, String] = Map("key1" -> "value")
    val value1: Option[String] = myMap.get("key1")
    val value2: Option[String] = myMap.get("key2")
 
    println(value1) // Some("value1")
    println(value2) // None
  }

  def main(args: Array[String]) {
      val sites = Map("runoob" -> "www.runoob.com", "google" -> "www.google.com")
      println("show(sites.get( \"runoob\")) : " +  
                                          show(sites.get( "runoob")) )
      println("show(sites.get( \"baidu\")) : " +  
                                          show(sites.get( "baidu")) )
   }
   def show(x: Option[String]) = x match {
      case Some(s) => s
      case None => "?"
   }

   def main(args: Array[String]) {
      val a:Option[Int] = Some(5)
      val b:Option[Int] = None 
      
      println("a.isEmpty: " + a.isEmpty )
      println("b.isEmpty: " + b.isEmpty )
   }
   * 
   */
}
object TestIterator{
  def main(args: Array[String]) {
      val it = Iterator("Baidu", "Google", "Runoob", "Taobao")
      
      while (it.hasNext){
         println(it.next())
      }
//      println("最大元素是：" + it.max ) //error
//      println("最小元素是：" + it.min ) //error
      
      val ita = Iterator(20,40,2,50,69, 90)
      val itb = Iterator(20,40,2,50,69, 90)
      
      println("最大元素是：" + ita.max )
      println("最小元素是：" + itb.min )
   }
}
