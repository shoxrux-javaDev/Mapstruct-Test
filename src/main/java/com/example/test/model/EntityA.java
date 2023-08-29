package com.example.test.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class EntityA {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int myIdA;
  private String stringA;
  @OneToOne
  @JoinTable(name = "MY_JOIN_TABLE",
          joinColumns = {
                  @JoinColumn(name = "ENTITYA_FK", referencedColumnName = "myIdA")
          },
          inverseJoinColumns = {
                  @JoinColumn(name = "ENTITYB_FK", referencedColumnName = "myIdB", unique = true)
          }
  )
  private EntityB entityB;
}