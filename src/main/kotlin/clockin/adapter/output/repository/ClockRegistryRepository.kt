package clockin.adapter.output.repository

import clockin.adapter.output.entity.ClockRegistryEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDate

interface ClockRegistryRepository: JpaRepository<ClockRegistryEntity, Long> {

    fun findAllByDateOrderByTime(date: LocalDate): List<ClockRegistryEntity>
}