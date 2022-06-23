package net.mastrio.hideousmass.goals;

import net.mastrio.hideousmass.entity.custom.HideousMassEntity;
import net.minecraft.entity.ai.control.MoveControl;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.mob.GhastEntity;
import net.minecraft.util.math.random.Random;

import java.util.EnumSet;

// Goal specifically made for the Hideous Mass entity
// Literally just copied from the Ghasts code lol
public class FlyRandomlyGoal extends Goal {

    private final HideousMassEntity hideous_mass;

    public FlyRandomlyGoal(HideousMassEntity hideous_mass) {
        this.hideous_mass = hideous_mass;
        this.setControls(EnumSet.of(Control.MOVE));
    }

    public boolean canStart() {
        MoveControl moveControl = this.hideous_mass.getMoveControl();
        if (!moveControl.isMoving()) {
            return true;
        } else {
            double d = moveControl.getTargetX() - this.hideous_mass.getX();
            double e = moveControl.getTargetY() - this.hideous_mass.getY();
            double f = moveControl.getTargetZ() - this.hideous_mass.getZ();
            double g = d * d + e * e + f * f;
            return g < 1.0 || g > 3600.0;
        }
    }

    public boolean shouldContinue() {
        return false;
    }

    public void start() {
        Random random = this.hideous_mass.getRandom();
        double d = this.hideous_mass.getX() + (double)((random.nextFloat() * 2.0F - 1.0F) * 16.0F);

        double e = this.hideous_mass.getY(); //this.hideous_mass.getY() + (double)((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
        if (this.hideous_mass.getY() < 120) {
            e = this.hideous_mass.getY() + 10;
        } else if (this.hideous_mass.getY() > 120) {
            e = this.hideous_mass.getY() - 10;
        }

        double f = this.hideous_mass.getZ() + (double)((random.nextFloat() * 2.0F - 1.0F) * 16.0F);

        this.hideous_mass.getMoveControl().moveTo(d, e, f, 1.0);
    }

}
