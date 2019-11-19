package com.clientes.APIREST.original.Controller

import com.clientes.APIREST.original.Model.Cliente
import com.clientes.APIREST.original.Repository.ClienteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/kotlin/api/clientes")
class ClienteController {

    @Autowired
    lateinit var clienteRepo: ClienteRepository

    @GetMapping("/all")
    fun all(): List<Cliente> {
        return this.clienteRepo.findAll().toList()
    }

    @GetMapping("{id}")
    fun one(@PathVariable id: Long): Cliente {
        return this.clienteRepo.findById(id).get()
    }

    @PostMapping
    fun add(@RequestBody clientes: Cliente): Cliente {
        return this.clienteRepo.save(clientes)
    }

    @PutMapping("{id}")
    fun put(@PathVariable id: Long, @RequestBody clientes: Cliente): Cliente {
        if (this.clienteRepo.existsById(id)) {
            val safeCliente = clientes.copy(id)
            return clienteRepo.save(safeCliente)
        }
        return Cliente()
    }

    @DeleteMapping("{id}")
    fun del(@PathVariable id: Long) {
        clienteRepo.deleteById(id)
    }
}