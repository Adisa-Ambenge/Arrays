fun main() {
    names("Angela","Jesse","Mariam","Halima")
    capitalCities()
    number()
    println(topFriends("Maureen","Joan","Ann"))


}
fun names(nameOne:String,nameTwo:String,nameThree:String,nameFour:String){
    val bestFriends = arrayOf(nameOne, nameTwo, nameThree,nameFour)
    println(bestFriends.contentToString())
}
fun capitalCities(){
    val cities = arrayOf("harare","mumbai","dodoma","jakarta")
    val city = (cities.map { it .capitalize() })
    println(city)
}
fun number(){
    val numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers[1]+numbers[4])
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())
}
fun topFriends(first:String,second:String,third:String):String{
    var friend = arrayOf(first,second,third)
    return friend.contentToString()
}