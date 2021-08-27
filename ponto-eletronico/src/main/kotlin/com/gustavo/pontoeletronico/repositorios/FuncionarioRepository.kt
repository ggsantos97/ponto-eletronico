package com.gustavo.pontoeletronico.repositorios

import com.gustavo.pontoeletronico.documentos.Funcionario
import org.springframework.data.mongodb.repository.MongoRepository

interface FuncionarioRepository : MongoRepository<Funcionario, String> {
    fun findByEmail(email: String) : Funcionario
    fun findByCpf(cpf: String): Funcionario
}