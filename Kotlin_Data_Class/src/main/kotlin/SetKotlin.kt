
    fun main(){
        //tidak bisa duplikasi
        val set1 = setOf<Int>(1,4,2,3,4,2,1)
        println(set1)
        // bisa langsung komparasi karena tidak mempedulikan urutan index
        val set2 = setOf<Int>(1,2,3,4)
        println("komparasi set 1 dan 2 ${set1.equals(set2)}")
        println(3 in set2)
        // union dan intersect
        val ekskulBasket = setOf("Adit","Bobon","Cici","Dodit","Eka")
        val ekskulMusik = setOf("Adit","Cici","Fariz","Galih")
        val basketdanMusik = ekskulBasket.intersect(ekskulMusik)
        val semuaMember = ekskulBasket.union(ekskulMusik)
        println(basketdanMusik)
        println(semuaMember)
        println("mutable set")
        // pada mutable set, hanya bisa menambah dan menghapus item, tidak bisa mengedit isi
        val ekskulBola = mutableSetOf<String>("Fariz","Galih")
        ekskulBola.add("Irwan")
       // tidak bisa menambahkan pada suatu index tertentu
        ekskulBola.remove("Fariz")
        println(ekskulBola)
    }
