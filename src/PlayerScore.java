public class PlayerScore {
    private String playerName;          // Name of the player
    private String role;                // Role of player
    private Integer damageDealt;        // Amount of damage dealt
    private Integer damageReceived;     // Amount of damage received
    private Integer healingDone;        // Amount of healing dealt
    private Integer healingReceived;    // Amount of healing received
    private Integer attacks;            // Number of attacks performed

    PlayerScore(String name, String playerRole, int dmgDealt, int dmgReceived, int healDone, int healReceived, int numOfAttacks) {
        setPlayerName(name);
        setRole(playerRole);
        setDamageDealt(dmgDealt);
        setDamageReceived(dmgReceived);
        setHealingDone(healDone);
        setHealingReceived(healReceived);
        setAttacks(numOfAttacks);
    }

    PlayerScore(){

    }

    /**
     * Gets playerName
     *
     * @return value of playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     * Gets role
     *
     * @return value of role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Gets damageDealt
     *
     * @return value of damageDealt
     */
    public Integer getDamageDealt() {
        return damageDealt;
    }

    public void setDamageDealt(Integer damageDealt) {
        this.damageDealt = damageDealt;
    }

    /**
     * Gets damageReceived
     *
     * @return value of damageReceived
     */
    public Integer getDamageReceived() {
        return damageReceived;
    }

    public void setDamageReceived(Integer damageReceived) {
        this.damageReceived = damageReceived;
    }

    /**
     * Gets healingDone
     *
     * @return value of healingDone
     */
    public Integer getHealingDone() {
        return healingDone;
    }

    public void setHealingDone(Integer healingDone) {
        this.healingDone = healingDone;
    }

    /**
     * Gets healingReceived
     *
     * @return value of healingReceived
     */
    public Integer getHealingReceived() {
        return healingReceived;
    }

    public void setHealingReceived(Integer healingReceived) {
        this.healingReceived = healingReceived;
    }

    /**
     * Gets attacks
     *
     * @return value of attacks
     */
    public Integer getAttacks() {
        return attacks;
    }

    public void setAttacks(Integer attacks) {
        this.attacks = attacks;
    }


    //TODO
    //Getters

}