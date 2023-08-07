package clockin.adapter.input.api.request

data class ClockRegisterRequest(
    val type: String,
    val userId: String,
    val location: Location
) {
    data class Location(
        val longitude: Long,
        val latitude: Long
    )
}

