package EDU;
//모든 병사의 공격력과 방어력이 같아야 하므로
//weapon, armor에 static을 붙여야 한다.

class Marin{
    int x = 0, y = 0; //위치 좌표
    int hp = 60;      // 현재 체력
    static int weapon = 6;   // 공격력
    static int armor = 0;      // 방어력

    void weaponUp(){
        weapon++;
    }
    void armorUp(){
        armor++;
    }
    void move(int x, int y){
        this.x = x;
        this.y = y;
    }
}