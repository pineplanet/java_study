package EDU.E7;



class Unit {
    int x,y;
    void move(int x, int y){}
    void stop(){}
}
class Marine extends Unit {

    void stimPack(){}

}
class Tank extends Unit{

    void changeMode(){}

}
class Dropship extends Unit {

    void load(){}
    void unload(){}
}