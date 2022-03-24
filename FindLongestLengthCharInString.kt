fun main() { 
    print(findLongestLengthChar("Lord Krishna is the cause of all causes!!"))
}
fun findLongestLengthChar(s1:String):String {
    var strArray = s1.split(" ")
    var maxCharLen = strArray[0]
    strArray.forEach {
        it -> if(it.length > maxCharLen.length) {
            maxCharLen = it
        }
    }
    return maxCharLen
}

//output causes!!
