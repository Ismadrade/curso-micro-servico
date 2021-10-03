package br.com.ismadrade.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Entity(name = "cambio")
public class Cambio implements Serializable {

    private static final long serialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "from_currency", nullable = false, length = 3)
    private String from;

    @Column(name = "to_currency", nullable = false, length = 3)
    private String to;

    @Column(nullable = false)
    private BigDecimal conversionFactor;


    @Transient
    private BigDecimal convertedValue;

    @Transient
    private String enviroment;

    public Cambio() {}

    public Cambio(Long id, String from, String to, BigDecimal conversionFactor, BigDecimal convertedValue, String enviroment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionFactor = conversionFactor;
        this.convertedValue = convertedValue;
        this.enviroment = enviroment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionFactor() {
        return conversionFactor;
    }

    public void setConversionFactory(BigDecimal conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public BigDecimal getConvertedValue() {
        return convertedValue;
    }

    public void setConvertedValue(BigDecimal convertedValue) {
        this.convertedValue = convertedValue;
    }

    public String getEnviroment() {
        return enviroment;
    }

    public void setEnviroment(String enviroment) {
        this.enviroment = enviroment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cambio cambio = (Cambio) o;
        return id.equals(cambio.id) &&
                from.equals(cambio.from) &&
                to.equals(cambio.to) &&
                conversionFactor.equals(cambio.conversionFactor) &&
                convertedValue.equals(cambio.convertedValue) &&
                enviroment.equals(cambio.enviroment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, from, to, conversionFactor, convertedValue, enviroment);
    }
}