fun main() {
   
    print(reverseString("shivaannnnnnnnniiiiiiiiiii"))
}


fun reverseString(str:String):String {
    //1st way
			   var chars1 = ""
					for(i in str.length.minus(1) downTo 0) {
				  chars1 += str[i]
			   }
                    //2nd way
			 var chars = CharArray(str.length)
			for(i in str.length.minus(1) downTo 0) {
				chars[str.length.minus(1).minus(i)] = str[i]
			}
			   return chars1
}

//output iiiiiiiiiiinnnnnnnnnaavihs
