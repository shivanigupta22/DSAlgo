import java.util.regex.Pattern;

fun main() {
    
   //How do you check if a string contains only digits
   solution() 
}

fun solution() {
  val given = "22"
    val pattern = Pattern.compile(".*[^0-9].*")
    print("$given contains only digits : ${!pattern.matcher(given).matches()}")
    
    //output true
}
