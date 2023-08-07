package clockin.adapter.input.api

import clockin.adapter.input.api.controller.ClockController
import clockin.adapter.input.api.request.ClockRegisterRequest
import clockin.domain.converter.toDomain
import clockin.domain.model.ClockRegistry
import clockin.service.usecase.FindRegistriesByDateUseCase
import clockin.service.usecase.RegisterClockUseCase
import org.springframework.stereotype.Service
import java.time.LocalDate

@Service
class ClockApi(
    private val registerClockUseCase: RegisterClockUseCase,
    private val findRegistriesByDateUseCase: FindRegistriesByDateUseCase
): ClockController {

    override fun registerClock(clockRegisterRequest: ClockRegisterRequest): ClockRegistry {
        return registerClockUseCase.execute(clockRegisterRequest.toDomain())
    }

    override fun getClockRegistry(date: LocalDate): List<ClockRegistry> {
        return findRegistriesByDateUseCase.execute(date)
    }
}