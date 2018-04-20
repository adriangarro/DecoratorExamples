package com.DSWTEC.SwordPackage;

public class CommonSword implements Sword {

    private Integer power;
    private String swordName;

    public CommonSword(String swordName){
        this.power = 1;
        this.swordName = swordName;
    }

    @Override
    public void setPower(Integer power) { this.power = power; }

    @Override
    public Integer getPower() { return power; }

    @Override
    public void setSwordName(String swordName) { this.swordName = swordName; }

    @Override
    public String getSwordName() { return swordName; }

    @Override
    public void attributes() {
        System.out.println(
                "This is a "
                        + this.swordName
                        + ". Its power is "
                        + this.power
                        + "!"
        );
    }

}
