package de.dj;

import org.locationtech.jts.geom.Geometry;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class MyEntity extends PanacheEntity {

    public Geometry geometry;
}
