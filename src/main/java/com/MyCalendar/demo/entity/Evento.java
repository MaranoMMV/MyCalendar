package com.MyCalendar.demo.entity;

import java.time.LocalDateTime;
import java.util.List;

import com.MyCalendar.demo.enuns.TipoRecorrencia;

public class Evento {
	private String nome;
	private String descricao;
	private List<String> participantes;
	private String recorrencia;
	private TipoRecorrencia tipoRecorencia;
	private LocalDateTime inicio;
	private LocalDateTime fim;
}
