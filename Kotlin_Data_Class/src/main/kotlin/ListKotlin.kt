

fun main(){
    println("List dan memberi tahu compiler mengenai tipe nya(hanya bisa 1 tipe data)")
    val listNo1 : List<Int> = listOf(1,2,3)
    println(listNo1)

    println("List tanpa memberi tahu compiler tipe datanya(data boleh campur)")
    val listNo2 = listOf(1,2,3,"123",'4','5','6',"456")
    println(listNo2)
    println(listNo2[2])

    println("mutable list")
    val listMakanan = mutableListOf<String>("seblak","Bakso","Sate")
    println("list index ke 1 "+listMakanan[1])
    listMakanan.add("Soto")
    listMakanan.add(0,"ayam goreng")
    println(listMakanan)
    listMakanan.removeAt(1)
    listMakanan[0] = "Ayam Bakar"
    // ada juga removeFirst, removeLast dan lainnya
    println(listMakanan)
}