

object TestList {
  /**
  def main(args: Array[String]){
    // �ַ����б�
val site: List[String] = List("Runoob", "Google", "Baidu")
// �����б�
val nums: List[Int] = List(1, 2, 3, 4)
// ���б�
val empty: List[Nothing] = List()
// ��ά�б�
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
    // �ַ����б�
val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
// �����б�
val nums = 1 :: (2 :: (3 :: (4 :: Nil)))
// ���б�
val empty = Nil
// ��ά�б�
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

      println( "��һ��վ�� : " + site.head )
      println( "���һ����վ�� : " + site.tail )
      println( "�鿴�б� site �Ƿ�Ϊ�� : " + site.isEmpty )
      println( "�鿴 nums �Ƿ�Ϊ�� : " + nums.isEmpty )
   }
  def main(args:Array[String]){
    val site1 = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
      val site2 = "Facebook" :: ("Taobao" :: Nil)
      // ʹ�� ::: �����
      var fruit = site1 ::: site2
      println( "site1 ::: site2 : " + fruit )
      // ʹ�� Set.:::() ����
      fruit = site1.:::(site2)
      println( "site1.:::(site2) : " + fruit )
      // ʹ�� concat ����
      fruit = List.concat(site1, site2)
      println( "List.concat(site1, site2) : " + fruit  )
  }

  def main(args: Array[String]) {
      val site = List.fill(3)("Runoob") // �ظ� Runoob 3��
      println( "site : " + site  )
      val num = List.fill(10)(2)         // �ظ�Ԫ�� 2, 10 ��
      println( "num : " + num  )
   }

   def main(args: Array[String]) {
      // ͨ�������ĺ������� 5 ��Ԫ��
      val squares = List.tabulate(6)(n => n * n)
      println( "һά : " + squares  )
      // ������ά�б�
      val mul = List.tabulate( 4,5 )( _ * _ )      
      println( "��ά : " + mul  )
   }

   def main(args: Array[String]) {
      val site = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
      println( "site ��תǰ : " + site )

      println( "site ��תǰ : " + site.reverse )
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

      println( "��һ��վ�� : " + site.head )
      println( "���һ����վ�� : " + site.tail )
      println( "�鿴�б� site �Ƿ�Ϊ�� : " + site.isEmpty )
      println( "�鿴 nums �Ƿ�Ϊ�� : " + nums.isEmpty )
   }

   def main(args: Array[String]) {
      val site1 = Set("Runoob", "Google", "Baidu")
      val site2 = Set("Faceboook", "Taobao")
      // ++ ��Ϊ�����ʹ��
      var site = site1 ++ site2
      println( "site1 ++ site2 : " + site )
      //  ++ ��Ϊ����ʹ��
      site = site1.++(site2)
      println( "site1.++(site2) : " + site )
   }

  def main(args: Array[String]) {
      val num = Set(5,6,9,20,30,45)
      // ���Ҽ������������СԪ��
      println( "Set(5,6,9,20,30,45) �����е���СԪ���� : " + num.min )
      println( "Set(5,6,9,20,30,45) �����е����Ԫ���� : " + num.max )
   }

  def main(args: Array[String]) {
      val num1 = Set(5,6,9,20,30,45)
      val num2 = Set(50,60,9,20,35,55)
      // ����
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

      println( "colors �еļ�Ϊ : " + colors.keys )
      println( "colors �е�ֵΪ : " + colors.values )
      println( "��� colors �Ƿ�Ϊ�� : " + colors.isEmpty )
      println( "��� nums �Ƿ�Ϊ�� : " + nums.isEmpty )
   }

     def main(args: Array[String]) {
      val colors1 = Map("red" -> "#FF0000",
                        "azure" -> "#F0FFFF",
                        "peru" -> "#CD853F")
      val colors2 = Map("blue" -> "#0033FF",
                        "yellow" -> "#FFFF00",
                        "red" -> "#FF0000")
      //  ++ ��Ϊ�����
      var colors = colors1 ++ colors2
      println( "colors1 ++ colors2 : " + colors )
      //  ++ ��Ϊ����
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
      println( "Ԫ��֮��Ϊ: "  + sum )
      t.productIterator.foreach{ i =>println("Value = " + i )}
      println("���Ӻ���ַ���Ϊ: " + t.toString() )
      
   }

  def main(args: Array[String]) {
      val t = new Tuple2("www.google.com", "www.runoob.com")
     
      println("�������Ԫ��: " + t.swap )
      val t1 = new Tuple2(1, 2)
     
      println("�������Ԫ��: " + t1.swap )
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
//      println("���Ԫ���ǣ�" + it.max ) //error
//      println("��СԪ���ǣ�" + it.min ) //error
      
      val ita = Iterator(20,40,2,50,69, 90)
      val itb = Iterator(20,40,2,50,69, 90)
      
      println("���Ԫ���ǣ�" + ita.max )
      println("��СԪ���ǣ�" + itb.min )
   }
}
