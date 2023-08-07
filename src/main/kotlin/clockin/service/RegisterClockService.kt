package clockin.service

import clockin.adapter.output.repository.ClockRegistryRepository
import clockin.domain.converter.toDomain
import clockin.domain.converter.toEntity
import clockin.domain.model.ClockRegistry
import clockin.service.usecase.RegisterClockUseCase
import org.springframework.stereotype.Service
import java.time.LocalDate
import java.time.LocalTime

@Service
class RegisterClockService(
    private val repository: ClockRegistryRepository
): RegisterClockUseCase {


    override fun execute(clockRegistry: ClockRegistry): ClockRegistry {
        clockRegistry.date = LocalDate.now()
        clockRegistry.time = LocalTime.now()

        return repository.save(clockRegistry.toEntity()).toDomain()
    }
}
