package clockin.adapter.input.api.output.repository.converter

import clockin.adapter.input.api.output.entity.DoctorEntity
import clockin.adapter.input.api.output.entity.SpecialityEntity
import clockin.domain.model.Doctor

fun Doctor.toEntity() = DoctorEntity(
    name = this.name,
    averagePrice = this.averagePrice,
    specialities = this.specialities?.map {
        SpecialityEntity(it)
    }?.toSet(),
    addresses = this.addresses
)

fun DoctorEntity.toDomain() = Doctor(
    name = this.name,
    averagePrice = this.averagePrice!!,
    specialities = this.specialities?.map { it.name }?.toSet(),
    addresses = this.addresses,
    createdAt = this.createdAt,
    updatedAt = this.updatedAt
)