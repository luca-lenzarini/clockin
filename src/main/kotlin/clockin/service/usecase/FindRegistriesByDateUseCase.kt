package clockin.service.usecase

import clockin.domain.model.ClockRegistry
import java.time.LocalDate

interface FindRegistriesByDateUseCase {
    fun execute(date: LocalDate): List<ClockRegistry>
}