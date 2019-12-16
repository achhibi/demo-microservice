package org.market.company.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "mkt_company")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company implements Serializable{
	private static final long serialVersionUID = -1285046274323471422L;
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private Double price;

}
