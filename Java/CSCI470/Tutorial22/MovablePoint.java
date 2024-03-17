package Tutorial22;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed){
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(){
        super();
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }
    public float getxSpeed() {
        return xSpeed;
    }
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getySpeed() {
        return ySpeed;
    }
    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] arr = new float[2];
        arr[0] = getX();
        arr[1] = getY();
        return arr;
    }
    public String toString(){
        return String.format("%s,speed=(%f.%f)", super.toString(), xSpeed,ySpeed);
    }
    public MovablePoint move(){
        MovablePoint mPoint = new MovablePoint();
        mPoint.setX(getX() + getxSpeed());
        mPoint.setY(getY() + getySpeed());
        return mPoint;
    }
}
