package br.cefetmg.games.weapons;

import com.badlogic.gdx.math.Vector2;

public class LaserShotFactory implements ShotFactory {
    @Override
    public Shot createShot(Vector2 position) {
        return new LaserShot(position);
    }
}
