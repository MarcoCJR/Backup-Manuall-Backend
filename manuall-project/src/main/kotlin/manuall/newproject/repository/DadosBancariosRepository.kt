package manuall.newproject.repository

import manuall.newproject.domain.DadosBancarios
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DadosBancariosRepository: JpaRepository<DadosBancarios, Int> {
    fun deleteByUsuarioId(id: Int)
}