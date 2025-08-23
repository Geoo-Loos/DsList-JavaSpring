package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BelongingPK {
    
    @ManyToOne
    @JoinColumn(name = "jogo_id")
    private Jogo jogo;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private JogoList list;

	 public BelongingPK() {
    }

    public BelongingPK(Jogo jogo, JogoList list) {
        this.jogo = jogo;
        this.list = list;
    }
	public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public JogoList getList() {
        return list;
    }

    public void setList(JogoList list) {
        this.list = list;
    }

    @Override
	public int hashCode() {
		return Objects.hash(jogo, list);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(jogo, other.jogo) && Objects.equals(list, other.list);
	}
}
