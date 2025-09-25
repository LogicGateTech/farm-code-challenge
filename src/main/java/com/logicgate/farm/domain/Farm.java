package com.logicgate.farm.domain;

import com.logicgate.farm.util.FarmUtils;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity(name = "farm")
public class Farm implements Serializable {

  private static final long serialVersionUID = 1803928155981647930L;

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  protected Long id;

  @Column(name = "name")
  protected String name;

  @Column(name = "color")
  protected Color color;

  @Column(name = "capacity")
  protected Integer capacity = FarmUtils.farmCapacity();

  protected Farm() {
    // default constructor
  }

  public Farm(String name, Color color) {
    this.name = name;
    this.color = color;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Color getColor() {
    return color;
  }

  public Integer getCapacity() {
    return capacity;
  }

  @Override
  public String toString() {
    return String.format("Farm[id=%d, name=%s, color=%s, capacity=%d]", id, name, color.name(), capacity);
  }

  @Override
  public boolean equals(Object obj) {
    return this == obj || (obj instanceof Farm that && Objects.equals(id, that.id));
  }
}
