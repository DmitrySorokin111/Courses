package oop;
public class Book {
    private String title;
    private Author author;
    private int year;

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("название: %s, автор: %s, год: %d.", title, author.getName(), year);
    }

    Book(String title, Author author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }
}
class Author {
    private String name, sex, email;
    Author(String name, String sex, String email){
        this.name = name;
        this.sex = sex;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return String.format("имя: %s, пол: %s, почта: %s.", name, sex, email);
    }
}