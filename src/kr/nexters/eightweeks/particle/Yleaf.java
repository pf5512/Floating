package kr.nexters.eightweeks.particle;

import kr.nexters.eightweeks.animation.ParticleAnimationFactory;
import kr.nexters.eightweeks.manager.BitmapManager;

public class Yleaf extends Particle {
	public Yleaf() {
		super(BitmapManager.getYleafBitmap(), ParticleAnimationFactory.TYPE_FALLING_ANIMATION);
	}
}
