package com.gustavo.pontoeletronico.repositorios

import main.kotlin.com.gustavo.pontoeletronico.documentos.Empresa
import org.springframework.data.mongodb.repository.MongoRepository

interface EmpresaRepository : MongoRepository<Empresa, String> {
    fun findByCnpj(cnpj: String) : Empresa
}