package ifrn.pi.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ifrn.pi.eventos.models.Evento;

@Controller
public class EventosController {

	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
	}

	@RequestMapping("/eventos/submit")
	public String submit(Evento evento) {
		System.out.println("Evento salvo com os seguintes dados");
		System.out.println(evento.getNome());
		System.out.println(evento.getLocal());
		System.out.println(evento.getData());
		System.out.println(evento.getHorario());
		return "ExecutandoSubmit";
	}

}
