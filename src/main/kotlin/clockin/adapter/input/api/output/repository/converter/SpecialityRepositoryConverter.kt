package clockin.adapter.input.api.output.repository.converter

import clockin.domain.model.Speciality
import clockin.adapter.input.api.output.entity.SpecialityEntity

fun Speciality.toEntity() = SpecialityEntity(
    name = this.name
)

fun SpecialityEntity.toDomain() = Speciality(
    name = this.name
)