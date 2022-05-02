class Monster extends Sprite {
    public Monster() {
        x = y =8;
    }
    void move(char c) {
        x += (Math.random()-0.5)>0 ? 1: -1;
        y += (Math.random()-0.5)>0 ? 1: -1;
    }
}