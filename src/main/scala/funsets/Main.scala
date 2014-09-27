package funsets

object Main extends App {
  import FunSets._

  private val set1: Set = singletonSet(1)
  private val set2: Set = singletonSet(2)
  private val set3: Set = singletonSet(3)
  private val set4: Set = singletonSet(4)
  
  private val set_1000: Set = singletonSet(-1000)
  private val set0: Set = singletonSet(0)
  
  val set_1234 = union(set1, union(set2, union(set3, set4)))
  val set_10001 = union(set_1000, set0)
 printSet(diff(set_1234, set_10001))
}
