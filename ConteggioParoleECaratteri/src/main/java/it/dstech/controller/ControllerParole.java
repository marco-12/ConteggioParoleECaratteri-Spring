package it.dstech.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dstech.model.Conteggio;

public class ControllerParole {

	@RequestMapping(value = "/contaParole", method = RequestMethod.POST)
	public ModelAndView scelta(@RequestParam("frase") String frase, Model model) {

		ModelAndView prossimaJSP = new ModelAndView();
		Conteggio cont = new Conteggio(frase);

		prossimaJSP.setViewName("risultato");
		prossimaJSP.addObject("frase", frase);
		prossimaJSP.addObject("parole", cont.contaParole(frase));

		return prossimaJSP;
	}

}
