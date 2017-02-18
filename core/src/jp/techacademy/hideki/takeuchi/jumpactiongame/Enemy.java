package jp.techacademy.hideki.takeuchi.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by OWNER on 2017/02/13.
 */

public class Enemy extends GameObject {

    // 横幅、高さ 敵のサイズはUFOと同じとする
    public static final float ENEMY_WIDTH = 2.0f;
    public static final float ENEMY_HEIGHT = 1.3f;

    //状態（動くのと動かないのがいる)
//    public static final int ENEMY_TYPE_STAY = 0;
//    public static final int ENEMY_TYPE_MOVING = 1;

    // 速度
    public static final float ENEMY_VELOCITY = 2.0f;

    int mType;
    int mStatus;

    public Enemy( Texture texture, int srcX, int srcY, int srcWidth, int srcHeight){
        super(texture,srcX,srcY,srcWidth,srcHeight);
        setSize(ENEMY_WIDTH,ENEMY_HEIGHT);

//        mType = type;
 //       if (mType == ENEMY_TYPE_MOVING){
 //           velocity.x = ENEMY_VELOCITY;
 //       }

    }

    // 座標を更新する
  //  public void update(float deltaTime){
 //       if (mType == ENEMY_TYPE_MOVING){
 //           setX(getX() + velocity.x * deltaTime);
//
 //           if (getX() < ENEMY_WIDTH /2){
 //               velocity.x = -velocity.x;
//
//            }

  //          if (getX() > GameScreen.WORLD_WIDTH - ENEMY_WIDTH/2){
 //               velocity.x = -velocity.x;
//                setX(GameScreen.WORLD_WIDTH - ENEMY_WIDTH/2);
//            }
 //       }
//    }
}
