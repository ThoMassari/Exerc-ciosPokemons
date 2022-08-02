abstract class Pokemons (var nome: String, var genero: String, var life: Int, var nivel: Int, var ataque: Int){
}

    class PscieDuck (nome:String, genero:String, life:Int, nivel: Int, ataque:Int) : PokemonsAtaqueSoco, PokemonsAgua, Pokemons(nome, genero, life, nivel, ataque) {

        override fun ataqueSoco(dano: Int, pokemonAtacado: Pokemons) {
            var dano = 1
            println("$nome, usou seu ataque soco e causou um dano de $dano pontos em ${pokemonAtacado.nome}.")
            pokemonAtacado.life -= dano
            println("Cuidado ${pokemonAtacado.nome}, agora sua life esta em " + pokemonAtacado.life + " pontos.")


        }
        override fun ataqueTipoAgua(dano: Int, pokemonAtacado: Pokemons) { //aqui ficam as regras de ataque
            var dano = 3
            println("$nome, usou seu ataque do tipo agua e acertou ${pokemonAtacado.nome} " )
            pokemonAtacado.life -= dano //pokemon.life = pokemon.life - dano
            println("Cuidado ${pokemonAtacado.nome}, agora sua life esta em " + pokemonAtacado.life + " pontos.")

        }

    }

    class Charmander (nome: String, genero:String, life:Int, nivel: Int, ataque:Int) : PokemonsAtaqueSoco, PokemonsFogo, Pokemons(nome, genero, life, nivel, ataque) {

        override fun ataqueSoco(dano: Int, pokemonAtacado: Pokemons) {
            var dano = 1
            println("$nome, usou seu ataque soco")

        }
        override fun ataqueTipoFogo(dano: Int, pokemonAtacado: Pokemons) {
            var dano = 3
            println("$nome, usou seu ataque do tipo fogo")

        }


    }

    class Bulbassauro (nome: String, genero:String, life:Int, nivel: Int, ataque:Int) : PokemonsAtaqueSoco, PokemonsPlanta, Pokemons(nome, genero, life, nivel, ataque) {

        override fun ataqueSoco(dano: Int, pokemonAtacado: Pokemons) {
            var dano = 1
            println("$nome, usou seu ataque soco")

        }

        override fun ataqueTipoPlanta(dano: Int, pokemonAtacado: Pokemons) {
            var dano = 3
            println("$nome, usou seu ataque do tipo planta")


        }

        override fun autoCura(cura: Int, pokemonAutoCura: Bulbassauro) {
            var cura = 3

            pokemonAutoCura.life += cura
            println("${pokemonAutoCura.nome} utilizou sua autocura e sua life foi para ${pokemonAutoCura.life} pontos.")

        }

        override fun curaOutroPokemon(cura: Int, pokemonCuraOutroPokemon: Pokemons) {
            var cura = 3

            pokemonCuraOutroPokemon.life += cura
            println("$nome utilizou seu poder de cura e ajudou ${pokemonCuraOutroPokemon.nome}, que agora esta com ${pokemonCuraOutroPokemon.life} de vida!")

        }

    }

    class Gastly (nome: String, genero:String, life:Int, nivel: Int, ataque:Int): PokemonsAtaqueSoco, PokemonsFantasma, Pokemons(nome, genero, life, nivel, ataque){
        override fun ataqueTipoFantasma(dano: Int, pokemonAtacado: Pokemons) {
            var dano = 3

        }

        override fun ataqueSoco(dano: Int, pokemonAtacado: Pokemons) {
            var dano = 1
        }

    }

    class Pidgey (nome: String, genero:String, life:Int, nivel: Int, ataque:Int): PokemonsAtaqueSoco, PokemonsVoador, Pokemons(nome, genero, life, nivel, ataque){
        override fun ataqueTipoVoador(dano: Int, pokemonAtacado: Pokemons) {
            var dano = 3

        }

        override fun ataqueSoco(dano: Int, pokemonAtacado: Pokemons) {
            var dano = 1
        }

    }

    class Onix (nome: String, genero:String, life:Int, nivel: Int, ataque:Int): PokemonsAtaqueSoco, PokemonsPedra, Pokemons(nome, genero, life, nivel, ataque){
        override fun ataqueTipoPedra(dano: Int, pokemonAtacado: Pokemons) {
            var dano = 3

        }

        override fun ataqueSoco(dano: Int, pokemonAtacado: Pokemons) {
            var dano = 1
        }

    }

interface PokemonsAtaqueSoco{
    fun ataqueSoco(dano: Int, pokemonAtacado: Pokemons)
}


interface PokemonsAgua {
    fun ataqueTipoAgua(dano:Int, pokemonAtacado: Pokemons)
}


interface PokemonsFogo {
    fun ataqueTipoFogo(dano:Int, pokemonAtacado: Pokemons)
}

interface PokemonsPlanta{
    fun ataqueTipoPlanta(dano:Int, pokemonAtacado: Pokemons)

    fun autoCura(cura: Int, pokemonPlantaAutoCura: Bulbassauro)

    fun curaOutroPokemon (cura: Int, pokemonPlantaCuraOutroPokemon: Pokemons)

}

interface PokemonsFantasma{
    fun ataqueTipoFantasma(dano:Int, pokemonAtacado: Pokemons)
}

interface PokemonsVoador{
    fun ataqueTipoVoador(dano:Int, pokemonAtacado: Pokemons)
}

interface PokemonsPedra{
    fun ataqueTipoPedra(dano:Int, pokemonAtacado: Pokemons)
}


fun main(){

    var pscieDuck = PscieDuck ("Pscie", "água", 10, 1, 2)
    var charmander = Charmander ("Char", "fogo", 12, 1, 3)
    var bulbassauro = Bulbassauro ("Bulba", "terra", 10, 1, 2)
    var gastly = Gastly ("Gas", "Fantasma", 10, 1, 2)
    var pidgey = Pidgey ("Pid", "voador", 11, 1, 2)
    var onix = Onix ("Onix", "pedra", 20, 1, 2)


    pscieDuck.ataqueSoco(0, pidgey)
    pscieDuck.ataqueTipoAgua(0, charmander)

    charmander.ataqueSoco(0, gastly)
    charmander.ataqueTipoFogo(0, onix)

    //bulbassauro.ataqueSoco()
    //bulbassauro.ataqueTipoPlanta()

    bulbassauro.autoCura(0, bulbassauro)
    bulbassauro.curaOutroPokemon(0, onix)



    }


