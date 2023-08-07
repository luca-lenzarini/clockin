package clockin.service.usecase

import clockin.domain.model.ClockRegistry

interface RegisterClockUseCase {
    fun execute(clockRegistry: ClockRegistry): ClockRegistry
}