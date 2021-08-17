internal fun twofer(name: String = "you"): String {
    /* return if (name == "") {
        "One for you, one for me."
    }						// cannot use this approach because in the case where we pass 
    						// empty string as parameter and no parameter, output is same which should not be the case
    else {
        "One for $name, one for me."
    }*/
    return "One for $name, one for me."
}
