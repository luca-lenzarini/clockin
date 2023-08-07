package clockin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ClockinApplication

fun main(args: Array<String>) {
    runApplication<ClockinApplication>(*args)
}