package br.com.marli.concessionariapi.controller

import br.com.marli.concessionariapi.model.Carro
import br.com.marli.concessionariapi.service.CarroService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/carro")
class CarroController {

    @Autowired
    lateinit var carroService: CarroService

    @GetMapping
    fun buscarTodos() :List<Carro> {
        return carroService.buscarTodosCarros()
    }

    @GetMapping
    @RequestMapping("/{marca}")
    fun buscarPorMarca(@PathVariable("marca") marca: String): List<Carro> {
        return this.carroService.buscaCarroPorMarca(marca)
    }

    @PutMapping
    fun update(@RequestBody carro: Carro) {
        carroService.update(carro)
    }

    @DeleteMapping
    @RequestMapping("/{id}/deletar")
    fun deletar(@PathVariable("id") id: String){
        carroService.deletar(id)
    }

    @PostMapping
    fun salvar(@RequestBody carro: Carro) {
        carroService.salvar(carro)
    }
}