import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._

object FrenchDate {
  def main(args: Array[String]) {
  val now = new Date
  val df = getDateInstance(LONG, Locale.FRANCE)
  print("Aujourd'hui est ")
  println(df format now)
  }
}
