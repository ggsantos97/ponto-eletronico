package com.gustavo.pontoeletronico.services

import com.gustavo.pontoeletronico.documents.Empresa


interface IEmpresaService {

    fun buscarPorCnpj(cnpj: String) : Empresa?
    fun persistir(empresa: Empresa) : Empresa

}