object Main {
  private def scalarProduct(xs: List[Double], ys: List[Double]): Double = {
    (xs zip ys).map { case (x, y) => x * y }.sum
  }

  def main(args: Array[String]): Unit = {
    val xs = List(1.0, 2.0, 10.0)
    val ys = List(4.0, 5.0, 6.0)

    val result = this.scalarProduct(xs, ys)
    println(result)
  }
}