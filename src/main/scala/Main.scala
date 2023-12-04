import scala.util.Random

object Main {
  private def scalarProduct(xs: List[Double], ys: List[Double]): Double = {
    (xs zip ys).map { case (x, y) => x * y }.sum
  }

  private def generateRandomList(length: Int): List[Double] = {
    List.fill(length)(Random.nextDouble())
  }

  def main(args: Array[String]): Unit = {
    val xs = this.generateRandomList(3)
    val ys = this.generateRandomList(3)

    val result = this.scalarProduct(xs, ys)
    println(result)
  }
}