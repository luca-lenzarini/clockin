package clockin.adapter.input.api.output.repository

import org.springframework.data.jpa.repository.JpaRepository
import clockin.adapter.input.api.output.entity.SpecialityEntity

interface SpecialityRepository: JpaRepository<SpecialityEntity, Long> {
}