package br.com.marli.concessionariapi.controller

import br.com.marli.concessionariapi.model.Usuario
import br.com.marli.concessionariapi.service.UsuarioService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/usuario")
class UsuarioController {

    @Autowired
    lateinit var usuarioService: UsuarioService

    @GetMapping
    fun buscarTodos() :List<Usuario> {
        return this.usuarioService.buscaTodosUsuarios()
    }

    @PostMapping
    @RequestMapping("/autentica")
    fun login(@RequestBody usuario: Usuario) :Usuario {
        return this.usuarioService.login(usuario)
    }

    @PostMapping
    fun salvar(@RequestBody usuario: Usuario) {
        usuarioService.salvar(usuario)
    }

}