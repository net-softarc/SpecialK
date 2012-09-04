package com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn; // Java Package generated by the BNF Converter.

public class INL extends Instruction {
  public final String illinl_;

  public INL(String p1) { illinl_ = p1; }

  public <R,A> R accept(com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.Instruction.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.INL) {
      com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.INL x = (com.biosimilarity.seleKt.model.ill.vm.illvm.Absyn.INL)o;
      return this.illinl_.equals(x.illinl_);
    }
    return false;
  }

  public int hashCode() {
    return this.illinl_.hashCode();
  }


}