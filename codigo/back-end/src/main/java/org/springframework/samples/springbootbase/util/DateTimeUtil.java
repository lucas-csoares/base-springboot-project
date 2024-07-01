package org.springframework.samples.springbootbase.util;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.experimental.UtilityClass;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@UtilityClass
@Schema(description = "Contains utility methods for date and time operations")
public class DateTimeUtil {

    // DateTimeFormatter patterns
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    @Operation(summary = "Convert LocalDate to String with format (dd/MM/yyyy)")
    public static String localDateToString(LocalDate date) {
        return date.format(DATE_FORMATTER);
    }

    @Operation(summary = "Convert String to LocalDate with format (dd/MM/yyyy)")
    public static LocalDate stringToLocalDate(String dateString) {
        return LocalDate.parse(dateString, DATE_FORMATTER);
    }

    @Operation(summary = "Convert LocalTime to String with format (HH:mm:ss)")
    public static String localTimeToString(LocalTime time) {
        return time.format(TIME_FORMATTER);
    }

    @Operation(summary = "Convert String to LocalTime with format (HH:mm:ss)")
    public static LocalTime stringToLocalTime(String timeString) {
        return LocalTime.parse(timeString, TIME_FORMATTER);
    }

    @Operation(summary = "Convert LocalDateTime to String with format (dd/MM/yyyy HH:mm:ss)")
    public static String localDateTimeToString(LocalDateTime dateTime) {
        return dateTime.format(DATE_TIME_FORMATTER);
    }

    @Operation(summary = "Convert String to LocalDateTime with format (dd/MM/yyyy HH:mm:ss)")
    public static LocalDateTime stringToLocalDateTime(String dateTimeString) {
        return LocalDateTime.parse(dateTimeString, DATE_TIME_FORMATTER);
    }

    @Operation(summary = "Convert LocalDateTime to LocalDate")
    public static LocalDate localDateTimeToLocalDate(LocalDateTime dateTime) {
        return dateTime.toLocalDate();
    }

    @Operation(summary = "Convert LocalDate to LocalDateTime at start of day")
    public static LocalDateTime localDateToLocalDateTime(LocalDate date) {
        return date.atStartOfDay();
    }

    @Operation(summary = "Convert LocalDateTime to LocalTime")
    public static LocalTime localDateTimeToLocalTime(LocalDateTime dateTime) {
        return dateTime.toLocalTime();
    }

    @Operation(summary = "Convert LocalTime to LocalDateTime with current date")
    public static LocalDateTime localTimeToLocalDateTime(LocalTime time) {
        return time.atDate(LocalDate.now());
    }

    @Operation(summary = "Convert Date to LocalDateTime")
    public static LocalDateTime dateToLocalDateTime(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    @Operation(summary = "Convert LocalDateTime to Date")
    public static Date localDateTimeToDate(LocalDateTime dateTime) {
        return Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    @Operation(summary = "Convert Date to LocalDate")
    public static LocalDate dateToLocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }

    @Operation(summary = "Convert LocalDate to Date")
    public static Date localDateToDate(LocalDate date) {
        return Date.from(date.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    @Operation(summary = "Convert Date to LocalTime")
    public static LocalTime dateToLocalTime(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
    }

    @Operation(summary = "Convert LocalTime to Date with current date")
    public static Date localTimeToDate(LocalTime time) {
        return Date.from(time.atDate(LocalDate.now()).atZone(ZoneId.systemDefault()).toInstant());
    }

    @Operation(summary = "Calculate the difference in hours between two LocalDateTime instances")
    public static long calcDifTime(LocalDateTime dataHora1, LocalDateTime dataHora2) {
        Duration duration = Duration.between(dataHora1, dataHora2);
        return duration.toHours();
    }

}
