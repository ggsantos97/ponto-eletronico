package com.gustavo.pontoeletronico.services.impl

import com.gustavo.pontoeletronico.documents.Funcionario
import com.gustavo.pontoeletronico.repositories.FuncionarioRepository
import com.gustavo.pontoeletronico.services.IFuncionarioService
import org.springframework.stereotype.Service

@Service
class FuncionarioServiceImpl(val funcionarioRepository: FuncionarioRepository) : IFuncionarioService {
    override fun persistir(funcionario: Funcionario): Funcionario
            = funcionarioRepository.save(funcionario)

    override fun buscarPorCpf(cpf: String): Funcionario? =
            funcionarioRepository.findByCpf(cpf)

    override fun buscarPorEmail(email: String): Funcionario? =
            funcionarioRepository.findByEmail(email)

    override fun buscarPorId(id: String): Funcionario? =
            funcionarioRepository.findById(id).get()
}