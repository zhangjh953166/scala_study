
import Array._

object TestArray {
  /*
  def main(args: Array[String]) {
      var myList = Array(1.9, 2.9, 3.4, 3.5)
      
      // �����������Ԫ��
      for ( x <- myList ) {
         println( x )
      }

      // ������������Ԫ�ص��ܺ�
      var total = 0.0;
      for ( i <- 0 to (myList.length - 1)) {
         total += myList(i);
      }
      println("�ܺ�Ϊ " + total);

      // ���������е����Ԫ��
      var max = myList(0);
      for ( i <- 1 to (myList.length - 1) ) {
         if (myList(i) > max) max = myList(i);
      }
      println("���ֵΪ " + max);
    
   }
  import Array._
  def main(args: Array[String]) {
      var myMatrix = ofDim[Int](3,3)
      // ��������
      for (i <- 0 to 2) {
         for ( j <- 0 to 2) {
            myMatrix(i)(j) = j;
         }
      }
      
      // ��ӡ��ά����
      for (i <- 0 to 2) {
         for ( j <- 0 to 2) {
            print(" " + myMatrix(i)(j));
         }
         println();
      }
    
   }
  def main(args: Array[String]) {
      var myList1 = Array(1.9, 2.9, 3.4, 3.5)
      var myList2 = Array(8.9, 7.9, 0.4, 1.5)

      var myList3 =  concat( myList1, myList2)
      
      // �����������Ԫ��
      for ( x <- myList3 ) {
         println( x )
      }
   }
   * 
   */
  def main(args: Array[String]) {
      var myList1 = range(10, 20, 2)
      var myList2 = range(10,20)

      // �����������Ԫ��
      for ( x <- myList1 ) {
         print( " " + x )
      }
      println()
      for ( x <- myList2 ) {
         print( " " + x )
      }
   }
}