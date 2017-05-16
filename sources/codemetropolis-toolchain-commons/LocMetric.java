package codemetropolis.toolchain.rendering.model.building;

import codemetropolis.toolchain.commons.cmxml.Buildable;
import codemetropolis.toolchain.commons.cmxml.Buildable.Type;
import codemetropolis.toolchain.commons.cmxml.Point;
import codemetropolis.toolchain.rendering.exceptions.BuildingTypeMismatchException;
import codemetropolis.toolchain.rendering.model.BasicBlock;
import codemetropolis.toolchain.rendering.model.pattern.RandomPattern;
import codemetropolis.toolchain.rendering.model.pattern.RepeationPattern;
import codemetropolis.toolchain.rendering.model.pattern.YSplitPattern;
import codemetropolis.toolchain.rendering.model.primitive.SignPost;
import codemetropolis.toolchain.rendering.model.primitive.SolidBox;
import codemetropolis.toolchain.rendering.model.building.LocMetric;
import codemetropolis.toolchain.rendering.model.building.Ground;
import codemetropolis.toolchain.rendering.util.Orientation;

/**
 * Created by Gábor on 2017. 03. 20..
 */
public class LocMetric extends Building {

    public LocMetric(Buildable innerBuildable) throws BuildingTypeMismatchException {
    	super(innerBuildable);

    	
    	if ( innerBuildable.getType() != Type.LOCMETRIC )
			throw new BuildingTypeMismatchException(innerBuildable.getType(), getClass());
    	
        prepareSign();

    }
    protected void prepareSign(){
        primitives.add(new SignPost(position.getX() + size.getX(), position.getY() + 4, position.getZ() + size.getZ() - 1, SignPost.Orientation.SOUTHEAST, innerBuildable.getName()));
    }






}
