package com.gustavo.pontoeletronico.repositories


import com.gustavo.pontoeletronico.documents.Empresa
import org.springframework.data.mongodb.repository.MongoRepository

interface EmpresaRepository : MongoRepository<Empresa, String> {
    fun findByCnpj(cnpj: String) : Empresa
}