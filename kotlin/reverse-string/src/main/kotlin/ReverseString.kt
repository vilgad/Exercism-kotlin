fun reverse(input: String): String {
	var b : String = ""
	var c = input.length - 1
    for (i in (c downTo 0)){
    	b += input[i]
	}
	
    return b
}

