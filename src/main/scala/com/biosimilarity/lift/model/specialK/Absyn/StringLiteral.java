package com.biosimilarity.lift.model.specialK.Absyn; // Java Package generated by the BNF Converter.

public class StringLiteral extends Value {
  public final String string_;

  public StringLiteral(String p1) { string_ = p1; }

  public <R,A> R accept(com.biosimilarity.lift.model.specialK.Absyn.Value.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.lift.model.specialK.Absyn.StringLiteral) {
      com.biosimilarity.lift.model.specialK.Absyn.StringLiteral x = (com.biosimilarity.lift.model.specialK.Absyn.StringLiteral)o;
      return this.string_.equals(x.string_);
    }
    return false;
  }

  public int hashCode() {
    return this.string_.hashCode();
  }


}
