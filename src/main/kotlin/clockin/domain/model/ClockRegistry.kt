package clockin.domain.model

import clockin.domain.model.enum.ClockRegistryType
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

data class ClockRegistry(
    val id: Long? = null,
    val type: ClockRegistryType,
    val userId: String,
    val location: Location,
    var date: LocalDate? = null,
    var time: LocalTime? = null,
    val createdAt: LocalDateTime? = null
)