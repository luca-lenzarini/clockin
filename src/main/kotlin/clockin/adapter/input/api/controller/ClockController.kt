package clockin.adapter.input.api.controller

import clockin.adapter.input.api.request.ClockRegisterRequest
import clockin.domain.model.ClockRegistry
import org.springframework.format.annotation.DateTimeFormat
import org.springframework.web.bind.annotation.*
import java.time.LocalDate

@RestController
@RequestMapping("/api/clock")
interface ClockController {
    @PostMapping
    fun registerClock(@RequestBody clockRegisterRequest: ClockRegisterRequest): ClockRegistry

    @GetMapping
    fun getClockRegistry(
        @RequestParam @DateTimeFormat(pattern = "dd-MM-yyyy") date: LocalDate
    ): List<ClockRegistry>
}