package clockin.adapter.input.api.output.repository

import org.springframework.data.jpa.repository.JpaRepository
import clockin.adapter.input.api.output.entity.DoctorEntity
import clockin.adapter.input.api.output.entity.SpecialityEntity

interface DoctorRepository: JpaRepository<DoctorEntity, Long> {

    fun findBySpecialities(speciality: SpecialityEntity): List<DoctorEntity>

}