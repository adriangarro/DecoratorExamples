package com.DSWTEC.SwordPackage;

public class ExcaliburSword extends SwordDecorator {

    private String commonSwordName;
    private Integer commonSwordPower;

    public ExcaliburSword(Sword sword) {
        super(sword);
        this.commonSwordName = sword.getSwordName();
        this.commonSwordPower = sword.getPower();
        setSwordName("Excalibur");
        setPower(10);
    }

    @Override
    public void setPower(Integer power) { super.setPower(power); }

    @Override
    public Integer getPower() { return super.getPower(); }

    @Override
    public void setSwordName(String swordName) { super.setSwordName(swordName); }

    @Override
    public String getSwordName() { return super.getSwordName(); }

    @Override
    public void attributes() {
        System.out.println("This is not a "
                + commonSwordName
                + " any more. This is the "
                + getSwordName()
                + " sword."
                + " Its power increased from "
                + commonSwordPower + " to " + getPower() + "!");
        magicalPower();
    }

    @Override
    public void magicalPower() {
        System.out.println(getSwordName()
                + " has a magical power as well. It blinds its enemies!");
    }
}
