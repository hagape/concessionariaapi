package br.com.marli.concessionariapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Carro(@Id var id: String?, var marca: String, var modelo: String, var ano: Int, var placa: String?, var urlImagem: String?, var preco: Int, var descricao: String?) {
    //constructor() : this("", "", "", 0, "") se for necessario
}