package clockin.adapter.input.api.request

data class WorkplaceRequest(
    val name: String,
    val location: Location
) {
    data class Location(
        val longitude: Long,
        val latitude: Long
    )
}

