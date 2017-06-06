package golden.horde.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import golden.horde.demo.domain.Journal;
import golden.horde.demo.repositary.JournalRepository;

@Controller
public class JournalController {

	@Autowired
	JournalRepository repo;

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("journal", repo.findAll());
		return "index";
	}

	@RequestMapping(value = "/journal", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE })
	public @ResponseBody List<Journal> getJournal() {
		return repo.findAll();
	}
}
