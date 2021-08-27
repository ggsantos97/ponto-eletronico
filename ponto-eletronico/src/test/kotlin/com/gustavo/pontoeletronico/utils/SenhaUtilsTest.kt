package com.gustavo.pontoeletronico.utils

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class SenhaUtilsTest {
private val bCryptEnconder = BCryptPasswordEncoder()
    @Test
    fun deveGerarHashSenha(){
        val hash = SenhaUtils().gerarBcrypt("123456")
        Assertions.assertTrue(bCryptEnconder.matches("123456", hash))
    }
}