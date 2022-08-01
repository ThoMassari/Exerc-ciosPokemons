abstract class Pokemons (var nome: String, var genero: String, var life: Int, var nivel: Int, var ataque: Int){
}

    class PscieDuck (nome:String, genero:String, life:Int, nivel: Int, ataque:Int) : PokemonsAtaqueSoco, PokemonsAgua, Pokemons(nome, genero, life, nivel, ataque) {

        override fun ataqueSoco() {
            println("$nome, usou seu ataque soco")

        }
        override fun ataqueTipoAgua() {
            println("$nome, usou seu ataque do tipo água")

        }

    }

    class Charmander (nome: String, genero:String, life:Int, nivel: Int, ataque:Int) : PokemonsAtaqueSoco, PokemonsFogo, Pokemons(nome, genero, life, nivel, ataque) {

        override fun ataqueSoco() {
            println("$nome, usou seu ataque soco")

        }
        override fun ataqueTipoFogo() {
            println("$nome, usou seu ataque do tipo fogo")

        }


    }

    class Bulbassauro (nome: String, genero:String, life:Int, nivel: Int, ataque:Int) : PokemonsAtaqueSoco, PokemonsPlanta, Pokemons(nome, genero, life, nivel, ataque) {

        override fun ataqueSoco() {
            println("$nome, usou seu ataque soco")

        }

        override fun ataqueTipoPlanta() {
            println("$nome, usou seu ataque do tipo planta")

        }

    }

interface PokemonsAtaqueSoco{
    fun ataqueSoco()
}


interface PokemonsAgua {
    fun ataqueTipoAgua()
}


interface PokemonsFogo {
    fun ataqueTipoFogo()
}

interface PokemonsPlanta{
    fun ataqueTipoPlanta()
}

fun main(){

    var pscieDuck = PscieDuck ("PscieDuck", "água", 10, 1, 2)
    var charmander = Charmander ("Charmander", "fogo", 12, 1, 3)
    var bulbassauro = Bulbassauro ("Bulbassauro", "terra", 10, 1, 2)

    pscieDuck.ataqueSoco()
    pscieDuck.ataqueTipoAgua()

    charmander.ataqueSoco()
    charmander.ataqueTipoFogo()

    bulbassauro.ataqueSoco()
    bulbassauro.ataqueTipoPlanta()


    }


