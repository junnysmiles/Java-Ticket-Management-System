/*******************************************************************************************************************
 * Project: A Team
 * Assignment: 3
 * Author(s): Nicholas Chinsen, Joel Max Abramson, Jun-Yan Gan, Stefan Maric, Kevin Silva
 * Student Number: 101075596, 101165088, 101197834, 101208175, 101210892
 * Date: 02/12/2020
 * Description: Users can have zero to many credit cards carddtype is an enum
 * ****************************************************************************************************************/
package ca.gbc.model;

import javax.persistence.*;

@Entity
public class CreditCard {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Enumerated(value = EnumType.STRING)
    private CardType cardType;

    private Integer expirationMonth;
    private Integer expirationYear;
    private String cardholderName;
    private Long CCNumber;
    private Boolean defaultCC;

    @ManyToOne
    private Client client;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public Integer getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(Integer expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public Integer getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(Integer expirationYear) {
        this.expirationYear = expirationYear;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public Long getCCNumber() {
        return CCNumber;
    }

    public void setCCNumber(Long CCNumber) {
        this.CCNumber = CCNumber;
    }

    public Boolean getDefaultCC() {
        return defaultCC;
    }

    public void setDefaultCC(Boolean defaultCC) {
        this.defaultCC = defaultCC;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
