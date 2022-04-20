package com.mjv.openbanking;

import java.time.BigDecimal;
import java.time.LocalDate;

public class Movimentacao {
	private LocalDate data;
	private BigDecimal valor;
	private String cpfCnpj;
	private String nomeCliente;
	private Boolean estornada;
	private TipoMovimentacao tipo;
}
