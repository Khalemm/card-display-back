package entities;

import java.util.Base64;
import java.util.Objects;

public class Card {

    private Integer idCard;
    private String nameCard;
    private String descriptionCard;
    private String image;
    private Integer numFavorites;

    public Card(Integer idCard, String nameCard, String descriptionCard, String image, Integer numFavorites) {
        this.idCard = idCard;
        this.nameCard = nameCard;
        this.descriptionCard = descriptionCard;
        this.image = image;
        this.numFavorites = numFavorites;
    }

    @Override
    public String toString() {
        return "card{" +
                "idCard='" + idCard + '\'' +
                ", nameCard='" + nameCard + '\'' +
                ", descriptionCard='" + descriptionCard + '\'' +
                ", image=" + image +
                ", numFavorites=" + numFavorites +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(idCard, card.idCard) && Objects.equals(nameCard, card.nameCard) && Objects.equals(descriptionCard, card.descriptionCard) && Objects.equals(image, card.image) && Objects.equals(numFavorites, card.numFavorites);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCard, nameCard, descriptionCard, image, numFavorites);
    }

    public Integer getIdCard() {
        return idCard;
    }

    public void setIdCard(Integer idCard) {
        this.idCard = idCard;
    }

    public String getNameCard() {
        return nameCard;
    }

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }

    public String getDescriptionCard() {
        return descriptionCard;
    }

    public void setDescriptionCard(String descriptionCard) {
        this.descriptionCard = descriptionCard;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getNumFavorites() {
        return numFavorites;
    }

    public void setNumFavorites(Integer numFavorites) {
        this.numFavorites = numFavorites;
    }
}
