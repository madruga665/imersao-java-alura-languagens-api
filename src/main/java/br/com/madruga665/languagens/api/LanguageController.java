package br.com.madruga665.languagens.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class LanguageController {
  @Autowired
  private LanguageRepository repository;

  @GetMapping("/languages")
  public List<Language> getLanguages() {
    List<Language> languages = repository.findAll();
    return languages;
  }

  @PostMapping("/languages")
  public Language createLanguage(@RequestBody Language language, HttpServletResponse response) {
    repository.save(language);
    response.setStatus(HttpStatus.CREATED.value());
    return language;
  }

}
