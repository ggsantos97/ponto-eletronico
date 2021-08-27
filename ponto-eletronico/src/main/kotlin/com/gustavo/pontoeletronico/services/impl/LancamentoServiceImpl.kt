package com.gustavo.pontoeletronico.services.impl

import com.gustavo.pontoeletronico.documents.Lancamento
import com.gustavo.pontoeletronico.repositories.LancamentoRepository
import com.gustavo.pontoeletronico.services.ILancamentoService
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service


@Service
class LancamentoServiceImpl(val lancamentoRepository: LancamentoRepository) : ILancamentoService {

    override fun buscarPorFuncionarioId(funcionarioId: String, pageRequest: PageRequest): Page<Lancamento> {
       return lancamentoRepository.findByFuncionarioId(funcionarioId, pageRequest)
    }

    override fun buscarPorId(id: String): Lancamento? {
        return lancamentoRepository.findById(id).get()
    }

    override fun persistir(lancamento: Lancamento): Lancamento {
       return lancamentoRepository.save(lancamento)
    }

    override fun remover(id: String) {
        lancamentoRepository.deleteById(id)
    }


}