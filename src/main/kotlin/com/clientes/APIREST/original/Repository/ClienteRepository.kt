package com.clientes.APIREST.original.Repository

import com.clientes.APIREST.original.Model.Cliente
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

interface ClienteRepository : CrudRepository<Cliente, Long>