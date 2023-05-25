fun main() { 
    print(returnDuplicateChar("saaaaaddddffdfdfdfdfdfddgergfexcsdsddasadsf"))
}


fun returnDuplicateChar(str:String):HashMap<Char,Int> {
    val map = hashMapOf<Char,Int>()
   str.forEach { it ->
       if(map.containsKey(it))
     		 map[it] = map[it]!! + 1
       else map[it] = 1
   }
   var map1 = hashMapOf<Char,Int>()
    map.forEach {k,v ->
        if(v >1) map1[k] = v
    }
    return map1
}
// using filter values prop of hashmap collection
val given = "shviani"
   
val map = hashMapOf<Char,Int>()
for(i in given) {
     if(map.containsKey(i)) {
       map[i] =map[i]!!.plus(1)
    } else {
       map[i] = 1
    }
}
 print(map.filterValues {
         it > 1
     }.entries)

//output {a=7, s=5, d=15, e=2, f=9, g=2}

