package com.clientes.APIREST.original.Model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "clientes")
data class Cliente(
        @Id @GeneratedValue(
                strategy = GenerationType.IDENTITY) val id : Long = 0,
        val nome : String = "",
        val email : String = "",
        val cpf : String = ""){
}