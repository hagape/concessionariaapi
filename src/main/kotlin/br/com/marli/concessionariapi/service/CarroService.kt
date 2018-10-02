package br.com.marli.concessionariapi.service

import br.com.marli.concessionariapi.model.Carro
import br.com.marli.concessionariapi.repository.CarroRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CarroService {

    @Autowired
    lateinit var carroRepository: CarroRepository

    fun buscarTodosCarros() : List<Carro> {
        return this.carroRepository.findAll()
    }

    fun buscaCarroPorAno(ano: Int) : List<Carro> {
        return this.carroRepository.findByAno(ano)
    }

    fun buscaCarroPorMarca(marca: String) : List<Carro> {
        return this.carroRepository.findByMarca(marca)
    }

    fun buscarCarroPorId(id: Int): Carro {
        return this.carroRepository.findById(id)
    }

    fun deletar(id: String) {
        val carro = Carro(id, "", "", 0, "", "", 0, "")
        return this.carroRepository.delete(carro)
    }

    fun update(carro: Carro) {

        if(carro.id.isNullOrBlank()) {
            throw Exception("Preencha o Id")
        }

        this.carroRepository.save(carro)
    }

    fun salvar(carro: Carro) {
        this.carroRepository.save(carro)
    }
}