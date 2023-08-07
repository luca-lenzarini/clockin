package clockin.domain.converter

import clockin.adapter.input.api.request.ClockRegisterRequest
import clockin.adapter.output.entity.ClockRegistryEntity
import clockin.domain.model.ClockRegistry
import clockin.domain.model.enum.ClockRegistryType

fun ClockRegistry.toEntity() = ClockRegistryEntity(
    id = this.id,
    type = this.type,
    userId = this.userId,
    location = this.location,
    date = this.date,
    time = this.time,
    createdAt = this.createdAt
)

fun ClockRegisterRequest.toDomain() = ClockRegistry(
    type = ClockRegistryType.valueOf(this.type),
    userId = this.userId,
    location = ClockRegistry.Location(
        longitude =  this.location.longitude,
        latitude = this.location.latitude
    )
)

fun ClockRegistryEntity.toDomain() = ClockRegistry(
    id = this.id,
    userId = this.userId,
    type = this.type,
    location = this.location,
    date = this.date,
    time = this.time,
    createdAt = this.createdAt
)