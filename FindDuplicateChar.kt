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

//output {a=7, s=5, d=15, e=2, f=9, g=2}

