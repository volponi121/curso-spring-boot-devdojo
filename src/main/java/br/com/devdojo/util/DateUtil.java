package br.com.devdojo.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

@Component//Escaneada pelo componentScan @Configuration @EnableAutoConfiguration @ComponentScan
public class DateUtil {
	public String formatLocalDateTimeToDatabaseStyle(LocalDateTime localDateTime) {
		return DateTimeFormatter.ofPattern("yyy-MM-dd HH:mm:ss").format(localDateTime);
	}
}
