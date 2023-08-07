package clockin.adapter.input.api.request

import java.time.LocalTime

data class JobRequest(
    val name: String,
    val workplaceId: Long,
    val entryTime: LocalTime,
    val exitTime: LocalTime
)