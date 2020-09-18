package br.com.digitalhouse.exGuardaVolume

class GuardaVolumes(){
    var contador: Int = 0
    var dicionario = mutableMapOf<Int,List<Peca>>()


    fun guardarPecas(listaDePecas: List<Peca>):Int{
        dicionario.put(contador, listaDePecas)
        return contador++
    }


    fun mostrarPeca(numero: Int){
        if (numero in dicionario.keys) {
            println("Peças existentes no número $numero")
            for (peca in dicionario.getValue(numero)) {
                println("Marca: ${peca.marca}, Modelo: ${peca.modelo}")
            }
        }
        else println("O número $numero está vazio.")
    }


    fun mostrarTodasPecas(){
        for(keys in dicionario.keys) {
            println("Peças no número ${keys}")
            for (peca in dicionario.getValue(keys)) {
                println("${peca.marca}, ${peca.modelo}")
            }
        }
    }


    fun retirar(numero:Int) {
        if (numero in dicionario.keys) {
            println("Retirando as seguuintes peças do número $numero")
            for (peca in dicionario.getValue(numero)){
                println("Marca: ${peca.marca}, Modelo: ${peca.modelo}")
            }
            dicionario.remove(numero)
            println("Peças retiradas com sucesso")
        }

        else println("Não foi possível realizar a retirada pois o número já está vazio.")

    }

}