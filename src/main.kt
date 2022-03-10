fun main() {
    var name = "codeHive"
    println(name[4].toString() + name[5] + name[6] + name[7])
    div(8,5)
sentence("Miriam",20)
    word("pinapple".length)

}
fun div(a: Int,b: Int){
    var module=a%b
    println(module)

}
fun sentence(p: String,z: Int){
    println("Hi my name is $p and I am $z years old")
}
fun word(){
    var name="pinapple"
println("pinapple".length)
}