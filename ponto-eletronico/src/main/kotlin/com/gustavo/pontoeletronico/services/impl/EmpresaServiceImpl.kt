package com.gustavo.pontoeletronico.services.impl

import com.gustavo.pontoeletronico.documents.Empresa
import com.gustavo.pontoeletronico.repositories.EmpresaRepository
import com.gustavo.pontoeletronico.services.IEmpresaService

import org.springframework.stereotype.Service

@Service
class EmpresaServiceImpl(val empresaRepository: EmpresaRepository) : IEmpresaService {



    override fun buscarPorCnpj(cnpj: String): Empresa? = empresaRepository.findByCnpj(cnpj)

    override fun persistir(empresa: Empresa): Empresa = empresaRepository.save(empresa)
}