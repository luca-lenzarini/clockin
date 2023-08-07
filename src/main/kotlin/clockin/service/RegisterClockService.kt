package clockin.service

import clockin.adapter.output.repository.ClockRegistryRepository
import clockin.config.objectToJson
import clockin.domain.converter.toDomain
import clockin.domain.converter.toEntity
import clockin.domain.model.ClockRegistry
import clockin.service.usecase.RegisterClockUseCase
import net.logstash.logback.argument.StructuredArguments.kv
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import java.time.LocalDate
import java.time.LocalTime

@Service
class RegisterClockService(
    private val repository: ClockRegistryRepository
): RegisterClockUseCase {

    private val logger = LoggerFactory.getLogger(RegisterClockService::class.java)

    override fun execute(clockRegistry: ClockRegistry): ClockRegistry {
        logger.info(
            "Starting registering clock with {} for {}",
            kv("user_id", clockRegistry.userId),
            kv("type", clockRegistry.type)
        )

        clockRegistry.date = LocalDate.now()
        clockRegistry.time = LocalTime.now()

        return repository.save(clockRegistry.toEntity()).toDomain().also {
            logger.info("Successfully registered clock {}", kv("clockRegistry", it.objectToJson()))
        }
    }
}
