package clockin.service

import clockin.adapter.output.repository.ClockRegistryRepository
import clockin.domain.converter.toDomain
import clockin.service.usecase.FindRegistriesByDateUseCase
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
class FindRegistriesByDateService(
    private val repository: ClockRegistryRepository
): FindRegistriesByDateUseCase {

    override fun execute(date: LocalDate) = repository.findAllByDateOrderByTime(date).map { it.toDomain() }
}