package br.com.digitalhouse.exGuardaVolume

fun main(){

    val guardaVolumes = GuardaVolumes()
    val peca1 = Peca("a", "blusa")
    val peca2 = Peca("b", "calça")
    val peca3 = Peca("a", "vestido")

    val peca4 = Peca("c", "top")
    val peca5 = Peca("d", "bermuda")
    val peca6 = Peca("c", "short")

    val lista1 = listOf<Peca>(peca1, peca2, peca3)
    val lista2 = listOf<Peca>(peca4,peca5, peca6)

    println(guardaVolumes.guardarPecas(lista1))
    println(guardaVolumes.guardarPecas(lista2))

    guardaVolumes.mostrarTodasPecas()
    guardaVolumes.mostrarPeca(3)

    guardaVolumes.retirar(1)

    guardaVolumes.mostrarTodasPecas()


}