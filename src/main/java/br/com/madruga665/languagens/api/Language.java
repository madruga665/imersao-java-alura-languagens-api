package br.com.madruga665.languagens.api;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "languages")
public class Language {
  @Id
  private String id;
  private String title;
  private String image;
  private String ranking;

  public Language() {
  }

  public Language(String title, String image, String ranking) {
    this.title = title;
    this.image = image;
    this.ranking = ranking;
  }

  public String getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getImage() {
    return image;
  }

  public String getRanking() {
    return ranking;
  }
}
