package br.com.marli.concessionariapi.repository

import br.com.marli.concessionariapi.model.Usuario
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UsuarioRepository : MongoRepository<Usuario, String> {
    fun findById(id: Int): Usuario
    fun findByUsuario(usuario: String) : List<Usuario>
}