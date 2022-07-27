abstract class Pokemons (var nome: String, var genero: String, var life: Int, var nivel: Int, var ataque: Int){
}

    class PscieDuck () : PokemonsAtaqueSoco, PokemonsAgua, Pokemons("PscieDuck", "água", 10, 1, 2) {

        override fun ataqueSoco() {
            println("$nome, usou seu ataque soco")

        }
        override fun ataqueTipoAgua() {
            println("$nome, usou seu ataque do tipo água")

        }

    }

    class Charmander () : PokemonsAtaqueSoco, PokemonsFogo, Pokemons("Charmander", "fogo", 12, 1, 3) {

        override fun ataqueSoco() {
            println("$nome, usou seu ataque soco")

        }
        override fun ataqueTipoFogo() {
            println("$nome, usou seu ataque do tipo fogo")

        }


    }

    class Bulbassauro () : PokemonsAtaqueSoco, PokemonsPlanta, Pokemons("Bulbassauro", "terra", 10, 1, 2) {

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

    var pscieDuck = PscieDuck ()
    var charmander = Charmander ()
    var bulbassauro = Bulbassauro ()

    pscieDuck.ataqueSoco()
    pscieDuck.ataqueTipoAgua()

    charmander.ataqueSoco()
    charmander.ataqueTipoFogo()

    bulbassauro.ataqueSoco()
    bulbassauro.ataqueTipoPlanta()

    }


