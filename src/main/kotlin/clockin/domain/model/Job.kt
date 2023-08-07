package clockin.domain.model

import java.time.LocalTime

data class Job(
    val name: String,
    val role: String,
    val workplace: Workplace,
    val entryTime: LocalTime,
    val exitTime: LocalTime
)
