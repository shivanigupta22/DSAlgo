fun main() { 
    print(isAnagram("shiv","shvi"))
}


fun isAnagram(str1:String,str2:String):Boolean {
    val map = hashMapOf<Char,Int>()
   if(str1.length == str2.length) {
       str1.forEach { it ->
       if(map.containsKey(it))
     		 map[it] = map[it]!! + 1
       else map[it] = 1
   }
   str2.forEach { it ->
       if(map.containsKey(it)) {
           map[it] = map[it]!! -1
       }    
   }
  	return if(map.filterValues {
        it -> it > 0
    }.isEmpty()) true else false
   } else return false
}
//output true
