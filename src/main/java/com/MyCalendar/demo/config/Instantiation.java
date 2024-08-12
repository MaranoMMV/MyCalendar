package com.MyCalendar.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.MyCalendar.demo.service.EventCreateService;
import com.google.api.services.calendar.model.Event;

@Configuration
public class Instantiation implements CommandLineRunner{
	

	@Override
	public void run(String... args) throws Exception {
		 // Instancia o serviço de criação de eventos
	    EventCreateService eventCreateService = new EventCreateService();

	    // Cria um novo evento
	    Event event = eventCreateService.createEvent("Título do Evento", "Descrição do Evento");

	    // Define a data e hora de início do evento (em formato ISO 8601)
	    eventCreateService.start("2024-08-12T10:00:00-03:00");

	    // Define a data e hora de fim do evento (em formato ISO 8601)
	    eventCreateService.end("2024-08-12T12:00:00-03:00");

	    // Adiciona participantes ao evento
	    // Colocar manualmente caso seja necessario, aqui na classe Instantiation é feita a mockagem dos valores. futuramente pode ser realizado em uma classe de serviço essa opção de forma automatica.
	    eventCreateService.addParticipantes("matheusmmv16@gmail.com");

	    // Salva o evento no Google Calendar
	    Event savedEvent = eventCreateService.save();
		
	    System.out.println("Evento criado: " + savedEvent.getHtmlLink());
	}

    // Exibe informações sobre o evento criado
}
