

class TestCompanionClass private(val color:String) {
  println("����" + this)
  
  override def toString(): String = "��ɫ��ǣ�"+ color
}

// �����������๲�����֣����Է������˽�����Ժͷ���
object TestCompanionClass{
  
    private val markers: Map[String, TestCompanionClass] = Map(
      "red" -> new TestCompanionClass("red"),
      "blue" -> new TestCompanionClass("blue"),
      "green" -> new TestCompanionClass("green")
    )
    
    def apply(color:String) = {
      if(markers.contains(color)) markers(color) else null
    }
  
    
    def getMarker(color:String) = { 
      if(markers.contains(color)) markers(color) else null
    }
    def main(args: Array[String]) { 
        println(TestCompanionClass("red"))  
        // �����������ã�ʡ����.(��)����  
		println(TestCompanionClass getMarker "blue")  
    }
}