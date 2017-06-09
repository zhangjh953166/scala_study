

object TestString {
  val greeting: String = "Hello, World!"

  /**
   def main(args: Array[String]) {
      println( greeting )
   }

  def main(args: Array[String]) {
      val buf = new StringBuilder;
      buf += 'a'
      buf ++= "bcdef"
      println( "buf is : " + buf.toString );
   }

  def main(args: Array[String]) {
      var palindrome = "www.google.com";
      var len = palindrome.length();
      println( "String Length is : " + len );
   }
   * 
   */
  def main(args: Array[String]) {
      var str1 = "3214321£º";
      var str2 =  "    cccccccccc";
      var str3 =  "vfsfaerfeaf";
      var str4 =  "aaaaaaaaaaa";
      println( str1 + str2 );
      println( str3.concat(str4) );
   }
}