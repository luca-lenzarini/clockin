package clockin.domain.model

import com.fasterxml.jackson.databind.PropertyNamingStrategies
import com.fasterxml.jackson.databind.annotation.JsonNaming
import clockin.adapter.input.api.output.repository.DoctorRepository
import clockin.adapter.input.api.output.repository.converter.toDomain
import clockin.adapter.input.api.output.repository.converter.toEntity
import java.time.LocalDateTime

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy::class)
data class Doctor(
    val name: String,
    val averagePrice: Double,
    val addresses: List<Address>? = null,
    val specialities: Set<String>? = null,
    val regionalId: String? = null,
    val createdAt: LocalDateTime? = null,
    val updatedAt: LocalDateTime? = null
) {
    fun save(repository: DoctorRepository) = repository.save(this.toEntity()).toDomain()

//    fun update(repository: DoctorRepository) = repository.save(this.to)
}