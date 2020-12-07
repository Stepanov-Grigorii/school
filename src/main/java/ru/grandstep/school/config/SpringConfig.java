package ru.grandstep.school.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ru.grandstep.school")//указывает в каком package искать бины
public class SpringConfig {
}
