// scalac: -Xfatal-warnings
//
class PostFix {
  val list = List(1, 2, 3)
  def main(args: Array[String]): Unit = {
    val a = list filter (2 !=)
    val b = list filter (2 != _)
  }
}
