

fun main() {
    
   //How do you find 1st non-repeated character in string
   solution() 
}

fun solution() {
  val given = "shivvvandddhhadsssin"  
    print(findNonRepeatedChar(given))
}

fun findNonRepeatedChar(str:String):Char {
    val linkedhashmap = LinkedHashMap<Char,Int>()
    str.forEach { i ->
        if(linkedhashmap.contains(i)) {
            linkedhashmap[i] = linkedhashmap[i]!! + 1
        } else {
            linkedhashmap[i] = 1
        }
    }
    val filteredkeys = linkedhashmap.filterValues {v ->
        v==1
    }.keys
    if(filteredkeys.isNotEmpty()) {
        return filteredkeys.elementAt(0)
    }
    return '.'
  
}
