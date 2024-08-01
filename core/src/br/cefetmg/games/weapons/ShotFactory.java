package br.cefetmg.games.weapons;

import com.badlogic.gdx.math.Vector2;

public abstract class ShotFactory {
    public abstract Shot createShot(Vector2 position);
}