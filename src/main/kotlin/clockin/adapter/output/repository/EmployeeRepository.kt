package clockin.adapter.output.repository

import clockin.adapter.output.entity.ClockRegistryEntity
import clockin.adapter.output.entity.EmployeeEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.time.LocalDate

interface EmployeeRepository: JpaRepository<EmployeeEntity, Long> {
}