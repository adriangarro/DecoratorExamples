package com.DSWTEC.SwordPackage;

public abstract class SwordDecorator implements Sword {

    private final Sword decoratedSword;

    SwordDecorator(Sword s) { this.decoratedSword = s; }

    @Override
    public void setPower(Integer power) { decoratedSword.setPower(power); }

    @Override
    public Integer getPower() { return decoratedSword.getPower(); }

    @Override
    public void setSwordName(String swordName) { decoratedSword.setSwordName(swordName); }

    @Override
    public String getSwordName() { return decoratedSword.getSwordName(); }

    @Override
    public void attributes() { decoratedSword.attributes(); }

    // new method
    public abstract void magicalPower();
}
