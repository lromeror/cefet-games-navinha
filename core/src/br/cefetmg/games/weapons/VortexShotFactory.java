package br.cefetmg.games.weapons;

import com.badlogic.gdx.math.Vector2;

public class VortexShotFactory implements ShotFactory {
    @Override
    public Shot createShot(Vector2 position) {
        return new VortexShot(position);
    }
}
