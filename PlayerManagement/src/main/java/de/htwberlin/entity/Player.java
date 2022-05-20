package de.htwberlin.entity;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Player {

    int id;

    String name;

    List<Card> playerCards;

    Boolean hasCalledMau;

}