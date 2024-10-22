public class Weapon {
    private Weapontype type;
    private String weaponName;

    public Weapontype getType() {
        return type;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setType(Weapontype type) {
        this.type = type;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public Weapon(Weapontype type, String weaponName) {
        this.type = type;
        this.weaponName = weaponName;
    }
}
