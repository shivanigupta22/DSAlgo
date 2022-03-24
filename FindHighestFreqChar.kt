
fun main() {
    println(returnFreqChar("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadbbccccccccccccccddddddddddd"))
}


fun returnFreqChar(str:String):Pair<Char,Int?> {
    val map = hashMapOf<Char,Int>()
   str.forEach { it ->
       if(map.containsKey(it))
     		 map[it] = map[it]!! + 1
       else map[it] = 1
   }
   var pair = Pair(str[0],map[str[0]])
   map.forEach { k,v ->
       if(v > pair.second!!) {
      	pair = Pair(k,v)
       }
   }
    return pair
}
//output (a, 52)
