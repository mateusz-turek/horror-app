package project4.horrormoviesapp.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class Horror {

    private Long id;
    private String title;
    private HorrorType horrorType;
    private String author;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate releaseDate;


    public Horror() {
    }

    public Horror(Long id, String title, HorrorType horrorType, String author, LocalDate releaseDate) {
        this.id = id;
        this.title = title;
        this.horrorType = horrorType;
        this.author = author;
        this.releaseDate = releaseDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public HorrorType getHorrorType() {
        return horrorType;
    }

    public void setHorrorType(HorrorType horrorType) {
        this.horrorType = horrorType;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
